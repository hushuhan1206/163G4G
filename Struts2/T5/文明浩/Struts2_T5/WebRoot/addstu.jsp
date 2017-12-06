<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addstu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- 对错误信息进行红色提交 -->
	<s:head/>
	<s:actionerror/>
  <body>
  <p><a href="helloAction?lang=en"><s:text name="lang_en"/></a>&nbsp;|| 
  <a href="helloAction?lang=zh"><s:text name="lang_zh"/></a></p>
  <s:form action="studentAction.action" method="post" theme="simple">  	
  	<s:text name="student.sid"></s:text><input type="text" name="student.sid"/>  	
  	<br>
  	<s:fielderror fieldName="student.sid"></s:fielderror>
 	<s:text name="student.sname"></s:text><input type="text" name="student.sname"/><br>
  	<s:fielderror fieldName="student.sname"></s:fielderror>
  	<s:text name="student.sex"></s:text><input type="text" name="student.sex"/><br>
  	<s:text name="student.age"></s:text><input type="text" name="student.age"/><br>
  	<s:text name="student.birthday"></s:text><input type="text" name="student.birthday"/><br>
  	<s:submit key="dosubmit"></s:submit>
  </s:form>
  
   
  </body>
</html>
