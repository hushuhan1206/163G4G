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
    
    <title>My JSP 'result.jsp' starting page</title>
    
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
	<h2>所有用户信息</h2>
		<table border="1">
		   <tr>
		    <td>用户id</td>
		    <td>用户名</td>
		    <td>密码</td>
		    <td>生日</td>
		    <td>性别</td>
		    <td>是否启用</td>
		    <td>操作</td>
		   </tr>
		   <s:iterator value="select">
		   	<tr>
			   	<td><s:property value="id"/></td>
			   	<td><s:property value="name"/></td>
			   	<td><s:property value="pwd"/></td>
			   	<td><s:property value="brithday"/></td>
			   	<td><s:property value="sex"/></td>
			   	<td><s:property value="active"/></td>
			   	 <td>
				   	 <a href="del?user.id=<s:property value="id" />">删除</a>
				   	 <a href="update?user.id=<s:property value="id" />">修改</a>
			   	 </td>
		   	</tr>
		   </s:iterator>
		 </table>
	</center>
  </body>
</html>
