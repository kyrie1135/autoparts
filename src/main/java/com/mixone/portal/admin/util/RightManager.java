package com.mixone.portal.admin.util;

import com.mixone.portal.admin.app.model.ModuleRes;
import com.mixone.portal.admin.app.model.ModuleResExample;
import com.mixone.portal.admin.app.service.ModuleResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class RightManager {

    //不需要权限验证的url
    private static final String[] IGNORE_URI = { "/index","/noright","/logout","/error" };

    public boolean hasRightByUrl(ModuleResService moduleResService,HttpServletRequest request){
        boolean hasright = false;

        String headUrl = request.getServletPath();
        if("".equals(headUrl)){//如果是/*的情况
            headUrl=request.getRequestURI();//getRequestURI包含上下文根
            headUrl=headUrl.substring(request.getContextPath().length());//去掉上下文根
        }

        //1 判断该url是否属于功能入口(模块或资源数据库表里面是否存在该url)
        //  如果不属于功能入口,则允许访问
        ModuleResExample example =new ModuleResExample();
        example.createCriteria().andResourceUrlLike(headUrl);
        List<ModuleRes> list=moduleResService.selectByExample(example);

        if(list.size()==0){
            hasright = true;
        }

        //2 如果不属于上面情况,则该url属于功能入口,需要做权限验证
        if (!hasright) {
            //看该请求的url是否在不需要权限控制列表中,如果有,则认为该url不需要权限控制,可以直接访问
            if (UserLoginUtil.getUserLogin(request).getNotNeedRightSet().contains(headUrl)) {
                hasright = true;
            } else {
                //否则从seesion 权限控制列表中判断是否包含当前访问的url
                if (UserLoginUtil.getUserLogin(request).getRightSet().contains(headUrl)) {
                    hasright = true;
                }
            }
        }

        return hasright;
    }
}
