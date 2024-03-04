<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product And Supplier AddData Form</h1>
<form action="save">
<pre>
ProductId	 :<input type="number" name="productId">
ProductName	 :<input type="text" name="productName">
ProductType      :<input type="text" name="productType">
ProductPrice     :<input type="text" name="productPrice">
SupplierId       :<input type="text" name="supplier.supplierId">
SupplierName     :<input type="text" name="supplier.supplierName">
SupplierMobileNo :<input type="number" name="supplier.supplierMobileNo">
SupplierCity     :<input type="text" name="supplier.supplierCity">
<input type="submit" value=SAVE>
	
</pre>
</form>
</body>
</html>