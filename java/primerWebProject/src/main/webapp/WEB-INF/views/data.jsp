<%@page import="cl.codingdojo.info.models.Modelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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