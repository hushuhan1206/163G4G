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
    
    <title>角色管理-修改角色</title>
    
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
    	<h2>角色管理-修改角色</h2>
    	<s:form action="updateRole" method="post">
    		<s:hidden name="role.roleId" />
    		<s:textfield label="角色名称" name="role.roleName" required="true" />
    		<s:textfield label="角色说明" name="role.memo" required="true" />
    		<s:checkboxlist name="userId" list="userlist" listKey="userId" listValue="userName"></s:checkboxlist>
    		<s:submit value="保存"></s:submit>
    	</s:form>
    </center>
  </body>
</html>
