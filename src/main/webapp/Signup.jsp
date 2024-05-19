<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
	<form action="SignupController" method="post">
	<table>
		<tr>
			<td>Student Name</td>
			<td><input type="text" Name="Name" placeholder="Enter Student_Name"/></td>
		</tr>
		<tr>
			<td>Student User ID</td>
			<td><input type="text" Name="EmailID" placeholder="Enter Student Email"/></td>
		</tr>
		<tr>
			<td>Student Password</td>
			<td><input type="password" Name="Password" placeholder="Set a New Password"/></td>
		</tr>    
		<tr>
			<td><input type="submit" value="Sign Up"/></td>
		</tr>
	</table>
	</form>
	<a href="Index.jsp"><input type="submit" value="Home"></a>
	<%if(request.getAttribute("value")!=null){ 
	out.print(request.getAttribute("value"));
	}%>
</body>
</html>