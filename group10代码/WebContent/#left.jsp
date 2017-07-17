<%--
  Created by IntelliJ IDEA.
  User: FLcolin
  Date: 2017/7/11
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Free Bootstrap Admin Template : Two Page</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="asserts/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="asserts/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="asserts/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                Menu
            </div>
        </div>
    </div>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li class="text-center user-image-back">
                    <img src="asserts/img/find_user.png" class="img-responsive" />

                </li>


                <li>
                    <a href="main.jsp" target="mainFrame"><i class="fa fa-desktop "></i>主页</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-user "></i>员工管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="emp/roleadd.jsp" target="mainFrame"><i class="fa fa-users "></i>入职管理</a>
                        </li>
                        <li>
                            <a href="emp/listpart.action" target="mainFrame"><i class="fa fa-users "></i> 角色管理</a>
                        </li>
                        <li>
                            <a href="pro/pro_listpro.action" target="mainFrame"><i class="fa fa-users "></i>试用期员工管理</a>
                        </li>
                        <li>
                            <a href="dismission/#dismission.jsp" target="mainFrame"><i class="fa fa-users "></i>离职管理</a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="posts/posts_listpost.action" target="mainFrame"><i class="fa fa-globe "></i>岗位管理</a>
                </li>
                <li>
                    <a href="dept/dept_listDpt.action" target="mainFrame"><i class="fa fa-list "></i>部门管理 </a>
                </li>
                <li>
                    <a href="train/train_listtrain" target="mainFrame"><i class="fa fa-edit "></i>申请培训</a>
                </li>


                <li>
                    <a href="NewFile7.html"><i class="fa fa-fire "></i>退出系统</a>
                </li>

            </ul>

        </div>

    </nav>
    <!-- /. NAV SIDE  -->

    <!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="asserts/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="asserts/js/bootstrap.min.js"></script>
<!-- METISMENU SCRIPTS -->
<script src="asserts/js/jquery.metisMenu.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="asserts/js/custom.js"></script>


</body>
</html>
