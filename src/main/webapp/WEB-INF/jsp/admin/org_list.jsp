<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>组织管理</title>
    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap-treeview-patternfly/dist/bootstrap-treeview.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/iCheck/skins/flat/green.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/css/bootstrapValidator.min.css" rel="stylesheet" type="text/css">
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
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h4>组织管理
                                <small>
                                    <a class="btn-link" style="cursor: hand" id="btnAll" >点击查看全部一级组织 </a>
                                </small>
                            </h4>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <div id="tree"></div>
                        </div>
                    </div>
                </div>

                <div class="col-md-8 col-sm-8 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title ">
                            <div>
                                <button id="btnAdd" class="btn btn-success"
                                        type="button" data-toggle="modal"
                                        data-target=".add-modal" data-backdrop="static">
                                    <span class="glyphicon glyphicon-equalizer" aria-hidden="true"></span>&nbsp;添加组织
                                </button>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <form id="frmtb">
                                <table id="tbList" class="table"
                                       data-click-to-select="true"
                                       data-sort-name="orderIndex"
                                       data-sort-order="asc"
                                >
                                </table>

                            </form>
                            <%--<c:import url="page.jsp"/>--%>
                        </div>
                    </div>

                </div>

            </div>

            <!--添加按钮弹出框-->
            <div class="modal fade add-modal" tabindex="-1" role="dialog" aria-labelledby="orgaddModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">添加组织</h4>
                        </div>
                        <!--form-->
                        <form id="frmAdd" name="frmAdd" class="form-horizontal form-label-left" novalidate
                              method="post">
                            <input type="hidden" id="parentId" name="parentId" value="0">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12" for="orgName">组织名称 *</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orgName" class="form-control" name="orgName" type="text">
                                    </div>
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12" for="orgCode">组织代码 *</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orgCode" class="form-control" name="orgCode" type="text">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="orgShortName">组织简称</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orgShortName" class="form-control" name="orgShortName" type="text">
                                    </div>
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="orderIndex">排序号</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orderIndex" class="form-control" name="orderIndex" type="text">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12" for="contactAddress">联系地址</label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input id="contactAddress" class="form-control" name="contactAddress" type="text">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="comments">简介</label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <textarea id="comments" class="form-control" name="comments"
                                                  rows="3"></textarea>
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
            <div class="modal fade edit-modal" tabindex="-1" role="dialog" aria-labelledby="orgeditModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">组织信息修改</h4>
                        </div>
                        <!--form-->
                        <form id="frmEdit" name="frmEdit" class="form-horizontal form-label-left" novalidate
                              method="post">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="orgNameEdit">组织名称</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orgNameEdit" class="form-control" name="orgName" type="text">
                                    </div>
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="orgCodeEdit">组织代码</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orgCodeEdit" class="form-control" name="orgCode" type="text">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="orgShortNameEdit">组织简称</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orgShortNameEdit" class="form-control" name="orgShortNameEdit" type="text">
                                    </div>
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="orderIndexEdit">排序号</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="orderIndexEdit" class="form-control" name="orderIndexEdit" type="text">
                                    </div>
                                </div>
                                 <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="contactAddressEdit">联系方式</label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input id="contactAddressEdit" class="form-control" name="contactAddressEdit" type="text">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12"
                                           for="commentsEdit">组织简介</label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <textarea id="commentsEdit" class="form-control" name="commentsEdit"
                                                  rows="3"></textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" id="btnEditSave" class="btn btn-success">
                                    <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                </button>
                                <button type="button" id="btnEditReset" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;重置</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">
                                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;取消</button>
                            </div>
                        </form>
                        <!-- /from -->
                    </div>
                </div>
            </div>
            <!-- 删除确认框 -->
            <div class="modal fade" id="del-modal">
                <div class="modal-dialog">
                    <div class="modal-content message_align">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">×</span></button>
                            <h4 class="modal-title">提示信息</h4>
                        </div>
                        <div class="modal-body">
                            <p>您确认要删除吗？</p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" data-dismiss="modal">取消</button>
                            <button class="btn btn-danger" id="btnDeleteConfirm" data-dismiss="modal">确定</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            <!-- 不能删除提示框 -->
            <div class="modal fade" id="notDel-modal">
                <div class="modal-dialog">
                    <div class="modal-content message_align">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">×</span></button>
                            <h4 class="modal-title">提示信息</h4>
                        </div>
                        <div class="modal-body">
                            <p>该组织下有子组织,请先删除子组织!</p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" data-dismiss="modal">关闭</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

        </div>
        <!-- /页面内容 -->

        <!-- f页脚 -->
        <c:import url="../include/navfooter.jsp"/>
        <!-- /页脚 -->
    </div>
