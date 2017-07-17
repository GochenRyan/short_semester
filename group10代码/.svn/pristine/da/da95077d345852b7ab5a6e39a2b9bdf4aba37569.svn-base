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
<title>新增岗位</title>
<link rel="stylesheet"
          href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="http://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet" />
<script
           src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
          src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
</head>
<body>
    <div class="panel panel-default">
	<div class="panel-heading">新建岗位</div>
<form class="form-horizontal" role="form"action="posts_add.action" method="post"
      style="vertical-align:middle">
      
		<div class="form-group">
			<label for="pno" class="col-sm-2 control-label">岗位编号</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="pno" name="classAll.posts.pno" 
					   placeholder="请输入岗位编号">
			</div>
		</div>
		<div class="form-group">
			<label for="pname" class="col-sm-2 control-label">岗位名称</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="pname" name="classAll.posts.pname" 
					   placeholder="请输入岗位名称">
			</div>
		</div>
		<div class="form-group">
			<label for="pum" class="col-sm-2 control-label">岗位编制</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="pum" name="classAll.posts.pum" 
					   placeholder="请输入岗位编制">
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

<script type="text/javascript">
$(function () {
    $('form').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	"classAll.posts.pno":{
        		validators:{
        			notEmpty:{
        				message: '岗位编号不能为空'
        			},
        			regexp:{
        				regexp: /^22\d{3}$/,
        				message: '请输入正确格式：22XXX'
        			}
        		}
	       	},
	       	"classAll.posts.pname":{
	       		validators:{
	       			notEmpty:{
	       				message: '岗位名称不能为空'
	       			}
	       		}
	       	},
	       	"classAll.posts.pum":{
	       		validators:{
	       			notEmpty:{
	       				message: '岗位编制不能为空'
	       			},
	       			regexp:{
	       				regexp: /^[1-9]\d*$/,
	       				message: '请输入正确的岗位编制'
	       			}
	       		}
	       	}
        }
    });
});
</script>

</body>
</html>