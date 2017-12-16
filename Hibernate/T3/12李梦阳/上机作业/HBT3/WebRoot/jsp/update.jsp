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
    
    <title>员工修改页面</title>
    
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
    <h2>员工管理-修改员工</h2>
    <s:form action="updateEmp" method="post">
    	<s:hidden name="emp.eid"></s:hidden>
    	<s:textfield label="员工姓名" name="emp.ename" required="true" />
    	<s:radio label="员工性别" name="emp.esex" list="#{'m':'男','f':'女'}" value="'m'" />
    	<s:textfield label="员工生日" name="emp.ebirth" required="true" />
    	<s:select label="所属部门" name="emp.did" list="deptlist" headerKey="" headerValue="请选择"  />
    	<s:submit value="修改" />
    </s:form>
  </center>
  </body>
</html>
