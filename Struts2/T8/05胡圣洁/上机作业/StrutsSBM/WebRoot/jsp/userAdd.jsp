<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>My JSP 'userAdd.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link type="text/css" rel="stylesheet" href="css/style.css">
<script type="text/javascript">
	function checkit() {
		//判断是否是数字的正则表达式
		return true;
	}
</script>
</head>
<body>
	<div class="main">
		<div class="optitle clearfix">
			<div class="title">用户管理&gt;&gt;</div>

		</div>
		<s:form action="user!upload" method="post" enctype="multipart/form-date">
			<div class="content">
				<s:textfield label="用户名称" name="user.userName" required="true" />
				<s:password label="用户密码" name="user.userPassword" required="true" />
				<s:radio label="用户性别" name="user.userSex" list="#{'m':'男';'f':'女' }" value="'m'"/>
				<s:textfield label="用户年龄" name="user.userAge"/>
				<s:textfield label="用户电话" name="user.telephone"/>
				<s:textfield label="用户地址" name="user.address"/>
				<s:radio name="user.type" list="#{0:'管理员';1:'普通用户' }" value="0"/>

				<font color="red">*只允许png,jpg,jpeg,gif类型的文件，最大文件大小为2M</font>
				<s:file label="头像" name="uploadPhoto"/>

				<s:submit value="添加"/>
			</div>
		</s:form>
	</div>
</body>
</html>
