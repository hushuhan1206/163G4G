<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c"  uri = "core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>系统登录 - 超市账单管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body class="blue-style">
	<c:if test=" ${param.doLogin eq 'error' } ">
	<script type="text/javascript">

			window.alert("用户名或密码有误");
	</script>
	</c:if>
<div id="login">
	<div class="icon"></div>
	<div class="login-box">
		<form method="post" action="user?cmd=login">
			<dl>
				<dt>用户名：</dt>
				<dd><input type="text" name="userName" class="input-text" /></dd>
				<dt>密　码：</dt>
				<dd><input type="password" name="userPassword" class="input-text" /></dd>
			</dl>
			<div class="buttons">
				<input type="submit" name="submit" value="登录系统" class="input-button" />
				<input type="reset" name="reset" value="重　　填" class="input-button" />
			</div>
		</form>
	</div>
</div>
</body>
</html>
