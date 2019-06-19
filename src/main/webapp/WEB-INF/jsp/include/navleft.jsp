<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <a href="index.html" class="site_title"><i class="fa fa-cubes"></i> <span>管理控制台</span></a>
        </div>
        <div class="clearfix"></div>
        <br />
        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <h3></h3>
                <ul class="nav side-menu">

                    <li><a href="${pageContext.request.contextPath}/admin/index"><i class="fa fa-home"></i> 返回管理首页 </a></li>

                    <li><a><i class="fa fa-sitemap"></i> 组织人员管理 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}/admin/orglist"><i class="fa fa-sitemap"></i>组织管理</a></li>
                            <li><a href="${pageContext.request.contextPath}/admin/userlist"><i class="fa fa-user"></i>用户管理 </a></li>
                            <%--<li><a ><i class="fa fa-cubes"></i>职务（岗位）管理</a></li>--%>
                            <%--<li><a ><i class="fa fa-bars"></i>职级管理 </a></li>--%>
                        </ul>
                    </li>

                    <li><a><i class="fa fa-th-large"></i> 应用管理 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}/admin/applist"><i class="fa fa-th-large"></i>应用管理</a></li>
                            <li><a href="${pageContext.request.contextPath}/admin/modulelist"><i class="fa fa-th"></i>模块管理 </a></li>
                            <%--<li><a href="${pageContext.request.contextPath}/admin/modulereslist"><i class="fa fa-th-list"></i>资源管理</a></li>--%>
                        </ul>
                    </li>

                    <li><a><i class="fa fa-cog"></i> 权限管理 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}/admin/toroleadd"><i class="fa fa-male"></i>添加角色</a></li>
                            <li><a href="${pageContext.request.contextPath}/admin/rolelist"><i class="fa fa-male"></i>角色管理</a></li>
                            <%--<li><a ><i class="fa fa-group"></i>用户组管理 </a></li>--%>
                            <li><a ><i class="fa fa-key"></i>授权管理<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li class="sub_menu"><a href="${pageContext.request.contextPath}/admin/rightperson">用户授权</a></li>
                                    <%--<li class="sub_menu"><a >用户组授权</a></li>--%>
                                    <%--<li class="sub_menu"><a >职级授权</a></li>--%>
                                    <%--<li class="sub_menu"><a >组织授权</a></li>--%>
                                </ul>
                            </li>
                         </ul>
                    </li>


                    <li><a><i class="fa fa-user"></i> 个人中心 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a ><i class="fa fa-info-circle"></i>个人信息</a></li>
                            <li><a href="${pageContext.request.contextPath}/user/changepwd"><i class="fa fa-lock"></i>修改密码</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!-- /sidebar menu -->

        <!-- /menu footer buttons -->
        <div class="sidebar-footer hidden-small">
            <a data-toggle="tooltip" data-placement="top" title="">
                <span class="glyphicon" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="">
                <span class="glyphicon " aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="">
                <span class="glyphicon " aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="退出" href="${pageContext.request.contextPath}/logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
            </a>
        </div>
        <!-- /menu footer buttons -->
    </div>
</div>
