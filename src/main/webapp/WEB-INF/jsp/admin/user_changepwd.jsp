<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>密码修改</title>
    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/vendors/custom/css/custom.min.css" rel="stylesheet">
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

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>密码修改
                            <small></small>
                        </h3>
                    </div>
                </div>
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_content">
                                <!--form-->
                                <form id="frmpwd" name="frmpwd" class="form-horizontal form-label-left" method="post" novalidate>
                                    <div id="step-1">
                                        <div class="item form-group">
                                            <label for="currentPassword"
                                                   class="control-label col-md-3 col-sm-3 col-xs-12">新密码</label>
                                            <div class="col-md-5 col-sm-5 col-xs-12">
                                                <input id="currentPassword" type="password"
                                                       name="currentPassword" data-validate-linked="password"
                                                       class="form-control" >
                                            </div>
                                        </div>
                                        <div class="item form-group">
                                            <label for="currentPassword2"
                                                   class="control-label col-md-3 col-sm-3 col-xs-12">重复密码</label>
                                            <div class="col-md-5 col-sm-5 col-xs-12">
                                                <input id="currentPassword2" type="password"
                                                       name="currentPassword2" data-validate-linked="password"
                                                       class="form-control col-md-7 col-xs-12">
                                            </div>
                                        </div>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                                                <button class="btn btn-success" type="button" onclick="btnSave()">
                                                    <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;提交</button>
                                                <%--<button class="btn btn-primary" type="button" id="btnCancel">取消</button>--%>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <!-- /from -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /page content -->

        <!-- 页脚 -->
        <c:import url="../include/appfooter.jsp"/>
        <!-- /页脚 -->
    </div>
</div>

<script src="${pageContext.request.contextPath}/static/vendors/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/bootstrapValidator.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/language/zh_CN.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/custom/js/custom.min.js"></script>
<script language="JavaScript">
    function btnSave() {
        //开启验证
        $('#frmpwd').data('bootstrapValidator').validate();
        if (!$('#frmpwd').data('bootstrapValidator').isValid()) {
            return;
        }
        document.frmpwd.action="${pageContext.request.contextPath}/user/savepwd";
        document.frmpwd.submit();
    }

    function frmValidator() {
        $("#frmpwd").bootstrapValidator({
            live: 'disabled',//验证时机，enabled是内容有变化就验证（默认），disabled和submitted是提交再验证
            excluded: [':disabled', ':hidden', ':not(:visible)'],//排除无需验证的控件，比如被禁用的或者被隐藏的
            submitButtons: '#btnAddSave',//指定提交按钮，如果验证失败则变成disabled
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                //这里校验是通过input名称,而不是id进行校验
                currentPassword: {
                    message: '密码验证失败',
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 10,
                            message: '密码长度必须在6到10位之间'
                        }
                    }
                },
                currentPassword2: {
                    message: '重复密码验证失败',
                    validators: {
                        notEmpty: {
                            message: '重复密码不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 10,
                            message: '密码长度必须在6到10位之间'
                        },
                        identical: {//相同
                            field: 'currentPassword',
                            message: '两次密码不一致'
                        }
                    }
                }
            }
        });
    };

    //初始化表单验证
    $(document).ready(function () {
        frmValidator();
    });

</script>


</body>
</html>
