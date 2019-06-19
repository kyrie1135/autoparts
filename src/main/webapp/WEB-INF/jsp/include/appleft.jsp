<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <a href="${pageContext.request.contextPath}/index" class="site_title"><i class="fa fa-cubes"></i> <span>配件采购管理</span></a>
        </div>
        <div class="clearfix"></div>
        <br />
        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <h3></h3>
                <ul class="nav side-menu">

                    <li><a href="${pageContext.request.contextPath}/index"><i class="fa fa-home"></i> 返回首页 </a></li>

                    <c:forEach var="app" items="${sessionScope.appList}">
                        <li><a><i class="${app.appIconUrl}"></i> ${app.appName} <span class="fa fa-chevron-down"></span></a>
                            <c:if test="${fn:length(sessionScope.moduleResList)>0}" >
                                <ul class="nav child_menu">
                                    <c:forEach var="moduleres" items="${sessionScope.moduleResList}">
                                        <c:if test="${app.appId eq moduleres.appId}">
                                            <li><a href="${pageContext.request.contextPath}${moduleres.resourceUrl}"><i class="${moduleres.resourceIconUrl}"></i>${moduleres.resourceName}</a></li>
                                        </c:if>
                                    </c:forEach>
                                </ul>
                            </c:if>
                        </li>
                    </c:forEach>
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
<script language="JavaScript">
    function tourl(url) {
        window.location.replace(url);
    }
</script>