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
<th>SupplierID</th>
<th>SupplierName</th>
<th>SupplierMobNO</th>
<th>SupplierCity</th>
<th>Action</th>
</tr>

<c:forEach items="${data}" var="s">

<tr>
<td>${s.supplierId}</td>
<td>${s.supplierName}</td>
<td>${s.supplierMobileNo}</td>
<td>${s.supplierCity}</td>
<td><a href="">EDIT</a> || <a href="">DELETE</a></td>
</tr>

</c:forEach>

</table>
</body>
</html>