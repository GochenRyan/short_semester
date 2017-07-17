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
<title>编辑部门</title>
<link rel="stylesheet"
          href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="http://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet" />
<script
           src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
          src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
<script type="text/javascript" src="../assets/js/ver_deptedit.js"></script>
</head>
<body>
<div class="panel panel-default">
	<div class="panel-heading">编辑部门</div>
<form class="form-horizontal" role="form" action=" dept_editdept.action" method="post"
      style="vertical-align:middle">
      <div class="form-group">
			<label for="dptno" class="col-sm-2 control-label">部门编号</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="dptno" name="classBag.dept.dptno" 
					   value="${classBag.dept.dptno}" readonly>
			</div>
		</div>
		<div class="form-group">
			<label for="dname" class="col-sm-2 control-label">部门名称</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="dname" name="classBag.dept.dname" 
					   placeholder="${classBag.dept.dname}">
			</div>
		</div>
		<div class="form-group">
			<label for="dptTel" class="col-sm-2 control-label">部门电话</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="dptTel" name="classBag.dept.dptTel" 
					   placeholder="${classBag.dept.dptTel}">
			</div>
		</div>
		<div class="form-group">
			<label for="upDpt" class="col-sm-2 control-label">上属部门</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="upDpt" name="classBag.dept.upDpt" 
					   placeholder="${classBag.dept.upDpt}">
			</div>
		</div>
		<div class="form-group">
			<label for="setupDate" class="col-sm-2 control-label">成立日期</label>
			<div class="col-sm-3">
				<input type="date" class="form-control" id="setupDate" name="classBag.dept.setupDate" 
					   placeholder="${classBag.dept.setupDate}">
			</div>
		</div>

	<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-info">保存</button>
			</div>
		</div>
	</form>
</div>
<ul class="pager">
	<li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
</ul>
</body>
</html>