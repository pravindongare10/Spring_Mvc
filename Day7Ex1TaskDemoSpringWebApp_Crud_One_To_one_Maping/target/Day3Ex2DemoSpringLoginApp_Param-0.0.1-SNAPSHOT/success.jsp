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
<th>ProductId</th>
<th>ProductName</th>
<th>ProductType</th>
<th>ProductPrice</th>
<th>SupplierId</th>
<th>SupplierName</th>
<th>SupplierMobNO</th>
<th>SupplierCity</th>
<th>Action</th>
</tr>

<c:forEach items="${data}" var="p">

<tr>
<td>${p.productId}</td>
<td>${p.productName}</td>
<td>${p.productType}</td>
<td>${p.productPrice}</td>
<td>${p.supplier.supplierId}</td>
<td>${p.supplier.supplierName}</td>
<td>${p.supplier.supplierMobileNo}</td>
<td>${p.supplier.supplierCity}</td>
<td><a href="">EDIT</a> || <a href="">DELETE</a></td>
</tr>

</c:forEach>

</table>
</body>
</html>