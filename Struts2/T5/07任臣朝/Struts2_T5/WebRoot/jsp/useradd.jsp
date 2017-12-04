<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
  
  <body>
    <s:form action="/user!add" method="post" theme="simple">
    用户名:<s:textfield name="userinfo.name"/><br/>
    密码:<s:password name="userinfo.password"/><br/>
    出生日期:<s:textfield name="userinfo.birthday"/><br/>
    性别:<s:radio name="userinfo.sex" list="#{'M':'男','F':'女'}" value='"M"'/><br/>
    是否启用:<s:checkbox name="userinfo.active" fieldValue="true"/><br/>
    <input type="submit" value="保存"/>
    </s:form>
  </body>
</html>