</div>

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/static/vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-treeview-patternfly/dist/bootstrap-treeview.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/bootstrapValidator.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/language/zh_CN.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/custom/js/custom.min.js"></script>

<script language="JavaScript">

    //初始化
    $(function () {
        var parentId = '0';
        initOrgTree();
        initOrgTable(parentId);
    });
    //全局变量
    var temporgParentId = '0';

    var selectedRowIndex;

    //初始化组织列表
    function initOrgTable (parentOrgId) {
        if(null == parentOrgId || "" == parentOrgId){
            parentOrgId = 0;
        }

        $('#tbList').bootstrapTable({
            url: '${pageContext.request.contextPath}/admin/orgs/'+ parentOrgId,

            uniqueId: "partyId",
            singleSelect: true,
            columns: [
                {
                    field: 'orderIndex',
                    title: '序号',
                    align: 'center',
                    width: 60
                }, {
                    field: 'orgName',
                    title: '名称',
                    width: 260
                }, {
                    field: 'orgCode',
                    title: '代码',
                    width: 150
                }, {
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    width: 140,
                    events: 'operateEvents',
                    formatter: operateFormatter
                }, {
                    field: 'partyId',
                    title: '#',
                    align: 'center',
                    width: 1
                }, {
                    field: 'orgId',
                    title: '#',
                    align: 'center',
                    width: 1
                }
            ],
            onCheck:function(row,$element){
                selectedRowIndex = $element.data('index');
            },
        });
        $('#tbList').bootstrapTable('hideLoading');
        $('#tbList').bootstrapTable('hideColumn', 'partyId');
        $('#tbList').bootstrapTable('hideColumn', 'orgId');
    }

    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnUpdate" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>',
            '<button type="button" id="btnDel" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>',
            // '<button type="button" id="btnResetPwd" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span>重置密码</button>'
        ].join('');
    }

    window.operateEvents = {
        'click #btnUpdate': function (e, value, row, index) {
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);

            $("#orgNameEdit").val(row.orgName)
            $("#orgCodeEdit").val(row.orgCode)
            $("#orgShortNameEdit").val(row.orgShortName)
            $("#orderIndexEdit").val(row.orderIndex)
            $("#contactAddressEdit").val(row.contactAddress)
            $("#commentsEdit").val(row.comments)

            $('.edit-modal').modal({backdrop: 'static', keyboard: false});
        },
        'click #btnDel': function (e, value, row, index) {
            selectedId = row.partyId;
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];
            //判断是否可以删除
            var canDel=false;
            $.ajax({
                type: "get",
                url: '${pageContext.request.contextPath }/admin/orgs/node/' + selectContent.partyId,
                async: false,
                success: function (data, status) {
                    if(data.length > 0){
                    }else{
                        canDel = true;
                    }
                }
            });
            if(!canDel){
                //有子组织,不能删除
                $('#notDel-modal').modal({backdrop: 'static', keyboard: false});
            }else{
                $('#del-modal').modal({backdrop: 'static', keyboard: false});
            }

        }
    };

    //初始化组织结构
    function initOrgTree(parentOrgId){
        if(null == parentOrgId || "" == parentOrgId){
            parentOrgId = 0;
        }
        $.ajax({
            url: "${pageContext.request.contextPath }/admin/orgs/node/" + parentOrgId,
            data: 0,
            type: "GET",
            dataType: "json",
            success: function (defaultData) {
                $('#tree').treeview({
                    data: defaultData,//数据源参数
                    //emptyIcon: "glyphicon glyphicon-stop",
                    levels: 1,
                    loadingIcon: "fa fa-hourglass",//懒加载过程中显示的沙漏字符图标
                    lazyLoad: loadNode, //loadNode()为点击懒加载节点目录时，运行的函数名称，把后端的数据添加到这个节点下面
                    onNodeSelected: function (event, node) {
                        //alert(node.id);//这里拿到id，就可以通过函数跳转触发点击事件
                        //$('#parentId').val(node.id);
                        temporgParentId = node.id;
                        tableRefresh(node.id);
                    },
                    onNodeUnselected: function (event, node) {
                    }
                });
            }
        });
    }
    //得到节点数据，同时可以把节点下级的数据通过函数发回去
    function loadNode(node, func) {
        // alert(node.id);
        // alert(func);
        $.ajax({
            type: "get",
            url: '${pageContext.request.contextPath }/admin/orgs/node/' + node.id,
            success: function (data, status) {
                func(data);
            }
        });
        //func(singleNode);//把新的下级节点数据发回到后端
        // $("#tree").treeview("addNode", [singleNode,node]);这一句和上面一句等同
    }
    function loadChild(node) {
        // alert(node.id);
        // alert(func);
        $.ajax({
            type: "get",
            url: '${pageContext.request.contextPath }/admin/orgs/node/' + node.id,
            success: function (data, status) {
                $("#tree").treeview("addNode", [data, node, 99, {silent: true}]);
            }
        });
        //func(singleNode);//把新的下级节点数据发回到后端
        // $("#tree").treeview("addNode", [singleNode,node]);这一句和上面一句等同
    }

    //重新初始化org页面
    function initPage(parentId){
        initOrgTree(parentId);
        tableRefresh(parentId);
    }
    //刷新table
    function tableRefresh(parentId) {
        if (typeof(parentId) == 'undefined') {
            parentId = '0';
        }
        $('#tbList').bootstrapTable('refresh', {url: '${pageContext.request.contextPath }/admin/orgs/' + parentId});
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
        $("#frmEdit").data('bootstrapValidator').destroy();
        $('#frmEdit').data('bootstrapValidator', null);
        //重新添加校验
        frmEditValidator();
    });

    $(function () {
        $('#btnAll').click(function () {
            tableRefresh('0');
        })

        //添加保存响应函数
        $('#btnAddSave').click(function () {
            //开启验证
            $('#frmAdd').data('bootstrapValidator').validate();
            if (!$('#frmAdd').data('bootstrapValidator').isValid()) {
                return;
            }

            var data = {
                "partyId": "",
                "orgName": $("#orgName").val(),
                "orgShortName": $("#orgShortName").val(),
                "parentOrgId": temporgParentId,
                "orgCode": $("#orgCode").val(),
                "orderIndex": $("#orderIndex").val(),
                "contactAddress": $("#contactAddress").val(),
                "comments": $("#comments").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath }/admin/org",
                type: "POST",
                // data表示发送的数据
                data: JSON.stringify(data),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnOrgData, status) {
                    //添加到组织树
                    var childNode = {
                        text: returnOrgData.orgName,
                        id: returnOrgData.partyId,
                        parentId: returnOrgData.parentOrgId,
                        orderIndex:returnOrgData.orderIndex,
                        expandIcon:'glyphicon glyphicon-plus',
                        lazyLoad:loadNode,//设置成懒加载节点,并绑定懒加载函数
                        state:{
                            expanded:false
                        }
                    };
                    var parentNode = $("#tree").treeview('getSelected');

                    //添加到组织表
                    $('#tbList').bootstrapTable('insertRow',{index:0,row:returnOrgData});
                    //通过table计算索引
                    var index = getindex(returnOrgData.partyId);
                    //添加到组织树
                    $("#tree").treeview("addNode", [childNode, parentNode, index, {silent: true}]);

                }
            });
            //关闭模态框
            $('.add-modal').modal('hide');
            return false;
        })

        //删除确认响应函数
        $("#btnDeleteConfirm").click(function () {
            //获得选中的行数据
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];
            var partyId = selectContent.partyId;
            $.ajax({
                url: '${pageContext.request.contextPath}/admin/org/' + partyId,
                type: "DELETE",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: 'json',
                //成功响应的结果
                success: function (data) {
                    if (data && data.resultcode == '200') {
                        console.log(data.result.today);
                    };
                    //删除组织树节点
                    var tempnode = $('#tree').treeview('findNodes', [selectContent.partyId, 'id']);
                    $("#tree").treeview("removeNode", [tempnode, {silent: true}]);

                    //删除表格行
                    $("#tbList").bootstrapTable("removeByUniqueId",partyId);
                }
            });

            $('#del-modal').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });

        //编辑保存响应函数
        $('#btnEditSave').click(function () {
            //开启验证
            $('#frmEdit').data('bootstrapValidator').validate();
            if (!$('#frmEdit').data('bootstrapValidator').isValid()) {
                return;
            }

            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];
            var partyId = selectContent.partyId;
            var orgdata = {
                "partyId": partyId,
                "orgId": selectContent.orgId,
                "parentOrgId": selectContent.parentOrgId,
                "orgName": $("#orgNameEdit").val(),
                "orgCode": $("#orgCodeEdit").val(),
                "orgShortName": $("#orgShortNameEdit").val(),
                "orderIndex": $("#orderIndexEdit").val(),
                "contactAddress": $("#contactAddressEdit").val(),
                "comments": $("#commentsEdit").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath }/admin/org/" + partyId,
                type: "PUT",
                // data表示发送的数据
                data: JSON.stringify(orgdata),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (data) {
                    if (data && data.resultcode == '200') {
                        console.log(data.result.today);
                    }
                    if (data != null) {
                        console.log(data.toString())
                    }
                    //获得当前修改数据的排序号
                    var selectedRowIndex = getindex(orgdata.partyId);
                    //更新组织表
                    $('#tbList').bootstrapTable('updateRow',{index: selectedRowIndex,row: orgdata});
                    //由于修改后,表格中数据排序可能有变化,从新获得更新后的排序号
                    var index = getindex(orgdata.partyId);
                    //更新组织树
                    var cunrrentNode = $('#tree').treeview('findNodes', [selectContent.partyId, 'id']);
                    var newNode = {
                        text: orgdata.orgName,
                        id: orgdata.partyId,
                        parentId: orgdata.parentOrgId,
                        expandIcon:'glyphicon glyphicon-plus',
                        lazyLoad:loadNode,//设置成懒加载节点,并绑定懒加载函数
                        state:{
                            expanded:false
                        }
                    };
                    $('#tree').treeview('updateNode', [ cunrrentNode, newNode, { silent: true } ]);
                    $.ajax({
                        type: "get",
                        url: '${pageContext.request.contextPath }/admin/orgs/node/' + cunrrentNode.id,
                        success: function (data, status) {
                            $("#tree").treeview("addNode", [data, cunrrentNode, index, {silent: true}]);
                        }
                    });


                }
            });
            $('.edit-modal').modal('hide');
            //刷新表格
            //tableRefresh(temporgParentId);
            return false;
        })

        //编辑对话框重置按钮
        $('#btnEditReset').click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];

            $("#orgNameEdit").val(selectContent.orgName);
            $("#orgCodeEdit").val(selectContent.orgCode);
            $("#orgShortNameEdit").val(selectContent.orgShortName);
            $("#orderIndexEdit").val(selectContent.orderIndex);
            $("#contactAddressEdit").val(selectContent.contactAddress)
            $("#commentsEdit").val(selectContent.comments)
        })

    });

    function getindex(partyId) {
        var orgs=$("#tbList").bootstrapTable('getData');
        if(orgs == null || typeof (orgs) == "undefined"){
            return 0;
        }else{
            for(var i=0 ; i< orgs.length;i++){
                if(partyId == orgs[i].partyId){
                    return i;
                }
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
                //名称
                orgName: {
                    message: '名称验证失败',
                    validators: {
                        notEmpty: {
                            message: '组织名称不能为空'
                        },
                        stringLength: {
                            min: 2,
                            max: 100,
                            message: '组织名称长度必须在2到100位之间'
                        }
                    }
                },
                //代码
                orgCode: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '代码不能为空'
                        },
                        stringLength: {
                            min: 2,
                            max: 100,
                            message: '密码长度在2到100之间'
                        }
                    }
                },

                //排序号
                orderIndex: {
                    validators: {
                        notEmpty: {
                            message: '排序号不能为空'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: '排序号只能是数字'
                        },
                        stringLength: {
                            max: 5,
                            message: '排序号长度必须小于5位'
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
            submitButtons: '#btnEditSave',//指定提交按钮，如果验证失败则变成disabled
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                //这里校验是通过input名称,而不是id进行校验
                //名称
                orgNameEdit: {
                    message: '名称验证失败',
                    validators: {
                        notEmpty: {
                            message: '组织名称不能为空'
                        },
                        stringLength: {
                            min: 2,
                            max: 100,
                            message: '组织名称长度必须在2到100位之间'
                        }
                    }
                },
                //代码
                orgCodeEdit: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '代码不能为空'
                        },
                        stringLength: {
                            min: 2,
                            max: 100,
                            message: '代码长度在2到100之间'
                        }
                    }
                },

                //排序号
                orderIndexEdit: {
                    validators: {
                        notEmpty: {
                            message: '排序号不能为空'
                        },
                        regexp: {
                            regexp: /^[0-9]+$/,
                            message: '排序号只能是数字'
                        },
                        stringLength: {
                            max: 5,
                            message: '排序号长度必须小于5位'
                        }

                    }
                }
            }
        });
    }

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

    function sortNode(newNode,parentNodeId) {

        var listNodes = $('#tree').treeview('findNodes', [parentNodeId, 'id']);

        if(listNodes == null || typeof (listNodes.nodes) == "undefined"){
            return 0;
        }else{
            for(var i=0 ; i< listNodes.nodes.size();i++){
                if(newNode.orderIndex >= listNodes[i].orderIndex){
                    //由于现有节点是从小到大排序,当排序号等于/大于现有某个排序时,即返回当前索引
                    return i;
                }
            }
        }
    }

</script>

</body>
</html>