<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>ACADEMIA eWon -Mensajes de respuesta</title>
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
		<h2>Mensajes de respuesta</h2>
		<%=request.getAttribute("mensaje") %>
		</main>
		
		<footer>
			<p>Ana María García Moreno</p>
		</footer>

	</body>
</html>