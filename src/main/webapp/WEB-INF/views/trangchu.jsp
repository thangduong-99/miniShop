<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/login">
		<input name="user" type="text"> <input name="pass"
			type="password"> <input type="submit" value="submit">
	</form>
	<% String x =(String) request.getAttribute("thongbao"); %>
<h3>${x }</h3>
</body>
</html>