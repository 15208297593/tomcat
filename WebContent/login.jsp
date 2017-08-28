<%@page import="com.utils.CounterListener"%>
<%@ page language="java" contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>欢迎页面</title>
	<meta charset="utf-8" http-equiv="content-type" content="text/html">
</head>
<body>
	<% String username = request.getParameter("username"); %>
	欢迎你,<%=new String(username.getBytes("ISO-8859-1"),"utf-8")%>!
	<%=com.utils.CounterListener.count %>
</body>
</html>