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
<title>员工评估</title>
<link rel="stylesheet"
          href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="http://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet" />
    <script
            src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script
            src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
            
            <script src="${ basePath}js/jquery-min-1.12.4.js"></script>
            
            <!-- 调用外部javascript -->
	<script type="text/javascript" src="../assets/js/ver_estimate.js"></script>
</head lang="zh-CN">
<body >	
	<div class="panel panel-default">
	<div class="panel-heading">评估</div>
	<div class="panel-body">
		<form class="form-horizontal" style="vertical-align:middle" role="form" >
			<tbody>
				<div class="form-group">
					<label for="empno" class="col-sm-2 control-label">员工编号</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="empno" name="empno" 
							   value= "${param.empno}" readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="pro_Remark" class="col-sm-2 control-label">试用期部门考核评语</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="pro_Remark" name="pro_Remark"
							   value= "该员工试用期表现良好">
					</div>
				</div>
				<div class="form-group">
					<label for="checkResult" class="col-sm-2 control-label">试用期考核结果</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="checkResult" name="checkResult" 
							   value= "合格">
					</div>
				</div>
				<div class="form-group">
					<label for="dealDate" class="col-sm-2 control-label">处理日期</label>
					<div class="col-sm-3">
						<input type="date" class="form-control" id="dealDate" name="dealDate" 
							   value= "2017-04-06">
					</div>
				</div>
				<div class="form-group">
					<label for="remark" class="col-sm-2 control-label">试用期备注</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="remark" name="remark">
					</div>	
				</div>
				 <div class="form-group">
					<label class="col-sm-2 control-label">操作</label>
					<div class="btn-group col-sm-10">
	    				 <a href="pro/pro_come.action?pro.empno=${param.empno}"><button type="button" class="btn btn-info">转正</button></a>
	       				 <a href="pro/pro_waita.action?pro.empno=${param.empno}"><button type="button" class="btn btn-info">延期15天</button></a>
	           			 <a href="pro/pro_go.action?pro.empno=${param.empno}"><button type="button" class="btn btn-info">不录用</button></a>
					</div>
				</div> 
			</tbody>
		</form>
	</div>
<ul class="pager">
	<li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
</ul>
</body>
</html>