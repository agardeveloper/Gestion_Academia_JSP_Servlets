<%@page import="java.util.List"%>
<%@page import="modelo.Alumno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>ACADEMIA eWon - Listado Alumnos</title>
	<link rel="stylesheet" type="text/css" href="estilos/estilos.css">
	</head>
	<body>	
		<header>
			<ul>
		        <li><a href="index.html">ACADEMIA eWon</a></li>
		        <li><a href="index.html">Inicio</a></li>
		        <li><a href="fAlumno.jsp">Alumnos</a></li>
		        <li><a href="fCurso.jsp">Cursos</a></li>
		        <li><a href="fProfesor.jsp">Profesores</a></li>
		    </ul>
	    </header>
    
    
		<main>
			<h2>Alumnos</h2>
	<% List<Alumno> alumnos = (List<Alumno>) request.getAttribute("listadoAlumnos"); %>
	<table>
		<tr>
			<th>DNI</th>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Telefono</th>
			<th>Email</th>
			
		</tr>
		<% for (Alumno a : alumnos) {%>
		<tr>
			<td><%=a.getDNI() %></td>
			<td><%=a.getNombre() %></td>
			<td><%=a.getApellidos() %></td>
			<td><%=a.getTelefono() %></td>
			<td><%=a.getEmail() %></td>		
		</tr>
		
		<% } %>
	
	</table>
		</main>
		<footer>
			<p>Ana María García Moreno</p>
		</footer>
	</body>
</html>