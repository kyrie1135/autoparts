<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>配件录入</title>

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

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>配件录入
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
                                <form id="frmauto" name="frmauto" class="form-horizontal form-label-left" method="post" novalidate>
                                    <input type="hidden" name="userId" value="${userId}">
                                    <div id="step-1">
                                        <div class="form-group">
                                            <label for="autocarNo" class="control-label col-md-2 col-sm-2 col-xs-12">车牌号</label>
                                            <div class="col-md-8 col-sm-8 col-xs-12">
                                                <select id="autocarNo" name="autocarNo" class="form-control">
                                                    <c:forEach var="autocar" items="${autoCars}" varStatus="ac">
                                                        <option value="${autocar.autocarNo}">${autocar.autocarNo}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="item form-group">
                                            <label class="control-label col-md-2 col-sm-2 col-xs-12" for="purchaseTime">采购日期</label>
                                            <div class="col-md-3 col-sm-3 col-xs-12">
                                                <div class="input-group date col-md-12 col-sm-12 col-xs-12 "
                                                     data-provide="datepicker">
                                                    <input id="purchaseTime" class="form-control" name="purchaseTime" type="text"
                                                           readonly placeholder="">
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                            <div class="col-md-4 col-sm-4 col-xs-12">
                                                <label class="control-label col-md-4 col-sm-4 col-xs-12" for="purchaser">采购人</label>
                                                <div class="col-md-8 col-sm-8 col-xs-12">
                                                    <input id="purchaser" class="form-control" name="purchaser" type="text">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="item form-group">
                                            <label class="control-label col-md-2 col-sm-2 col-xs-12"></label>
                                            <div class="col-md-8 col-sm-8 col-xs-12">
                                                <table class="table table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th scope="row" style="text-align:center;" class="col-md-1 col-sm-1 col-xs-1">序号</th>
                                                        <th class="col-md-5 col-sm-5 col-xs-5">配件名称</th>
                                                        <th style="text-align:right;" >单价(元)</th>
                                                        <th style="text-align:right;" class="col-md-2 col-sm-2 col-xs-2">数量</th>
                                                        <th style="text-align:right;" class="col-md-2 col-sm-2 col-xs-2">总价(元)</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <th scope="row" style="text-align:center;">1</th>
                                                        <td><input id="autopartName1" name="autopartName1" minlength="2" maxlength="125" required class="form-control" type="text">                                                        </td>
                                                        <td><input id="autopartPrice1" name="autopartPrice1" onkeyup="onlyNumber(this)" onchange="formatMoney(this);caltotal(1);" style="text-align:right;" maxlength="8" class="form-control" type="text"></td>
                                                        <td><input id="autopartQuantity1" name="autopartQuantity1" onkeyup="onlyNumber(this)" onchange="caltotal(1);" maxlength="8" style="text-align:right;" class="form-control" type="text"></td>
                                                        <td><input id="autopartTotal1" name="autopartTotal1" style="text-align:right;" readonly class="form-control" type="text"></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row" style="text-align:center;">2</th>
                                                        <td><input id="autopartName2" name="autopartName2" minlength="2" maxlength="125" required class="form-control" type="text">                                                        </td>
                                                        <td><input id="autopartPrice2" name="autopartPrice2" onkeyup="onlyNumber(this)" onchange="formatMoney(this);caltotal(2);" style="text-align:right;" maxlength="8" class="form-control" type="text"></td>
                                                        <td><input id="autopartQuantity2" name="autopartQuantity2" onkeyup="onlyNumber(this)" onchange="caltotal(2);" maxlength="8" style="text-align:right;" class="form-control" type="text"></td>
                                                        <td><input id="autopartTotal2" name="autopartTotal2" style="text-align:right;" readonly class="form-control" type="text"></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row" style="text-align:center;">3</th>
                                                        <td><input id="autopartName3" name="autopartName3" minlength="2" maxlength="125" required class="form-control" type="text">                                                        </td>
                                                        <td><input id="autopartPrice3" name="autopartPrice3" onkeyup="onlyNumber(this)" onchange="formatMoney(this);caltotal(3);" style="text-align:right;" maxlength="8" class="form-control" type="text"></td>
                                                        <td><input id="autopartQuantity3" name="autopartQuantity3" onkeyup="onlyNumber(this)" onchange="caltotal(3);" maxlength="8" style="text-align:right;" class="form-control" type="text"></td>
                                                        <td><input id="autopartTotal3" name="autopartTotal3" style="text-align:right;" readonly class="form-control" type="text"></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row" style="text-align:center;">4</th>
                                                        <td><input id="autopartName4" name="autopartName4" minlength="2" maxlength="125" required class="form-control" type="text">                                                        </td>
                                                        <td><input id="autopartPrice4" name="autopartPrice4" onkeyup="onlyNumber(this)" onchange="formatMoney(this);caltotal(4);" style="text-align:right;" maxlength="8" class="form-control" type="text"></td>
                                                        <td><input id="autopartQuantity4" name="autopartQuantity4" onkeyup="onlyNumber(this)" onchange="caltotal(4);" maxlength="8" style="text-align:right;" class="form-control" type="text"></td>
                                                        <td><input id="autopartTotal4" name="autopartTotal4" style="text-align:right;" readonly class="form-control" type="text"></td>
                                                    </tr>
                                                    <tr>
                                                        <th scope="row" style="text-align:center;">5</th>
                                                        <td><input id="autopartName5" name="autopartName5" minlength="2" maxlength="125" required class="form-control" type="text">                                                        </td>
                                                        <td><input id="autopartPrice5" name="autopartPrice5" onkeyup="onlyNumber(this)" onchange="formatMoney(this);caltotal(5);" style="text-align:right;" maxlength="8" class="form-control" type="text"></td>
                                                        <td><input id="autopartQuantity5" name="autopartQuantity5" onkeyup="onlyNumber(this)" onchange="caltotal(5);" maxlength="8" style="text-align:right;" class="form-control" type="text"></td>
                                                        <td><input id="autopartTotal5" name="autopartTotal5" style="text-align:right;" readonly class="form-control" type="text"></td>
                                                    </tr>
                                                </tbody>
                                            </table>

                                            </div>
                                        </div>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                                                <button class="btn btn-success" type="button" id="btnSave">
                                                    <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>&nbsp;提交
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
        <!-- 页脚 -->
        <c:import url="../include/appfooter.jsp"/>
        <!-- /页脚 -->
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
        if($("#autopartPrice"+index).val() !=null && $("#autopartPrice"+index).val() != ""){
            price = $("#autopartPrice"+index).val();
        }

        if($("#autopartQuantity"+index).val() !=null && $("#autopartQuantity"+index).val() != ""){
            quantity=$("#autopartQuantity"+index).val();
        }

        $("#autopartTotal"+index)[0].value = price * quantity;
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
        $('#purchaseTime').parent().datepicker({
            autoclose: true, //自动关闭
            format: 'yyyy-mm-dd',   //日期格式
            language: "zh-CN",      //语言选择中文
            clearBtn: true,         //显示清除按钮
            todayHighlight: true,   //今天高亮
            weekStart: 0           //星期几是开始//startDate: '0d'
        });
    })

    $(function () {
        $('#btnSave').click(function () {
            // //开启验证
            // $('#frmauto').data('bootstrapValidator').validate();
            // if (!$('#frmauto').data('bootstrapValidator').isValid()) {
            //     return;
            // }
            document.frmauto.action="${pageContext.request.contextPath}/saveautopart";
            document.frmauto.submit();
        })
    })

    $(function () {
        $('#btnCancel').click(function () {
            window.location.replace("${pageContext.request.contextPath}/autopartlist");
        })
    })

    function frmValidator() {
        $("#frmauto").bootstrapValidator({
            live: 'disabled',//验证时机，enabled是内容有变化就验证（默认），disabled和submitted是提交再验证
            excluded: [':disabled', ':hidden', ':not(:visible)'],//排除无需验证的控件，比如被禁用的或者被隐藏的
            submitButtons: '#btnAddSave',//指定提交按钮，如果验证失败则变成disabled
            message: '通用的验证失败消息',//好像从来没出现过
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {}
        });
    };

    //初始化表单验证
    $(document).ready(function () {
        frmValidator();
    });



    var nulldata=[
        {
            "autopartName": "",
            "autopartPrice": "",
            "autopartQuantity": "",
            "autopartTotal": ""
        },
        {
            "autopartName": "",
            "autopartPrice": "",
            "autopartQuantity": "",
            "autopartTotal": ""
        }
    ];
    $(function(){
        //初始化表格
        $('#subTable').bootstrapTable({
            editable:true,//开启编辑模式
            data: nulldata,
            uniqueId: 'index', //将index列设为唯一索引
            columns: [
                {
                    title: '序号',
                    formatter: function (value, row, index) {
                        return index+1;
                    },
                    align: 'center',
                    class: 'editable',
                    width: 80
                }, {
                    field: 'autopartName',
                    title: '配件名称',
                    class: 'editable',
                    width: 250
                }, {
                    field: 'autopartPrice',
                    title: '单价(元)',
                    align: 'right',
                    class: 'editable',
                    width: 250
                }, {
                    field: 'autopartQuantity',
                    title: '数量',
                    align: 'center',
                    class: 'editable',
                    width: 200
                },
                {
                    field: 'autopartTotal',
                    title: '总价(元)',
                    align: 'right',
                    class: 'editable',
                    formatter: function (value, row, index) {
                        return dataFormat(value)
                    },
                    width: 200
                }]

        });
        $('#subTable').bootstrapTable('hideLoading');

        function dataFormat(cellval) {
            if (cellval != null) {
                var data = parseInt(cellval);
                if(data==0){
                    return "0"
                }else{
                    return "0"
                }
            }
        }

        /**
         * add a new row
         */
        $('#addData').click(function(){
            $('#subprocessTable').bootstrapTable('selectPage', 1); //Jump to the first page
            var data = {actionId: '', actionName: '',category:'', description: ''}; //define a new row data，certainly it's empty

            $('#subprocessTable').bootstrapTable('prepend', data);

            $("#dataTable tr:eq(1) td:eq(0)").trigger("dblclick");
            $("#dataTable input")[0].focus();
        });
    });
</script>


</body>
</html>
