<%@page import="java.util.List" %>
<%@page import="sun.awt.RepaintArea" %>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>培训管理</title>
</head>
<body>
<a href="train_apart.action">培训</a>
<a href="train_listtrain.action">查看所有培训员工信息</a>
</body>
</html>