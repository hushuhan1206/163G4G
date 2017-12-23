<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息表</title>
</head>
<body>
	<h2>用户信息表</h2>
	姓名：
	<s:property value="user.name" />
	<br> 密码：
	<s:property value="user.password" />
	<br> 生日：
	<s:property value="user.birthday" />
	<br> 性别：
	<s:if test="user.sex==1">男</s:if>
	<s:elseif test="user.sex==2">女</s:elseif>
	<s:else>保密</s:else>
	<br> 是否启用：
	<s:property value="user.isable" />
	<br>
</body>
</html>