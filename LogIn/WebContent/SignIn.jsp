 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
</head>
<body>
	<form action="SignIn.servlet" method="post">
		登录名：<input type="text" name="pnm" value="d" />
		</br>
		密码：<input type="password" name="pwd" />
		</br>
		出生日期：<input type="date" name="bdate" />
		</br>
		角色：<input type="text" name="rid" value="0" readonly="readonly" />
		</br>
		头像：<input type="file" name="icon" />
		</br>
		<input type="text" name="pid" value="0" readonly="readonly" />
		<input type="text" name="mgid" value="0" readonly="readonly" />
		<input type="submit" value="注册"/>
	</form>
</body>
</html>