<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo</title>
</head>
<body>
	<form method="POST" action="/primer-spring/ejemplo/login">
	    <label>Username: <input type="text" name="username"></label>
	    <label>Password: <input type="password" name="password"></label>
	    <button>Login</button>
	</form>
	
	<br>
	<c:out value="${nombre }"></c:out>
</body>
</html>