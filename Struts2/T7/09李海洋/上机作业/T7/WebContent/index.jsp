<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
	<s:form action="file!upload" enctype="multipart/form-data" method="post">
		<s:textfield name="username" label="用户名"/><br/>
		<s:file name="uploadfile" label="选择上传的文件"/><br/>
		<s:submit value="上传"/>
	</s:form>
	<s:fielderror/>
	<s:actionerror/>
</body>
</html>