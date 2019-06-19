<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>人员管理</title>

    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/vendors/bootstrap-treeview-patternfly/dist/bootstrap-treeview.min.css" rel="stylesheet" type="text/css">
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

                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="x_panel">
                            <div class="x_title">
                                <h4>用户管理
                                    <small>
                                        <a class="btn-link" style="cursor: hand" id="btnAll" >查看无归属组织人员 </a>
                                    </small>
                                </h4>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div id="tree"></div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-8 col-sm-8 col-xs-8">
                        <div class="x_panel">
                            <div class="x_title ">
                                <div>
                                    <button id="btnAdd"
                                            class="btn btn-success"
                                            type="button" data-toggle="modal"
                                            data-target=".add-modal" data-backdrop="static"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;注册用户
                                    </button>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="tbList" class="table"
                                       data-click-to-select="true"
                                       data-sort-name="partyId"
                                       data-sort-order="asc">
                                </table>
                                <%--<c:import url="page.jsp"/>--%>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <!--添加框-->
            <div class="modal fade add-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">注册用户</h4>
                        </div>
                        <!--form-->
                        <form id="frmAdd" name="frmAdd" class="form-horizontal form-label-left" novalidate method="post">
                            <input type="hidden" id="orgId" name="orgId" value="0">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userLoginId">登录账号*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input id="userLoginId" class="form-control"
                                               data-validate-length-range="6" data-validate-words="2"
                                               name="userLoginId" placeholder=""
                                               type="text"><span id="errorinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="currentPassword"
                                           class="control-label col-md-3 col-sm-3 col-xs-12">密码</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input id="currentPassword" type="password"
                                               name="currentPassword" data-validate-linked="password"
                                               class="form-control" >
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="currentPassword2"
                                           class="control-label col-md-3 col-sm-3 col-xs-12">重复密码</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input id="currentPassword2" type="password"
                                               name="currentPassword2" data-validate-linked="password"
                                               class="form-control col-md-7 col-xs-12">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           for="lastName">姓</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input type="text" id="lastName" name="lastName"
                                               class="form-control col-md-6 col-xs-12">
                                    </div>
                                    <label class="control-label col-md-1 col-sm-1 col-xs-12"
                                           for="firstName">名</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input type="text" id="firstName" name="firstName"
                                               class="form-control col-md-6 col-xs-12">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           for="mobile">手机号码</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="mobile" name="mobile" class="form-control">
                                        <span id="mobileinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           for="email">邮箱</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="email" id="email" name="email" class="form-control">
                                        <span id="emailinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">账号类型</label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <div id="isSystem" class="btn-group" data-toggle="buttons">
                                            <label id="isSystemBtn1" class="btn btn-primary"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isSystem" checked value="0">普通账号
                                                &nbsp;
                                            </label>
                                            <label id="isSystemBtn2" class="btn btn-default"
                                                   data-toggle-class="btn-default"
                                                   data-toggle-passive-class="btn-default">
                                                <input type="radio" name="isSystem" value="1">系统管理员
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
            <!--修改框-->
            <div class="modal fade edit-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">修改用户信息</h4>
                        </div>
                        <!--form-->
                        <form id="frmEdit" name="frmEdit" class="form-horizontal form-label-left" novalidate method="post">
                            <input type="hidden" id="orgIdEdit" name="orgIdEdit" value="0">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userLoginIdEdit">登录账号</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input id="userLoginIdEdit" class="form-control"
                                               data-validate-length-range="6" data-validate-words="2"
                                               name="userLoginIdEdit" placeholder="" readonly
                                               type="text"><span id="errorinfoedit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           for="lastNameEdit">姓</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input type="text" id="lastNameEdit" name="lastNameEdit"
                                               class="form-control col-md-6 col-xs-12">
                                    </div>
                                    <label class="control-label col-md-1 col-sm-1 col-xs-12"
                                           for="firstNameEdit">名</label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input type="text" id="firstNameEdit" name="firstNameEdit"
                                               class="form-control col-md-6 col-xs-12">
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           for="mobileEdit">手机号码</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="mobileEdit" name="mobileEdit" class="form-control">
                                        <span id="mobileinfoedit"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                           for="emailEdit">邮箱</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="emailEdit" id="emailEdit" name="email" class="form-control">
                                        <span id="emailinfoEdit"></span>
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
                            <p>您确认要删除吗？</p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" data-dismiss="modal">取消</button>
                            <button class="btn btn-danger" id="btnDeleteConfirm" data-dismiss="modal">确定</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            <!-- 重置密码框 -->
            <div class="modal fade resetpwd-modal">
                <div class="modal-dialog">
                    <div class="modal-content message_align">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">×</span></button>
                            <h4 class="modal-title">重置密码</h4>
                        </div>
                        <div class="modal-body">
                            <!--form-->
                            <form id="frmPwd" name="frmPwd" class="form-horizontal form-label-left" novalidate method="post">
                                <div class="item form-group">
                                    <label for="currentPasswordReset"
                                           class="control-label col-md-3 col-sm-3 col-xs-12">密码</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input id="currentPasswordReset" type="password"
                                               name="currentPasswordReset" data-validate-linked="password"
                                               class="form-control" >
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="currentPasswordReset2"
                                           class="control-label col-md-3 col-sm-3 col-xs-12">重复密码</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input id="currentPasswordReset2" type="password"
                                               name="currentPasswordReset2" data-validate-linked="password"
                                               class="form-control col-md-7 col-xs-12">
                                    </div>
                                </div>
                            </form>
                            <!-- /form -->
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" data-dismiss="modal">取消</button>
                            <button class="btn btn-danger" id="btnResetPwdConfirm" data-dismiss="modal">确定</button>
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
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-treeview-patternfly/dist/bootstrap-treeview.min.js"></script>
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
        initTable('0');
        initOrgTree('0');
    })
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
                    emptyIcon: "glyphicon glyphicon-stop",
                    levels: 1,
                    loadingIcon: "fa fa-hourglass",//懒加载过程中显示的沙漏字符图标
                    lazyLoad: loadNode, //loadNode()为点击懒加载节点目录时，运行的函数名称，把后端的数据添加到这个节点下面
                    onNodeSelected: function (event, node) {
                        temporgParentId = node.id;
                        $("#orgId").val(node.id);
                        loadOrgPerson(node.id);
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

    function loadOrgPerson(parentOrgID){
        $('#tbList').bootstrapTable('refresh', {url: '${pageContext.request.contextPath }/admin/users/' + parentOrgID});
    }
    //初始化列表
    function initTable (parentOrgID) {
        $('#tbList').bootstrapTable({
            url: '${pageContext.request.contextPath}/admin/users/' + parentOrgID,
            uniqueId: "partyId",
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
                    field: 'userLoginId',
                    title: '登录账号',
                    valign: 'middle',
                    width: 150
                }, {
                    field: 'userName',
                    title: '姓名',
                    valign: 'middle',
                    width: 150
                }, {
                    field: 'currentStatus',
                    title: '状态',
                    // formatter: function (value, row, index) {
                    //     return statusFormat(value)
                    // },
                    align: 'center',
                    valign: 'middle',
                    width: 60,
                    formatter: statusFormatter
                }, {
                    field: 'isSystem',
                    title: '类型',
                    formatter: function (value, row, index) {
                        return dataFormat(value)
                    },
                    align: 'center',
                    valign: 'middle',
                    width: 60
                },{
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    width: 200,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'partyId',
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
        $('#tbList').bootstrapTable('hideColumn', 'partyId');

    }
    function dataFormat(cellval) {
        if (cellval != null) {
            var data = parseInt(cellval);
            if(data==0){
                return "普通"
            }else{
                return "系统"
            }
        }
    }
    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnUpdate" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>',
            '<button type="button" id="btnDel" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>',
            '<button type="button" id="btnResetPwd" class="btn btn-info btn-xs"><span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>密码</button>'
        ].join('');
    }
    function statusFormatter(cellval, value, row, index) {
        if (cellval != null) {
            var data = parseInt(cellval);
            if(data==0){
                return [
                    '<button type="button" id="btnUpdate" class="btn btn-default btn-xs">正常</button>',
                ].join('');
            }else{
                return [
                    '<button type="button" id="btnUpdate" class="btn btn-link btn-xs">锁住</button>',
                ].join('');
            }
        }


    }

    window.operateEvents = {
        'click #btnUpdate': function (e, value, row, index) {
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);

            $("#userLoginIdEdit").val(row.userLoginId);
            $("#lastNameEdit").val(row.lastName);
            $("#firstNameEdit").val(row.firstName);
            $("#mobileEdit").val(row.mobile);
            $("#emailEdit").val(row.email);

            $('.edit-modal').modal({backdrop: 'static', keyboard: false});

        },
        'click #btnDel': function (e, value, row, index) {
            //显示删除确认对话框
            selectedId = row.partyId;
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);
            $('.del-modal').modal({backdrop: 'static', keyboard: false});
        },

        'click #btnResetPwd': function (e, value, row, index) {
            //window.location.replace("${pageContext.request.contextPath}/resetpwd?resetpwd=reset&userId="+row.partyId);
            selectedId = row.partyId;
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);
            $('.resetpwd-modal').modal({backdrop: 'static', keyboard: false});
        }
    };

    $(function () {
        $('#btnAll').click(function () {
            $("#orgId").val(0);
            loadOrgPerson('0');
        })

        //添加保存响应函数
        $('#btnAddSave').click(function () {

            //开启验证
            $('#frmAdd').data('bootstrapValidator').validate();
            if (!$('#frmAdd').data('bootstrapValidator').isValid()) {
                return;
            }

            var isSystem=$(':radio[name="isSystem"]:checked').val();

            var userdata = {
                "userId": "",
                "orgId": $("#orgId").val(),
                "isSystem": String(isSystem),
                "userLoginId": $("#userLoginId").val(),
                "currentPassword": $("#currentPassword").val(),
                "lastName": $("#lastName").val(),
                "firstName": $("#firstName").val(),
                "mobile": $("#mobile").val(),
                "email": $("#email").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
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

        //编辑框重置按钮
        $('#btnEditReset').click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];

            $("#userLoginIdEdit").val(selectContent.userLoginId);
            $("#lastNameEdit").val(selectContent.lastName);
            $("#firstNameEdit").val(selectContent.firstName);
            $("#mobileEdit").val(selectContent.mobile);
            $("#emailEdit").val(selectContent.email);
        })

        $('#btnEditSave').click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];
            var userdata={
                partyId:selectContent.partyId,
                userLoginId:selectContent.userLoginId,
                isSystem:selectContent.isSystem,
                lastName:$("#lastNameEdit").val(),
                firstName:$("#firstNameEdit").val(),
                mobile:$("#mobileEdit").val(),
                email:$("#emailEdit").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type: "PUT",
                data: JSON.stringify(userdata),
                contentType: "application/json;charset=UTF-8",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    var selectedRowIndex = getindex(selectContent.partyId);
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
                url: "${pageContext.request.contextPath}/admin/user",
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
                    $("#tbList").bootstrapTable("removeByUniqueId",selectContent.partyId);
                }
            });

            $('#delfmModel').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });

        $("#isSystemBtn1.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#isSystemBtn2.btn").button().removeClass("btn-primary");
            $("#isSystemBtn2.btn").button().addClass("btn-default");
        });
        $("#isSystemBtn2.btn").click(function () {
            $(this).button().removeClass("btn-default");
            $(this).button().addClass("btn-primary");
            $("#isSystemBtn1.btn").button().removeClass("btn-primary");
            $("#isSystemBtn1.btn").button().addClass("btn-default");
        });
    });

    //检验是否有重复值,当鼠标失去焦点时显示
    $("#userLoginId").blur(function(){
        if($("#userLoginId").val()!= ""){
            var data = {
                userLoginId: $('#userLoginId').val()
            }
            //用ajax去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type:"GET",               //提交方式
                data: data,
                dataType:"JSON",          //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success:function(data){          //回调函数，data为形参
                    if(data.length == 0)           //
                    {
                        $("#errorinfo").html("");
                    }else{
                        $("#errorinfo").html("此账号名已注册,请用另外一个名称！");
                        $("#errorinfo").css("color","red");
                    }
                }
            });
        }else{
            $("#errorinfo").html("");
        }
    })
    //检验是否有重复值,当鼠标失去焦点时显示
    $("#mobile").blur(function(){
        if($("#mobile").val()!= ""){
            var data = {
                mobile: $('#mobile').val()
            }
            //用ajax去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type:"GET",               //提交方式
                data: data,
                dataType:"JSON",          //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success:function(data){          //回调函数，data为形参
                    if(data.length == 0)           //
                    {
                        $("#mobileinfo").html("");
                    }else{
                        $("#mobileinfo").html("此手机号码已注册,请用另外一个号码！");
                        $("#mobileinfo").css("color","red");
                    }
                }
            });
        }else{
            $("#errorinfo").html("");
        }
    })
    //检验是否有重复值,当鼠标失去焦点时显示
    $("#email").blur(function(){
        if($("#email").val()!= ""){
            var data = {
                email: $('#email').val()
            }
            //用ajax去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type:"GET",               //提交方式
                data: data,
                dataType:"JSON",          //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success:function(data){          //回调函数，data为形参
                    if(data.length == 0)           //
                    {
                        $("#emailinfo").html("");
                    }else{
                        $("#emailinfo").html("此邮箱已注册,请用另外一个邮箱！");
                        $("#emailinfo").css("color","red");
                    }
                }
            });
        }else{
            $("#errorinfo").html("");
        }
    })

    //检验是否有重复值,当鼠标失去焦点时显示
    $("#userLoginIdEdit").blur(function(){
        if($("#userLoginIdEdit").val()!= ""){
            var data = {
                userLoginId: $('#userLoginIdEdit').val()
            }
            //用ajax去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type:"GET",               //提交方式
                data: data,
                dataType:"JSON",          //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success:function(data){          //回调函数，data为形参
                    if(data.length == 0)           //
                    {
                        $("#errorinfoEdit").html("");
                    }else{
                        $("#errorinfoEdit").html("此账号名已注册,请用另外一个名称！");
                        $("#errorinfoEdit").css("color","red");
                    }
                }
            });
        }else{
            $("#errorinfoEdit").html("");
        }
    })
    //检验是否有重复值,当鼠标失去焦点时显示
    $("#mobileEdit").blur(function(){
        if($("#mobileEdit").val()!= ""){
            var data = {
                mobile: $('#mobileEdit').val()
            }
            //用ajax去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type:"GET",               //提交方式
                data: data,
                dataType:"JSON",          //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success:function(data){          //回调函数，data为形参
                    if(data.length == 0)           //
                    {
                        $("#mobileinfoEdit").html("");
                    }else{
                        $("#mobileinfoEdit").html("此手机号码已注册,请用另外一个号码！");
                        $("#mobileinfoEdit").css("color","red");
                    }
                }
            });
        }else{
            $("#errorinfoEdit").html("");
        }
    })
    //检验是否有重复值,当鼠标失去焦点时显示
    $("#emailEdit").blur(function(){
        if($("#emailEdit").val()!= ""){
            var data = {
                email: $('#emailEdit').val()
            }
            //用ajax去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/user",
                type:"GET",               //提交方式
                data: data,
                dataType:"JSON",          //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success:function(data){          //回调函数，data为形参
                    if(data.length == 0)           //
                    {
                        $("#emailinfoEdit").html("");
                    }else{
                        $("#emailinfoEdit").html("此邮箱已注册,请用另外一个邮箱！");
                        $("#emailinfoEdit").css("color","red");
                    }
                }
            });
        }else{
            $("#errorinfoEdit").html("");
        }
    })

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
                userLoginId: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '账号不能为空,必须在2-15个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 15,
                            message: '账号长度必须在2-15个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '账号只能包含大写、小写、数字和下划线'
                        }
                    }
                },
                currentPassword: {
                    message: '密码验证失败',
                    validators: {
                        notEmpty: {
                            message: '密码不能为空,必须在6-10个字符之间之间'
                        },
                        stringLength: {
                            min: 6,
                            max: 10,
                            message: '密码必须在6-10个字符之间之间'
                        }
                    }
                },
                currentPassword2: {
                    message: '重复密码验证失败',
                    validators: {
                        notEmpty: {
                            message: '重复密码不能为空,必须在6-10个字符之间之间'
                        },
                        stringLength: {
                            min: 6,
                            max: 10,
                            message: '密码必须在6-10个字符之间之间'
                        },
                        identical: {//相同
                            field: 'currentPassword',
                            message: '两次密码不一致'
                        }
                    }
                },
                //姓氏
                lastName: {
                    message: '姓氏验证失败',
                    validators: {
                        stringLength: {
                            min: 1,
                            max: 10,
                            message: '姓氏长度必须在1-10个字符之间之间'
                        }
                    }
                },
                firstName: {
                    message: '名字验证失败',
                    validators: {
                        stringLength: {
                            min: 1,
                            max: 10,
                            message: '名字长度必须在6-10个字符之间之间'
                        }
                    }
                },
                mobile: {
                    message: '手机号码验证失败',
                    validators: {
                        // notEmpty: {
                        //     message: '手机号码不能为空,只支持中国大陆11位手机号码'
                        // },
                        regexp: {
                            regexp: /^1[3|4|5|6|7|8]{1}[0-9]{9}$/,
                            message: '请输入正确的手机号码,只支持中国大陆11位手机号码'
                        }
                    }
                },
                email: {
                    message: '邮箱验证失败',
                    validators: {
                        // notEmpty: {
                        //     message: '邮箱不能为空'
                        // },
                        emailAddress: {
                            message: '请输入正确的邮箱格式: xxx@xxx.xx'
                        }
                    }
                }
            }

        });
    }

    function frmEditValidator() {
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

                //姓氏
                lastNameEdit: {
                    message: '姓氏验证失败',
                    validators: {
                        stringLength: {
                            min: 1,
                            max: 10,
                            message: '姓氏长度必须在1-10个字符之间之间'
                        }
                    }
                },
                firstNameEdit: {
                    message: '名字验证失败',
                    validators: {
                        stringLength: {
                            min: 1,
                            max: 10,
                            message: '名字长度必须在6-10个字符之间之间'
                        }
                    }
                },
                mobileEdit: {
                    message: '手机号码验证失败',
                    validators: {
                        // notEmpty: {
                        //     message: '手机号码不能为空,只支持中国大陆11位手机号码'
                        // },
                        regexp: {
                            regexp: /^1[3|4|5|6|7|8]{1}[0-9]{9}$/,
                            message: '请输入正确的手机号码,只支持中国大陆11位手机号码'
                        }
                    }
                },
                emailEdit: {
                    message: '邮箱验证失败',
                    validators: {
                        // notEmpty: {
                        //     message: '邮箱不能为空'
                        // },
                        emailAddress: {
                            message: '请输入正确的邮箱格式: xxx@xxx.xx'
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
        $("#errorinfo").html("");
        $("#mobileinfo").html("");
        $("#emailinfo").html("");
        $("#errorinfoEdit").html("");
        $("#mobileinfoEdit").html("");
        $("#emailinfoEdit").html("");
    };

    //获得表格行索引
    function getindex(partyId) {
        var rows=$("#tbList").bootstrapTable('getData');
        if(rows == null || typeof (rows) == "undefined"){
            return 0;
        }else{
            for(var i=0 ; i< rows.length;i++){
                if(partyId == rows[i].partyId){
                    return i;
                }
            }
        }

    }
</script >

</body>
</html>