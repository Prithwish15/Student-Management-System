<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student </title>
</head>
<body>
<%@include file="Menu.jsp" %>

<h2>Create New Registration(Students Details)</h2>

<form action="AddNewRegistration" method="post">

<pre>


<input type="hidden" name="studentEnrollmentNo" value="0">
Student student Name<input type="text" name="studentName" placeholder="Enter Student_Name">
Student Student Email ID<input type="text" name="studentEmail" placeholder="Enter Student Email ID">
Student Student Mobile No<input type="text" name="studentMobileNo" placeholder="Enter Student Mobile No">
Student Student City<input type="text" name="studentCity" placeholder="Enter Student City">
Student Student Course<input type="text" name="studentCourse" placeholder="Enter Student Course">
Student Student Fee<input type="text" name="studentFee" placeholder="Enter Student Fees">
<input type="submit" value="Save Student Details"/>
</pre>
</form>

<%if (request.getAttribute("msg") != null){
out.print(request.getAttribute("msg"));
}
%>





</body>
</html>