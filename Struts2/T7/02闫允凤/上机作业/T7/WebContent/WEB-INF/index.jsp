<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="/file!upload" enctype="multipart/form_data" method="post" theme="simple">
用户名<s:textfield name="username"></s:textfield><br>
选着上传文件<s:file name="uploadfile"></s:file><br>
<s:submit value="确定"></s:submit>
</s:form>
</body>
</html>