<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="co.edu.unbosque.model.EstudianteDTO"%>
<%@page import="co.edu.unbosque.controller.EstudianteDataSource"%>
<%@page import="java.util.List"%>
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
		EstudianteDTO estudianteUnico = (EstudianteDTO) request.getAttribute("estudiante");
		List<EstudianteDTO> estudiantes = (List<EstudianteDTO>) request.getAttribute("estudiantes");
		%>
		<p>
			Nombre:
			<%=estudianteUnico.getNombre()%>
		</p>
		<p>
			Apellido:
			<%=estudianteUnico.getApellido()%>
		</p>
		<p>
			Correo:
			<%=estudianteUnico.getCorreo()%>
		</p>
		<p>
			Fecha de Nacimiento:
			<%=estudianteUnico.getFechaNacimiento()%>
		</p>
		<p>
			ID de Estudiante:
			<%=estudianteUnico.getIdEstudiante()%>
		</p>
		<p>
			Programa:
			<%=estudianteUnico.getPrograma()%>
		</p>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Correo</th>
				<th>Fecha de Nacimiento</th>
				<!-- Puedes agregar más columnas según los atributos de EstudianteDTO -->
			</tr>
			<%
			for (EstudianteDTO estudiante : estudiantes) {
			%>
			<tr>
				<td><%=estudiante.getIdEstudiante()%></td>
				<td><%=estudiante.getNombre()%></td>
				<td><%=estudiante.getApellido()%></td>
				<td><%=estudiante.getCorreo()%></td>
				<td><%=estudiante.getFechaNacimiento()%></td>
				<!-- Puedes agregar más columnas según los atributos de EstudianteDTO -->
			</tr>
			<%
			}
			%>
		</table>
	</div>

</body>
</html>