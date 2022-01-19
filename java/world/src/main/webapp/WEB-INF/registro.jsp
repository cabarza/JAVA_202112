<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
</head>
<body>
	<h1>Registro</h1>
	<form:form action="/registro" method="post" modelAttribute="user">
		<p>
			<form:label path="email">Email</form:label>
			<form:input type="email" path="email"/>
			<form:errors path="email"/>
		<p>
		<p>
			<form:label path="birthDay">Birthday</form:label>
			<form:input type="date" path="birthDay"/>
			<form:errors path="birthDay"/>
		<p>
		<p>
			<form:label path="password">Password</form:label>
			<form:input type="password" path="password"/>
			<form:errors path="password"/>
		<p>
		<p>
			<form:label path="passwordConfirmation">Password Confirmation</form:label>
			<form:input type="password" path="passwordConfirmation"/>
			<form:errors path="passwordConfirmation"/>
		<p>
		<form:button type="submit">Registrar</form:button>
	</form:form>

</body>
</html>