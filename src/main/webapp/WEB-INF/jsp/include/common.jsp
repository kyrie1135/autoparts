<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>common</title>
</head>
<body>

<!--页头-->
<div th:fragment="navheader">
    <div class="top_nav">
        <div class="nav_menu">
            <nav>
                <div class="nav toggle">
                    <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li class="">

                        <!--<c:set var="userLogin" value="${sessionScope.USER_SESSION}" />-->
                        <a href="javascript:;" class="user-profile " data-toggle="dropdown" aria-expanded="false">
                            <img th:src="@{/vendors/custom/images/user.png}" alt=""><label th:text="${session.USER_SESSION.userName}"/>
                            <span class=" fa fa-angle-down"></span>
                        </a>
                        <ul class="dropdown-menu dropdown-usermenu pull-right">
                            <li><a href="javascript:;"> 个人信息</a></li>
                            <li><a href="javascript:;">修改密码</a></li>
                            <li><a th:href="@{/logout}"><i class="fa fa-sign-out pull-right"></i> 退出</a></li>
                        </ul>
                    </li>

                </ul>
            </nav>
        </div>
    </div>
</div>
<!--/页头-->

<!--左侧导航-->
<div th:fragment="navleft">
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

                        <li><a th:href="@{/admin/index}"><i class="fa fa-home"></i> 返回管理首页 </a></li>

                        <li><a><i class="fa fa-sitemap"></i> 组织人员管理 <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                                <li><a th:href="@{/admin/orglist}"><i class="fa fa-sitemap"></i>组织管理</a></li>
                                <li><a th:href="@{/admin/userlist}"><i class="fa fa-user"></i>用户管理 </a></li>
                                <li><a ><i class="fa fa-cubes"></i>职务（岗位）管理</a></li>
                                <li><a ><i class="fa fa-bars"></i>职级管理 </a></li>
                            </ul>
                        </li>

                        <li><a><i class="fa fa-th-large"></i> 应用管理 <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                                <li><a th:href="@{/admin/applist}"><i class="fa fa-th-large"></i>应用管理</a></li>
                                <li><a th:href="@{/admin/modulelist}"><i class="fa fa-th"></i>模块管理 </a></li>
                                <li><a th:href="@{/admin/modulereslist}"><i class="fa fa-th-list"></i>资源管理</a></li>
                            </ul>
                        </li>

                        <li><a><i class="fa fa-cog"></i> 权限管理 <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                                <li><a th:href="@{/admin/roletoadd}"><i class="fa fa-male"></i>添加角色</a></li>
                                <li><a th:href="@{/admin/rolelist}"><i class="fa fa-male"></i>角色管理</a></li>
                                <li><a ><i class="fa fa-group"></i>用户组管理 </a></li>
                                <li><a th:href="@{/admin/right}"><i class="fa fa-key"></i>授权管理</a></li>
                            </ul>
                        </li>


                        <li><a><i class="fa fa-user"></i> 个人中心 <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                                <li><a ><i class="fa fa-info-circle"></i>个人信息</a></li>
                                <li><a ><i class="fa fa-lock"></i>修改密码</a></li>
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
                <a data-toggle="tooltip" data-placement="top" title="退出" th:href="@{/logout}">
                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                </a>
            </div>
            <!-- /menu footer buttons -->
        </div>
    </div>
</div>
<!--/左侧导航-->
<!--页脚-->
<div th:fragment="navfooter">
    <footer>
        <div class="pull-right">
            由xxx提供技术支撑
        </div>
        <div class="clearfix"></div>
    </footer>
</div>
<!--/页脚-->
</body>
</html>