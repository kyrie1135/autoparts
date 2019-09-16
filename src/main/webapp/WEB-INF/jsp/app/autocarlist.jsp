<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>车辆管理</title>

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
                        <h3>车辆管理 <small></small></h3>
                    </div>
                </div>

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2></h2>
                                <button id="btnAdd"
                                        class="btn btn-success"
                                        type="button" data-toggle="modal"
                                        data-target=".car-add-modal" data-backdrop="static">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;添加车辆
                                </button>

                            </div>
                            <div class="x_content">


                                <form id="frmCar">
                                    <table id="tbCar" class="table"
                                           data-click-to-select="true"
                                           data-sort-name="autocarId"
                                           data-sort-order="asc">
                                    </table>
                                </form>
                                <%--<c:import url="page.jsp"/>--%>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <!--添加输入框-->
            <div class="modal fade car-add-modal" tabindex="-1"
                 role="dialog" aria-labelledby="caraddModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">添加车辆</h4>
                        </div>
                        <!--form-->
                        <form id="frmCarAdd" name="frmCarAdd" class="form-horizontal form-label-left" novalidate
                              method="post">

                            <input type="hidden" name="parentId" value="0">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="autocarNo">车牌号
                                    </label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <input id="autocarNo" class="form-control"
                                               data-validate-length-range="6" data-validate-words="2"
                                               name="autocarNo" placeholder=""
                                               type="text"><span id="errorinfo"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="autocarOwner">责任人
                                    </label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <input id="autocarOwner" class="form-control"
                                               data-validate-length-range="6" data-validate-words="2"
                                               name="autocarOwner" placeholder=""
                                               type="text">
                                    </div>
                                </div>

                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                        <button type="button" id="btnAddSave"
                                                class="btn btn-success">
                                            <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                        </button>
                                        <button type="reset" class="btn btn-primary">
                                            <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;重置</button>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">
                                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;取消</button>
                                    </div>

                                </div>
                            </div>
                        </form>
                        <!-- /from -->
                    </div>
                </div>
            </div>
            <!-- 添加输入框结束 -->

            <!--修改输入框-->
            <div class="modal fade car-edit-modal" tabindex="-1" role="dialog" aria-labelledby="careditModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 50%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">修改车辆信息</h4>
                        </div>
                        <!--form-->
                        <form id="frmCarEdit" name="frmCarEdit" class="form-horizontal form-label-left" novalidate
                              method="post">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="autocarNoEdit">车牌号
                                    </label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <input id="autocarNoEdit" class="form-control"
                                               data-validate-length-range="6" data-validate-words="2"
                                               name="autocarNoEdit" placeholder=""
                                               type="text"><span id="errorinfoEdit"></span>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="autocarOwnerEdit">责任人
                                    </label>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <input id="autocarOwnerEdit" class="form-control"
                                               data-validate-length-range="6" data-validate-words="2"
                                               name="autocarOwnerEdit" placeholder=""
                                               type="text">
                                    </div>
                                </div>

                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                        <button type="button" id="btnEditSave"
                                                class="btn btn-success">
                                            <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                        </button>
                                        <%--<button type="reset" class="btn btn-primary">
                                        <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;重置</button>--%>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">
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
            <!-- 修改输入框结束 -->

            <!-- 删除确认框 -->
            <div class="modal fade" id="delfmModel">
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
                            <button class="btn btn-default" data-dismiss="modal">
                                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;取消
                            </button>
                            <button class="btn btn-danger" href id="btnDeleteConfirm" data-dismiss="modal">
                                <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;确定
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            <!-- 删除确认框结束 -->
        </div>
        <!-- /工作区域 -->

        <!-- 页脚 -->
        <c:import url="../include/appfooter.jsp"/>
        <!-- /页脚 -->
    </div>
</div>


<!-- jQuery -->
<script src="${pageContext.request.contextPath}/static/vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/bootstrapValidator.min.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-validator/dist/js/language/zh_CN.js"></script>

<script src="${pageContext.request.contextPath}/static/vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="${pageContext.request.contextPath}/static/vendors/nprogress/nprogress.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/static/vendors/iCheck/icheck.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="${pageContext.request.contextPath}/static/vendors/custom/js/custom.min.js"></script>


