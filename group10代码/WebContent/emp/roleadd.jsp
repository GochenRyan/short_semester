<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加成员</title>
    <link rel="stylesheet"
          href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="http://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet" />

    <script
            src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script
            src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
	<!-- 调用外部javascript -->
	<script type="text/javascript" src="../assets/js/ver_role.js"></script>
</head>

<body>
<div class="panel panel-default">
    <div class="panel-heading">添加成员</div>
    <div class="panel-body">
        <form class="form-horizontal" role="form"  action="role_add.action" method="post"
              style="vertical-align:middle">

            <tbody>

            <div class="form-group">
                <label for="empno" class="col-sm-2 control-label">员工编号</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="empno" name="empno" 
                           placeholder="请输入员工编号">
                </div>
            </div>

            <div class="form-group">
                <label for="ename" class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="ename" name="ename" 
                           placeholder="请输入姓名">
                </div>
            </div>

            <div class="form-group">
                <label for="esex" class="col-sm-2 control-label">性别</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="esex" name="esex" 
                            placeholder="男">
                        <option>男</option>
                        <option>女</option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label for="bornDate" class="col-sm-2 control-label">出生日期</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="bornDate" name="bornDate" 
                           placeholder="请输入出生日期">
                </div>
            </div>

            <div class="form-group">
                <label for="identityId" class="col-sm-2 control-label">身份证号</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="identityId" name="identityId" 
                           placeholder="请输入身份证号">
                </div>
            </div>

            <div class="form-group">
                <label for="pname" class="col-sm-2 control-label">入职岗位</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="pname" name="pname" 
                            placeholder="技术人员">
                        <option>技术人员</option>
                        <option>主管</option>
                        <option>销售人员</option>
                        <option>文员</option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label for="dname" class="col-sm-2 control-label">入职部门</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="dname" name="dname" 
                            placeholder="生产部">
                        <option>生产部</option>
                        <option>技术部</option>
                        <option>销售部</option>
                        <option>管理部</option>
                        <option>传媒部</option>
                        <option>总经理办公室</option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label for="entryDate" class="col-sm-2 control-label">入职日期</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="entryDate" name="entryDate" 
                           placeholder="请输入入职日期">
                </div>
            </div>

            <div class="form-group">
                <label for="if_pro" class="col-sm-2 control-label">是否试用中</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="if_pro" name="if_pro" 
                            placeholder="否">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </div>
            </div>
            <script type="text/javascript">
                $("#if_pro").change(function(){
                    var val = $('#if_pro option:selected').val();
                    if (val =='否'){
                        $("#workDate").removeAttr("disabled");
                        $("#workDatediv").removeAttr("hidden");
                        $("#pro_state").attr("disabled",'disabled');
                        $("#pro_statediv").attr("hidden",'hidden');
                        $("#proStartDate").attr("disabled",'disabled');
                        $("#proStartDatediv").attr("hidden",'hidden');
                        $("#proEndDate").attr("disabled",'disabled');
                        $("#proEndDatediv").attr("hidden",'hidden');
                    }
                    else if (val =='是'){
                        $("#workDate").attr("disabled",'disabled');
                        $("#workDatediv").attr("hidden",'hidden');
                        $("#pro_state").removeAttr("disabled");
                        $("#pro_statediv").removeAttr("hidden");
                        $("#proStartDate").removeAttr("disabled");
                        $("#proStartDatediv").removeAttr("hidden");
                        $("#proEndDate").removeAttr("disabled");
                        $("#proEndDatediv").removeAttr("hidden");
                    }
                });
            </script>

            <div id="workDatediv" name="workDatediv" class="form-group" >
                <label for="workDate" class="col-sm-2 control-label">参加工作日期</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="workDate" name="workDate" 
                           placeholder="请输入参加工作日期" >
                </div>
            </div>
            <div id="pro_statediv" name="pro_statediv" class="form-group" hidden>
                <label for="pro_state" class="col-sm-2 control-label">试用期状态</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="pro_state" name="pro_state"  disabled>
                        <option value="正常">正常</option>
                        <option value="延期">延期</option>
                    </select>
                </div>
            </div>

            <div id="proStartDatediv" name="proStartDatediv" class="form-group" hidden>
                <label for="proStartDate" class="col-sm-2 control-label">试用期开始时间</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="proStartDate" name="proStartDate" 
                           placeholder="请输入参加工作日期" disabled>
                </div>
            </div>

            <div id="proEndDatediv" name="proEndDatediv" class="form-group" hidden>
                <label for="proEndDate" class="col-sm-2 control-label">试用期结束时间</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="proEndDate" name="proEndDate" 
                           placeholder="请输入参加工作日期" disabled>
                </div>
            </div>


            <div class="form-group" hidden>
                <label for="if_train" class="col-sm-2 control-label">是否培训中</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="if_train" name="if_train" 
                            placeholder="否" >
                        <option>否</option>
                    </select>
                </div>
            </div>
            <div class="form-group" hidden>
                <label for="if_dim" class="col-sm-2 control-label">是否离职</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="if_dim" name="if_dim" 
                            placeholder="否">
                        <option>否</option>
                    </select>
                </div>
            </div>



            <div class="form-group">
                <label for="workWay" class="col-sm-2 control-label">用工形式</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="workWay" name="workWay" 
                            placeholder="正式员工">
                        <option>正式员工</option>
                        <option>临时员工</option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label for="employeeOrigin" class="col-sm-2 control-label">人员来源</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="employeeOrigin" name="employeeOrigin" 
                            placeholder="校园招聘">
                        <option>校园招聘</option>
                        <option>社会招聘</option>
                        <option>其他</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="politicalStatus" class="col-sm-2 control-label">政治面貌</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="politicalStatus" name="politicalStatus" 
                            placeholder="党员">
                        <option>党员</option>
                        <option>团员</option>
                        <option>群众</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="enation" class="col-sm-2 control-label">民族</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="enation" name="enation" 
                           placeholder="请输入民族">
                </div>
            </div>
            <div class="form-group">
                <label for="enative" class="col-sm-2 control-label">籍贯</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="enative" name="enative" 
                           placeholder="请输入籍贯">
                </div>
            </div>
            <div class="form-group">
                <label for="etel" class="col-sm-2 control-label">联系电话</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="etel" name="etel" 
                           placeholder="请输入联系电话">
                </div>
            </div>
            <div class="form-group">
                <label for="email" class="col-sm-2 control-label">电子邮件</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="email" name="email"
                           placeholder="请输入电子邮件">
                </div>
                
            </div>
            <div class="form-group">
                <label for="bloodType" class="col-sm-2 control-label">血型</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="bloodType" name="bloodType" 
                           placeholder="请输入血型">
                </div>
            </div>
            <div class="form-group">
                <label for="marriageStatus" class="col-sm-2 control-label">婚姻状况</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="marriageStatus" name="marriageStatus" 
                            placeholder="未婚">
                        <option>未婚</option>
                        <option>已婚</option>
                        <option>离异</option>
                        <option>丧偶</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="hometown" class="col-sm-2 control-label">出生地</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="hometown" name="hometown" 
                           placeholder="请输入出生地">
                </div>
            </div>
            <div class="form-group">
                <label for="qualification" class="col-sm-2 control-label">学历</label>
                <div class="col-sm-3">
                    <select type="text" class="form-control" id="qualification" name="qualification" 
                            placeholder="本科">
                        <option>本科</option>
                        <option>硕士</option>
                        <option>其它</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="graduatedSchool" class="col-sm-2 control-label">毕业院校</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="graduatedSchool" name="graduatedSchool" 
                           placeholder="请输入毕业院校">
                </div>
            </div>
            <div class="form-group">
                <label for="emajor" class="col-sm-2 control-label">所学专业</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" id="emajor" name="emajor" 
                           placeholder="请输入所学专业">
                </div>
            </div>
            <div class="form-group">
                <label for="graduatedDate" class="col-sm-2 control-label">毕业日期</label>
                <div class="col-sm-3">
                    <input type="date" class="form-control" id="graduatedDate" name="graduatedDate" 
                           placeholder="请输入毕业日期">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-info">确认</button>
                </div>
            </div>

            </tbody>

        </form>
    </div>
</div>
<ul class="pager">
    <li class="previous" onclick="javascript:window.history.back();location.reload();"><a href="#">&larr; 返回</a></li>
</ul>


</body>
</html>