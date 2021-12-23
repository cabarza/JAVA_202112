<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Primer Proyecto</title>
</head>
<body>
	<%!
		public List<String> mensajes;
		int cantidad = 10;	
	
		public void agregarMensaje(String mensaje) {
			this.mensajes.add(mensaje);
		}
		
		
	%>
	<h1>Este es mi primera JSP</h1>
	
	<% 
		mensajes = new ArrayList<String>();
		if(request.getParameter("cantidad")!=null) {
			cantidad = Integer.valueOf(request.getParameter("cantidad"));
		}
	
		for(int i=0;i<cantidad; i++) {
			this.agregarMensaje("Estes es el mensaje n° " + i);
		} 
	%>
	
	<% for(String mensaje: this.mensajes){ %>
		<h3><%= mensaje %></h3>
	<% } %>
</body>
</html>