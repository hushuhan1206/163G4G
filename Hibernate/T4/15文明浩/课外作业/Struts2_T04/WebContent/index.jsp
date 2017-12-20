<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<s:form action="user/add" namespace="/user" method = "post">
		<s:textfield label="用户名"  name="tbuser.uname" required="true"></s:textfield>
		<s:password label="密码"  name = "tbuser.upwd" required="true"></s:password>
		<s:select label="学历"  list="{ '高中','大专','本科','研究生','博士'}"  size = "2" value = "'高中'" name = "tbuser.eduction"></s:select>
		<s:radio list="#{'1':'男','2':'女','3':'保密' }"  value="1"  name = "tbuser.sex"></s:radio>
		<s:submit value="提交"></s:submit>
	</s:form>
	
	
</body>
</html>