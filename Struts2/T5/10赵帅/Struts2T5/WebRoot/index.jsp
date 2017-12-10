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
    
    <title>My JSP 'index.jsp' starting page</title>
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
		<h2>添加用户</h2>
		<form action="useradd" method="post">
		<s:textfield name="user.name" label="用户名" /><br/><br/>
		<s:password name="user.pwd" label="密码" /><br/><br/>a
		<s:textarea label="生日" name="user.brithday"></s:textarea>
		<s:radio name="user.sex" list="{'男','女'}" value="'男'" label="性别" /><br/><br/>
		<s:checkboxlist label="是否启用" list="{1:'是',2:'否'}" value="是"></s:checkboxlist>
		<s:submit value="添加"></s:submit>
  		</form>
	</center>
  </body>
</html>
