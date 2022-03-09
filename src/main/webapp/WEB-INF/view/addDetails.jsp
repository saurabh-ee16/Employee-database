<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
	body{
		font-family: 'Ubuntu', sans-serif;
	}
	
	
	form{
	border: 2px solid;
	width: 30%;
	}
</style>


</head>
<body>

<div align="center">
	<form action="/addAccount" method="post" name="form1" >
		<h2 align="center">Employee Form</h2>
		<table >
			<tr>
				<td>Employee ID:</td>
				<td><input type="text" name="empid" placeholder="id"></td>
			</tr>		
			<tr>
				<td>Employee Name: </td>
				<td><input type="text" name="empname" placeholder="username" ></td>
			</tr>
			<tr>
				<td>Employee Email: </td>
				<td><input type="email" placeholder="user@gmail.com" name="email"></td>
				
			</tr>
			<tr>
				<td>Office Location: </td>
				<td><input type="text" placeholder="location" name="emploc"> </td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Submit" ></td>
			</tr>
			
			
		</table>
	
	</form>
</div>


</body>
</html>