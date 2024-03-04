<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<table border="2" style="border-collapse:collapse">
<form action= "SUCCESS">
<tr>
<th>Teacher Name</th>
<th>Teacher MobileNo</th>
</tr>

<c:forEach items="${seconddata}" var="n">

<tr>
<td>${n.tname}</td>
<td>${n.tmobno}</td>
</tr>

</c:forEach>
<input type="submit" value="Done">
</form>
</table>
</body>
</html>