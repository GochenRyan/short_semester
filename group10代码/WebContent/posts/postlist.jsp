<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
/*
   	<table class="table table-striped">
		<caption>岗位信息列表</caption>
		
		
		<td><a href="posts_findpost?classAll.posts.pno= ${p.pno}">编辑</a>
		<a href="posts_delete?classAll.posts.pno= ${p.pno}" >删除</a> <a
	       href="posts_findrole?classAll.posts.pno=${p.pno}">查看员工</a></td>
*/
%>
<!DOCTYPE html>
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
<body>
	<!-- HTML HERE -->
<div class="panel panel-default">
	<div class="panel-heading">岗位信息列表</div>
	<div class="panel-body">
		<a href="postadd.jsp"><input type="button" class="btn btn-info" value="建立新岗位"></a>
	</div>
	<table class="table table-striped table-hover">
		<thead>
			<th>岗位编号</th>
			<th>岗位名称</th>
			<th>岗位编制</th>
			<th>操作</th>
			
		</thead>
		<tbody>
			<c:if test="${ empty  requestScope.classAll.lps}">
				<tr>
					<td colspan="3">没有角色数据</td>
				</tr>
			</c:if>
			<c:if test="${ not  empty requestScope.classAll.lps}">
				<c:forEach items="${ requestScope.classAll.lps }" var="p">
					<tr>
						<td>${p.pno}</td>
						<td>${p.pname }</td>
						<td>${p.pum}</td>
						
		
					  <td>
						<a href="posts_findpost?classAll.posts.pno= ${p.pno}">
                            <input type="button" class="btn btn-info btn-sm" value="编辑"></a>
						<a href="posts_delete?classAll.posts.pno= ${p.pno}" >
                            <input type="button" class="btn btn-info btn-sm" value="删除"></a>
						<a href="posts_findrole?classAll.posts.pno=${p.pno}" >
                            <input type="button" class="btn btn-info btn-sm" value="查看员工"></a>
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
	<script src="${ basePath}js/jquery-min-1.12.4.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->