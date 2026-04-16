<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="StudentController">
	<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		
		<tr>
			<td>Phone</td>
			<td><input type="tel" name="phone"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea rows="5" cols="22" name="address"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center" >
				<input type="submit" name="action" value="Insert">
			</td>
		</tr>
	
	</table>


</form>
</body>
</html>