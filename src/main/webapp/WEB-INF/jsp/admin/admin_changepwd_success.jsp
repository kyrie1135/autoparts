<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>密码修改成功</title>

    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/iCheck/skins/flat/green.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/custom/css/custom.min.css" rel="stylesheet" type="text/css">

</head>
<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <!--左侧导航栏-->
        <c:import url="../include/appleft.jsp"/>
        <!--/左侧导航栏-->
        <!-- 页面头部 -->
        <c:import url="../include/appheader.jsp"/>
        <!-- /页面头部 -->

        <!-- 页面内容 -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>&nbsp;
                            <small></small>
                        </h3>
                    </div>
                </div>
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                        <span class="text-success">密码修改成功</span>
                    </div>
                </div>
            </div>

        </div>
        <!-- /页面内容 -->

        <!-- 页脚 -->
        <c:import url="../include/appfooter.jsp"/>
        <!-- /页脚 -->
    </div>
</div>

<script src="${pageContext.request.contextPath}/static/vendors/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/bootstrapValidator.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/language/zh_CN.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/custom/js/custom.min.js"></script>

</body>
</html>