<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在培训员工信息列表</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- HTML HERE -->
	<div class="panel panel-default">
		<div class="panel-heading">在试用员工信息列表</div>
		<div class="panel-body">
		</div>
		<table class="table table-striped table-hover">
			<thead>
			<th>员工号</th>
			<th>姓名</th>
			<th>部门名称</th>
			<th>岗位名称</th>
			<th>试用期状态</th>
			<th>试用期开始时间</th>
			<th>试用期结束时间</th>
			<th>操作</th>
			</thead>
			<tbody>
			<c:if test="${ empty  requestScope.lp}">
				<tr>
					<td colspan="3">没有角色数据</td>
				</tr>
			</c:if>
			<c:if test="${ not  empty requestScope.lp}">
				<c:forEach items="${ requestScope.lp }" var="pr">
					<tr>
						<td>${pr.empno}</td>
						<td>${pr.ename}</td>
						<td>${pr.dname}</td>
						<td>${pr.pname}</td>
						<td>${pr.pro_state}</td>
						<td>${pr.proStartDate}</td>
						<td>${pr.proEndDate}</td>

						<td>
							<a href="estimate_emp.jsp?empno=${pr.empno}">
							<input type="button" class="btn btn-info btn-sm" value="评估"></a>
						</td>

					</tr>
				</c:forEach>
			</c:if>
			</tbody>
		</table>
	</div>
	<ul class="pager">
		<li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
	</ul>


	<!-- END HTML -->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="${ basePath}js/jquery-min-1.12.4.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->