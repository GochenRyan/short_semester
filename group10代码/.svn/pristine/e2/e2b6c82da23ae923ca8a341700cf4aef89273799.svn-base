<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理_修改成员</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

    <div class="panel panel-default">
    <div class="panel-heading">员工详细信息</div>
    <div class="panel-body"></div>
	<form class="form-horizontal" role="form"  action="#" method="post"
          style="vertical-align:middle">

		<div class="form-group">
            <label for="empno" class="col-sm-2 control-label">员工编号</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="empno" name="empno" 
                       value="${role.empno}" readonly="readonly">
            </div>
        </div>
			<div class="form-group">
            <label for="ename" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="ename" name="ename" 
                       value="${role.ename}" readonly="readonly">
            </div>
        </div>
			<div class="form-group">
            <label for="esex" class="col-sm-2 control-label">性别</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="esex" name="esex" 
                        value="${role.esex}" readonly="readonly">
                </input>
            </div>
        </div>
			<div class="form-group">
            <label for="bornDate" class="col-sm-2 control-label">出生日期</label>
            <div class="col-sm-3">
                <input type="date" class="form-control" id="bornDate" name="bornDate" 
                       value="${role.bornDate}" readonly="readonly">
            </div>
        </div>
			<div class="form-group">
            <label for="identityId" class="col-sm-2 control-label">身份证号</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="identityId" name="identityId" 
                       value="${role.identityId}" readonly="readonly">
            </div>
        </div>
        <div class="form-group" >
            <label for="pname" class="col-sm-2 control-label">入职岗位</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="pname" name="pname" 
                       value="${role.pname}" readonly>
            </div>
        </div>

        <div class="form-group" >
            <label for="dname" class="col-sm-2 control-label">入职部门</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="dname" name="dname" 
                       value="${role.dname}" readonly>
            </div>
        </div>
			<div class="form-group">
            <label for="entryDate" class="col-sm-2 control-label">入职日期</label>
            <div class="col-sm-3">
                <input type="date" class="form-control" id="entryDate" name="entryDate" 
                       value="${role.entryDate}" readonly="readonly">
            </div>
        </div>
			<div class="form-group" >
            <label for="if_dim" class="col-sm-2 control-label">在职状态</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="if_dim" name="if_dim" 
                        value="${role.if_dim}" readonly="readonly">
                </input>
                <c:if test="${role.if_dim eq '是'}">
                    <script>$("#if_dim").val("已离职")</script>
                </c:if>
                <c:if test="${role.if_pro eq '是'}">
                    <script>$("#if_dim").val("试用中")</script>
                </c:if>
                <c:if test="${role.if_dim eq '否'}">
                    <script>$("#if_dim").val("在职中")</script>
                </c:if>
            </div>
        </div>
        <div class="form-group" hidden>
            <label for="if_train" class="col-sm-2 control-label">培训状态</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="if_train" name="if_train" 
                       value="${role.if_train}" readonly="readonly">
                </input>
                <c:if test="${role.if_train eq '是'}">
                    <script>$("#iif_train").val("培训中")</script>
                </c:if>
                <c:if test="${role.if_train eq '否'}">
                    <script>$("#if_train").val("未培训")</script>
                </c:if>
            </div>
        </div>

			<div class="form-group">
            <label for="workDate" class="col-sm-2 control-label">参加工作日期</label>
            <div class="col-sm-3">
                <input type="date" class="form-control" id="workDate" name="workDate" 
                       value="${role.workDate}" readonly="readonly">
            </div>
        </div>
			<div class="form-group">
            <label for="workWay" class="col-sm-2 control-label">用工形式</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="workWay" name="workWay" 
                        value="${role.workWay}" readonly="readonly">
                </input>
            </div>
        </div>
			<div class="form-group">
            <label for="employeeOrigin" class="col-sm-2 control-label">人员来源</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="employeeOrigin" name="employeeOrigin" 
                        value="${role.employeeOrigin}" readonly="readonly">
                </input>
            </div>
        </div>
			<div class="form-group">
            <label for="politicalStatus" class="col-sm-2 control-label">政治面貌</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="politicalStatus" name="politicalStatus" 
                        value="${role.politicalStatus}" readonly="readonly">
                </input>
            </div>
        </div>
			<div class="form-group">
            <label for="enation" class="col-sm-2 control-label">民族</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="enation" name="enation" 
                       value="${role.enation}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="enative" class="col-sm-2 control-label">籍贯</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="enative" name="enative" 
                       value="${role.enative}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="etel" class="col-sm-2 control-label">联系电话</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="etel" name="etel" 
                       value="${role.etel}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-2 control-label">电子邮件</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="email" name="email" 
                       value="${role.email}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="bloodType" class="col-sm-2 control-label">血型</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="bloodType" name="bloodType" 
                       value="${role.bloodType}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="marriageStatus" class="col-sm-2 control-label">婚姻状况</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="marriageStatus" name="marriageStatus" 
                        value="${role.marriageStatus}" readonly="readonly">
                </input>
            </div>
        </div>
        <div class="form-group">
            <label for="hometown" class="col-sm-2 control-label">出生地</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="hometown" name="hometown" 
                       value="${role.hometown}" readonly="readonly">
            </div>
        </div>
			<div class="form-group">
            <label for="registerPlace" class="col-sm-2 control-label">户口所在地</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="registerPlace" name="registerPlace" 
                       value="${role.registerPlace}" readonly="readonly">
            </div>
        </div>
			 <div class="form-group">
            <label for="qualification" class="col-sm-2 control-label">学历</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="qualification" name="qualification" 
                        value="${role.qualification}" readonly="readonly">
                </input>
            </div>
        </div>
        <div class="form-group">
            <label for="graduatedSchool" class="col-sm-2 control-label">毕业院校</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="graduatedSchool" name="graduatedSchool" 
                       value="${role.graduatedSchool}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="emajor" class="col-sm-2 control-label">所学专业</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" id="emajor" name="emajor" 
                       value="${role.emajor}" readonly="readonly">
            </div>
        </div>
        <div class="form-group">
            <label for="graduatedDate" class="col-sm-2 control-label">毕业日期</label>
            <div class="col-sm-3">
                <input type="date" class="form-control" id="graduatedDate" name="graduatedDate" 
                       value="${role.graduatedDate}" readonly="readonly">
            </div>
        </div>
			
		</tbody>
        
	</table>
	</form>
	
	<ul class="pager">
    <li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
    </ul>
    </div>
</body>
</html>