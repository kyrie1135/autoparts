package com.mixone.portal.admin.login.interceptor;

import com.mixone.portal.admin.app.service.ModuleResService;
import com.mixone.portal.admin.org.model.UserLogin;
import com.mixone.portal.admin.util.RightManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    ModuleResService moduleResService;

    // 不拦截 "/login" 请求
    private static final String[] IGNORE_URI = { "/login","/noright","/sba","/error"};

    // 该方法将在 Controller 处理前进行调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        // flag 表示是否需要登录
        boolean flag = false;

        String url = request.getServletPath();

        for (String s : IGNORE_URI) {
            if (url.contains(s)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            // 获取 Session 并判断是否登录
            UserLogin userLogin =
                    (UserLogin)request.getSession().getAttribute("USER_SESSION");
            if (userLogin == null) {
                request.setAttribute("message", "Please log in first!");
                // 如果未登录，进行拦截，跳转到登录页面
                response.sendRedirect(request.getContextPath()+"/login");
            } else {
                if ("1".equalsIgnoreCase(userLogin.getIsSystem()) || "2".equalsIgnoreCase(userLogin.getIsSystem())) {
                    //系统管理员暂时不用鉴权
                    flag = true;
                }else{

                    //鉴权:判断是否需要做权限判断,请求的url是否在权限列表
                    RightManager rightManager = new RightManager();
                    if (!rightManager.hasRightByUrl(moduleResService,request)) {
                        response.sendRedirect(request.getContextPath() + "/noright");
                    } else {
                        flag = true;
                    }

                }

            }
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
