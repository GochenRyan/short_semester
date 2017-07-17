<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
/*
	<frameset rows="60,*" cols="*" frameborder="no" border="0" framespacing="0">
	<frame src="#top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame"/>
	<frameset cols=400,*" frameborder="no" border="0" framespacing="0">
	<frame src="#left.jsp" name="leftFrame" scrolling="No" noresize="noresize"  id="leftFrame"/>
	<frame src="#left.jsp" name="mainFrame" id="mainFrame"/>


	<frameset cols=280,*" frameborder="no" border="0" framespacing="0">
		<frame src="#left2.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame"/>

	<frameset rows="10%,*" cols="*" frameborder="no" border="0" framespacing="0">
			<frame src="#top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame"/>
			<frame src="main.jsp" name="mainFrame" id="mainFrame"/>



			<frameset rows="10%,*" cols="*" frameborder="no" border="0" framespacing="0">
		<frame src="#top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame"/>
	<frameset cols=280,*" frameborder="no" border="0" framespacing="0">
		<frame src="#left2.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame"/>
		<frame src="main.jsp" name="mainFrame" id="mainFrame"/>
		<body style="background:url(http://img3.redocn.com/tupian/20160129/lansetuhuangjianbianguangxianmohubeijingsucai_5835943.jpg)">
		</body>
*/

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理首页</title>

	<link href="assets/css/bootstrap.css" rel="stylesheet" />
	<!-- FONTAWESOME STYLES-->
	<link href="assets/css/font-awesome.css" rel="stylesheet" />
	<!-- CUSTOM STYLES-->
	<link href="assets/css/custom.css" rel="stylesheet" />
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
						<img src="assets/img/find_user.png" class="img-responsive" />

					</li>


					<li>
						<a href="main.jsp" target="mainIframe"><i class="fa fa-desktop "></i>主页</a>
					</li>

					<li>
						<a href="#"><i class="fa fa-user "></i>员工管理<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li>
								<a href="emp/roleadd.jsp" target="mainIframe"><i class="fa fa-users "></i>入职管理</a>
							</li>
							<li>
								<a href="emp/listpart.action" target="mainIframe"><i class="fa fa-users "></i> 在职管理</a>
							</li>
							<li>
								<a href="pro/listpro.action" target="mainIframe"><i class="fa fa-users "></i>试用期员工管理</a>
							</li>
						</ul>
					</li>

					<li>
						<a href="#"><i class="fa fa-user "></i>岗位管理<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li>
								<a href="posts/listpost.action" target="mainIframe"><i class="fa fa-list-alt"></i> 岗位列表</a>
							</li>
							<li>
								<a href="posts/listTransfer.action" target="mainIframe"><i class="fa fa-list-alt"></i> 岗位调动</a>
							</li>
						</ul>
					</li>

					<li>
						<a href="#"><i class="fa fa-user "></i>部门管理<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li>
								<a href="dept/listDpt.action" target="mainIframe"><i class="fa fa-list"></i>部门列表</a>
							</li>
							<li>
								<a href="dept/listTransfer.action" target="mainIframe"><i class="fa fa-list"></i>部门调动</a>
							</li>
						</ul>
					</li>

					<li>
						<a href="#"><i class="fa fa-user "></i>培训管理<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<script>/*
							<li>
								<a href="train/train_apart.action" target="mainIframe"><i class="fa fa-book"></i>员工培训</a>
							</li>
							 */
							</script>
							<li>
								<a href="train/listtrain.action" target="mainIframe"><i class="fa fa-book"></i>培训列表</a>
							</li>
						</ul>
					</li>

					<li>
						<a href="#"><i class="fa fa-user "></i>离职管理<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<script>/*
							<li>
								<a href="dismission/dismission_apart.action" target="mainIframe"><i class="fa fa-home"></i>员工离职</a>
							</li>
							*/
							</script>
							<li>
								<a href="dismission/list.action" target="mainIframe"><i class="fa fa-home"></i>离职列表</a>
							</li>
						</ul>
					</li>


					<li>
						<a href="logout.action" target="mainIframe"><i class="fa fa-coffee"></i>退出系统</a>
					</li>

				</ul>

			</div>

		</nav>
		<div id="page-wrapper">
			<div id="page-inner">
				<iframe width="100%" src="main.jsp" name="mainIframe" scrolling="no" frameborder="0"
						id="mainIframe" onload="this.height=100"></iframe>
				<script type="text/javascript">
                    function reinitIframe(){
                        var iframe = document.getElementById("mainIframe");
                        try{
                            var bHeight = iframe.contentWindow.document.body.scrollHeight;
                            var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
                            var height = Math.max(bHeight, dHeight);
                            iframe.height =  height;
                        }catch (ex){}
                    }
                    window.setInterval("reinitIframe()", 200);
				</script>
		<!-- /. NAV SIDE  -->

			</div>
		</div>
		<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="assets/js/jquery.metisMenu.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="assets/js/custom.js"></script>


	</body>
</html>