<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>模块管理</title>

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
                        <h3>模块管理
                            <small>
                                <button id="btnAdd"
                                        class="btn btn-success"
                                        type="button" data-toggle="modal"
                                        data-target=".add-modal" data-backdrop="static"><span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>&nbsp;添加模块
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
                            <div class="x_title">
                                <h2>
                                    <c:if test="${not empty appName}"><c:out value="[${appName}]"/></c:if>
                                    <c:if test="${empty appName}">全部应用</c:if>
                                    &nbsp;模块列表</h2>
                                <div>

                                </div>
                                <div class="clearfix"></div>
                            </div>
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

            <!--新建按钮弹出框-->
            <div class="modal fade add-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">添加模块</h4>
                        </div>
                        <!--form-->
                        <form id="frmAdd" name="frmAdd" class="form-horizontal form-label-left" novalidate method="post">
                            <input type="hidden" id="selectAppId" name="selectAppId" value="${appId}">
                            <input type="hidden" id="selectAppName" name="selectAppId" value="${appName}">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="appId">所属应用</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <select id="appId" name="appId" class="form-control">
                                            <!--如果appId = -1,构造列用列表下拉框,以便可以选择-->
                                            <c:if test="${appId eq -1}">
                                                <c:forEach var="app" items="${applist}">
                                                    <option value="${app.appId}">${app.appName}</option>
                                                </c:forEach>
                                            </c:if>
                                            <!--如果appId <> -1,直接显示所属应用-->
                                            <c:if test="${appId ne -1}">
                                                <option value="${appId}">${appName}</option>
                                            </c:if>
                                        </select>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="moduleName">模块名称*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleName" name="moduleName" placeholder="模块名称作为菜单项名称"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="nameinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="moduleCode" class="control-label col-md-3 col-sm-3 col-xs-12">模块代码*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleCode" name="moduleCode" placeholder="模块代码唯一标识模块"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="codeinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="orderIndex" class="control-label col-md-3 col-sm-3 col-xs-12">显示序号</label>
                                    <div class="col-md-3 col-sm-3 col-xs-3">
                                        <input type="text" id="orderIndex" name="orderIndex" placeholder="定义在导航栏中的位置"
                                               class="form-control"><span id="Indexinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="moduleIconUrl" class="control-label col-md-3 col-sm-3 col-xs-12">模块图标</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleIconUrl" name="moduleIconUrl" placeholder="图标名称"
                                               class="form-control"><span id="iconinfo"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label for="moduleUrl" class="control-label col-md-3 col-sm-3 col-xs-12">模块导航入口URL</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleUrl" name="moduleUrl" placeholder="URL地址"
                                               class="form-control"><span id="urlinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">是否需要权限</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="needRight" class="btn-group" data-toggle="buttons">
                                            <label id="needRightBtn1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="needRight" checked value="1">是
                                                &nbsp;
                                            </label>
                                            <label id="needRightBtn2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="needRight" value="0">否
                                            </label>
                                        </div>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">是否管理模块</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="isAdmin" class="btn-group" data-toggle="buttons">
                                            <label id="isAdminBtn1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdmin" checked value="0">普通模块
                                                &nbsp;
                                            </label>
                                            <label id="isAdminBtn2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdmin" value="1">系统模块
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
            <!--编辑按钮弹出框-->
            <div class="modal fade edit-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">修改模块信息</h4>
                        </div>
                        <!--form-->
                        <form id="frmEdit" name="frmEdit" class="form-horizontal form-label-left" novalidate method="post">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label for="appNameEdit" class="control-label col-md-3 col-sm-3 col-xs-12">所属应用</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="appNameEdit" name="appNameEdit" placeholder="" readonly
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="appnameinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="moduleNameEdit" class="control-label col-md-3 col-sm-3 col-xs-12">模块名称*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleNameEdit" name="moduleNameEdit" placeholder="模块名称作为菜单项名称"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="nameinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="moduleCodeEdit" class="control-label col-md-3 col-sm-3 col-xs-12">模块代码*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleCodeEdit" name="moduleCodeEdit" placeholder="模块代码唯一标识模块"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="codeinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="orderIndexEdit" class="control-label col-md-3 col-sm-3 col-xs-12">显示序号</label>
                                    <div class="col-md-3 col-sm-3 col-xs-3">
                                        <input type="text" id="orderIndexEdit" name="orderIndexEdit" placeholder="定义在导航栏中的位置"
                                               class="form-control"><span id="IndexinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="moduleIconUrlEdit" class="control-label col-md-3 col-sm-3 col-xs-12">模块图标</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleIconUrlEdit" name="moduleIconUrlEdit" placeholder="图标名称"
                                               class="form-control"><span id="iconinfoEdit"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label for="moduleUrlEdit" class="control-label col-md-3 col-sm-3 col-xs-12">模块导航入口URL</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="moduleUrlEdit" name="moduleUrlEdit" placeholder="URL地址"
                                               class="form-control"><span id="urlinfoEdit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">是否需要权限</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="needRightEdit" class="btn-group" data-toggle="buttons">
                                            <label id="needRightBtnEdit1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="needRightEdit" checked value="1">是
                                                &nbsp;
                                            </label>
                                            <label id="needRightBtnEdit2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="needRightEdit" value="0">否
                                            </label>
                                        </div>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">是否管理模块</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="isAdminEdit" class="btn-group" data-toggle="buttons">
                                            <label id="isAdminBtnEdit1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdminEdit" checked value="0">普通模块
                                                &nbsp;
                                            </label>
                                            <label id="isAdminBtnEdit2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isAdminEdit" value="1">系统模块
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
                                <button type="btnEditReset" class="btn btn-primary">
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
                            <p>这将会删除模块及其所有的模块权限资源，您确认要删除吗？</p>
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
    var context = '${pageContext.request.contextPath}';

    var selectedRowIndex;
    var selectedId;

    //初始化
    $(function () {
        initTable();
    })


    //初始化组织列表
    function initTable () {
        var appId=$('#selectAppId').val();
        if(appId == '-1'){
            appId='';
        }
        $('#tbList').bootstrapTable({
            url: '${pageContext.request.contextPath}/admin/module?appId='+appId,
            uniqueId: "moduleId",
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
                    field: 'moduleName',
                    title: '模块名称',
                    valign: 'middle',
                    width: 200
                }, {
                    field: 'moduleCode',
                    title: '模块代码',
                    valign: 'middle',
                    width: 200
                }, {
                    field: 'orderIndex',
                    title: '显示序号',
                    align: 'center',
                    valign: 'middle',
                    width: 90
                },{
                    field: 'isAdmin',
                    title: '模块类型',
                    formatter: function (value, row, index) {
                        return dataFormat(value)
                    },
                    align: 'center',
                    valign: 'middle',
                    width: 120
                }, {
                    field: 'appName',
                    title: '所属应用',
                    valign: 'middle',
                    width: 160
                }, {
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    width: 250,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'moduleId',
                    title: '#',
                    align: 'center',
                    width: 5
                },{
                    field: 'appId',
                    title: '#',
                    align: 'center',
                    width: 5
                }
            ],
            onCheck:function(row,$element){
                selectedRowIndex = $element.data('index');
            }
        });
        $('#tbList').bootstrapTable('hideLoading');
        $('#tbList').bootstrapTable('hideColumn', 'moduleId');
        $('#tbList').bootstrapTable('hideColumn', 'appId');
    }

    function dataFormat(cellval) {
        if (cellval != null) {
            var data = parseInt(cellval);
            if(data==0){
                return "普通模块"
            }else{
                return "系统模块"
            }
        }
    }

    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnUpdate" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>',
            '<button type="button" id="btnDel" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>',
            // '<button type="button" id="btnMan" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>权限资源管理</button>',
        ].join('');
    }

    window.operateEvents = {
        'click #btnUpdate': function (e, value, row, index) {
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);

            $("#appNameEdit").val(row.appName);
            $("#moduleNameEdit").val(row.moduleName);
            $("#moduleCodeEdit").val(row.moduleCode);
            $("#orderIndexEdit").val(row.orderIndex);
            $("#moduleIconUrlEdit").val(row.moduleIconUrl);
            $("#moduleUrlEdit").val(row.moduleUrl);
            //$("#appDeveloperEdit").val(row.appDeveloper);

            if(row.needRight == 1){
                $("#needRightBtnEdit1.btn").button().removeClass("btn-default");
                $("#needRightBtnEdit1.btn").button().addClass("btn-primary");
                $("#needRightBtnEdit2.btn").button().removeClass("btn-primary");
                $("#needRightBtnEdit2.btn").button().addClass("btn-default");
            }else{
                $("#needRightBtnEdit2.btn").button().removeClass("btn-default");
                $("#needRightBtnEdit2.btn").button().addClass("btn-primary");
                $("#needRightBtnEdit1.btn").button().removeClass("btn-primary");
                $("#needRightBtnEdit1.btn").button().addClass("btn-default");
            }
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
            window.location.replace("${pageContext.request.contextPath}/admin/modulereslist?moduleId="
                +row.moduleId+"&moduleName="+encodeURIComponent(row.moduleName)
                +"&appId="+row.appId+"&appName="+encodeURIComponent(row.appName));
            //alert(row.userId);
        }
    };

    $(function () {
        //添加保存响应函数
        $('#btnAddSave').click(function () {

            //开启验证
            $('#frmAdd').data('bootstrapValidator').validate();
            if (!$('#frmAdd').data('bootstrapValidator').isValid()) {
                return;
            }

            var needRight=$(':radio[name="needRight"]:checked').val();
            var isAdmin=$(':radio[name="isAdmin"]:checked').val();
            var appName=$("#appId").find("option:selected").text();

            var userdata = {
                "moduleId": "",
                "needRight": String(needRight),
                "isAdmin": String(isAdmin),
                "moduleName": $("#moduleName").val(),
                "moduleCode": $("#moduleCode").val(),
                "orderIndex": $("#orderIndex").val(),
                "moduleIconUrl": $("#moduleIconUrl").val(),
                "moduleUrl": $("#moduleUrl").val(),
                "appId": $("#appId").val(),
                "appName": String(appName)
            };
            $.ajax({
                url: context+"/admin/module",
                type: "POST",
                // data表示发送的数据
                data: JSON.stringify(userdata),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnData, status) {
                    //添加到表
                    $('#tbList').bootstrapTable('append', returnData);
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

            var needRight =$(':radio[name="needRightEdit"]:checked').val();
            var isAdmin=$(':radio[name="isAdminEdit"]:checked').val();

            var userdata = {
                "moduleId": selectContent.moduleId,
                "isAdmin": String(isAdmin),
                "needRight": String(needRight),
                "moduleName": $("#moduleNameEdit").val(),
                "moduleCode": $("#moduleCodeEdit").val(),
                "orderIndex": $("#orderIndexEdit").val(),
                "moduleIconUrl": $("#moduleIconUrlEdit").val(),
                "moduleUrl": $("#moduleUrlEdit").val(),
                "appId": selectContent.appId,
                "appName": $("#appNameEdit").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/module",
                type: "PUT",
                // data表示发送的数据
                data: JSON.stringify(userdata),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (data, status) {
                    var selectedRowIndex = getindex(selectContent.moduleId);
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
                url: "/admin/module",
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
                    $("#tbList").bootstrapTable("removeByUniqueId",selectContent.moduleId);
                }
            });

            $('.del-modal').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });

        $("#needRightBtn1.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#needRightBtn2.btn").button().removeClass("btn-primary");
            $("#needRightBtn2.btn").button().addClass("btn-default");
        });
        $("#needRightBtn2.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#needRightBtn1.btn").button().removeClass("btn-primary");
            $("#needRightBtn1.btn").button().addClass("btn-default");
        });
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
    });

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
                moduleName: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '模块名称不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '模块名称长度必须在2-10个字符之间之间'
                        }
                    }
                },
                moduleCode: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '模块代码不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '模块代码长度必须在2-10个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '模块代码只能包含大写、小写字母、数字和下划线'
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
                moduleNameEdit: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '模块名称不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '模块名称长度必须在2-10个字符之间之间'
                        }
                    }
                },
                moduleCodeEdit: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '模块代码不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '模块代码长度必须在2-10个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '模块代码只能包含大写、小写字母、数字和下划线'
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

        //clearForm('#frmAdd');

        $("#moduleName").val('');
        $("#moduleCode").val('');
        $("#orderIndex").val('');
        $("#moduleIconUrl").val('');
        $("#moduleUrl").val('');

        //移除上次校验配置
        $('#frmAdd').data('bootstrapValidator').destroy();
        $('#frmAdd').data('bootstrapValidator', null);
        //重新添加校验
        frmAddValidator();
    });
    $(".edit-modal").on('hidden.bs.modal', function (e) {
        //clearForm('#frmEdit');
        //移除上次校验配置
        $('#frmEdit').data('bootstrapValidator').destroy();
        $('#frmEdit').data('bootstrapValidator', null);
        //重新添加校验
        frmEditValidator();
    });
    //清空表单
    function clearForm(form) {
        // if(){
        //
        // }
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
    function getindex(moduleId) {
        var rows=$("#tbList").bootstrapTable('getData');
        if(rows == null || typeof (rows) == "undefined"){
            return 0;
        }else{
            for(var i=0 ; i< rows.length;i++){
                if(moduleId == rows[i].moduleId){
                    return i;
                }
            }
        }

    }

</script >

</body>
</html>