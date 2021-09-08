<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.pojo.Employee" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h2>Employees data</h2>


	<table border="1">

		<th>Sr No</th>
		<th>Id</th>
		<th>Name</th>
		<th>Designation</th>
		
		<c:forEach var="emp" items="${data}" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.designation}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>