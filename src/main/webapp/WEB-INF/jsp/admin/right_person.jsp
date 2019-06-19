<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户授权</title>

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
                        <h3>给用户授权
                            <small>

                            </small>
                        </h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5   form-group pull-right top_search">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="按姓名查询">
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
                                       data-sort-name="partyId"
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
                            <h4 class="modal-title">给用户[<span id="userName"></span>]授权</h4>
                        </div>
                        <!--form-->
                        <form id="frmAdd" name="frmAdd" class="form-horizontal form-label-left" novalidate method="post">
                            <div class="modal-body">
                                <div class="form-group">
                                    <div class="col-md-5 col-sm-5 col-xs-5">
                                        <select class="select2_multiple form-control" multiple="multiple"
                                                size="15" id="roleId" name="roleId">
                                            <option value="-100">已分配角色</option>
                                        </select>
                                    </div>
                                    <div class="col-md-2 col-sm-2 col-xs-2">
                                        <br>
                                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button id="btnSelect" class="btn btn-info btn-sm" type="button">
                                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>&nbsp;选择
                                        </button>
                                        <br>
                                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button id="btnRemove" class="btn btn-info btn-sm" type="button">
                                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>&nbsp;移除

                                        </button>

                                    </div>
                                    <div class="col-md-5 col-sm-5 col-xs-5">
                                        <select class="select2_multiple form-control" multiple="multiple"
                                                size="15" id="roleId2" name="roleId2">
                                            <option value="-100">可分配角色</option>

                                        </select>
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
                        <!-- /from -->
                    </div>
                </div>
            </div>

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
            url: '${pageContext.request.contextPath}/admin/user',
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
                    width: 80
                }, {
                    field: 'userLoginId',
                    title: '登录账号',
                    valign: 'middle',
                    width: 200
                }, {
                    field: 'userName',
                    title: '姓名',
                    valign: 'middle',
                    width: 200
                }, {
                    field: 'email',
                    title: '邮箱',
                    valign: 'middle',
                    width: 200
                }, {
                    field: 'mobile',
                    title: '手机号码',
                    align: 'center',
                    valign: 'middle',
                    width: 130
                }, {
                    field: 'isSystem',
                    title: '账号类型',
                    formatter: function (value, row, index) {
                        return dataFormat(value)
                    },
                    align: 'center',
                    valign: 'middle',
                    width: 130
                },{
                    field: 'Button',
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    width: 180,
                    events: 'operateEvents',
                    formatter: operateFormatter
                },{
                    field: 'partyId',
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
        $('#tbList').bootstrapTable('hideColumn', 'partyId');

    }
    function dataFormat(cellval) {
        if (cellval != null) {
            var data = parseInt(cellval);
            if(data==0){
                return "普通人员"
            }else{
                return "系统管理员"
            }
        }
    }
    function operateFormatter(value, row, index) {
        return [
            '<button type="button" id="btnAssign2Person" class="btn btn-info btn-xs" data-toggle="modal" data-target=".add-modal" data-backdrop="static">' +
            '<span class="glyphicon glyphicon-lock" aria-hidden="true"></span>给人员授权' +
            '</button>'
        ].join('');
    }

    window.operateEvents = {

        'click #btnAssign2Person': function (e, value, row, index) {

            selectedId = row.partyId;
            selectedRowIndex = index;
            //alert(row.partyId);
            $("#userName").html(row.userName);
            $('#tbList').bootstrapTable('check',index);
            //每次先清除
            $("#roleId option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //移除一项option
                    $("#roleId option[value='"+value+"']").remove()
                }
            });
            //每次先清除
            $("#roleId2 option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //移除一项option
                    $("#roleId2 option[value='"+value+"']").remove()
                }
            });

            //获得尚未授权角色
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/roleparty",
                data:{
                    partyId: row.partyId
                },
                type: "GET",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    if (data != null) {
                        //重新设置option
                        var i;
                        for(i in data){
                            $("#roleId2").append("<option value='"+data[i]["roleId"]+"'>"+data[i]["roleName"]+"</option>");
                        }

                    };

                }
            });
            //获得已授权角色
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/roleparty2",
                data:{
                    partyId: row.partyId
                },
                type: "GET",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    if (data != null) {
                        //重新设置option
                        var i;
                        for(i in data){
                            $("#roleId").append("<option value='"+data[i]["roleId"]+"'>"+data[i]["roleName"]+"</option>");
                        }

                    };

                }
            });

        }
    };

    $(function () {
        $("#btnSelect").click(function () {
            var options = $('#roleId2 option:selected');
            for(i=0;i<options.length;i++){
                var value = options[i].value;
                var text = options[i].text;
                //添加一项option
                $("#roleId").append("<option value='"+value+"'>"+text+"</option>");
                //移除一项option
                $("#roleId2 option[value='"+value+"']").remove()
            }
        });
        $("#btnSelectAll").click(function () {
            $("#roleId2 option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //添加一项option
                    $("#roleId").append("<option value='"+value+"'>"+text+"</option>");
                    //移除一项option
                    $("#roleId2 option[value='"+value+"']").remove()
                }
            });
        })

        $("#btnRemove").click(function () {
            var options = $('#roleId option:selected');
            for(i=0;i<options.length;i++){
                var value = options[i].value;
                var text = options[i].text;
                //添加一项option
                $("#roleId2").append("<option value='"+value+"'>"+text+"</option>");
                //移除一项option
                $("#roleId option[value='"+value+"']").remove()
            }

        })

        $("#btnRemoveAll").click(function () {
            $("#roleId option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //添加一项option
                    $("#roleId2").append("<option value='"+value+"'>"+text+"</option>");
                    //移除一项option
                    $("#roleId option[value='"+value+"']").remove()
                }
            });
        })

        $('#btnAddSave').click(function () {
            var selectContent = $('#tbList').bootstrapTable('getSelections')[0];

            var roleParties = new Array();
            var i=0;
            //构造roleParty对象
            $("#roleId option").each(function(){
                //遍历所有option
                var value = $(this).val();
                var text = $(this).text();
                if(value > 0 ){
                    //设置选中
                    $("#roleId").val(value);
                    var roleParty={
                        partyId: selectContent.partyId,
                        roleId: value,
                        roleName: text
                    };
                    roleParties[i]=roleParty;
                    i++;
                }
            });
            var data = {
                partyId: selectContent.partyId,
                roleParties: roleParties
            };
            //提交
            $.ajax({
                url: "${pageContext.request.contextPath}/admin/roleparty",
                type: "POST",
                // data表示发送的数据
                data: JSON.stringify(data),
                // 定义发送请求的数据格式为JSON字符串
                contentType: "application/json;charset=UTF-8",
                dataType:"JSON",
                //成功响应的结果
                success: function (data) {
                    if (data && data.resultcode == '200') {
                        console.log(data.result.today);
                    };
                }
            });
            //关闭模态框
            $('.add-modal').modal('hide');
            return false;
        })

        $('#btnCancel').click(function () {
            window.location.replace("${pageContext.request.contextPath}admin/rolelist");
        })

    });




</script >

</body>
</html>