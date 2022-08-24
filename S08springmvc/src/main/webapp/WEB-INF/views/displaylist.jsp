<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.samples.s08springmvc.domain.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display List</title>
</head>
<body>

	<%=request.getAttribute("employees")%>
	
	<br/>

	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
		for (Employee e : employees) {
			out.println(e.getId());
			out.println(e.getName());
			out.println(e.getSalary());
			out.println("<br/>");
		}
	%>

</body>
</html>