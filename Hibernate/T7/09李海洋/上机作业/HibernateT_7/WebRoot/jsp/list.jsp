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
    
    <title>员工列表页面</title>
    
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
    	<h2>员工管理</h2>
    	<s:form action="/getAllEmp" method="post">
    			<s:textfield label="员工姓名" name="emp.ename" />
    			<s:select name="emp.dept" list="deptlist" listKey="did" listValue="dname"></s:select>
    			<s:submit value="查询" />
    	</s:form>
    	<table border="1">
    			<tr align="center">
    				<td>员工ID</td>
    				<td>姓名</td>
    				<td>性别</td>
    				<td>出生日期</td>
    				<td>所属部门</td>
    			</tr>
    			<s:iterator value="emplist" var="emp">
    				<tr>
    					<td><s:property value="#emp.eid"/></td>
    					<td><s:property value="#emp.ename"/></td>
    					<td><s:property value="#emp.esex"/></td>
    					<td><s:property value="#emp.ebirth"/></td>
    					<td><s:property value="#emp.dept.dname"/></td>
    				</tr>
    			</s:iterator>
    	</table>
    </center>
  </body>
</html>