<script language="JavaScript">

    var selectedRowIndex;

    //初始化
    $(function () {
        initTable();
    })


    //初始化table
    function initTable () {
        $('#tbCar').bootstrapTable({
            url: '${pageContext.request.contextPath}/autocars',
            uniqueId: "autocarId",
            singleSelect: true,
            columns: [
                {
                    title: '序号',
                    formatter: function (value, row, index) {
                        return index+1;
                    },
                    align: 'center',
                    width: 80
                }, {
                    field: 'autocarNo',
                    title: '车牌号',
                    width: 250
                }, {
                    field: 'autocarOwner',
                    title: '责任人',
                    width: 250
                },{
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    width: 120,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'autocarId',
                    title: '#',
                    align: 'center',
                    width: 50
                }
            ]
            // ,
            // onCheck:function(row,$element){
            //     selectedRowIndex = $element.data('index');
            // }
        });
        $('#tbCar').bootstrapTable('hideLoading');
        $('#tbCar').bootstrapTable('hideColumn', 'autocarId');

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
            $('#tbCar').bootstrapTable('check',index);

            $('#autocarNoEdit').val(row.autocarNo);
            $('#autocarOwnerEdit').val(row.autocarOwner);
            $('.car-edit-modal').modal({backdrop: 'static', keyboard: false});
        },
        'click #btnDel': function (e, value, row, index) {
            //显示删除确认对话框
            selectedId = row.autocarId;
            selectedRowIndex = index;
            $('#tbCar').bootstrapTable('check',index);
            $('#delfmModel').modal({backdrop: 'static', keyboard: false});
        },
    }

    //设置行选中
    function changeTableSelect(staffId){
        var data = $('#tbCar').DataTable().rows().nodes();
        var data2 = $('#tbCar').DataTable().rows().data();
        $(data).each(function(index,item){
            if(data2[index].STAFF_ID==staffId){
                $(item).addClass('selected');
            }else{
                $(item).removeClass('selected');
            }
        });
    }


    //删除确认响应函数
    $(function () {
        $("#btnDeleteConfirm").click(function () {
            var selectContent = $('#tbCar').bootstrapTable('getSelections')[0];
            $.ajax({
                url: "${pageContext.request.contextPath}/autocar",
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
                    $("#tbCar").bootstrapTable("removeByUniqueId",selectContent.autocarId);
                }
            });

            $('#delfmModel').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });
    })



    //重新初始化页面
    function initPage(){
        tableRefresh();
    }
    //刷新table
    function tableRefresh() {
        $('#tbCar').bootstrapTable('refresh', {url: '${pageContext.request.contextPath }/autocars/'});
    }

    //清除modal框
    $(".car-add-modal").on('hidden.bs.modal', function (e) {
        clearForm('#frmCarAdd');
        //移除上次校验配置
        $('#frmCarAdd').data('bootstrapValidator').destroy();
        $('#frmCarAdd').data('bootstrapValidator', null);
        //重新添加校验
        frmAddValidator();
    })

    $(".car-edit-modal").on('hidden.bs.modal', function (e) {
        clearForm('#frmCarEdit');
        //移除上次校验配置
        $("#frmCarEdit").data('bootstrapValidator').destroy();
        $('#frmCarEdit').data('bootstrapValidator', null);
        //重新添加校验
        frmEditValidator();
    })



    //清空表单
    function clearForm(form) {
        // input清空
        $(':input', form).each(function () {
            var type = this.type;
            var tag = this.tagName.toLowerCase(); // normalize case
            if (type == 'text' || type == 'password' || tag == 'textarea') {
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
        $("#errorinfoEdit").html("");

    };


    //添加按钮响应函数
    $(function () {
        $('#btnAdd').click(function () {
        });
    })
    //添加保存响应函数
    $(function () {
        $('#btnAddSave').click(function () {
            //开启验证
            $('#frmCarAdd').data('bootstrapValidator').validate();
            if (!$('#frmCarAdd').data('bootstrapValidator').isValid()) {
                return;
            }

            var data = {
                "autocarId": "",
                "autocarNo": $("#autocarNo").val(),
                "autocarOwner": $("#autocarOwner").val(),
            };
            $.ajax({
                url: "${pageContext.request.contextPath }/autocar",
                type: "POST",
                // data表示发送的数据
                data: JSON.stringify(data),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnData, status) {
                    //添加到表
                    $('#tbCar').bootstrapTable('append',returnData);
                }
            });
            //关闭模态框
            $('.car-add-modal').modal('hide');
            return false;
        })

    });

    //修改保存响应函数
    $(function () {
        $('#btnEditSave').click(function () {
            //开启验证
            $('#frmCarEdit').data('bootstrapValidator').validate();
            if (!$('#frmCarEdit').data('bootstrapValidator').isValid()) {
                return;
            }

            var data = {
                "autocarId": $('#tbCar').bootstrapTable('getSelections')[0].autocarId,
                "autocarNo": $("#autocarNoEdit").val(),
                "autocarOwner": $("#autocarOwnerEdit").val(),
            };
            $.ajax({
                url: "${pageContext.request.contextPath }/autocar",
                type: "PUT",
                // data表示发送的数据
                data: JSON.stringify(data),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnData, status) {
                    $('#tbCar').bootstrapTable('updateRow',{index:selectedRowIndex,row:returnData});
                }
            });
            //关闭模态框
            $('.car-edit-modal').modal('hide');
            return false;
        })

    });

    //检验是否有重复值,当鼠标失去焦点时显示
    $("#autocarNo").blur(function(){
        if($("#autocarNo").val()!= ""){
            //用autocarNo去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/autocar/check",
                type:"GET",
                data: {
                    autocarNo: $("#autocarNo").val()
                },
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: 'json',
                success:function(data){          //回调函数，data为形参
                    if(data.autocarId !=null)
                    {
                        $("#errorinfo").html("此车牌号已注册！");
                        $("#errorinfo").css("color","red");
                    }else{
                        $("#errorinfo").html("");
                    }
                }
            });
        }else{
            $("#errorinfo").html("");
        }
    })

    //检验是否有重复值,当鼠标失去焦点时显示
    $("#autocarNoEdit").blur(function(){
        if($("#autocarNoEdit").val()!= ""){
            //用autocarNo去数据库匹配
            $.ajax({
                url: "${pageContext.request.contextPath}/autocar/check",
                type:"GET",
                data: {
                    autocarId: $('#tbCar').bootstrapTable('getSelections')[0].autocarId,
                    autocarNo: $("#autocarNoEdit").val()
                },
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: 'json',
                success:function(data){          //回调函数，data为形参
                    if(data.autocarId !=null)
                    {
                        $("#errorinfoEdit").html("此车牌号已注册！");
                        $("#errorinfoEdit").css("color","red");
                    }else{
                        $("#errorinfoEdit").html("");
                    }
                }
            });
        }else{
            $("#errorinfo").html("");
        }
    })



    //初始化表单验证
    $(document).ready(function () {
        frmAddValidator();
        frmEditValidator();
    });

    //form验证规则
    function frmAddValidator() {
        $("#frmCarAdd").bootstrapValidator({
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
                autocarNo: {
                    message: '车牌照验证失败',
                    validators: {
                        notEmpty: {
                            message: '车牌照不能为空,长度必须为5到20个字之间'
                        },
                        stringLength: {
                            min: 5,
                            max: 20,
                            message: '车牌照长度必须为5到20之间'
                        }
                    }
                },
                autocarOwner: {
                    message: '责任人验证失败',
                    validators: {
                        notEmpty: {
                            message: '责任人不能为空,,长度必须为5到10个字之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '责任人长度在2到10之间'
                        }
                    }
                }
            }
        });
    }

    function frmEditValidator() {
        $("#frmCarEdit").bootstrapValidator({
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
                autocarNoEdit: {
                    message: '车牌照验证失败',
                    validators: {
                        notEmpty: {
                            message: '车牌照不能为空,长度必须为5到20个字之间'
                        },
                        stringLength: {
                            min: 5,
                            max: 20,
                            message: '车牌照长度必须为5到20之间'
                        }
                    }
                },
                autocarOwnerEdit: {
                    message: '责任人验证失败',
                    validators: {
                        notEmpty: {
                            message: '责任人不能为空,,长度必须为5到10个字之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '责任人长度在2到10之间'
                        }
                    }
                }
            }
        });
    }
</script>
</body>
</html>