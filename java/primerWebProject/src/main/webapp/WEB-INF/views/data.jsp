<%@page import="cl.codingdojo.info.models.Modelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Welcome to javaTpoint'}"/>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Tipo</th>
				<th>Cantidad</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%=((Modelo)request.getAttribute("m")).getNombre() %></td>
				<td><%=((Modelo)request.getAttribute("m")).getTipo() %></td>
				<td><%=((Modelo)request.getAttribute("m")).getCantidad() %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>