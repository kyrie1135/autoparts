<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>权限资源管理</title>

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
                <div class="page-title">
                    <div class="title_left">
                        <h3>权限资源管理
                            <small>
                                <%--<button id="btnAdd"--%>
                                        <%--class="btn btn-success"--%>
                                        <%--type="button" data-toggle="modal"--%>
                                        <%--data-target=".add-modal" data-backdrop="${pageContext.request.contextPath}/static"><span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>&nbsp;添加资源--%>
                                <%--</button>--%>
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
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>应用模块</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div id="tree"></div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-8 col-sm-8 col-xs-8">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>
                                    <span id="moduleinfo"><c:if test="${not empty moduleName}"><c:out value="[${moduleName}]"/></c:if></span>

                                    &nbsp;权限资源列表&nbsp;&nbsp;</h2>
                                </h2>
                                <div>
                                    <button id="btnAdd"
                                            class="btn btn-success"
                                            type="button"><span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>&nbsp;添加资源
                                    </button>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="tbList" class="table"
                                       data-click-to-select="true"
                                       data-sort-name="resourceId"
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
                            <h4 class="modal-title">注册资源&nbsp;&nbsp;
                                <small>
                                    <span id="moduleinfo2">
                                    <c:if test="${not empty moduleName}">给模块[${moduleName}]添加资源</c:if>
                                    </span>
                                </small></h4>
                        </div>
                        <!--form-->
                        <form id="frmAdd" name="frmAdd" class="form-horizontal form-label-left" novalidate method="post">
                            <input type="hidden" id="appId" name="appId" value="${appId}">
                            <input type="hidden" id="appName" name="appName" value="${appName}">
                            <input type="hidden" id="moduleId" name="moduleId" value="${moduleId}">
                            <input type="hidden" id="moduleName" name="moduleName" value="${moduleName}">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="resourceName">资源名称*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="resourceName" name="resourceName" placeholder="资源名称作为菜单项名称"
                                               data-validate-length-range="10" data-validate-words="2"
                                               class="form-control"><span id="nameinfo"></span>
                                    </div>
                                </div>
                                <div class="item form-group">
                                    <label for="resourceCode" class="control-label col-md-3 col-sm-3 col-xs-12">资源代码*</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="resourceCode" name="resourceCode" placeholder="资源代码唯一标识资源"
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
                                    <label for="resourceIconUrl" class="control-label col-md-3 col-sm-3 col-xs-12">资源图标</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="resourceIconUrl" name="resourceIconUrl" placeholder="图标名称"
                                               class="form-control"><span id="iconinfo"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label for="resourceUrl" class="control-label col-md-3 col-sm-3 col-xs-12">资源导航入口URL</label>
                                    <div class="col-md-7 col-sm-7 col-xs-12">
                                        <input type="text" id="resourceUrl" name="resourceUrl" placeholder="URL地址"
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

            <!-- 选择确认框 -->
            <div class="modal fade" id="select-Model">
                <div class="modal-dialog">
                    <div class="modal-content message_align">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">×</span></button>
                            <h4 class="modal-title">提示信息</h4>
                        </div>
                        <div class="modal-body">
                            <p>请先选择模块!</p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" data-dismiss="modal">关闭</button>
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
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-treeview-patternfly/dist/bootstrap-treeview.min.js"></script>
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
        initTree();
    })

    //初始化tree
    function initTree(){

        $.ajax({
            url: "${pageContext.request.contextPath}/admin/appmodule/node",
            data: 0,
            type: "GET",
            dataType: "json",
            success: function (defaultData) {
                $('#tree').treeview({
                    data: defaultData,//数据源参数
                    emptyIcon: "glyphicon glyphicon-stop",
                    levels: 1,
                    onNodeSelected: function (event, node) {
                        //$('#parentId').val(node.id);
                        if(node.parentId != null){
                            //alert(node.id);//这里拿到id，就可以通过函数跳转触发点击事件
                            $('#moduleinfo').html('['+node.text+']');
                            $('#moduleId').val(node.id);
                            $('#moduleName').val(node.text);
                            var nodes=new Array();
                            nodes[0]=node;
                            var pnode = $('#tree').treeview('getParents', nodes[0]);
                            $('#appId').val(pnode[0].id);
                            $('#appName').val(pnode[0].text);

                            $('#moduleinfo2').html('给模块['+node.text+']添加资源');

                            //alert(pnode[0].text);
                            tableRefresh(node.id);//刷新右侧表格
                        }
                    },
                    onNodeUnselected: function (event, node) {
                    }
                });
            }
        });
    }

    //初始化table
    function initTable () {
       $('#tbList').bootstrapTable({
            url: '',
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
                    field: 'resourceName',
                    valign: 'middle',
                    title: '资源名称',
                    width: 180
                }, {
                    field: 'resourceCode',
                    title: '资源代码',
                    valign: 'middle',
                    width: 180
                }, {
                    field: 'orderIndex',
                    title: '显示序号',
                    align: 'center',
                    valign: 'middle',
                    width: 90
                }, {
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    width: 140,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'resourceId',
                    title: '#',
                    align: 'center',
                    width: 5
                },{
                    field: 'moduleId',
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
        $('#tbList').bootstrapTable('hideColumn', 'resourceId');
        $('#tbList').bootstrapTable('hideColumn', 'moduleId');
    }
    function tableRefresh (moduleId) {
        $('#tbList').bootstrapTable('refresh', {url: '${pageContext.request.contextPath}/admin/moduleres?moduleId='+moduleId});
    }
    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnUpdate" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改</button>',
            '<button type="button" id="btnDel" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>',
        ].join('');
    }

    window.operateEvents = {
        'click #btnUpdate': function (e, value, row, index) {
            selectedRowIndex = index;
            alert(row.resourceId);
        },
        'click #btnDel': function (e, value, row, index) {
            //显示删除确认对话框
            selectedId = row.resourceId;
            selectedRowIndex = index;
            $('#tbList').bootstrapTable('check',index);
            $('#delfmModel').modal({backdrop: 'static', keyboard: false});
        }
    };

    function dataFormat(cellval) {
        if (cellval != null) {
            var data = parseInt(cellval);
            if(data==0){
                return "普通应用模块"
            }else{
                return "系统应用模块"
            }
        }
    }

    $(function () {
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


        //btnAdd保存按钮响应函数
        $('#btnAdd').click(function () {
            if($("#moduleId").val() != ''){
                $('.add-modal').modal({backdrop: 'static', keyboard: false});
            }else {
                $('#select-Model').modal({backdrop: 'static', keyboard: false});
            }
        })

        //btnAddSave保存按钮响应函数
        $('#btnAddSave').click(function () {

            //开启验证
            $('#frmAdd').data('bootstrapValidator').validate();
            if (!$('#frmAdd').data('bootstrapValidator').isValid()) {
                return;
            }

            var needRight=$(':radio[name="needRight"]:checked').val();

            var data = {
                "resourceId":"",
                "resourceName": $("#resourceName").val(),
                "resourceCode": $("#resourceCode").val(),
                "needRight": String(needRight),
                "orderIndex": $("#orderIndex").val(),
                "resourceIconUrl": $("#moduleIconUrl").val(),
                "resourceUrl": $("#moduleUrl").val(),
                "moduleId": $("#moduleId").val(),
                "moduleName": $("#moduleName").val(),
                "appId": $("#appId").val(),
                "appName": $("#appName").val()
            };
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/moduleres",
                type: "POST",
                // data表示发送的数据
                data: JSON.stringify(data),
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
                    $("#tbList").bootstrapTable("removeByUniqueId",selectContent.partyId);
                }
            });

            $('#delfmModel').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });
    });


    //初始化表单验证
    $(document).ready(function () {
        frmAddValidator();
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
                resourceName: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '资源名称不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '资源名称长度必须在2-10个字符之间之间'
                        }
                    }
                },
                resourceCode: {
                    message: '验证失败',
                    validators: {
                        notEmpty: {
                            message: '资源代码不能为空,必须在2-10个字符之间之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '资源代码长度必须在2-10个字符之间之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '资源代码只能包含大写、小写字母、数字和下划线'
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

    //清除modal框
    $(".add-modal").on('hidden.bs.modal', function (e) {
        clearForm('#frmAdd');
        //移除上次校验配置
        $('#frmAdd').data('bootstrapValidator').destroy();
        $('#frmAdd').data('bootstrapValidator', null);
        //重新添加校验
        frmAddValidator();
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