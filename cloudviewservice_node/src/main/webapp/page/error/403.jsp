<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if IE 8]><html class="ie8 oldie"><![endif]-->
<!--[if IE 9]><html class="ie9 oldie"><![endif]-->
<!--[if gt IE 9]><!--><html><!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<title>403</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/common.js" ></script>
​<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.form.js" ></script>
<!--[if IE]>
	<link rel="stylesheet" type="text/css" href="../../static/css/ie.css" />
<![endif]-->
<!--[if lt IE 9]>
	<script type="text/javascript" src="../../static/js/html5.js" ></script>
	<script type="text/javascript" src="../../static/js/ie.js" ></script>
<![endif]-->

</head>
<body>
<div class="g-header">
	<a href="${pageContext.request.contextPath}/index.html" class="logo"></a>
	<a class="exit" href="${pageContext.request.contextPath}/index.html"><span class="icon"></span>退出</a>
	<!-- <div class="status"><span class="icon"></span>系统管理员</div> -->
	<div class="g-select language">
		<span class="icon"></span>
		<select>
			<option value="" selected>中文</option>
			<!-- <option value="">英文</option> -->
		</select>
		<span class="arr-icon"></span>
	</div>
	<a href="${pageContext.request.contextPath}/index.html" class="index-page"><span class="icon"></span>首页</a>
</div>
<div class="no-page">
	<div class="word">
		抱歉，请求的资源不再您的权限范围<br>
		请联系系统管理员<br>
		或者 <a class="back-to-index" href="${pageContext.request.contextPath}/index.html">返回首页</a>
	</div>
</div>
<script type="text/javascript">
$(function(){
	var location = (window.location+'').split('/');  
	var basePath = location[0]+'//'+location[2]+'/'+location[3];
	$("a.exit").attr("href",basePath+"/login/logout");
	
});
</script>
</body>
</html>


