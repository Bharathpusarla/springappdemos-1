<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Hello world !! Welcome to Spring MVC</h1>
	
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		
		out.println("Id: " + id);
		out.println("| Name: " + name);
		out.println("| Salary: " + salary);
	
	%>
	
</body>
</html>