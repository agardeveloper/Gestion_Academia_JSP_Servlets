<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>ACADEMIA eWon - A�adir alumnos</title>
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
			
			<form action="s_alta_alumno" method="post">
				<h1 class="center-content">A�adir alumnos</h1>
				<p>DNI: <input type="text" name="dni"/></p>
				<p>Nombre: <input type="text" name="nombre"/></p>
				<p>Apellidos: <input type="text" name="apellidos"/></p>
				<p>Tel�fono: <input type="text" name="telefono"/></p>
				<p>Email: <input type="text" name="email"/></p>	
		
				<p class="center-content"><input type="submit" value="Guardar"/>
			</form>
	
		</main>
		
		<footer>
			<p>Ana Mar�a Garc�a Moreno</p>
		</footer>
	</body>
</html>