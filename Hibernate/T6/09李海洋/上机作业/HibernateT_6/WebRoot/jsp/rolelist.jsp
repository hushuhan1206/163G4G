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
    
    <title>角色列表页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function toggle(roleId){
			var tr = document.getElementById(roleId);
			tr.style.display = tr.style.display=='none'?'block':'none';
		}
	</script>
  </head>
  
  <body>
    <center>
    	<h2>角色管理</h2>
    	<a href="<s:url value='/toAddRole'/>">新增角色</a>
    	<table border="1">
    		<tr align="center">
    			<td>角色ID</td>
    			<td>角色名称</td>
    			<td>说明</td>
    			<td>操作</td>
    		</tr>
    		<s:iterator value="rolelist" var="role">
    			<tr align="center">
    				<td><s:property value="#role.roleId" /></td>
    				<td><a href="javascript:toggle(${role.roleId})"><s:property value="#role.roleName" /></a></td>
    				<td><s:property value="#role.memo" /></td>
    				<td>
    					<a href="<s:url value='toUpdateRole?role.roleId=%{#role.roleId}'/>">修改</a>
    					<a href="<s:url value='deleteRole?role.roleId=%{#role.roleId}'/>">删除</a>
    				</td>
    			</tr>
    			
    			<tr id="<s:property value='#role.roleId' />" style="display: none;" align="center">
    				<td colspan="4" align="center">
    					<table border="1">
    						<tr align="center">
    							<td>账号ID</td>
    							<td>用户</td>
    						</tr>
    						<s:iterator value="#role.users" var="user">
    							<tr align="center">
    								<td><s:property value="#user.userId"/></td>
    								<td><s:property value="#user.userName"/></td>
    							</tr>
    						</s:iterator>
    					</table>
    				</td>
    			</tr>
    			
    		</s:iterator>
    	</table>
    </center>
  </body>
</html>
