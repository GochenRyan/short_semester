<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="Login.servlet" method="post">
			用户名:<input type="text" name="nm" value="Jack">
			</br>
			密码:<input type="text" name="pwd" value="Jack">
			</br>
			验证码：<input type="text" name="sid"/><img alt="no vercode" src = "sid.servlet"
			id="sid"><a href="javascript:reloadimg()">看不清</a> 
			</br>
			<input type="submit" value="确认">
		</form>
</body>
</html>
<script>

	function reloadimg(){
		var img = document.getElementById("sid");
		img.src = "sid.servlet?dtdr=" + Math.random();
	}
</script>