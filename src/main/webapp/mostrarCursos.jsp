<%@page import="modelo.Curso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>ACADEMIA eWon - Listado Cursos</title>
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
			<h2>Cursos</h2>
	<% List<Curso> cursos = (List<Curso>) request.getAttribute("listadoCursos"); %>
	<table>
		<tr>
			<th>Identificador</th>
			<th>Curso</th>
			<th>Certificado de Profesionalidad</th>
			
		</tr>
		<% for (Curso c : cursos) {%>
		<tr>
			<td><%=c.getIdCurso() %></td>
			<td><%=c.getCurso() %></td>
			<td><%=c.getC_profesionalidad() %></td>
	
		</tr>
		
		<% } %>
	
	</table>
		</main>
		<footer>
			<p>Ana María García Moreno</p>
		</footer>
	</body>
</html>