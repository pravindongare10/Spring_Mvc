<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="success.jsp">
 	<h1>TeacherRej From</h1>	 
	<hr>
<center><Table> 
	<tr>
	<td><label for="fname">First Name</label></td>
<td><input type="text"id="fname" name="fname"required placeholder="Entr ur Fst Name "autocomplete="off"></td>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<td><label for="mname">Middle Name</label></td>
<td><input type="text"id="mname" name="mname"required autocomplete="off"></td>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	<td><label for="lname">Last Name</label></td>
<td><input type="text"id="lname" name="lname"required autocomplete="off"></td>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	<td><label for="dob">Date of Birth</lable></td>
	 <td><input type="date"id="dob"name="dob"requiredautocomplete="off"></td>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
<tr>
	<td><label for="email">Email</label></td>
	<td><input type="email" id="email" name="email"required placeholder="xyx@gmail.com"autocomplete="off"></td>
</tr>
<tr>
</tr>
<tr>
	<td><label for="mobile number">Mobile Number</lable></td>
<td>
<select>
		<option>91</option>
		<option>55</option>
		<option>66</option>
</select>
<input type="tel" id="mnum" name="mobile number"required pattern=[0-9]{4}-[0-9]{2}-[0-9]{4} placeholder="0123-56-0123"autocomplete="off"></td>
</tr> 

<tr>
	<td><label for="gender">Gender</label></td>
<td><input type="radio"id="male"name="gender">
	<label for>Male</label>
	<input type="radio"id="female"name="gender">
	<label>Female</lable></td>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	<td><label for="address">Address</label></td>
	<td><textarea></textarea></td>
	</tr>
	<tr>
	<td><label for="city">City</label></td>
	<td><select>
		<option>Ahemdnager</option>
		<option>Pune</option>
		<option>Sangmner</option>
		<option>Pangari</option>
	</select></td>
	</tr>
<tr>
	<td>
<input type="submit" name="submit"value="submit">
	<!--<button>Submit</button>-->
	<input type="reset" name="reset"value="reset">
	</td>
</tr>

<Table></center>	

<form>
</body>
</html>