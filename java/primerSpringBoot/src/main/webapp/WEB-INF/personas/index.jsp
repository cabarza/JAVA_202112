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
	<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>	
	<!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
	<div class="container">
		<h1>Listado de Personas</h1>
		<a href="/primer-spring/personas/new">Nueva Persona</a>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Ver</th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${personas}" var="p">
					<tr>
						<td><c:out value="${p.id}"/></td>
						<td><c:out value="${p.nombre}"/></td>
						<td><c:out value="${p.primerApellido}"/></td>
						<td><a href="/primer-spring/personas/<c:out value="${p.id}"/>"><i class="fas fa-eye"></i></a></td>
						<td><a href="/primer-spring/personas/edit/<c:out value="${p.id}"/>"><i class="fas fa-pencil"></i></a></td>
						<td style="color: red" onclick="eliminar(<c:out value="${p.id}"/>)"><i class="fas fa-trash"></i></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<form:form id="deleteForm" method="POST" modelAttribute="persona">
		<input type="hidden" name="_method" value="delete"/>
	</form:form>
	<script>
		function eliminar(id) {
			
			Swal.fire({
				title: 'Eliminar Persona',
				text: '¿Esta seguro de eliminar la persona?',
				icon: 'question',
				showCancelButton: true,
				confirmButtonText: 'Si, Eliminarla!!!!'
			}).then(res => {
				if(res.value) {
					const form = document.getElementById('deleteForm')
					form.action="/primer-spring/personas/"+id;
					form.submit();
				}
			});
		}
	</script>
</body>
</html>