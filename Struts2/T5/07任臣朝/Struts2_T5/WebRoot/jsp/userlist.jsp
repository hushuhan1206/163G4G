<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息列表</title>
</head>
  
  <body>
    <h2>用户信息列表</h2>
    <a href="/Struts2_t6/useradd.jsp">添加新用户</a>
    <table border="1">
       <tr>
        <td>用户ID</td><td>用户名</td><td>密码</td><td>出生日期</td><td>性别</td><td>是否启用</td>
        </tr>
        <s:iterator value="userlist" var="user">
        <tr>
         <td><s:property value="#user.id"/></td>
         <td><s:property value="#user.name"/></td>
         <td><s:property value="#user.password"/></td>
         <td><s:property value="#user.birthday"/></td>
         <td><s:if test='#user.sex=="M"'>男</s:if><s:else>女</s:else></td>
         <td><s:property value="#user.active"/></td>
         <td><s:a herf="/Struts/user!toUpdate?userinfo.id=%{#user.id}">修改</s:a>&nbsp;
            <s:a href="/Struts/user!delete?userinfo.id=%{#user.id}">删除</s:a>
            </td>
            </tr>
        </s:iterator>     
    </table>
  </body>
</html>
