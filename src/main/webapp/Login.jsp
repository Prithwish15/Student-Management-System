
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login In</title>
</head>
<body>
	<h2>Login here</h2>
	<form action="LoginControll" method="post"> 
	<pre>  
	Student UserID<input type="text" name="UserInfo" placeholder="Please enter your userID" />
	Student Password<input type="password" name="Password" placeholder="Please enter your Password"/>
	<input type="submit" value="login"/>
	</pre>
	</form>
	
	<a href="Index.jsp"><input type="submit" value="Home"/></a>
	
		<%if(request.getAttribute("msg")!=null){%>
		<%=request.getAttribute("msg")%>
		<%} %>
	
		<%if(request.getAttribute("Value")!=null){%>
		<%=request.getAttribute("Value")%>
		<%} %>
	
		
	
		
</body>
</html>