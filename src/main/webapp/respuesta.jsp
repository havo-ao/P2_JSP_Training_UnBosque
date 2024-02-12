<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="co.edu.unbosque.model.EstudianteDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Respuesta</title>
<link rel="stylesheet" href="styles.css" />

</head>
<body>
	<div class="container">
		<h2>Registro Exitoso</h2>
		<%
		EstudianteDTO estudiante = (EstudianteDTO) request.getAttribute("estudiante");
		%>
		<p>
			Nombre:
			<%=estudiante.getNombre()%>
		</p>
		<p>
			Apellido:
			<%=estudiante.getApellido()%>
		</p>
		<p>
			Correo:
			<%=estudiante.getCorreo()%>
		</p>
		<p>
			Fecha de Nacimiento:
			<%=estudiante.getFechaNacimiento()%>
		</p>
		<p>
			ID de Estudiante:
			<%=estudiante.getIdEstudiante()%>
		</p>
		<p>
			Programa:
			<%=estudiante.getPrograma()%>
		</p>
	</div>

</body>
</html>