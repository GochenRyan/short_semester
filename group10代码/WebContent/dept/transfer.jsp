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
<title>员工调动</title>
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
		<div class="panel-heading">部门调动</div>
		<div class="panel-body"></div>
		<form class="form-horizontal" role="form" action="dept_transfer.action" method="post" onsubmit="check()"
			  style="vertical-align:middle">

			<div class="form-group">
				<label for="empno" class="col-sm-2 control-label">
					员工编号
				</label>
				<div class="col-sm-10">
					<input class="form-control" id="empno" type="text"
						   name="classBag.deptTransfer.empno" value="${param.empno}"   readonly>
				</div>
			</div>

			<div class="form-group">
				<label for="oldDptno"  class="col-sm-2 control-label">原部门编号
				</label>
				<div class="col-sm-10">
					<input class="form-control" id="oldDptno" type="text"
						   name="classBag.deptTransfer.oldDptno" value="${param.oldDptno}"   readonly>

				</div>
			</div>

			<div class="form-group">
				<label for="newDptno" class="col-sm-2 control-label">新部门名称</label>
				<div class="col-sm-10">
					<select class="form-control" id="newDptno" name="classBag.deptTransfer.newDptno" 
							placeholder="请选择部门名称">
						<c:forEach items="${ requestScope.classBag.lds }" var="d">
                                <option value='${d.dptno }'>${d.dname }</option>")
						</c:forEach>
				</select>
				</div>
			</div>
			<div class="form-group">
				<label for="dptTransferType" class="col-sm-2 control-label">调动类型</label>
				<div class="col-sm-10">
					<select class="form-control" id="dptTransferType" name="classBag.deptTransfer.dptTransferType"
							 placeholder="请选择调动类型">
						<option>主动</option>
						<option>被动</option>
						<option>其他</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="dptTransferCause" class="col-sm-2 control-label">调动原因</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="dptTransferCause" name="classBag.deptTransfer.dptTransferCause"
						    value="" placeholder="请输入调动原因"
						   onfocus="if (value ==''){value =''}"onblur="if (value ==''){value='无'}">

				</div>
			</div>

			<div class="form-group">
				<label for="dptTransferDate" class="col-sm-2 control-label">调动日期</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="dptTransferDate" name="classBag.deptTransfer.dptTransferDate"
						    placeholder="请输入调动日期"
						   onfocus="if(value==''){value=''}"onblur="if (value ==''){value='2017-07-12'}">
				</div>
			</div>

			<div class="form-group">
				<label for="dptTransferRemark" class="col-sm-2 control-label">备注信息</label>
				<div class="col-sm-10">
					<textarea class="form-control" rows="3" id="dptTransferRemark" name="classBag.deptTransfer.dptTransferRemark"
							   placeholder="请输入备注信息"
							  onfocus="if(value==''){value=''}"onblur="if (value ==''){value='无'}"></textarea>

				</div>
			</div>




			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-info">确认</button>
				</div>
			</div>
		</form>


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