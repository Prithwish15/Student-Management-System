<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update your details</title>
</head>
<body>
<h2>Update student details</h2>

<form action="UpdateRegistration" method="post">

<pre>


Student  Name<input type="text" name="name" placeholder="Enter Student_Name" value="<%= request.getAttribute("name")%>">
Student  Email ID<input type="text" name="email" placeholder="Enter Student Email ID"  value="<%= request.getAttribute("email")%>">
Student  Mobile No<input type="text" name="mobile" placeholder="Enter Student Mobile No"  value="<%= request.getAttribute("mobile")%>">
Student Student Course<input type="text" name="course" placeholder="Enter Student Course"  value="<%= request.getAttribute("course")%>">
<input type="submit" value="Update"/>
</pre>
</form>

<%if (request.getAttribute("msg") != null){
out.print(request.getAttribute("msg"));
}
%>


</body>
</html>