<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.Css{
	background-color: #66ffcc;
	position: absolute;
	top:20%;
	left: 40%;
	
}
</style>
<meta charset="ISO-8859-1">
<title>My first J2EE project</title>
</head>
<body class="Css">
	<h3>Welcome to J2EE Application</h3>
	<h4>Login Page</h4>
	<h6 style="color: red;">${errormessage}</h6>
	<form action="LoginController" method="post">
		Email : <input type="email" name="email" /> <br>
		<br> Password : <input type="password" name="password" /> <br>
		<br> <input type="submit" value="Login">
	</form>

</body>
</html>