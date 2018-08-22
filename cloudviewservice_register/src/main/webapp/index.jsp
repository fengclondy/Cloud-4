<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!--[if IE 8]><html class="ie8 oldie"><![endif]-->
<!--[if IE 9]><html class="ie9 oldie"><![endif]-->
<!--[if gt IE 9]><!--><html><!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="<%=basePath %>/static/css/style.css" />
<script type="text/javascript" src="<%=basePath %>/static/js/jquery.min.js" ></script>
<script type="text/javascript" src="<%=basePath %>/static/js/common.js" ></script>
<script type="text/javascript" src="<%=basePath %>/static/js/jquery.form.js" ></script>
<!--[if IE]>
	<link rel="stylesheet" type="text/css" href="css/ie.css" />
<![endif]-->
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/html5.js" ></script>
	<script type="text/javascript" src="js/ie.js" ></script>
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
    overflow: auto;
}
</style>
</head>
<body>
<div class="index">
	<div class="login-box">
		<img class="fl" src="<%=basePath %>/static/images/login-logo.jpg" alt="">
		<div class="con-right fr">
			<div class="title">欢迎登录海恒智能系统</div>
			<input type="hidden" id="device_idx" value="${device_idx}">
			<input type="hidden" id="device_id" value="${device_id}">
			<input type="hidden" id="device_ip" value="${device_ip}">
			<input type="hidden" id="deviceCode" value="${deviceCode}">
			
			<input type="hidden" id="old_library_idx" value="${old_library_idx}">
			<input type="hidden" id="old_library_id" value="${old_library_id}">
			<input type="hidden" id="old_library_name" value="${old_library_name}">
			<input type="hidden" id="redirectType" value="${redirectType}">
			
			<form id="loginForm" class="form-wrap" action="<%=basePath %>/login/logincheck" method="POST">
				<ul>
					<li>
						<div class="left fl">用户名</div>
						<div class="right fl" >
							<input  id="username" type="text" placeholder="请输入用户名" class="g-input">
						</div>
					</li>
					<li>
						<div class="left fl">密码</div>
						<div class="right fl">
							<input id="pwd" type="password" placeholder="请输入密码" class="g-input">
						</div>
					</li>
<!-- 					<li> -->
<!-- 						<div class="left fl">&nbsp;</div> -->
<!-- 						<div class="right fl"> -->
<!-- 							<div class="g-checkbox"><input id="rememberme" type="checkbox"></div>记住我 -->
<!-- 							<div class="forget">忘记密码？</div> -->
<!-- 						</div> -->
<!-- 					</li> -->
					<li>
						<div class="left fl">&nbsp;</div>
						<div class="right fl">
							<input id="login" type="submit" value="登录"  class="submit g-btn-blue">
							<!-- <button id="login" type="button" class="submit g-btn-lan">登录</button> -->
						</div>
					</li>
				</ul>
			</form>
		</div>
		<div class="copyright">copyright 2016 seaever technology</div>
	</div>

