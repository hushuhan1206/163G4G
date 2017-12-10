<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	<!-- 显示上传回执信息的页面 -->
	<h2>文件的上传与下载</h2>
		当前上传的信息回执显示:<br/><br/>
		用户名:<s:property value="username"/><br/>
		上传文件的名称:<s:property value="uploadfileFileName"/><br/>
		上传文件的类型:<s:property value="uploadfileContentType"/><br/>
		上传文件的大小:<s:property value="uploadfile.length()"/>字节<br/>
		
		下载方式一:<s:a href="/struts2T07/file!download?downfile_name=%{uploadfileFileName}">下载1</s:a>
		下载方式二:<s:a href="/struts2T07/%{uploadfileFileName}">下载2</s:a>
</body>
</html>