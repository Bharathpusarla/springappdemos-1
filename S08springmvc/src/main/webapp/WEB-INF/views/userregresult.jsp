<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>User Registered successfully</h3>
	<p>User details are: <%= request.getAttribute("userfromcontroller") %></p>
</body>
</html>