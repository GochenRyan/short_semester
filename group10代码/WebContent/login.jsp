<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>登陆</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" href="./assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./assets/css/customize_style/login-style.css">


</head>
<body>
	<div class="container">

		<div class="row">
			<div class="col-md-4 col-md-offset-4">

				<div id="logo-login">
					<h1>
						人事管理系统 <span>v1.0</span>
					</h1>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="account-box">
					<!--接口1-->
					<form action="login.action" method="post">

						<div class="form-group has-feedback">
							<label for="inputUser">用户名</label> <span
								class="glyphicon glyphicon-user form-control-feedback"></span> <input
								type="text" name="username" class="form-control" id="inputUser"
								placeholder="用户名">

						</div>

                    <div class="form-group has-feedback">
                        <label for="inputPassword" >密码</label>
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                            <input type="password" name="password" class="form-control" id="inputPassword" placeholder="密码">
                    </div>

                        <br>
                    <div class="form-group has-feedback">
                        <!--接口2-->
                        <p  style="float: left;width: 30%"><img src="SecurityCodeImageAction.action" alt="验证码" name="checkImg"
				id="checkImg"
				onClick="document.getElementById('checkImg').src='SecurityCodeImageAction.action?timestamp='+ (new Date().getTime().toString(36)); return false" />
						</p>
						<div style="width: 10%"></div>

							<p style="float: right; width: 60%">
								<input type="text" name="securityCode" class="form-control" />
							</p>

						</div>
						<br>
						<br>
						<br>

						<div class="checkbox pull-left">
							<label> <input type="checkbox">记住用户名
							</label>
						</div>

						<button class="btn btn btn-primary pull-right" type="submit">
							登 录</button>
						<br>
						<br>
					</form>
				</div>
			</div>
		</div>

	</div>

</body>
</html>
