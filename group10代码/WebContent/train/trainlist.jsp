<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>培训中员工信息表</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="${ basePath}js/jquery-min-1.12.4.js"></script>
</head>
<body lang="zh-CN" >
	<!-- HTML HERE -->
	<div class="panel panel-default">
    <div class="panel-heading">培训中员工信息表</div>
    <div class="panel-body">
    </div>
	<table class="table table-striped table-hover">
		<thead>
			<th>员工编号</th>	
						
			<th>培训项目名称</th>
			<th>培训类型</th>
			<th>培训公司</th>
			<th>负责人</th>
			<th>培训范围</th>
			<th>培训地点</th>
			<th>培训开始时间</th>
			<th>培训结束时间</th>
			<th>培训费用</th>		
			<th>操作</th>
		</thead>
		<tbody>
			<c:if test="${ empty  requestScope.lts }">
				<tr>
					<td colspan="3">没有角色数据</td>
				</tr>
			</c:if>
			<c:if test="${ not  empty requestScope.lts}">
				<c:forEach items="${ requestScope.lts }" var="t">
					<tr>			
						<td>${t.empno}</td>
						<td>${t.trainName}</td>
						<td>${t.trainType}</td>
						<td>${t.trainCmp}</td>
						<td>${t.trainLeader}</td>
						<td>${t.trainRange}</td>
						<td>${t.trainLoc}</td>
						<td>${t.trainStart}</td>
						<td>${t.trainEnd}</td>		  
						<td>${t.trainCost}</td>
					  	<td>
			<a href="train_endtrain?train.empno= ${t.empno}">
                <input type="button" class="btn btn-info btn-sm" value="结束培训"></a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
		  
			<!-- <a href="aparttrain.jsp">申请培训</a>-->
		
		  
		
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