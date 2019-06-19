<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>数据查询</title>

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

        <!-- 工作区域 -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>查询条件
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
                                <form id="frmauto" name="frmauto" class="form-horizontal form-label-left" method="get" novalidate>
                                    <div id="step-1">
                                        <div class="form-group">
                                            <label for="autocarNo" class="control-label col-md-3 col-sm-3 col-xs-12">车牌号</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <select id="autocarNo" name="autocarNo" class="form-control">
                                                    <option value="">请选择车牌号</option>
                                                    <c:forEach var="autocar" items="${autoCars}" varStatus="ac">
                                                        <option value="${autocar.autocarNo}">${autocar.autocarNo}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="autopartsName" class="control-label col-md-3 col-sm-3 col-xs-12">配件名称</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <input id="autopartsName" class="form-control" name="autopartsName" type="text">
                                            </div>
                                        </div>

                                        <div class="item form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="purchaseTime1">采购时间</label>
                                            <div class="col-md-3 col-sm-3 col-xs-12">
                                                <label class="control-label col-md-2 col-sm-2 col-xs-2" for="purchaseTime2">从</label>
                                                <div class="input-group date col-md-10 col-sm-10 col-xs-10 "
                                                     data-provide="datepicker">
                                                    <input id="purchaseTime1" class="form-control" name="purchaseTime1" type="text"
                                                           readonly placeholder="">
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                            <div class="col-md-3 col-sm-3 col-xs-12">
                                                <label class="control-label col-md-2 col-sm-2 col-xs-2" for="purchaseTime2">到</label>
                                                <div class="input-group date col-md-10 col-sm-10 col-xs-10 "
                                                     data-provide="datepicker">
                                                    <input id="purchaseTime2" class="form-control" name="purchaseTime2" type="text"
                                                           readonly placeholder="">
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                                                <button class="btn btn-success" type="button" id="btnSeach">
                                                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;查询
                                                </button>
                                                <button class="btn btn-default" type="button" id="btnCancel">
                                                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;取消
                                                </button>
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
        <!-- footer content -->
        <c:import url="../include/appfooter.jsp"/>
        <!-- /footer content -->
    </div>
</div>

<script src="${pageContext.request.contextPath}/static/vendors/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/bootstrapValidator.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/language/zh_CN.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.js"></script>
<%--<script src="${pageContext.request.contextPath}/static/vendors/validator/validator.js"></script>--%>
<script src="${pageContext.request.contextPath}/static/vendors/custom/js/custom.min.js"></script>

<script language="JavaScript">

    $(function () {
        //只能对每个输入框配置格式等属性?
        $('#purchaseTime1').parent().datepicker({
            autoclose: true, //自动关闭
            format: 'yyyy-mm-dd',   //日期格式
            language: "zh-CN",      //语言选择中文
            clearBtn: true,         //显示清除按钮
            todayHighlight: true,   //今天高亮
            weekStart: 0           //星期几是开始//startDate: '0d'
        });
    })

    $(function () {
        //只能对每个输入框配置格式等属性?
        $('#purchaseTime2').parent().datepicker({
            autoclose: true, //自动关闭
            format: 'yyyy-mm-dd',   //日期格式
            language: "zh-CN",      //语言选择中文
            clearBtn: true,         //显示清除按钮
            todayHighlight: true,   //今天高亮
            weekStart: 0           //星期几是开始//startDate: '0d'
        });
    })


    $(function () {
        $('#btnSeach').click(function () {
            document.frmauto.action="${pageContext.request.contextPath}/autopartlist";
            document.frmauto.submit();
        })
    })

    $(function () {
        $('#btnCancel').click(function () {
            window.location.replace("${pageContext.request.contextPath}/autopartlist");
        })
    })

</script>


</body>
</html>
