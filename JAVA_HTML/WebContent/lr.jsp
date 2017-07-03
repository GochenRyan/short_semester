<%@page import="com.kms.pojo.Role"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Role> lrs = null;
		Object o = request.getAttribute("lrs");
		if(o!=null){
			lrs = (List<Role>) o;
		}
	%>
	<table border="2">
		<tr>
			<th>姓名</th><th>性别</th>
		</tr>
		<%
			for(int i=0;i < lrs.size();i++){
				Role r = lrs.get(i);
		%>
		<tr>
			<td><%=r.getName() %></td>
			<td><%=r.getSex() %></td>
		</tr>
		<%
			} 
		%>
	</table>
</body>
</html>