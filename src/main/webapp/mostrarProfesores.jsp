<%@page import="modelo.Profesor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>ACADEMIA eWon - Listado Profesores</title>
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
			<h2>Profesores</h2>
	<% List<Profesor> profesores = (List<Profesor>) request.getAttribute("listadoProfesores"); %>
	<table>
		<tr>
			<th>DNI</th>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Telefono</th>
			<th>Email</th>
			<th>Titulación</th>
			<th>Diligencia</th>
			
		</tr>
		<% for (Profesor p : profesores) {%>
		<tr>
			<td><%=p.getDni() %></td>
			<td><%=p.getNombre() %></td>
			<td><%=p.getApellidosr() %></td>
			<td><%=p.getTelefono() %></td>
			<td><%=p.getEmail() %></td>	
			<td><%=p.getTitulacion() %></td>
			<td><%=p.getDiligencia()%></td>		
		</tr>
		
		<% } %>
	
	</table>
		</main>
		<footer>
			<p>Ana María García Moreno</p>
		</footer>
	</body>
</html>