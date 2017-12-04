<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户页面</title>
</head>

<body>
	<h2>修改用户</h2>
	
	<s:form action="/user!update" method="post" theme="simple">
		<s:hidden name="userinfo.id" />
     用户名:<s:textfield name="userinfo.name" /><br />
     密码:<s:password name="userinfo.oassword"/><br/>
     出生日期:<s:textfield name="userinfo.birthday"/><br/>
     性别:<s:radio name="userinfo.sex" list="#{'M':'男','F':'女'}"/><br/>
     是否启用:<s:checkbox name="userinfo.active" fieldValue="true"/><br/>
     <input type="submit" value="保存"/>
	</s:form>

</body>
</html>
