package com.mixone.portal.admin.login.controller;

import com.mixone.portal.admin.app.model.Application;
import com.mixone.portal.admin.app.model.ApplicationExample;
import com.mixone.portal.admin.app.model.ModuleRes;
import com.mixone.portal.admin.app.model.ModuleResExample;
import com.mixone.portal.admin.app.service.ApplicationService;
import com.mixone.portal.admin.app.service.ModuleResService;
import com.mixone.portal.admin.org.model.UserLogin;
import com.mixone.portal.admin.org.service.UserLoginService;
import com.mixone.portal.admin.right.model.RoleParty;
import com.mixone.portal.admin.right.model.RolePartyExample;
import com.mixone.portal.admin.right.model.RoleRight;
import com.mixone.portal.admin.right.model.RoleRightExample;
import com.mixone.portal.admin.right.service.RolePartyService;
import com.mixone.portal.admin.right.service.RoleRightService;
import com.mixone.portal.admin.util.LoginValidate;
import com.mixone.portal.admin.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    UserLoginService userLoginService;
    @Autowired
    private RoleRightService roleRightService;
    @Autowired
    private RolePartyService rolePartyService;

    @Autowired
    private ModuleResService moduleResService;

    @Autowired
    private ApplicationService appService;

    //系统首页
    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response) {
        return "index";
    }

    /**
     * 向用户登录页面/login.jsp跳转
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "/jsp/login";
    }

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserLogin user, Model model, HttpServletRequest request) {
        // 获取用户名和密码
        String userLoginId = user.getUserLoginId();
        String password = user.getCurrentPassword();
        // 从数据库中获取用户名和密码后进行判断
        if (userLoginId != null && password != null) {
            UserLogin userLogin = userLoginService.findByLoginId(userLoginId);
            if (userLogin != null) {
                if (LoginValidate.validate(password, userLogin.getCurrentPassword())) {
                    // 将用户对象添加到Session
                    request.getSession().setAttribute("USER_SESSION", userLogin);

                    //构造权限控制列表
                    makeRightCache(model,request);

                    // 重定向
                    //String toUrl = (String)session.getAttribute("toUrl");

                    if ("1".equalsIgnoreCase(userLogin.getIsSystem()) || "2".equalsIgnoreCase(userLogin.getIsSystem())) {
                        return "redirect:admin/index";
                    } else {
                        return "redirect:index";
                    }
                }
            }
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "/jsp/login";

    }

    /**
     * 退出登录
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // 清除Session
        session.invalidate();
        // 重定向到登录页面的跳转方法
        return "redirect:login";
    }

    /**
     * 向后台管理主页面/admin/admin_index.jsp跳转
     */
    @RequestMapping("/admin/index")
    public String admin(Model model) {

        return "/jsp/admin/admin_index";
    }

    /**
     * 向应用主页面/application/app_index.jsp跳转
     */
    @RequestMapping("/index")
    public String toIndex(Model model, HttpServletRequest request) {
        List<Application> appList =new ArrayList<>();

        //根据已经授予的模块权限,构造菜单
        List<ModuleRes> moduleResList = findModuleResByUserLogin(request);

        List<Application> apps = appService.selectByExample(new ApplicationExample());

        //通过模块权限资源,计算要显示的应用个数
        for (Application app: apps){
            for(ModuleRes res: moduleResList){
                if(app.getAppId().equalsIgnoreCase(res.getAppId())){
                    //如果资源的APPID与应用APPID相同,放入appList,然后跳出内循环
                    appList.add(app);
                    break;
                }
            }
        }

//        model.addAttribute("appList",appList);
//        model.addAttribute("moduleResList",moduleResList);

        request.getSession().setAttribute("appList",appList);
        request.getSession().setAttribute("moduleResList",moduleResList);

        return "/jsp/app/app_index";
    }

    @RequestMapping("/noright")
    public String noright(){
        return "/jsp/include/noright";
    }


    private void makeRightCache(Model model,HttpServletRequest request){
        List<ModuleRes> moduleResList = findModuleResByUserLogin(request);


        //构造权限访问列表(即具有可访问的模块URL),
        //放进一个hashset,并放进用户当前session中,以便在拦截器中做为鉴权依据
        HashSet<String> rightSet =new HashSet<>();
        for(ModuleRes res: moduleResList){
            if(!"".equalsIgnoreCase(res.getResourceUrl())){
                rightSet.add(res.getResourceUrl());
            }
        }

        //不需要权限控制的权限资源列表也放到session中
        HashSet<String> notNeedRightSet =new HashSet<>();
        ModuleResExample example =new ModuleResExample();
        ModuleResExample.Criteria criteria = example.createCriteria();

        criteria.andCurrentStatusEqualTo("0");
        criteria.andNeedRightEqualTo("0");

        List<ModuleRes> noRightResList = moduleResService.selectByExample(example);
        for (ModuleRes mr: noRightResList){
            notNeedRightSet.add(mr.getResourceUrl());
        }


        UserLogin userLogin = UserLoginUtil.getUserLogin(request);
        userLogin.setRightSet(rightSet);
        userLogin.setNotNeedRightSet(notNeedRightSet);
        //更新Session
        request.getSession().setAttribute("USER_SESSION",userLogin);
    }

    private List<ModuleRes> findModuleResByUserLogin(HttpServletRequest request) {
        //1 根据已授权的对象获得模块权限资源

        //查询该用户已经授权的对象
        RolePartyExample rolePartyExample = new RolePartyExample();
        rolePartyExample.createCriteria().andPartyIdEqualTo(UserLoginUtil.getUserLogin(request).getPartyId());
        //1.1获得用户的角色列表
        List<RoleParty> roleParties = rolePartyService.selectByExample(rolePartyExample);

        List<ModuleRes> moduleResList=new ArrayList<>();
        List<Application> appList =new ArrayList<>();

        if(roleParties.size()>0){

            List<String> roleIds = new ArrayList<>();
            for(RoleParty rp: roleParties){
                roleIds.add(rp.getRoleId());
            }

            //
            RoleRightExample example = new RoleRightExample();
            RoleRightExample.Criteria criteria=example.createCriteria();
            //设置查询条件,
            criteria.andRoleIdIn(roleIds);
            //获得角色权限
            List<RoleRight> roleRights = roleRightService.selectByExample(example);

            if(roleRights.size()>0){
                List<String> resourceIds = new ArrayList<>();
                for(RoleRight rr: roleRights){
                    resourceIds.add(rr.getResourceId());
                }
                ModuleResExample resExample =new ModuleResExample();
                ModuleResExample.Criteria criteria1 = resExample.createCriteria();
                criteria1.andCurrentStatusEqualTo("0");
                //设置查询条件
                criteria1.andResourceIdIn(resourceIds);

                //获得模块权限
                moduleResList = moduleResService.selectByExample(resExample);

            }
        }

        //2 不需要权限验证的模块权限资源也要查询查询出来
        ModuleResExample resExample =new ModuleResExample();
        ModuleResExample.Criteria criteria1 = resExample.createCriteria();
        criteria1.andCurrentStatusEqualTo("0");
        criteria1.andNeedRightEqualTo("0");
        //累加不需要权限验证的模块权限资源
        moduleResList.addAll(moduleResService.selectByExample(resExample));



        return moduleResList;
    }

}