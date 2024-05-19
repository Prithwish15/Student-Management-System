<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="Menu.jsp"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Registration</title>
</head>
<body>
	<h2>All Registration Details</h2>
	<table border="1">
		<tr>
			<th>Student Enrollment No</th>
			
			<th>Student Name</th>

			<th>Student Email</th>

			<th>student Mobile No</th>

			<th>Student City</th>

			<th>Student Course</th>

			<th>Student Fee</th>

			<th>Click Me</th>
			
			<th>Click Me</th>
		</tr>

		<%
		ResultSet result = (ResultSet)request.getAttribute("res");
		while (result.next()) {
		%>
		
		<tr>
			<td><%=result.getString(1)%></td>

			<td><%=result.getString(2)%></td>

			<td><%=result.getString(3)%></td>

			<td><%=result.getString(4)%></td>

			<td><%=result.getString(5)%></td>

			<td><%=result.getString(6)%></td>

			<td><%=result.getString(7)%></td>

			<td><a href="DeleteRegistration?email=<%=result.getString(3)%>"><input type="submit" value="Delete"/></a></td>
			
			<td><a href="UpdateRegistration?name=<%=result.getString(2)%>&email=<%=result.getString(3)%>&mobile=<%=result.getString(4)%>&course=<%=result.getString(6)%>"><input type="submit" value="Update"/></a></td>
		</tr>

		<%
		}
		%>
	</table>
	
	<%
	if(request.getAttribute("msg")!=null){
		out.print(request.getAttribute("msg"));
	}
	%>
	
	
</body>
</html>