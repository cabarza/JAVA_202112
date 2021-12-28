<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${2+2}"/><br>
	
	<h1><c:out value="${cantidad }"/> Recargas</h1>
	
	<c:if test="${nombre !=null }">
		<h1><c:out value="${nombre}"></c:out></h1>
	</c:if>
	<br>
	<a href="/primer-spring/fecha/date">Ver Fecha</a>
	<br>
	<a href="/primer-spring/fecha/time">Ver Hora</a>
	<br>
	<a href="/primer-spring/fecha/otro">Otro</a>
	<div>
		<c:choose>
			<c:when test="${date!=null || time!=null}">
				<h2>
					<c:if test="${date!=null}">
						<fmt:formatDate value="${date}" type="date"/>
					</c:if>
					
					<c:if test="${time!=null}">
						<fmt:formatDate value="${time}" type="time"/>
					</c:if>
				</h2>
			</c:when>
			<c:otherwise>
				<h2 style="color: red">
					<c:out value="${error }"/>
				</h2>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>