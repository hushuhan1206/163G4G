<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<s:form action="user" method="post">
		<s:textfield name="userName" label="请输入你的大名"></s:textfield>
		<s:submit value="确认"></s:submit>
	</s:form>

	<s:form action="login" method="post">
		<s:textfield name="user.name" label="用户名"></s:textfield>
		<s:password name="user.password" label="密码">
		</s:password>
		<s:submit value="确认"></s:submit>
	</s:form>
</body>
</html>