<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'modify.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="menu">
	</div>
	<div class="main">
		<div class="optitle clearfix">
			<div class="title">用户管理&gt;&gt;</div>
		</div>
		<form method="post" action="updateUploadUser" enctype="multipart/form-data" >
			<div class="content">
				<table class="box">
					<tr>
						<s:hidden name="user.userId"></s:hidden>
						<s:textfield label="用户名称" name="user.userName" required="true" class="text" />
						<s:password label="用户密码" name="user.userPassword" required="true" class="text" />
						<s:radio label="用户性别" name="user.userSex" list="#{'m':'男','f':'女'}" value="'m'"/>
						<s:textfield label="用户年龄" name="user.userAge" required="true" class="text"/>
						<s:textfield label="用户电话" name="user.telephone" required="true" class="text" />
						<s:textfield label="用户地址" name="user.address" required="true" class="text" />
						<s:radio label="用户权限" name="user.type" list="#{'0':'管理员','1':'普通用户女'}" value="1" />
						<s:file name="uploadfile" label="头像" /><font color="red">只允许上传png、jpg、jif文件，文件最大为2M</font>
					</tr>
				</table>
			</div>
			<div class="buttons">
				<input type="button" name="button" value="返回" class="input-button" onclick="history.back();" />
				<input type="submit" name="submit" value="修改" class="input-button" />
				<a style="text-decoration: none;" class="input-button" href="deleteUser?user.userId=${param.userId}" >删除</a>
			</div>
		</form>
	</div>
</body>
</html>
