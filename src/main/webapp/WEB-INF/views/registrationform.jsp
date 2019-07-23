<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<h1> Registration Form </h1>
<form action="/results">
<p>First Name: <input type= "text" name= "firstname" /> </p>
<p>Last Name: <input type= "text" name= "lastname" /> </p>
<p>E-mail: <input type="email" name= "email" /> </p>
<p>Phone Number: <input type="number" step="1" name= "phonenumber" /> </p>
<p>Password: <input type="password" name= "password" /> </p>

<p><button>Register</button></p>
</form>
</body>
</html>