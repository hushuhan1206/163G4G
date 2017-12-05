<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件信息</title>
</head>
<body>
	<h2>文件上传</h2>
	当前上传信息的回执信息：<br><br>
	用户名：<s:property value="username"/><br>
	文件名<s:property value="uploadfileFileName"/><br>
	文件类型：<s:property value="uploadfileContentType"/><br>
	文件大小：<s:property value="uploadfile.length()"/>字节<br><br>
	<h2>文件的下载</h2>
	<s:a href="/T7/upload/${uploadfileFileName}" label="方式一">下载1</s:a>
	<s:a href="download" label="方式二">下载2</s:a>
</body>
</html>