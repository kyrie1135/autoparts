<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>配件列表</title>

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
                        <h3>配件列表 <small></small></h3>
                    </div>
                </div>
                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <%--<h2>配件 <small> </small></h2>--%>
                                <button id="btnAdd"
                                        class="btn btn-success"
                                        type="button"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;录入采购信息
                                </button>

                                    <button id="btnSearch"
                                            class="btn btn-info"
                                            type="button"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;数据查询
                                    </button>
                            </div>
                            <div class="x_content">
                                <form id="frmauto">
                                    <table id="tbauto" class="table"
                                           data-click-to-select="true"
                                           >
                                    </table>
                                </form>
                                <%--<c:import url="page.jsp"/>--%>
                            </div>
                        </div>
                    </div>

                </div>

            </div>


            <!--修改输入框-->
            <div id="editfmModel" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="careditModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 62%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">×</span>
                                <span class="sr-only">关闭</span></button>
                            <h4 class="modal-title">修改信息</h4>
                        </div>
                        <!--form-->
                        <form id="frmEdit" name="frmEdit" class="form-horizontal form-label-left" novalidate
                              method="post">
                            <div class="modal-body">
                                <div class="item form-group">
                                    <label for="autocarNoEdit" class="control-label col-md-2 col-sm-2 col-xs-12">车牌号</label>
                                    <div class="col-md-9 col-sm-9 col-xs-9">
                                        <select id="autocarNoEdit" name="autocarNoEdit" class="form-control">
                                            <c:forEach var="autocar" items="${autoCars}" varStatus="ac">
                                                <option value="${autocar.autocarNo}">${autocar.autocarNo}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>

                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-12" for="purchaseTimeEdit">采购日期</label>
                                    <div class="col-md-4 col-sm-4 col-xs-12">
                                        <div class="input-group date col-md-12 col-sm-12 col-xs-12 "
                                             data-provide="datepicker">
                                            <input id="purchaseTimeEdit" class="form-control" name="purchaseTimeEdit" type="text"
                                                   readonly placeholder="">
                                            <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                        </div>
                                    </div>
                                    <div class="col-md-5 col-sm-5 col-xs-12">
                                        <label class="control-label col-md-4 col-sm-4 col-xs-12" for="purchaserEdit">采购人</label>
                                        <div class="col-md-8 col-sm-8 col-xs-12">
                                            <input id="purchaserEdit" class="form-control" name="purchaserEdit" type="text">
                                        </div>
                                    </div>

                                </div>
                                <div class="item form-group">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-2"></label>
                                    <div class="col-md-9 col-sm-9 col-xs-9">
                                        <table class="table table-bordered">
                                            <thead>
                                            <tr>
                                                <th scope="row" style="text-align:center;" class="col-md-1 col-sm-1 col-xs-1">序号</th>
                                                <th class="col-md-4 col-sm-4 col-xs-4">配件名称</th>
                                                <th style="text-align:right;" class="col-md-2 col-sm-2 col-xs-2">单价(元)</th>
                                                <th style="text-align:right;" class="col-md-2 col-sm-2 col-xs-2">数量</th>
                                                <th style="text-align:right;" class="col-md-2 col-sm-2 col-xs-2">总价(元)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <th scope="row" style="text-align:center;">1</th>
                                                <td><input id="autopartNameEdit" name="autopartNameEdit" minlength="2" maxlength="125" required class="form-control" type="text">                                                        </td>
                                                <td><input id="autopartPriceEdit" name="autopartPriceEdit" onkeyup="onlyNumber(this)" onchange="formatMoney(this);caltotal(1);" style="text-align:right;" maxlength="8" class="form-control" type="text"></td>
                                                <td><input id="autopartQuantityEdit" name="autopartQuantityEdit" onkeyup="onlyNumber(this)" onchange="caltotal(1);" maxlength="8" style="text-align:right;" class="form-control" type="text"></td>
                                                <td><input id="autopartTotalEdit" name="autopartTotalEdit" style="text-align:right;" readonly class="form-control" type="text"></td>
                                            </tr>
                                            </tbody>
                                        </table>

                                    </div>
                                </div>


                                <div class="ln_solid"></div>
                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                        <button type="button" id="btnEditSave"
                                                class="btn btn-success">
                                            <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;保存
                                        </button>
                                        <%--<button type="reset" class="btn btn-primary">重置</button>--%>
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

