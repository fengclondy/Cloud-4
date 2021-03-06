<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<!--[if IE 8]><html class="ie8 oldie"><![endif]-->
<!--[if IE 9]><html class="ie9 oldie"><![endif]-->
<!--[if gt IE 9]><!--><html><!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="static/css/style.css"/>
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <script type="text/javascript" src="static/js/common.js"></script>
    <script type="text/javascript" src="static/js/jquery.form.js"></script>

    <!--[if IE]>
    <link rel="stylesheet" type="text/css" href="css/ie.css"/>
    <![endif]-->
    <!--[if lt IE 9]>
    <script type="text/javascript" src="js/html5.js"></script>
    <script type="text/javascript" src="js/ie.js"></script>
    <![endif]-->
    <style type="text/css">
        .index .form-wrap ul li .error-msg {
            position: absolute;
            left: 276px;
            top: 0;
            width: 235px;
            height: 35px;
            text-align: center;
            line-height: 35px;
            border-radius: 2px;
            background-color: #ffdddd;
        }
    </style>
</head>
<body>
<div class="index">
    <div class="login-box">
        <img class="fl" src="static/images/login-logo.jpg" alt="">
        <div class="con-right fr">
            <div class="title">欢迎登录海恒智能系统</div>
            <form id="loginForm" class="form-wrap" action="login/logincheck" method="POST">
                <ul>
                    <li>
                        <div class="left fl">用户名</div>
                        <div class="right fl">
                            <input id="username" type="text" placeholder="请输入用户名" class="g-input">
                        </div>
                    </li>
                    <li>
                        <div class="left fl">密码</div>
                        <div class="right fl">
                            <input id="pwd" type="password" placeholder="请输入密码" class="g-input">
                        </div>
                    </li>
                    <!-- <li>
                        <div class="left fl">&nbsp;</div>
                        <div class="right fl">
                            <div class="g-checkbox"><input id="rememberme" type="checkbox"></div>记住我
                            <div class="forget">忘记密码？</div>
                        </div>
                    </li> -->
                    <li>
                        <div class="left fl">&nbsp;</div>
                        <div class="right fl">
                            <!-- <button id="login" type="submit" class="submit g-btn-lan">登录</button> -->
                            <input id="login" type="submit" value="登录" class="submit g-btn-blue">
                        </div>
                    </li>
                </ul>
            </form>
        </div>
        <div class="copyright">copyright 2016 seaever technology</div>
    </div>

</div>
<script type="text/javascript">
    $(function () {
        var afterSubmit = false;
        $(".index").height($(window).height());

        $("#username").on("keydown", function () {
            if (afterSubmit) {
                $error_li = $(this).parent().parent();
                var username = $(this).val();
                if (username) {
                    $error_li.removeClass("error");
                }
            }
        });
        $("#pwd").on("keydown", function () {
            if (afterSubmit) {
                $error_li = $(this).parent().parent();
                var username = $(this).val();
                if (username) {
                    $error_li.removeClass("error");
                }
            }
        });
        /*
            登录操作
        */
        $("#loginForm").on("submit", function () {
            afterSubmit = true;
            var username = $("#username").val();
            var pwd = $("#pwd").val();
            var remember = $("#rememberme").is(":checked");

            if (!username) {
                $username = $("#username");
                $username.next().remove();
                $username.after('<span  class="error-msg">用户名不能为空</span>');
                $username.parent().parent().addClass("error");
            }
            if (!pwd) {
                $pwd = $("#pwd");
                $pwd.next().remove();
                $pwd.after('<span  class="error-msg">密码不能为空</span>');
                $pwd.parent().parent().addClass("error");
            }
            if (!username || !pwd) {
                return false;
            }
            var params = {
                "operator_id": username,
                "operator_pwd": pwd,
                "rememberme": remember
            }
            console.info("param",params);
            $(this).ajaxSubmit({
                type: "post", // 提交方式 get/post
                url: "${ctx}/login/logincheck",// 需要提交的 url
                data: {"json": JSON.stringify(params)},
                success: function (result) { // data 保存提交后返回的数据，一般为 json 数据
                	// 此处可对 data 作相关处理
                    if (result.state == true) {
                        window.location.href = "${ctx}/device/main";
                        return true;
                    } else if (result.state == false) {
                        $("#username").parent().parent().addClass("error");
                        $("#pwd").parent().parent().addClass("error");
                        $("#username").next().remove();
                        $("#username").after('<span class="error-msg">' + result.message + '</span>');
                        $("#pwd").next().remove();
                        return false;
                    }
                    $(this).resetForm(); // 提交后重置表单
                }
            });
            return false; // 阻止表单自动提交事件
        });

    });
</script>
</body>
</html>


