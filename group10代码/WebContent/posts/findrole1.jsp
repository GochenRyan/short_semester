<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>岗位信息列表</title>
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
	<div class="panel-heading">岗位员工信息列表</div>
	<div class="panel-body">
 		<span> <strong>岗位编号：</strong>${classAll.lpe[0].pno}</span></br>
		<span> <strong>岗位名称：</strong>${classAll.lpe[0].pname}</span>
	</div>
	<table class="table table-striped"> 
		<thead>
		
			<th>员工姓名</th>
			<th>员工编号</th>
			<th>员工性别</th>
	
			<th>是否试用中</th>
			<th>是否培训中</th>
			<th>操作</th>
		</thead>
		<tbody>
				<c:forEach items="${requestScope.classAll.lpe}" var="p">
					<tr>
				
						<td>${p.ename}</td>
						<td>${p.empno}</td>
						<td>${p.esex}</td>
			
						<td>${p.if_train}</td>
						<td>${p.if_pro}</td>
						<td>
						<a href="posts_beforetransfer.action?empno=${p.empno}&oldPno=${p.pno}" >
                            <input type="button" class="btn btn-info btn-sm" value="岗位调动"></a>
					  </td>
					  	
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