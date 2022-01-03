<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
		<h1>Ver Persona</h1>
		<div class="row">
			<div class="form-group col-12">
				<label for="nombre">Nombre</label>
				<input id="nombre" class="form-control-plaintext" readonly="readonly" value="<c:out value="${persona.nombre}"/>"/>
			</div>
			<div class="form-group col-12">
				<label for="primerApellido">Apellido Paterno</label>
				<input id="primerApellido" class="form-control-plaintext" readonly="readonly" value="<c:out value="${persona.primerApellido}"/>"/>
			</div>
			<div class="form-group col-12">
				<label for="segundoApellido">Apellido Materno</label>
				<input id="segundoApellido" class="form-control-plaintext" readonly="readonly" value="<c:out value="${persona.segundoApellido}"/>"/>
			</div>
			<div class="form-group col-12">
				<label for="edad">Edad</label>
				<input type="number" id="edad" class="form-control-plaintext" readonly="readonly" value="<c:out value="${persona.edad}"/>"/>
			</div>
		</div>
		<div class="row">
			<div class="col-6 mt-4">
				<a href="/primer-spring/personas/" class="btn btn-primary">Volver</a>
			</div>
		</div>
	</div>
</body>
</html>