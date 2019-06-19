<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>应用管理</title>

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
        <c:import url="../include/navleft.jsp"/>
        <!--/左侧导航栏-->
        <!-- 页面头部 -->
        <c:import url="../include/navheader.jsp"/>
        <!-- /页面头部 -->

        <!-- 页面内容 -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>应用管理
                            <small>
                                <button id="btnAdd"
                                        class="btn btn-success"
                                        type="button" data-toggle="modal"
                                        data-target=".add-modal" data-backdrop="static"><span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>&nbsp;添加应用
                                </button>
                            </small>
                        </h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5   form-group pull-right top_search">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="按名称查询">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">查询!</button>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_content">
                                <table id="tbList" class="table"
                                       data-click-to-select="true"
                                       data-sort-name="appId"
                                       data-sort-order="asc">
                                </table>
                                <%--<c:import url="page.jsp"/>--%>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <!--添加按钮弹出框-->
            <div class="modal fade add-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">注册应用</h4>
                        </div>
                        <!--form-->
                        <form id="frmAdd" name="frmAdd" class="form-horizontal form-label-left" novalidate method="post">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="appName">应用名称*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appName" name="appName" placeholder="应用名称作为菜单模块分组名称"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="nameinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="appCode" class="control-label col-md-3 col-sm-3 col-xs-12">应用代码*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appCode" name="appCode" placeholder="应用代码唯一标识应用,一般为部署的上下文根"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="codeinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="orderIndex" class="control-label col-md-3 col-sm-3 col-xs-12">显示序号</label>
                                    <div class="col-md-3 col-sm-3 col-xs-3">
                                        <input type="text" id="orderIndex" name="orderIndex" placeholder="在导航栏中的位置"
                                               class="form-control"><span id="Indexinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="appIconUrl" class="control-label col-md-3 col-sm-3 col-xs-12">应用图标</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appIconUrl" name="appIconUrl" placeholder="图标名称"
                                               class="form-control"><span id="iconinfo"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label for="appUrl" class="control-label col-md-3 col-sm-3 col-xs-12">应用导航入口URL</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appUrl" name="appUrl" placeholder="URL地址"
                                               class="form-control"><span id="urlinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="appDeveloper">开发商名称</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appDeveloper" name="appDeveloper" class="form-control">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">是否管理应用</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="isAdmin" class="btn-group" data-toggle="buttons">
                                            <label id="isAdminBtn1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdmin" checked value="0">普通应用
                                                &nbsp;
                                            </label>
                                            <label id="isAdminBtn2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdmin" value="1">系统应用
                                            </label>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="modal-footer">
                                <button type="button" id="btnAddSave"
                                        class="btn btn-success">
                                    <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                </button>
                                <button type="reset" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;重置</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">
                                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;取消</button>
                            </div>
                        </form>
                        <!-- /form -->
                    </div>
                </div>
            </div>
            <!--修改按钮弹出框-->
            <div class="modal fade edit-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">注册应用</h4>
                        </div>
                        <!--form-->
                        <form id="frmEdit" name="frmEdit" class="form-horizontal form-label-left" novalidate method="post">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label for="appNameEdit" class="control-label col-md-3 col-sm-3 col-xs-12">应用名称*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appNameEdit" name="appNameEdit" placeholder="应用名称作为菜单模块分组名称"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="nameinfoedit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="appCodeEdit" class="control-label col-md-3 col-sm-3 col-xs-12">应用代码*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appCodeEdit" name="appCodeEdit" placeholder="应用代码唯一标识应用,一般为部署的上下文根"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="codeinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="orderIndexEdit" class="control-label col-md-3 col-sm-3 col-xs-12">显示序号</label>
                                    <div class="col-md-3 col-sm-3 col-xs-3">
                                        <input type="text" id="orderIndexEdit" name="orderIndexEdit" placeholder="在导航栏中的位置"
                                               class="form-control"><span id="IndexinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="appIconUrlEdit" class="control-label col-md-3 col-sm-3 col-xs-12">应用图标</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appIconUrlEdit" name="appIconUrlEdit" placeholder="图标名称"
                                               class="form-control"><span id="iconinfoEdit"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label for="appUrlEdit" class="control-label col-md-3 col-sm-3 col-xs-12">应用导航入口URL</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appUrlEdit" name="appUrlEdit" placeholder="URL地址"
                                               class="form-control"><span id="urlinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="appDeveloperEdit" class="control-label col-md-3 col-sm-3 col-xs-12">开发商名称</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appDeveloperEdit" name="appDeveloperEdit" class="form-control">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">是否管理应用</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="isAdminEdit" class="btn-group" data-toggle="buttons">
                                            <label id="isAdminBtnEdit1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdminEdit" checked value="0">普通应用
                                                &nbsp;
                                            </label>
                                            <label id="isAdminBtnEdit2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdminEdit" value="1">系统应用
                                            </label>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="modal-footer">
                                <button type="button" id="btnEditSave"
                                        class="btn btn-success">
                                    <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                </button>
                                <button type="button" id="btnEditReset" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;重置</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">
                                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;取消</button>
                            </div>
                        </form>
                        <!-- /form -->
                    </div>
                </div>
            </div>
            <!-- 删除确认框 -->
            <div class="modal fade del-modal">
                <div class="modal-dialog">
                    <div class="modal-content message_align">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">×</span></button>
                            <h4 class="modal-title">提示信息</h4>
                        </div>
                        <div class="modal-body">
                            <p>这将会删除应用及其所有的模块，您确认要删除吗？</p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" data-dismiss="modal">取消</button>
                            <button class="btn btn-danger" id="btnDeleteConfirm" data-dismiss="modal">确定</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

        </div>
        <!-- /页面内容 -->

        <!-- 页脚 -->
        <c:import url="../include/navfooter.jsp"/>
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

