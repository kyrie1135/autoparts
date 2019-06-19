<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>角色管理</title>

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
                        <h3>角色管理
                            <small>
                                <button id="btnAdd"
                                        class="btn btn-success"
                                        type="button"><span class="glyphicon glyphicon-pawn" aria-hidden="true"></span>&nbsp;添加角色
                                </button>
                            </small>
                        </h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 form-group pull-right top_search">
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
                                       data-sort-name="roleId"
                                       data-sort-order="asc">
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <!--修改角色权限按钮弹出框-->
            <div class="modal fade edit-right-modal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 60%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">修改角色权限</h4>
                        </div>
                        <!--form-->
                        <form id="frmEditRight" name="frmEditRight" class="form-horizontal form-label-left" novalidate>
                            <input type="hidden" id="roleId" name="roleId" value="${roleId}">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12" for="roleName">角色名称
                                    </label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="roleName" class="form-control"
                                               name="roleName" type="text" value="${roleName}">
                                    </div>
                                    <label for="roleCode"
                                           class="control-label col-md-2 col-sm-2 col-xs-12">角色代码
                                    </label>
                                    <div class="col-md-3 col-sm-3 col-xs-12">
                                        <input id="roleCode" type="text"
                                               name="roleCode" class="form-control" value="${roleCode}">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-5 col-sm-5 col-xs-5">
                                        <select class="select2_multiple form-control" multiple="multiple"
                                                size="15" id="rightId" name="rightId">
                                            <option value="-100">已分配权限</option>
                                            <%--<c:forEach var="moduleres" items="${resourcelist1}">--%>
                                                <%--<option value="${moduleres.resourceId}">${moduleres.appName}.${moduleres.resourceName}</option>--%>
                                            <%--</c:forEach>--%>
                                        </select>
                                    </div>
                                    <div class="col-md-2 col-sm-2 col-xs-2">
                                        <br>
                                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button id="btnSelect" class="btn btn-info btn-sm" type="button">
                                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>&nbsp;选择
                                        </button>
                                        <br>
                                        <br>
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button id="btnRemove" class="btn btn-info btn-sm" type="button">
                                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>&nbsp;移除

                                        </button>

                                    </div>
                                    <div class="col-md-5 col-sm-5 col-xs-5">
                                        <select class="select2_multiple form-control" multiple="multiple"
                                                size="15" id="rightId2" name="rightId2">
                                            <option value="-100">可分配权限</option>
                                            <%--<c:forEach var="moduleres" items="${resourcelist2}">--%>
                                                <%--<option value="${moduleres.resourceId}">${moduleres.appName}.${moduleres.resourceName}</option>--%>
                                            <%--</c:forEach>--%>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" id="btnEditSave"
                                        class="btn btn-success">
                                    <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                </button>
                                <button type="reset" class="btn btn-primary">
                                    <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;重置</button>
                                <button type="button" id="btnCancel" class="btn btn-default" data-dismiss="modal">
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


    //初始化组织列表
    function initTable () {

        $('#tbList').bootstrapTable({
            url: '${pageContext.request.contextPath}/admin/role',
            uniqueId: "roleId",
            singleSelect: true,
            columns: [
                {
                    title: '序号',
                    formatter: function (value, row, index) {
                        return index+1;
                    },
                    align: 'center',
                    valign: 'middle',
                    width: 50
                }, {
                    field: 'roleName',
                    valign: 'middle',
                    title: '角色名称',
                    width: 220
                }, {
                    field: 'roleCode',
                    title: '角色代码',
                    valign: 'middle',
                    width: 220
                }, {
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    width: 220,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'roleId',
                    title: '#',
                    align: 'center',
                    width: 10
                },
            ],
            onCheck:function(row,$element){
                selectedRowIndex = $element.data('index');
            }
        });
        $('#tbList').bootstrapTable('hideLoading');
        $('#tbList').bootstrapTable('hideColumn', 'roleId');
    }

    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnEditRight" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>修改角色权限</button>',
            // '<button type="button" id="btnUpdate" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>',
            '<button type="button" id="btnDel" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>',
        ].join('');
    }

    //响应表格中的按钮事件
    window.operateEvents = {
        'click #btnDel': function (e, value, row, index) {
            //显示删除确认对话框
            selectedId = row.resourceId;
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);
            $('.del-modal').modal({backdrop: 'static', keyboard: false});
        },
        'click #btnEditRight': function (e, value, row, index) {
            selectedId = row.resourceId;
            selectedRowIndex = index;
            //打开修改角色权限模态窗口
            //每次先清除
            $("#rightId option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //移除一项option
                    $("#rightId option[value='"+value+"']").remove()
                }
            });
            //每次先清除
            $("#rightId2 option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //移除一项option
                    $("#rightId2 option[value='"+value+"']").remove()
                }
            });

            //获得尚未授权权限
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/roleright2",
                data:{
                    roleId: row.roleId
                },
                type: "GET",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    if (data != null) {
                        //重新设置option
                        var i;
                        for(i in data){
                            $("#rightId2").append("<option value='"+data[i]["resourceId"]+"'>"+data[i]["appName"]+"."+data[i]["resourceName"]+"</option>");
                        }

                    };

                }
            });

            //获得已授权权限
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/roleright",
                data:{
                    roleId: row.roleId
                },
                type: "GET",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    if (data != null) {
                        //重新设置option
                        var i;
                        for(i in data){
                            $("#rightId").append("<option value='"+data[i]["resourceId"]+"'>"+data[i]["appName"]+"."+data[i]["resourceName"]+"</option>");
                        }

                    };

                }
            });

            $("#roleId").val(row.roleId);
            $("#roleName").val(row.roleName);
            $("#roleCode").val(row.roleCode);

            $('.edit-right-modal').modal({backdrop: 'static', keyboard: false});
        }
    };

    $(function () {
        $("#btnSelect").click(function () {
            var options = $('#rightId2 option:selected');
            for(i=0;i<options.length;i++){
                var value = options[i].value;
                var text = options[i].text;
                //添加一项option
                $("#rightId").append("<option value='"+value+"'>"+text+"</option>");
                //移除一项option
                $("#rightId2 option[value='"+value+"']").remove()
            }

        });
        $("#btnRemove").click(function () {
            var options = $('#rightId option:selected');
            for(i=0;i<options.length;i++){
                var value = options[i].value;
                var text = options[i].text;
                //添加一项option
                $("#rightId2").append("<option value='"+value+"'>"+text+"</option>");
                //移除一项option
                $("#rightId option[value='"+value+"']").remove()
            }

        })


        $("#btnAdd").click(function () {
            window.location.replace('${pageContext.request.contextPath}/admin/toroleadd');
        })

        //删除确认响应函数
        $("#btnDeleteConfirm").click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/role",
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
                    $("#tbList").bootstrapTable("removeByUniqueId",selectContent.roleId);
                }
            });

            $('.del-modal').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });

        //添加保存响应函数
        $('#btnEditSave').click(function () {

            //开启验证
            $('#frmEditRight').data('bootstrapValidator').validate();
            if (!$('#frmEditRight').data('bootstrapValidator').isValid()) {
                return;
            }

            var resourceIds= new Array();
            var i=0;
            $("#rightId option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    resourceIds[i]=value;//
                    i=i+1;
                }
            });


            var data = {
                "roleId": $("#roleId").val(),
                "roleName": $("#roleName").val(),
                "roleCode": $("#roleCode").val(),
                "resourceIds": resourceIds
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/role",
                type: "PUT",
                // data表示发送的数据
                data: JSON.stringify(data),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnData, status) {
                    //更新table
                    $('#tbList').bootstrapTable('updateRow', {index: selectedRowIndex, row: returnData});
                }
            });
            //关闭模态框
            $('.edit-right-modal').modal('hide');
            return false;
        })

    });


    //初始化表单验证
    $(document).ready(function () {
        frmEditRightValidator();
    });
    //form验证规则
    function frmEditRightValidator() {
        $("#frmEditRight").bootstrapValidator({
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
                roleName: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '角色名称不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '角色名称长度必须在2-10个字符之间之间'
                        }
                    }
                },
                roleCode: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '角色代码不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '角色代码长度必须在2-10个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '模块代码只能包含大写、小写字母、数字和下划线'
                        }
                    }
                }
            }

        });
    }

    //清除modal框
    $(".edit-right-modal").on('hidden.bs.modal', function (e) {
        clearForm('#btnEditRight');
        //移除上次校验配置
        $('#frmEditRight').data('bootstrapValidator').destroy();
        $('#frmEditRight').data('bootstrapValidator', null);
        //重新添加校验
        frmEditRightValidator();
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

</script >

</body>
</html>