<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
<script src="${pageContext.request.contextPath}/static/vendors/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>

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


    //初始化列表
    function initTable () {
        $('#tbauto').bootstrapTable({
            url: '${pageContext.request.contextPath}/autopart?autocarNo=${autocarNo}&autopartName=${autopartName}&purchaseTime1=${purchaseTime1}&purchaseTime2=${purchaseTime2}',
            uniqueId: "autopartId",
            singleSelect: true,
            sortName:"purchaseTime",
            sortOrder:"desc",
            // pagination:true,
            // sidePagination:"server",
            // toolbar:"#toolbar",
            // pageNumber:1,
            // pageSize:2,
            // paginationPreText:"上一页",
            // paginationNextText:"下一页",
            // //得到查询的参数
            // queryParams : function (params) {
            //     //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            //     var temp = {
            //         rows: params.limit,                         //页面大小
            //         page: (params.offset / params.limit) + 1,   //页码
            //         sort: params.sort,      //排序列名
            //         sortOrder: params.order //排位命令（desc，asc）
            //     };
            //     return temp;
            // },

            columns: [
                {
                    title: '序号',
                    formatter: function (value, row, index) {
                        return index+1;
                    },
                    align: 'center',
                    width: 60
                }, {
                    field: 'autocarNo',
                    title: '车牌号',
                    width: 100
                }, {
                    field: 'autopartName',
                    title: '配件名称',
                    width: 250
                }, {
                    field: 'autopartPrice',
                    title: '单价(元)',
                    align: 'right',
                    formatter: function (value, row, index) {
                        return formatMoney2(value,2,"","",".")
                    },
                    width: 100
                }, {
                    field: 'autopartQuantity',
                    title: '数量',
                    align: 'right',
                    width: 60
                }, {
                    field: 'autopartTotal',
                    title: '总价(元)',
                    align: 'right',
                    formatter: function (value, row, index) {
                        return formatMoney2(value,2,"","",".")
                    },
                    width: 100
                }, {
                    field: 'purchaseTime',
                    title: '采购日期',
                    align: 'center',
                    formatter: function (value, row, index) {
                        return changeDateFormat(value)
                    },width: 120
                }, {
                    field: 'purchaser',
                    title: '采购人',
                    align: 'center',
                    width: 100
                },{
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    width: 150,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'autopartId',
                    title: '#',
                    align: 'center',
                    width: 50
                }
            ],
            // onCheck:function(row,$element){
            //     selectedRowIndex = $element.data('index');
            // }
        });
        $('#tbauto').bootstrapTable('hideLoading');
        $('#tbauto').bootstrapTable('hideColumn', 'autopartId');

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
            $('#tbauto').bootstrapTable('check',index);

            $('#purchaserEdit').val(row.purchaser);
            $('#purchaseTimeEdit').val(changeDateFormat(row.purchaseTime));
            $('#autopartNameEdit').val(row.autopartName);
            $('#autopartPriceEdit').val(formatMoney2(row.autopartPrice,2,"","","."));
            $('#autopartQuantityEdit').val(row.autopartQuantity);
            $('#autopartTotalEdit').val(formatMoney2(row.autopartTotal,2,"","","."));
            $("#autocarNoEdit").val(row.autocarNo);
            $('#editfmModel').modal({backdrop: 'static', keyboard: false});
        },
        'click #btnDel': function (e, value, row, index) {
            //显示删除确认对话框
            selectedId = row.autocarId;
            selectedRowIndex = index;
            $('#tbauto').bootstrapTable('check',index);
            $('#delfmModel').modal({backdrop: 'static', keyboard: false});
        },
    }

    //设置行选中
    function changeTableSelect(staffId){
        var data = $('#tbauto').DataTable().rows().nodes();
        var data2 = $('#tbauto').DataTable().rows().data();
        $(data).each(function(index,item){
            if(data2[index].STAFF_ID==staffId){
                $(item).addClass('selected');
            }else{
                $(item).removeClass('selected');
            }
        });
    }


    //修改保存响应函数
    $(function () {
        $('#btnEditSave').click(function () {
            //开启验证
            $('#frmEdit').data('bootstrapValidator').validate();
            if (!$('#frmEdit').data('bootstrapValidator').isValid()) {
                return;
            }

            var data = {
                "autopartId": $('#tbauto').bootstrapTable('getSelections')[0].autopartId,
                "autocarNo": $("#autocarNoEdit").val(),
                "purchaser": $("#purchaserEdit").val(),
                "purchaseTime": $("#purchaseTimeEdit").val(),
                "autopartName": $("#autopartNameEdit").val(),
                "autopartPrice": $("#autopartPriceEdit").val(),
                "autopartQuantity": $("#autopartQuantityEdit").val(),
                "autopartTotal": $("#autopartTotalEdit").val(),
            };
            $.ajax({
                url: "${pageContext.request.contextPath }/autopart",
                type: "PUT",
                // data表示发送的数据
                data: JSON.stringify(data),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType: "json",
                success: function (returnData, status) {
                    $('#tbauto').bootstrapTable('updateRow',{index:selectedRowIndex,row:returnData});
                }
            });
            //关闭模态框
            $('#editfmModel').modal('hide');
            return false;
        })

    })

    //删除确认响应函数
    $(function () {
        $("#btnDeleteConfirm").click(function () {
            var selectContent = $('#tbauto').bootstrapTable('getSelections')[0];
            $.ajax({
                url: "${pageContext.request.contextPath}/autopart",
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
                    $("#tbauto").bootstrapTable("removeByUniqueId",selectContent.autopartId);
                }
            });

            $('#delfmModel').modal('hide');
            <!-- 取消 click 的默认事件 -->
            return false;
        });
    })


    function formatMoney2(number, places, symbol, thousand, decimal) {
        number = number || 0;
        places = !isNaN(places = Math.abs(places)) ? places : 2;
        symbol = symbol !== undefined ? symbol : "";
        thousand = thousand || "";//thousand = thousand || ",";
        decimal = decimal || ".";
        var negative = number < 0 ? "-" : "",
            i = parseInt(number = Math.abs(+number || 0).toFixed(places), 10) + "",
            j = (j = i.length) > 3 ? j % 3 : 0;
        return symbol + negative + (j ? i.substr(0, j) + thousand : "") + i.substr(j).replace(/(\d{3})(?=\d)/g, "$1" + thousand) + (places ? decimal + Math.abs(number - i).toFixed(places).slice(2) : "");
    }

    //转换日期格式(时间戳转换为datetime格式)
    function changeDateFormat(cellval) {
        var dateVal = cellval + "";
        if (cellval != null) {
            var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
            var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
            var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

            // var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
            // var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
            // var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();

            //return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
            return date.getFullYear() + "-" + month + "-" + currentDate;
        }
    }

    //重新初始化页面
    function initPage(){
        tableRefresh();
    }
    //刷新table
    function tableRefresh() {
        $('#tbauto').bootstrapTable('refresh', {url: '${pageContext.request.contextPath }/autopart/'});
    }


    //添加按钮响应函数
    $(function () {
        $('#btnAdd').click(function () {
            window.location.replace("${pageContext.request.contextPath}/toaddautopart");
        })
    })

    $(function () {
        $('#btnSearch').click(function () {
            window.location.replace("${pageContext.request.contextPath}/tosearch");
        })
    })




    $("#editfmModel").on('hidden.bs.modal', function (e) {
        clearForm('#frmEdit');
        //移除上次校验配置
        $("#frmEdit").data('bootstrapValidator').destroy();
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
    }

    //初始化表单验证
    $(document).ready(function () {
        frmEditValidator();
    });

    //form验证规则
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
                //名称
                autopartNameEdit: {
                    message: '配件名称验证失败',
                    validators: {
                        notEmpty: {
                            message: '配件名称不能为空,长度必须为5到50个字之间'
                        },
                        stringLength: {
                            min: 2,
                            max: 50,
                            message: '配件名称长度必须为5到50之间'
                        }
                    }
                },
                autopartPriceEdit: {
                    message: '配件价格验证失败',
                    validators: {
                        notEmpty: {
                            message: '配件价格不能为空,'
                        },
                        stringLength: {
                            min: 1,
                            max: 8,
                            message: '配件价格长度在1到8之间'
                        }
                    }
                },
                autopartQuantityEdit: {
                    message: '配件数量验证失败',
                    validators: {
                        notEmpty: {
                            message: '配件数量不能为空,'
                        },
                        stringLength: {
                            min: 1,
                            max: 8,
                            message: '配件数量长度在1到8之间'
                        }
                    }
                }
            }
        });
    };

    function onlyNumber(obj){
        // //得到第一个字符是否为负号
        // var t = obj.value.charAt(0);
        //先把非数字的都替换掉，除了数字和.
        obj.value = obj.value.replace(/[^\d\.]/g,'');
        //必须保证第一个为数字而不是.
        obj.value = obj.value.replace(/^\./g,'');
        //保证只有出现一个.而没有多个.
        obj.value = obj.value.replace(/\.{2,}/g,'.');
        //保证.只出现一次，而不能出现两次以上
        obj.value = obj.value.replace('.','$#$').replace(/\./g,'').replace('$#$','.');
        //如果第一位是负号，则允许添加
        if(obj.value == ''){
            obj.value = 0;
        }
    }

    function formatMoney(obj){
        obj.value = formatMoney2(obj.value,2,"","",".");
    }

    function formatMoney2(number, places, symbol, thousand, decimal) {
        number = number || 0;
        places = !isNaN(places = Math.abs(places)) ? places : 2;
        symbol = symbol !== undefined ? symbol : "";
        thousand = thousand || "";//thousand = thousand || ",";
        decimal = decimal || ".";
        var negative = number < 0 ? "-" : "",
            i = parseInt(number = Math.abs(+number || 0).toFixed(places), 10) + "",
            j = (j = i.length) > 3 ? j % 3 : 0;
        return symbol + negative + (j ? i.substr(0, j) + thousand : "") + i.substr(j).replace(/(\d{3})(?=\d)/g, "$1" + thousand) + (places ? decimal + Math.abs(number - i).toFixed(places).slice(2) : "");
    }

    function caltotal(index){
        //var total = "autopartTotal" + index;
        var quantity=0;
        var price=0;
        if($("#autopartPriceEdit").val() !=null && $("#autopartPriceEdit").val() != ""){
            price = $("#autopartPriceEdit").val();
        }

        if($("#autopartQuantityEdit").val() !=null && $("#autopartQuantityEdit").val() != ""){
            quantity=$("#autopartQuantityEdit").val();
        }

        $("#autopartTotalEdit")[0].value = price * quantity;
        //alert(document.getElementById(total).valueOf());
    }
    function upperCase(obj){//用户只能输入正负数与小数
        if(isNaN(obj.value) && !/^-$/.test(obj.value)){
            obj.value="";
        }
        if(!/^[+-]?\d*\.{0,1}\d{0,1}$/.test(obj.value)){
            obj.value=obj.value.replace(/\.\d{2,}$/,obj.value.substr(obj.value.indexOf('.'),3));
        }
    }

    function myselect(value){
        var element = document.getElementById('inputBox');
        if(value == 0){
            element.style.display = "block";
        }else{
            element.style.display = "none";
        }
    }


    //日期输入框,截止时间不能小于开始时间
    $(function () {
        //只能对每个输入框配置格式等属性?
        $('#purchaseTimeEdit').parent().datepicker({
            autoclose: true, //自动关闭
            format: 'yyyy-mm-dd',   //日期格式
            language: "zh-CN",      //语言选择中文
            clearBtn: true,         //显示清除按钮
            todayHighlight: true,   //今天高亮
            weekStart: 0           //星期几是开始//startDate: '0d'
        });
    })



</script>
</body>
</html>