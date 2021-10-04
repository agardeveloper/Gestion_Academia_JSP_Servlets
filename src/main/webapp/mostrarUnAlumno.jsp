<%@page import="modelo.Alumno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>ACADEMIA eWon - Consulta alumno</title>
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
	<% Alumno a1 = (Alumno) request.getAttribute("alumno"); %>
	<table>
		<tr>
			<th>DNI</th>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Telefono</th>
			<th>Email</th>
			
		</tr>
		
		<tr>
			<td><%=a1.getDNI() %></td>
			<td><%=a1.getNombre() %></td>
			<td><%=a1.getApellidos() %></td>
			<td><%=a1.getTelefono() %></td>
			<td><%=a1.getEmail() %></td>		
		</tr>
		

	
	</table>		

	
		</main>
		
		<footer>
			<p>Ana María García Moreno</p>
		</footer>
	</body>
</html>