<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<s:form action="addUser" method="post">
		<s:textfield name="user.name" label="用户名" />
		<br>
		<s:password name="user.password" label="密码" />
		<br>
		<s:textfield name="birthday" label="生日" />
		<br>
		<s:radio name="user.sex" list="#{1:'男',2:'女',0:'保密'}" value="1"
			label="性别" />
		<br>
		<s:checkbox name="user.isable" fieldValue="true" label="是否启用" />
		<br>
		<s:submit value="提交" />
	</s:form>
</body>
</body>
</html>