</div>
<script type="text/javascript">
$(function(){
	var location = (window.location+'').split('/');  
	var basePath = location[0]+'//'+location[2]+'/'+location[3];  
	var afterSubmit=false;
	$(".index").height($(window).height());
	$("#username").on("keydown",function(){
		if(afterSubmit){
			$error_li=$(this).parent().parent();
			var username=$(this).val();
			if(username){
				$error_li.removeClass("error");
			}/* else{
				$(this).next().remove();
				$(this).after('<span  class="error-msg">用户名不能为空</span>');
				$error_li.addClass("error");
			} */
		}
	});
	$("#pwd").on("keydown",function(){
		if(afterSubmit){
			$error_li=$(this).parent().parent();
			var username=$(this).val();
			if(username){
				$error_li.removeClass("error");
			}/* else{
				$(this).next().remove();
				$(this).after('<span  class="error-msg">密码不能为空</span>');
				$error_li.addClass("error");
			} */
		}
	});
		/*
			登录操作
		*/
	    $("#loginForm").on("submit", function() {
	    	afterSubmit=true;
	    	var username=$("#username").val();
			var pwd=$("#pwd").val();
			var remember=$("#rememberme").is(":checked");
			
			if(!username){
				$username=$("#username");
				$username.next().remove();
				$username.after('<span  class="error-msg">用户名不能为空</span>');
				$username.parent().parent().addClass("error");
			}
			if(!pwd){
				$pwd=$("#pwd");
				$pwd.next().remove();
				$pwd.after('<span  class="error-msg">密码不能为空</span>');
				$pwd.parent().parent().addClass("error");
			}
			if(!username||!pwd){
				return false;
			}
			var params={
					"operator_id":username,
					"operator_pwd":pwd,
					"rememberme":remember
			};
	        $(this).ajaxSubmit({
	            type: "post", // 提交方式 get/post
	            url: basePath+"/login/logincheck",// 需要提交的 url
	            data:{"json":JSON.stringify(params)},
	            success: function(result) { // data 保存提交后返回的数据，一般为 json 数据
	                // 此处可对 data 作相关处理
	            	if(result.state==true){
	            		var redirectType = $("#redirectType").val();
						if(redirectType == 2){
							//http://127.0.0.1:8080/cloudviewservice_register/page/libraryswitch.jsp?old_library_id=HHTEST&deviceCode=588CDED61A377FFA8E02A1629C65816AA91429026CA176368A918DD0F1A38022&device_id=SCH_118&device_idx=529&old_library_idx=181&old_library_name=海恒测试图书馆&device_ip=172.16.2.131
							window.location.href = "<%=basePath%>page/libraryswitch.jsp?old_library_id="+$("#old_library_id").val()+"&deviceCode="+$("#deviceCode").val()+"&device_id="+$("#device_id").val()+"&device_idx="+$("#device_idx").val()+"&old_library_idx="+$("#old_library_idx").val()+"&old_library_name="+$("#old_library_name").val()+"&device_ip="+$("#device_ip").val();
						}else{
							var deviceIsNull = $("#deviceCode").val();
							if (deviceIsNull){
								window.location.href = "<%=basePath%>device/register?deviceCode="+$("#deviceCode").val();
							}else{
								window.location.href = "<%=basePath%>device/hyregister";
							}
						} 
						return true;
					}else if(result.state==false){
						$("#username").parent().parent().addClass("error");
						$("#pwd").parent().parent().addClass("error");
						$("#username").next().remove();
						$("#username").after('<span class="error-msg">'+result.message+'</span>');
						$("#pwd").next().remove();
						return false;
					}
	                $(this).resetForm(); // 提交后重置表单
	            }
	        });
	        return false; // 阻止表单自动提交事件
	    });

	 $("#logi").on("click",function(){
		afterSubmit=true;
		//window.location.href = "main.html";
		var username=$("#username").val();
		var pwd=$("#pwd").val();
		var remember=$("#rememberme").is(":checked");
		
		if(!username){
			$username=$("#username");
			$username.next().remove();
			$username.after('<span  class="error-msg">用户名不能为空</span>');
			$username.parent().parent().addClass("error");
		}
		if(!pwd){
			$pwd=$("#pwd");
			$pwd.next().remove();
			$pwd.after('<span  class="error-msg">密码不能为空</span>');
			$pwd.parent().parent().addClass("error");
		}
		if(!username||!pwd){
			return false;
		}
		var params={
			"operator_id":username,
			"operator_pwd":pwd,
			"remember":remember,
			"faild_times":"0",
			"port":"8080"
		}
		$.ajax({
			 url:basePath+"/login/logincheck",
			 type:"POST",
			 async:false,
			 data:{"json":JSON.stringify(params)},
			 success:function(result){
				 console.log(result)
				if(result.state==true){
					window.location.href = "page/main.jsp";
					return true;
				}else if(result.state==false){
					$("#username").parent().parent().addClass("error");
					$("#pwd").parent().parent().addClass("error");
					$("#username").next().remove();
					$("#username").after('<span class="error-msg">'+result.message+'</span>');
					$("#pwd").next().remove();
					return false;
				}
			 },
			 error:function(e){
				 console.log(e);
			 }
		  }); 
		
	});
	 
});
</script>
</body>
</html>
