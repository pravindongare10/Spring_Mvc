<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Form</h1>
<form action="update">
<pre>
<input type="hidden" name="rollno" value="${s.rollno}">
Name	  :<input type="text" name="name" value="${s.name}">
User Name :<input type="text" name="username" value="${s.username}">
Password  :<input type="text" name="password" value="${s.password}">


<input type="submit" value=UPDATE>
	
</pre>
</form>
</body>
</html>