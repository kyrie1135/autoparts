<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>系统登录</title>

    <!-- CSS -->
    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/vendors/custom/css/login-form-elements.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/vendors/custom/css/login-style.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body onload="init('${pageContext.request.contextPath}/static/vendors/custom/images/backgrounds/02.jpg')">

<!-- Top content -->
<div class="top-content">
    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>汽车配件采购管理系统</strong></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    ${msg}
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h2>登录</h2>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="${pageContext.request.contextPath}/login" method="post"
                              class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-username">用户ID</label>
                                <div class="input-group input-group-lg">
                                    <span class="input-group-addon">
                                        <i class="fa fa-user" aria-hidden="true"></i></span>
                                    <input type="text" name="userLoginId" placeholder="请输入登陆账号"
                                           class="form-username form-control" id="form-username"></div>
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">密码</label>
                                <div class="input-group input-group-lg">
                                    <span class="input-group-addon"><i
                                            class="fa fa-key" aria-hidden="true"></i></span>
                                    <input type="password" name="currentPassword" placeholder="请输入密码"
                                           class="form-password form-control" id="form-password">
                                </div>

                            </div>
                            <button type="submit" class="btn btn-success">登录</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>


<!-- Javascript -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/static/vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<!-- NProgress -->
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/static/vendors/jquery-backstretch/jquery.backstretch.min.js"></script>

<!-- Custom Theme Scripts -->
<script src="${pageContext.request.contextPath}/static/vendors/custom/js/scripts.js"></script>

<script language="JavaScript">
    function init(url) {
        jQuery(document).ready(function () {

            /*
            Fullscreen background
            */
            $.backstretch(url);
        })
    }

</script>


</body>

</html>