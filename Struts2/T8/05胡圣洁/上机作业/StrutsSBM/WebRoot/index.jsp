<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>系统登录 - 超市账单管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/style.css" />
</head>

<body class="blue-style">
	<c:if test="${param.loginMsg == 'failed'}">
		<script type="text/javascript">
			alert("用戶名或密码错误");
		</script>
	</c:if>

	<div id="login">
		<div class="icon"></div>
		<div class="login-box">
		  <s:fielderror name="loginFail"></s:fielderror>
		  <s:form action="" method="post">
		    <s:textfield label="用户名" name="user.userName" required="true" cssClass="input-text"></s:textfield>
		    <s:password label="密码" name="user.userPassword" required="true" cssClass="input-text"></s:password>
		    <s:submit value="登录" cssClass="input-button"></s:submit>
		    <s:reset value="重置" cssClass="input-button"></s:reset>
		  </s:form>
			<form method="post" action="user?cmd=userLogin">
				<dl>
					<dt>用户名：</dt>
					<dd>
						<input type="text" name="userName" class="input-text" />
					</dd>
					<dt>密 码：</dt>
					<dd>
						<input type="password" name="userPassword" class="input-text" />
					</dd>
				</dl>
				<div class="buttons">
					<input type="submit" name="submit" value="登录系统"
						class="input-button" /> <input type="reset" name="reset"
						value="重　　填" class="input-button" />
				</div>
			</form>
		</div>
	</div>
</body>
</html>
