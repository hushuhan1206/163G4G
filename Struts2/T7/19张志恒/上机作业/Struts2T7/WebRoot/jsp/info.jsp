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
    
    <title>My JSP 'info.jsp' starting page</title>
    
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
    <h2>文件的上传与下载</h2>
    当前上传的信息显示<br><br>
    用户名：<s:property value="uname" /><br>
    上传文件的名称：<s:property value="uploadfileFileName" /><br>
    上传文件的大小：<s:property value="uploadfile.length()" /><br>
 	<br>   
    下载一：<s:a href="/Struts2T7/upfile/%{uploadfileFileName}">下载（点击右键选这目标另存为）</s:a>
    下载二：<s:a href="/Struts2T7/file!download?downfile_name=%{uploadfileFileName}">下载（单击流方式）</s:a>
  </body>
</html>
