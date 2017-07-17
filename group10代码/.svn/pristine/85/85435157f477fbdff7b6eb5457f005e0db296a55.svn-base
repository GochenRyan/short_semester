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
<title>员工培训申请表</title>
 <link rel="stylesheet"
          href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="http://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet" />
 <script
            src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
  <script
            src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
<script type="text/javascript" src="../assets/js/ver_train.js"></script>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">员工培训</div>
	<div class="panel-body"></div>
<form class="form-horizontal" role="form" action="train_add.action" method="post"  style="vertical-align:middle">
	
			<div class="form-group">
	            <label for="empno" class="col-sm-2 control-label">
	               	 员工编号
	            </label>
	            <div class="col-sm-3">
	                <input class="form-control" id="empno" type="text"
	                       name="train.empno" value="${param.empno}"   readonly>
	            </div>
        	</div>
			<div class="form-group">
	            <label for="train-name" class="col-sm-2 control-label">培训项目名称</label>
	            <div class="col-sm-3">
	                <select type="text" class="form-control" id="train-name" name="train.trainName" 
	                        placeholder="职业技能培训">
	                      <option>职业技能培训</option>
			              <option>职业素养培训</option>
			              <option>员工入职培训</option>
			              <option>拓展培训</option>
			              <option>软件操作培训</option>
			              <option>销售培训</option>
	                </select>
	            </div>
       	    </div>
			<div class="form-group">
	            <label for="train-type" class="col-sm-2 control-label">培训类型</label>
	            <div class="col-sm-3">
	                <select type="text" class="form-control" id="train-type" name="train.trainType" 
	                        placeholder="职业技能">
	                      <option>职业技能</option>
			              <option>素养</option>
			              <option>业务知识</option>
	                  
	                </select>
	            </div>
        	</div>
			<div class="form-group">
	            <label for="train-Cmp" class="col-sm-2 control-label">培训公司</label>
	            <div class="col-sm-3">
	                <select type="text" class="form-control" id="train-Cmp" name="train.trainCmp" 
	                        placeholder="总公司">
	                      <option>总公司</option>
			              <option>北京分公司</option>
			              <option>广州分公司</option>
	                </select>
	            </div>
       		 </div>
			<div class="form-group">
	            <label for="train-Leader" class="col-sm-2 control-label">负责人</label>
	            <div class="col-sm-3">
	                <select type="text"class="form-control" id="train-Leader" name="train.trainLeader" 
	                        placeholder="王大锤">
	                      <option>王大锤</option>
			              <option>陈二狗</option>
			              <option>张全蛋</option>
			              <option>康师傅</option>
	                </select>
	            </div>
       		 </div>
				<div class="form-group">
            <label for="train-Range" class="col-sm-2 control-label">培训范围</label>
            <div class="col-sm-3">
                <select type="text"class="form-control" id="train-Range" name="train.trainRange" 
                        placeholder="销售部">
                          <option>销售部</option>
			              <option>管理部</option>
			              <option>技术部</option>
                </select>
            </div>
        </div>
				<div class="form-group">
            <label for="train-Loc" class="col-sm-2 control-label">培训地点</label>
            <div class="col-sm-3">
                <select type="text"class="form-control" id="train-Loc" name="train.trainLoc" 
                        placeholder="北京">
                          <option>北京</option>
			              <option>广州</option>
			              <option>杭州</option>
                </select>
            </div>
        </div>
		<div class="form-group">
		    <label for="train-Start" class="col-sm-2 control-label">开始时间</label>
		    <div class="col-sm-3">
		        <input type="date" class="form-control" id="train-Start" name="train.trainStart"
		                placeholder="请输入开始时间"
		               onfocus="if(value==''){value=''}"onblur="if (value ==''){value='2017-09-09'}">
		    </div>
		</div>
		<div class="form-group">
		    <label for="train-End" class="col-sm-2 control-label">结束时间</label>
		    <div class="col-sm-3">
		        <input type="date" class="form-control" id="train-End" name="train.trainEnd"
		                placeholder="请输入结束时间"
		               onfocus="if(value==''){value=''}"onblur="if (value ==''){value='2017-10-10'}">
		    </div>
		</div>
		<div class="form-group">
		    <label for="train-Cost" class="col-sm-2 control-label">
		        培训费用
		    </label>
		    <div class="col-sm-3">
		        <input class="form-control" id="train-Cost" type="text"
		               name="train.trainCost" value="1000"  >
		    </div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-info">确认</button>
			</div>
		</div>

<!--  <script>
   function showDialog(){
	   alert("申请成功！请等候具体通知")
   }
</script>--></form>
</div>
<ul class="pager">
	<li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
</ul>
</body>
</html>