<%@page import="cl.codingdojo.info.models.Modelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página Info</title>
</head>
<body>
	<h1>Página de Info</h1>
	
	<form action="info" method="POST">
		<label>Nombre</label>
		<input type="text" name="nombre" required="required">
		<label>Tipo</label>
		<input type="text" name="tipo" required="required">
		<label>cantidad</label>
		<input type="number" name="cantidad" required="required">
		
		<button type="submit">Enviar</button>
	</form>
	
	

</body>
</html>