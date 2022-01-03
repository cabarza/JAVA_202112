<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Personas</title>
	<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	
</head>
<body>
	<div class="container">
		<h1>Nueva Persona</h1>
		<form:form action="/primer-spring/personas" method="POST" modelAttribute="persona">
			<div class="row">
				<div class="form-group col-12 col-md-6">
					<form:label path="nombre">Nombre</form:label>
					<form:errors path="nombre"></form:errors>
					<form:input path="nombre" class="form-control"/>
				</div>
				<div class="form-group col-12 col-md-6">
					<form:label path="primerApellido">Apellido Paterno</form:label>
					<form:errors path="primerApellido"></form:errors>
					<form:input path="primerApellido" class="form-control"/>
				</div>
				<div class="form-group col-12 col-md-6">
					<form:label path="segundoApellido">Apellido Materno</form:label>
					<form:errors path="segundoApellido"></form:errors>
					<form:input path="segundoApellido" class="form-control"/>
				</div>
				<div class="form-group col-12 col-md-6">
					<form:label path="edad">Edad</form:label>
					<form:errors path="edad"></form:errors>
					<form:input type="number" path="edad" class="form-control"/>
				</div>
			</div>
			<div class="row">
				<div class="col-12 col-md-6 mt-4">
					<button type="submit" class="btn btn-primary">Crear</button>
				</div>
				<div class="col-12 col-md-6 mt-4">
					<a href="/primer-spring/personas/" class="btn btn-primary">Volver</a>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>