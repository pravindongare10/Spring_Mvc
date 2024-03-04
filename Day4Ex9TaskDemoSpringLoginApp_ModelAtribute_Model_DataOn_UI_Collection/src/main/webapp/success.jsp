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
	<table border="2">
<tr>
<th>UserName</th>
<th>PassWord</th>
</tr>

<c:forEach items="${suc}" var="u">

<tr>
<td>${u.username}</td>
<td>${u.password}</td>
</tr>

</c:forEach>

</table>


 <form action= "byname">
<pre>
	Name	:<input type="text" name="name">

	<input type="submit" value="NAME">
</pre>		
</form>
<form action= "byusername">
<pre>
	Username:<input type="text" name="username">
	
	<input type="submit" value="USERNAME">
</pre>		
</form>

<form action= "bymob">
<pre>
	mobileno:<input type="text" name="mno">
	<input type="submit" value="MOBILENO">
</pre>		
</form>
	
</body>
</html>