<script language="JavaScript">
    var selectedRowIndex;
    var selectedId;

    //初始化
    $(function () {
        initTable();
    })


    //初始化列表
    function initTable () {
        $('#tbList').bootstrapTable({
            url: '${pageContext.request.contextPath}/admin/app',
            uniqueId: "appId",
            singleSelect: true,
            columns: [
                {
                    title: '序号',
                    formatter: function (value, row, index) {
                        return index+1;
                    },
                    align: 'center',
                    valign: 'middle',
                    width: 60
                }, {
                    field: 'appName',
                    title: '应用名称',
                    valign: 'middle',
                    width: 200
                }, {
                    field: 'appCode',
                    title: '应用代码',
                    valign: 'middle',
                    width: 160
                }, {
                    field: 'orderIndex',
                    title: '显示序号',
                    align: 'center',
                    valign: 'middle',
                    width: 90
                }, {
                    field: 'isAdmin',
                    title: '应用类型',
                    formatter: function (value, row, index) {
                        return dataFormat(value)
                    },
                    align: 'center',
                    valign: 'middle',
                    width: 80
                }, {
                    field: 'appDeveloper',
                    title: '开发商',
                    valign: 'middle',
                    width: 150
                },{
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    width: 200,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'appId',
                    title: '#',
                    align: 'center',
                    width: 50
                }
            ],
            onCheck:function(row,$element){
                selectedRowIndex = $element.data('index');
            }
        });
        $('#tbList').bootstrapTable('hideLoading');
        $('#tbList').bootstrapTable('hideColumn', 'appId');

    }

    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnUpdate" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>',
            '<button type="button" id="btnDel" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>',
            '<button type="button" id="btnMan" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-th" aria-hidden="true"></span>管理模块</button>',
        ].join('');
    }

    window.operateEvents = {
        'click #btnUpdate': function (e, value, row, index) {
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);

            $("#appNameEdit").val(row.appName);
            $("#appCodeEdit").val(row.appCode);
            $("#orderIndexEdit").val(row.orderIndex);
            $("#appIconUrlEdit").val(row.appIconUrl);
            $("#appUrlEdit").val(row.appUrl);
            $("#appDeveloperEdit").val(row.appDeveloper);

            if(row.isAdmin == 0){
                $("#isAdminBtnEdit1.btn").button().removeClass("btn-default");
                $("#isAdminBtnEdit1.btn").button().addClass("btn-primary");
                $("#isAdminBtnEdit2.btn").button().removeClass("btn-primary");
                $("#isAdminBtnEdit2.btn").button().addClass("btn-default");
            }else{
                $("#isAdminBtnEdit2.btn").button().removeClass("btn-default");
                $("#isAdminBtnEdit2.btn").button().addClass("btn-primary");
                $("#isAdminBtnEdit1.btn").button().removeClass("btn-primary");
                $("#isAdminBtnEdit1.btn").button().addClass("btn-default");
            }

            $('.edit-modal').modal({backdrop: 'static', keyboard: false});
        },
        'click #btnDel': function (e, value, row, index) {
            //显示删除确认对话框
            selectedId = row.appId;
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);
            $('.del-modal').modal({backdrop: 'static', keyboard: false});
        },
        'click #btnMan': function (e, value, row, index) {
            window.location.replace("${pageContext.request.contextPath}/admin/modulelist?appId="+row.appId+"&appName="+encodeURIComponent(row.appName));
            //alert(row.userId);
        }
    };

    $(function () {
        //新建保存响应函数
        $('#btnAddSave').click(function () {

            //开启验证
            $('#frmAdd').data('bootstrapValidator').validate();
            if (!$('#frmAdd').data('bootstrapValidator').isValid()) {
                return;
            }

            var isAdmin=$(':radio[name="isAdmin"]:checked').val();

            var userdata = {
                "appId": "",
                "isAdmin": String(isAdmin),
                "appName": $("#appName").val(),
                "appCode": $("#appCode").val(),
                "orderIndex": $("#orderIndex").val(),
                "appIconUrl": $("#appIconUrl").val(),
                "appUrl": $("#appUrl").val(),
                "appDeveloper": $("#appDeveloper").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/app",
                type: "POST",
                // data表示发送的数据
                data: JSON.stringify(userdata),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnData, status) {
                    //添加到表
                    $('#tbList').bootstrapTable('append',returnData);
                }
            });
            //关闭模态框
            $('.add-modal').modal('hide');
            return false;
        })

        //编辑保存响应函数
        $('#btnEditSave').click(function () {

            //开启验证
            $('#frmEdit').data('bootstrapValidator').validate();
            if (!$('#frmEdit').data('bootstrapValidator').isValid()) {
                return;
            }

            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];

            var isAdmin=$(':radio[name="isAdminEdit"]:checked').val();

            var userdata = {
                "appId": selectContent.appId,
                "isAdmin": String(isAdmin),
                "appName": $("#appNameEdit").val(),
                "appCode": $("#appCodeEdit").val(),
                "orderIndex": $("#orderIndexEdit").val(),
                "appIconUrl": $("#appIconUrlEdit").val(),
                "appUrl": $("#appUrlEdit").val(),
                "appDeveloper": $("#appDeveloperEdit").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/app",
                type: "PUT",
                // data表示发送的数据
                data: JSON.stringify(userdata),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (data, status) {
                    var selectedRowIndex = getindex(selectContent.appId);
                    $('#tbList').bootstrapTable('updateRow',{index: selectedRowIndex,row: data});
                }
            });
            //关闭模态框
            $('.edit-modal').modal('hide');
            return false;
        })

        //删除确认响应函数
        $("#btnDeleteConfirm").click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/app",
                type: "DELETE",
                data: JSON.stringify(selectContent),
                contentType: "application/json;charset=UTF-8",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    if (data && data.resultcode == '200') {
                        console.log(data.result.today);
                    };
                    //删除表格行
                    $("#tbList").bootstrapTable("removeByUniqueId",selectContent.appId);
                }
            });

            $('.del-modal').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });

        //编辑框重置按钮
        $('#btnEditReset').click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];

            $("#appNameEdit").val(selectContent.appName);
            $("#appCodeEdit").val(selectContent.appCode);
            $("#orderIndexEdit").val(selectContent.orderIndex);
            $("#appIconUrlEdit").val(selectContent.appIconUrl);
            $("#appUrlEdit").val(selectContent.appUrl);
            $("#appDeveloperEdit").val(selectContent.appDeveloper);

            if(selectContent.isAdmin == 0){
                $("#isAdminBtnEdit1.btn").button().removeClass("btn-default");
                $("#isAdminBtnEdit1.btn").button().addClass("btn-primary");
                $("#isAdminBtnEdit2.btn").button().removeClass("btn-primary");
                $("#isAdminBtnEdit2.btn").button().addClass("btn-default");
            }else{
                $("#isAdminBtnEdit2.btn").button().removeClass("btn-default");
                $("#isAdminBtnEdit2.btn").button().addClass("btn-primary");
                $("#isAdminBtnEdit1.btn").button().removeClass("btn-primary");
                $("#isAdminBtnEdit1.btn").button().addClass("btn-default");
            }        })

        $("#isAdminBtn1.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#isAdminBtn2.btn").button().removeClass("btn-primary");
            $("#isAdminBtn2.btn").button().addClass("btn-default");
        });

        $("#isAdminBtn2.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#isAdminBtn1.btn").button().removeClass("btn-primary");
            $("#isAdminBtn1.btn").button().addClass("btn-default");
        });
        $("#isAdminBtnEdit1.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#isAdminBtnEdit2.btn").button().removeClass("btn-primary");
            $("#isAdminBtnEdit2.btn").button().addClass("btn-default");
        });
        $("#isAdminBtnEdit2.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#isAdminBtnEdit1.btn").button().removeClass("btn-primary");
            $("#isAdminBtnEdit1.btn").button().addClass("btn-default");
        });
    });

    function dataFormat(cellval) {
        if (cellval != null) {
            var data = parseInt(cellval);
            if(data==0){
                return "普通应用"
            }else{
                return "系统应用"
            }
        }
    }

    //初始化表单验证
    $(document).ready(function () {
        frmAddValidator();
        frmEditValidator();
    });
    //form验证规则
    function frmAddValidator() {
        $("#frmAdd").bootstrapValidator({
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
                appName: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '应用名称不能为空,必须在2-20个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 20,
                            message: '应用名称长度必须在2-20个字符之间之间'
                        }
                    }
                },
                appCode: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '应用代码不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '应用代码长度必须在2-10个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '应用代码只能包含大写、小写字母、数字和下划线'
                        }
                    }
                },
                orderIndex: {
                    message: '验证失败',
                    validators: {
                        stringLength: {
                            min: 0,
                            max: 2,
                            message: '显示序号必须在0-99之间'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: '显示序号只能是数字'
                        }
                    }
                }
            }

        });
    }
    function frmEditValidator() {
        $("#frmEdit").bootstrapValidator({
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
                appNameEdit: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '应用名称不能为空,必须在2-20个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 20,
                            message: '应用名称长度必须在2-20个字符之间之间'
                        }
                    }
                },
                appCodeEdit: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '应用代码不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '应用代码长度必须在2-10个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '应用代码只能包含大写、小写字母、数字和下划线'
                        }
                    }
                },
                orderIndexEdit: {
                    message: '验证失败',
                    validators: {
                        stringLength: {
                            min: 0,
                            max: 2,
                            message: '显示序号必须在0-99之间'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: '显示序号只能是数字'
                        }
                    }
                }
            }

        });
    }

    //清除modal框
    $(".add-modal").on('hidden.bs.modal', function (e) {
        clearForm('#frmAdd');
        //移除上次校验配置
        $('#frmAdd').data('bootstrapValidator').destroy();
        $('#frmAdd').data('bootstrapValidator', null);
        //重新添加校验
        frmAddValidator();
    });
    $(".edit-modal").on('hidden.bs.modal', function (e) {
        clearForm('#frmEdit');
        //移除上次校验配置
        $('#frmEdit').data('bootstrapValidator').destroy();
        $('#frmEdit').data('bootstrapValidator', null);
        //重新添加校验
        frmEditValidator();
    });
    //清空表单
    function clearForm(form) {
        // input清空
        $(':input', form).each(function () {
            var type = this.type;
            var tag = this.tagName.toLowerCase(); // normalize case
            if (type == 'text' || type == 'password' || type == 'email' || tag == 'textarea') {
                this.value = "";
            }else if(type == 'radio'){
                if(this.defaultChecked ){
                    this.checked = true;
                }else {
                    //设置为不选中
                    this.checked = false;
                }
            }else if (tag == 'select') {
                // 多选checkboxes清空
                // select 下拉框清空
                this.selectedIndex = -1;
            }
        });

    };


    //获得表格行索引
    function getindex(appId) {
        var rows=$("#tbList").bootstrapTable('getData');
        if(rows == null || typeof (rows) == "undefined"){
            return 0;
        }else{
            for(var i=0 ; i< rows.length;i++){
                if(appId == rows[i].appId){
                    return i;
                }
            }
        }

    }
</script >

</body>
</html>