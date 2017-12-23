<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改界面</title>
</head>
<body>
	<s:form action="updateUser" namespace="/" method="post">

		<s:hidden name="user.uid"></s:hidden>

		<s:textfield name="user.name" label="用户名"></s:textfield>
		<br>

		<s:password name="user.password" showPassword="true"
			value="%{#user.password}" label="密码"></s:password>
		<br>

		<s:textfield name="birthday" value="%{user.birthday}" label="生日"></s:textfield>
		<br>

		<s:radio name="user.sex" list="#{1:'男',2:'女',0:'保密'}" value="1"
			label="性别"></s:radio>
		<br>

		<s:checkbox name="user.isable" fieldValue="true" label="是否启用"></s:checkbox>
		<br>

		<s:submit value="提交"></s:submit>

	</s:form>

</body>
</html>