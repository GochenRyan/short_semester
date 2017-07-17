<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>岗位信息列表</title>
    <link rel="stylesheet"
	    href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="${ basePath}js/jquery-min-1.12.4.js"></script>
</head>
<body lang="zh-CN" >
	<!-- HTML HERE -->
<div class="panel panel-default">
	<div class="panel-heading">调动列表</div>
	<div class="panel-body">
	</div>
	<table class="table table-striped table-hover">
		<thead>
		<th>员工编号</th>
		<th>原岗位编号</th>
		<th>新岗位编号</th>
		<th>调动类型</th>
		<th>调动原因</th>
		<th>备注信息</th>
		</thead>
		<tbody>
		<c:if test="${ empty  requestScope.deptTransfers}">
			<tr>
				<td colspan="3">没有角色数据</td>
			</tr>
		</c:if>
		<c:if test="${ not  empty requestScope.deptTransfers}">
			<c:forEach items="${ requestScope.deptTransfers }" var="d">
				<tr>
					<td>${d.empno }</td>
					<td>${d.oldPno }</td>
					<td>${d.newPno }</td>
					<td>${d.postTransferType}</td>
					<td>${d.postTransferCause}</td>
					<td>${d.postTransferRemark}</td>
					<td>
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
</body>
</html>


	<!-- END HTML -->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<!-- Include all compiled plugins (below), or include individual files as needed -->