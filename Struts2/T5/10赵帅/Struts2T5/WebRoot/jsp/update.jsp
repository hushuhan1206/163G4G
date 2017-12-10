<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
		<form action="userupdate" method="post">
			<s:hidden name="user.id"></s:hidden>
			<s:textfield name="user.name" label="用户名" />
			<br /><br />
			<s:password name="user.pwd" label="密码" />
			<br /><br />
			<s:textfield name="user.brithday" label="生日"/>
			<br /><br />
			<s:radio name="user.sex" label="性别" list="{'男','女'}" value="'男'"  />
			<br /><br />
			<s:checkboxlist label="是否启用" list="{1:'是',2:'否'}" value="是"></s:checkboxlist>
			<br /><br />
			<s:submit value="修改"></s:submit>
			<s:reset value="重置"></s:reset>
		</form>
	</center>
  </body>
</html>
