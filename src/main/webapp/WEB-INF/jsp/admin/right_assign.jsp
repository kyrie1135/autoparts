<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>授权管理</title>

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
                        <h3>授权管理 <small>可以给用户,用户组,职级,组织分配角色</small></h3>
                    </div>
                </div>
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_content">
                                <table width="100%" border="0">
                                    <tbody>
                                    <tr>
                                        <td rowspan="4" width="15%">
                                            <div class="x_content" align="center">
                                                <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_icon.png" width="80" class="img-rounded"/>
                                            </div>
                                            <div class="title" align="center">
                                                <h2>角色</h2>
                                            </div>
                                        </td>
                                        <td align="center" width="15%" >
                                            <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_arrow_right.png" width="80" class="img-rounded"/>
                                        </td>
                                        <td width="20%">
                                            <div class="x_content" align="center">
                                                <a href="${pageContext.request.contextPath}/admin/right2person">
                                                    <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_user.png" width="80" class="img-rounded"/>
                                                </a>
                                            </div>
                                            <div class="title" align="center">
                                                <h2>用户</h2>
                                            </div>
                                        </td>
                                        <td width="40%"></td>
                                    </tr>
                                    <tr>
                                        <td align="center">
                                            <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_arrow_right.png" width="80" class="img-rounded"/>
                                        </td>
                                        <td align="center">
                                            <div class="x_content">
                                                <a >
                                                    <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_usergroup.png" width="80" class="img-rounded"/>
                                                </a>
                                            </div>
                                            <div class="title">
                                                <h2>用户组</h2>
                                            </div>
                                        </td>
                                        <td width="40%"></td>
                                    </tr>
                                    <tr>
                                        <td align="center">
                                            <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_arrow_right.png" width="80" class="img-rounded"/>
                                        </td>
                                        <td align="center">
                                            <div class="x_content">
                                                <a >
                                                    <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_rank.png" width="80" class="img-rounded"/>
                                                </a>
                                            </div>
                                            <div class="title">
                                                <h2>职级</h2>
                                            </div>
                                        </td>
                                        <td width="40%"></td>
                                    </tr>
                                    <tr>
                                        <td align="center">
                                            <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_arrow_right.png" width="80" class="img-rounded"/>
                                        </td>
                                        <td align="center">
                                            <div class="x_content">
                                                <a >
                                                    <img src="${pageContext.request.contextPath}/static/vendors/custom/images/role_org.png" width="80" class="img-rounded"/>
                                                </a>
                                            </div>
                                            <div class="title">
                                                <h2>组织</h2>
                                            </div>
                                        </td>
                                        <td width="40%"></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
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
    var context = '${pageContext.request.contextPath}';

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
        $("#btnSelectAll").click(function () {
            $("#rightId2 option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //添加一项option
                    $("#rightId").append("<option value='"+value+"'>"+text+"</option>");
                    //移除一项option
                    $("#rightId2 option[value='"+value+"']").remove()
                }
            });
        })

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

        $("#btnRemoveAll").click(function () {
            $("#rightId option").each(function(){
                //遍历所有option
                var value = $(this).val();   //获取option值
                var text = $(this).text();
                if(value > 0 ){
                    //添加一项option
                    $("#rightId2").append("<option value='"+value+"'>"+text+"</option>");
                    //移除一项option
                    $("#rightId option[value='"+value+"']").remove()
                }
            });
        })

        $('#btnAddSave').click(function () {

            //开启验证
            $('#frmAdd').data('bootstrapValidator').validate();
            if (!$('#frmAdd').data('bootstrapValidator').isValid()) {
                return;
            }
            $("#rightId option").each(function(){
                //遍历所有option
                var value = $(this).val();
                var text = $(this).text();
                if(value > 0 ){
                    //设置选中
                    $("#rightId").val(value);
                }
            });

            document.frmAdd.action=context + 'admin/roleadd';
            document.frmAdd.submit();


        })

        $('#btnCancel').click(function () {
            window.location.replace(context+"admin/rolelist");
        })

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

</script>


</body>
</html>
