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
 		    <td>性别</td>
 		    <td>年龄</td>
 		    <td>电话</td>
 		    <td>地址</td>
 		    <td>操作</td>
 		   </tr>
 		   <s:iterator value="userlist">
 		   	<tr>
 			   	<td><s:property value="userId"/></td>
 			   	<td><s:property value="userName"/></td>
 			   	<td><s:property value="userSex"/></td>
 			   	<td><s:property value="userAge"/></td>
 			   	<td><s:property value="phone"/></td>
			   	<td><s:property value="address"/></td>
 			   	 <td>
 				   	 <a href="del?user.userId=<s:property value="userId" />">删除</a>
 				   	 <a href="perUpdate?user.userId=<s:property value="userId" />">修改</a>
 			   	 </td>
 		   	</tr>
 		   </s:iterator>
 		 </table>
 	</center>
  </body>
</html>
