<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My first j2ee App</title>
</head>
<body>

	<h3>Welcome to J2EE Application</h3>
	<h4>Login Page</h4>
	<h6 style="color: red;">${errormessage}</h6>

	<form action="LoginControllerone" method="post">
		Email <input type="email" name="email"> <br>
		<br> Password <input type="password" name="password"> <br>
		<br> <input type="submit" name="Login">

	</form>
</body>
</html>