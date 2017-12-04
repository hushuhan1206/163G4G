<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateuser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    	<center>
 		<h2>修改用户</h2>
 		<form action="update" method="post">
 			<s:hidden name="user.userId"></s:hidden>
 			<s:textfield name="user.userName" label="用户名" />
 			<br />
 			<s:password name="user.userPassword" label="密码" />
 			<br />
 			<s:radio name="user.userSex" list="{'男','女'}" value="'男'" label="性别" />
 			<br />
 			<s:textfield name="user.userAge" label="年龄" />
 			<br />
 			<s:textfield name="user.phone" label="电话" />
 			<br />
 			<s:textfield name="user.address" label="地址" />
 			<br />
 			<s:submit value="修改"></s:submit>
 			<s:reset value="重置"></s:reset>
 		</form>
 	</center>
  </body>
</html>
