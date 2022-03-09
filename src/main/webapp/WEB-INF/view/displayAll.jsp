<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.assignment.assignment5.model.Employee,com.assignment.assignment5.service.EmployeeService" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllEmployees</title>
<link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
	body{
		font-family: 'Ubuntu', sans-serif;
	}
	table,td,th{border:1px solid;}
	th{text-align: center;}
</style>
</head>
<body>
<div align="center">
<h2>-----Employee Details-----</h2>

<table>
<thead>
	<tr>
		<th>EmployeeId</th>
		<th>Employee Name</th>
		<th>Employee Email</th>
		<th>Employee Location</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${map}" var="entry">
	<tr>
		<td>${entry.key}</td> 
		<td>${entry.value.getEmpName()}</td>
		<td>${entry.value.getEmpEmail()}</td>
		<td>${entry.value.getEmpLoc()}</td>
	</tr>
</c:forEach>
</tbody>
</table>

</div>


</body>
</html>