<%--
  Created by IntelliJ IDEA.
  User: FLcolin
  Date: 2017/7/14
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>MoonCat V0.6</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Le styles -->
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.leoweather.min.js"></script>
<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet" href="assets/css/loader-style.css">
<link rel="stylesheet" href="assets/css/bootstrap.css">
<link rel="stylesheet" href="assets/js/button/ladda/ladda.min.css">





<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<!-- Fav and touch icons -->
<link rel="shortcut icon" href="../assets/ico/miao.png">
</head>

<body>
	<!-- Preloader -->
	<div id="preloader">
		<div id="status">&nbsp;</div>
	</div>
	<!-- TOP NAVBAR -->
	<nav role="navigation" class="navbar navbar-static-top">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button data-target="#bs-example-navbar-collapse-1"
					data-toggle="collapse" class="navbar-toggle" type="button">
					<span class="entypo-menu"></span>
				</button>
				<button class="navbar-toggle toggle-menu-mobile toggle-left"
					type="button">
					<span class="entypo-list-add"></span>
				</button>




				<div id="logo-mobile" class="visible-xs">
					<h1>
						MoonCat<span>v0.6</span>
					</h1>
				</div>

			</div>


			<!-- Collect the nav links, forms, and other content for toggling -->
			<div id="bs-example-navbar-collapse-1"
				class="collapse navbar-collapse">
				<ul class="nav navbar-nav">

					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"><i style="font-size: 20px;"
							class="icon-conversation"></i>
							<div class="noft-red">23</div></a></li>
					<li><a data-toggle="dropdown" class="dropdown-toggle" href="#"><i
							style="font-size: 19px;" class="icon-warning tooltitle"></i>
							<div class="noft-green">5</div></a></li>
					<li><a href="#"><i data-toggle="tooltip"
							data-placement="bottom" title="Help" style="font-size: 20px;"
							class="icon-help tooltitle"></i></a></li>

				</ul>
				<div id="nt-title-container"
					class="navbar-left running-text visible-lg">
					<ul class="date-top">
						<li class="entypo-calendar" style="margin-right: 5px"></li>
						<li id="Date"></li>


					</ul>

					<ul id="digital-clock" class="digital">
						<li class="entypo-clock" style="margin-right: 5px"></li>
						<li class="hour"></li>
						<li>:</li>
						<li class="min"></li>
						<li>:</li>
						<li class="sec"></li>
						<li class="meridiem"></li>
					</ul>
					<div class="col-sm-1"></div>
					<div id="demo">
						<script>
							$('#demo').leoweather({format : '{气温}℃ <span>|</span> {城市}<span>|</span>{天气}<span>|</span>{风向}{风级}级</p>'});
						</script>
					</div>
				</div>

				<ul style="margin-right: 0;" class="nav navbar-nav navbar-right">
					<li><a data-toggle="dropdown" class="dropdown-toggle" href="#">
							<img alt="" class="admin-pic img-circle"
							src="../assets/img/pipi.png"> <c:if
								test="${empty sessionScope.user} ">
								您未登陆
							</c:if> <c:if test="${not empty sessionScope.user}">
								Hi,${sessionScope.user}<b class="caret"></b>
							</c:if>
					</a>
						<ul style="margin-top: 14px;" role="menu"
							class="dropdown-setting dropdown-menu">
							<li class="divider"></li>
							<li><a href="../logout.action"> <span
									class="entypo-logout"></span>&#160;&#160;Logout&Login
							</a></li>
						</ul></li>
					<li><a data-toggle="dropdown" class="dropdown-toggle" href="#">
							<span class="icon-gear"></span>&#160;&#160;Setting
					</a>
						<ul role="menu" class="dropdown-setting dropdown-menu">

							<li class="theme-bg">
								<div id="button-bg"></div>
								<div id="button-bg2"></div>
								<div id="button-bg3"></div>
								<div id="button-bg5"></div>
								<div id="button-bg6"></div>
								<div id="button-bg7"></div>
								<div id="button-bg8"></div>
								<div id="button-bg9"></div>
								<div id="button-bg10"></div>
								<div id="button-bg11"></div>
								<div id="button-bg12"></div>
								<div id="button-bg13"></div>
							</li>
						</ul></li>
					<li class="hidden-xs"><a class="toggle-left" href="#"> <%--<span style="font-size:20px;" class="entypo-list-add"></span>--%>
					</a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<!-- /END OF TOP NAVBAR -->

	<!-- SIDE MENU -->
	<div id="skin-select">
		<div id="logo">
			<h1>
				MoonCat <span>v0.6</span>
			</h1>
		</div>

		<a id="toggle"> <span class="entypo-menu"></span>
		</a>
		<div class="dark">
			<form action="#">
				<span> <input type="text" name="search" value=""
					class="search rounded id_search" placeholder="Search Menu..."
					autofocus="">
				</span>
			</form>
		</div>

		<div class="search-hover">
			<form id="demo-2">
				<input type="search" placeholder="Search Menu..." class="id_search">
			</form>
		</div>



		<div class="skin-part">
			<div id="tree-wrap">
				<div class="side-bar">
					<ul class="topnav menu-left-nest">
						<li><a href="#" style="border-left: 0px solid !important;"
							class="title-menu-left"> <span class="widget-menu"></span> <i
								data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

						</a></li>

						<li><a class="tooltip-tip ajax-load" href="../main.jsp"
							target="mainIframe" title="主页"> <i class="icon-monitor"></i>
								<span>主页</span>

						</a></li>
						<li><a class="tooltip-tip" href="#" title="员工管理"> <i
								class="entypo-newspaper"></i> <span>员工管理</span>
						</a>
							<ul>
								<li><a class="tooltip-tip2 ajax-load"
									href="../emp/roleadd.jsp" target="mainIframe" title="入职管理"><i
										class="icon-media-record"></i><span>入职管理</span></a></li>
								<li><a class="tooltip-tip2 ajax-load"
									href="../emp/listpart.action" target="mainIframe" title="在职管理"><i
										class="icon-user"></i><span>在职管理</span></a></li>
								<li><a class="tooltip-tip2 ajax-load"
									href="../pro/listpro.action" target="mainIframe"
									title="试用期员工管理"><i class="entypo-newspaper"></i><span>试用期员工管理</span></a>
								</li>
							</ul></li>
						<li><a class="tooltip-tip" href="#" title="岗位管理"> <i
								class="icon-window"></i> <span>岗位管理</span>
						</a>
							<ul>
								<li><a class="tooltip-tip2 ajax-load"
									href="../posts/listpost.action" target="mainIframe"
									title="岗位列表"><i class="icon-media-record"></i><span>岗位列表</span></a>
								</li>
								<li><a class="tooltip-tip2 ajax-load"
									href="../posts/listTransfer.action" target="mainIframe"
									title="岗位调动"><i class="icon-user"></i><span>岗位调动</span></a></li>
							</ul></li>
						<li><a class="tooltip-tip" href="#" title="部门管理"> <i
								class="icon-window"></i> <span>部门管理</span>
						</a>
							<ul>
								<li><a class="tooltip-tip2 ajax-load"
									href="../dept/listDpt.action" target="mainIframe" title="部门列表"><i
										class="icon-media-record"></i><span>部门列表</span></a></li>
								<li><a class="tooltip-tip2 ajax-load"
									href="../dept/listTransfer.action" target="mainIframe"
									title="部门列表"><i class="icon-user"></i><span>部门调动</span></a></li>
							</ul></li>
						<li><a class="tooltip-tip ajax-load"
							href="../train/listtrain.action" target="mainIframe" title="培训管理">
								<i class="icon-feed"></i> <span>培训管理</span>

						</a></li>
						<li><a class="tooltip-tip ajax-load"
							href="../dismission/list.action" target="mainIframe" title="离职管理">
								<i class="icon-camera"></i> <span>离职管理</span>

						</a></li>

					</ul>

				</div>
			</div>
		</div>
	</div>
	<!-- END OF SIDE MENU -->



	<!--  PAPER WRAP -->
	<div class="wrap-fluid">
		<div class="container-fluid paper-wrap bevel tlbr">





			<!-- CONTENT -->
			<!--TITLE -->
			<div class="row">
				<div id="paper-top">
					<div class="col-sm-3">
						<h2 class="tittle-content-header">
							<i class="icon-media-record"></i> <span>Moon Cat </span>
						</h2>

					</div>

					<div class="col-sm-7">
						<div class="devider-vertical visible-lg"></div>
						<div class="tittle-middle-header">

							<div class="alert">
								<button type="button" class="close" data-dismiss="alert">×</button>
								<span class="tittle-alert entypo-info-circled"></span>
								欢迎回来,&nbsp; <strong>${sessionScope.user}</strong>&nbsp;&nbsp;
							</div>


						</div>

					</div>

				</div>
			</div>
			<!--/ TITLE -->

			<!-- BREADCRUMB -->

			<!-- END OF BREADCRUMB -->

			<div class="content-wrap">
				<div class="row">

					<div id="page-wrapper">
						<div id="page-inner">
							<iframe width="100%" src="../main.jsp" name="mainIframe"
								scrolling="no" frameborder="0" id="mainIframe"
								onload="this.height=100"></iframe>
							<script type="text/javascript">
								function reinitIframe() {
									var iframe = document
											.getElementById("mainIframe");
									try {
										var bHeight = iframe.contentWindow.document.body.scrollHeight;
										var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
										var height = Math.max(bHeight, dHeight);
										iframe.height = height;
									} catch (ex) {
									}
								}
								window.setInterval("reinitIframe()", 200);
							</script>
							<!-- /. NAV SIDE  -->

						</div>
					</div>

					<script>
						/*
						 *************************************************************

						<div class="col-sm-12">
						<!-- BLANK PAGE-->

						<div class="nest" id="Blank_PageClose">
						<div class="title-alt">
						<h6>
						    Blank Page</h6>
						<div class="titleClose">
						    <a class="gone" href="#Blank_PageClose">
						        <span class="entypo-cancel"></span>
						    </a>
						</div>
						<div class="titleToggle">
						    <a class="nav-toggle-alt" href="#Blank_Page_Content">
						        <span class="entypo-up-open"></span>
						    </a>
						</div>

						</div>

						<div class="body-nest" id="Blank_Page_Content">

						Content Goes Here
						</div>
						</div>
						</div>

						 ******************************************
						 */
					</script>
					<!-- END OF BLANK PAGE -->


				</div>



				<!-- /END OF CONTENT -->



				<!-- FOOTER -->
				<div class="footer-space"></div>
				<div id="footer">
					<div class="devider-footer-left"></div>
					<div class="time">
						<p id="spanDate">
						<p id="clock">
					</div>
					<div class="copyright">
						Make with Love <span class="entypo-heart"></span>Collect from <a
							href="#" title="网页模板">网页模板</a> All Rights Reserved
					</div>
					<div class="devider-footer"></div>

				</div>
				<!-- / END OF FOOTER -->


			</div>
		</div>
		<!--  END OF PAPER WRAP -->


		<script>
			/*
			 ***********************************************

			<!-- RIGHT SLIDER CONTENT -->

			<div class="sb-slidebar sb-right">
			<div class="right-wrapper">
			<div class="row">
			<h3>
			    <span><i class="entypo-gauge"></i>&nbsp;&nbsp;MAIN WIDGET</span>
			</h3>
			<div class="col-sm-12">

			    <div class="widget-knob">
			            <span class="chart" style="position:relative" data-percent="86">
			                <span class="percent"></span>
			            </span>
			    </div>
			    <div class="widget-def">
			        <b>Distance traveled</b>
			        <br>
			        <i>86% to the check point</i>
			    </div>

			    <div class="widget-knob">
			            <span class="speed-car" style="position:relative" data-percent="60">
			                <span class="percent2"></span>
			            </span>
			    </div>
			    <div class="widget-def">
			        <b>The average speed</b>
			        <br>
			        <i>30KM/h avarage speed</i>
			    </div>


			    <div class="widget-knob">
			            <span class="overall" style="position:relative" data-percent="25">
			                <span class="percent3"></span>
			            </span>
			    </div>
			    <div class="widget-def">
			        <b>Overall result</b>
			        <br>
			        <i>30KM/h avarage Result</i>
			    </div>
			</div>
			</div>
			</div>

			<div style="margin-top:0;" class="right-wrapper">
			<div class="row">
			<h3>
			    <span><i class="entypo-chat"></i>&nbsp;&nbsp;CHAT</span>
			</h3>
			<div class="col-sm-12">
			    <span class="label label-warning label-chat">Online</span>
			    <ul class="chat">
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/20.jpg">
			                    </span><b>Dave Junior</b>
			                <br><i>Last seen : 08:00 PM</i>
			            </a>
			        </li>
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
			                    </span><b>Kenneth Lucas</b>
			                <br><i>Last seen : 07:21 PM</i>
			            </a>
			        </li>
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/22.jpg">
			                    </span><b>Heidi Perez</b>
			                <br><i>Last seen : 05:43 PM</i>
			            </a>
			        </li>


			    </ul>

			    <span class="label label-chat">Offline</span>
			    <ul class="chat">
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/23.jpg">
			                    </span><b>Dave Junior</b>
			                <br><i>Last seen : 08:00 PM</i>
			            </a>
			        </li>
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/women/24.jpg">
			                    </span><b>Kenneth Lucas</b>
			                <br><i>Last seen : 07:21 PM</i>
			            </a>
			        </li>
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/25.jpg">
			                    </span><b>Heidi Perez</b>
			                <br><i>Last seen : 05:43 PM</i>
			            </a>
			        </li>
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/women/25.jpg">
			                    </span><b>Kenneth Lucas</b>
			                <br><i>Last seen : 07:21 PM</i>
			            </a>
			        </li>
			        <li>
			            <a href="#">
			                    <span>
			                        <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/26.jpg">
			                    </span><b>Heidi Perez</b>
			                <br><i>Last seen : 05:43 PM</i>
			            </a>
			        </li>


			    </ul>
			</div>
			</div>
			</div>
			</div>

			<!-- END OF RIGHT SLIDER CONTENT-->

			 ***********************************************
			 */
		</script>

		<!-- MAIN EFFECT -->
		<script type="text/javascript" src="assets/js/preloader.js"></script>
		<script type="text/javascript" src="assets/js/bootstrap.js"></script>
		<script type="text/javascript" src="assets/js/app.js"></script>
		<script type="text/javascript" src="assets/js/load.js"></script>
		<script type="text/javascript" src="assets/js/main.js"></script>


	</div>
</body>

</html>

