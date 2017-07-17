<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>
<body lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门信息列表</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
	<!-- HTML HERE -->
	<div class="panel panel-default">
	<div class="panel-heading">部门员工信息列表</div>
	<div class="panel-body">
		<span> <strong>部门编号：</strong>${classBag.lrd[0].dptno}</span></br>
		<span> <strong>部门名称：</strong>${classBag.lrd[0].dname}</span>
	</div>
		<table class="table table-striped table-hover">
			<thead>
			<th>员工名称</th>
			<th>员工编号</th>
			<th>员工性别</th>
			<th>是否试用中</th>
			<th>是否培训中</th>
			<th>操作</th>
			</thead>
			<tbody>
			<c:forEach items="${requestScope.classBag.lrd}" var="d">
				<tr>
					<td>${d.empno}</td>
					<td>${d.ename}</td>
					<td>${d.esex}</td>
					<td>${d.if_pro}</td>
					<td>${d.if_train}</td>
					<td>
						<a href="dept_beforetransfer.action?empno=${d.empno}&oldDptno=${d.dptno}">
							<input type="button" class="btn btn-info btn-sm" value="部门调动"></a>
				</tr>
			</c:forEach>
			</tbody>
		</table>


</div>
	<ul class="pager">
		<li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
	</ul>
</body>
</html>



	<!-- END HTML -->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="${ basePath}js/jquery-min-1.12.4.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->