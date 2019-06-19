<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="top_nav">
    <div class="nav_menu">
        <nav>
            <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li class="">
                    <c:set var="userLogin" value="${sessionScope.USER_SESSION}" />
                    <a href="javascript:;" class="user-profile " data-toggle="dropdown" aria-expanded="false">
                        <img src="${pageContext.request.contextPath}/static/vendors/custom/images/user.png" alt="">${userLogin.userName}
                        <span class=" fa fa-angle-down"></span>
                    </a>
                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                        <%--<li><a href="javascript:;"> 个人信息</a></li>--%>
                        <li><a href="${pageContext.request.contextPath}/user/changepwd">修改密码</a></li>
                        <li><a href="${pageContext.request.contextPath}/logout"><i class="fa fa-sign-out pull-right"></i> 退出</a></li>
                    </ul>
                </li>

            </ul>
        </nav>
    </div>
</div>

