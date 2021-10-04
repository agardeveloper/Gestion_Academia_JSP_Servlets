package persistencia;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;
import modelo.Curso;
import modelo.Profesor;

public class AccesoBD extends Conexion implements Serializable {

	private static final long serialVersionUID = 1L;

	// METODOS
	// Los datos de entrada no son ningunos porque queremos todos los alumnos
	// La salida es un ArrayList de alumnos
	public List<Alumno> obtenerAlumnos() throws ClassNotFoundException, SQLException {
		// 1. Definir variable

		// 1a. variables
		List<Alumno> alumnos = new ArrayList<Alumno>();
		String sql = "call academia.consulta_sencillaAlumnos();";
		// 1b. variable propias de la bd
		CallableStatement query;
		ResultSet rs;
		// 2. Abrir conexion
		abrirConexion();

		query = miConexion.prepareCall(sql);
		// 4. Ejecutar el statement (Query)
		rs = query.executeQuery();
		// 5. Recorrer el resultset para generar la coleccion
		while (rs.next()) {
			// Recoger los daots del reslt set
			String dni = rs.getString("DNI");
			String nombre = rs.getString("NOMBRE");
			String apellidos = rs.getString("APELLIDOS");
			String telefono = rs.getString("TELEFONO");
			String email = rs.getString("EMAIL");

			// Instanciar un alumno
			Alumno a1 = new Alumno(dni, nombre, apellidos, telefono, email);
			// Añadir a la coleccion
			alumnos.add(a1);
		}
		// 6. Cerrar resultset, statement y conexion
		rs.close();
		query.close();
		cerrarConexion();

		// 7. devolver la coleccion
		return alumnos;

	}// fin método obtenerAlumnos

	
	public List<Curso> obtenerCursos() throws ClassNotFoundException, SQLException {
		// 1. Definir variable

		// 1a. variables
		List<Curso> cursos = new ArrayList<Curso>();
		String sql = "call academia.consulta_sencilla_cursos();";
		// 1b. variable propias de la bd
		CallableStatement query;
		ResultSet rs;
		// 2. Abrir conexion
		abrirConexion();

		query = miConexion.prepareCall(sql);
		// 4. Ejecutar el statement (Query)
		rs = query.executeQuery();
		// 5. Recorrer el resultset para generar la coleccion
		while (rs.next()) {
			// Recoger los daots del reslt set
			String idcurso = rs.getString("idcurso");
			String curso = rs.getString("curso");
			String c_profesionalidad = rs.getString("c_profesionalidad");

			// Instanciar un alumno
			Curso c1 = new Curso(idcurso, curso, c_profesionalidad);
			// Añadir a la coleccion
			cursos.add(c1);
		}
		// 6. Cerrar resultset, statement y conexion
		rs.close();
		query.close();
		cerrarConexion();

		// 7. devolver la coleccion
		return cursos;

	}// fin método obtenerCursos

	
	public List<Profesor> obtenerProfesores() throws ClassNotFoundException, SQLException {
		// 1. Definir variable

		// 1a. variables
		List<Profesor> profesores = new ArrayList<Profesor>();
		String sql = "call academia.consulta_sencilla_profesores();";
		// 1b. variable propias de la bd
		CallableStatement query;
		ResultSet rs;
		// 2. Abrir conexion
		abrirConexion();

		query = miConexion.prepareCall(sql);
		// 4. Ejecutar el statement (Query)
		rs = query.executeQuery();
		// 5. Recorrer el resultset para generar la coleccion
		while (rs.next()) {
			// Recoger los daots del reslt set
			String dni = rs.getString("DNI");
			String nombre = rs.getString("NOMBRE");
			String apellidos = rs.getString("APELLIDOS");
			String telefono = rs.getString("TELEFONO");
			String email = rs.getString("EMAIL");
			String titulacion = rs.getString("TITULACION");
			String diligencia = rs.getString("DILIGENCIA");

			// Instanciar un alumno
			Profesor p1 = new Profesor(dni, nombre, apellidos, telefono, email, titulacion, diligencia);
			// Añadir a la coleccion
			profesores.add(p1);
		}
		// 6. Cerrar resultset, statement y conexion
		rs.close();
		query.close();
		cerrarConexion();

		// 7. devolver la coleccion
		return profesores;

	}// fin método obtenerProfesores

	
	// Método para obtener un alumno
	public Alumno consultaUnAlumno(String dni) throws ClassNotFoundException, SQLException {
		// 1. Declarar variables
		Alumno a1 = null;
		String sql = "call academia.consulta_un_alumno(?);";
		// 1b. variable propias de la bd
		CallableStatement sentencia = null;
		ResultSet cursor = null;
		
		// 2. Abrir conexion
		abrirConexion();
		
		//3. Obtener el statamente de la conexión
		sentencia = miConexion.prepareCall(sql);
				
		//3a. Asignamos los parametros
		sentencia.setString(1, dni);
		// 4. Ejecutar el statement (Query)
		cursor = sentencia.executeQuery();
		// 5. Recorrer el resultset para generar la coleccion

		if (cursor.next()) {
			// Recoger los daots del reslt set
			String nombre = cursor.getString("NOMBRE");
			String apellidos = cursor.getString("APELLIDOS");
			String telefono = cursor.getString("TELEFONO");
			String email = cursor.getString("EMAIL");

			// Instanciar un alumno
			a1 = new Alumno(dni, nombre, apellidos, telefono, email);

		} // fin if
			// 6. Cerrar resultset, statement y conexion
		cursor.close();
		sentencia.close();
		cerrarConexion();

		// 7. devolver 
		return a1;

	}// fin consultaUnAlumno

	
	// Método para obtener un curso
	public Curso consultaUnCurso(String idcurso) throws ClassNotFoundException, SQLException {
		// 1. Declarar variables
		Curso c1 = null;
		String sql = "call academia.consulta_un_curso(?);";
		// 1b. variable propias de la bd
		CallableStatement sentencia = null;
		ResultSet cursor = null;
		
		// 2. Abrir conexion
		abrirConexion();
		
		//3. Obtener el statamente de la conexión
		sentencia = miConexion.prepareCall(sql);
		
		//3a. Asignamos los parametros
		sentencia.setString(1, idcurso);
		
		// 4. Ejecutar el statement (Query)
		cursor = sentencia.executeQuery();
		
		// 5. Recorrer el resultset para generar la coleccion

		if (cursor.next()) {
			// Recoger los datos del reslt set
			String curso = cursor.getString("CURSO");
			String c_profesionalidad = cursor.getString("C_PROFESIONALIDAD");

			// Instanciar un alumno
			c1 = new Curso(idcurso, curso, c_profesionalidad);

		} // fin if
			// 6. Cerrar resultset, statement y conexion
		cursor.close();
		sentencia.close();
		cerrarConexion();

		// 7. devolver 
		return c1;

	}// fin consultaUnCurso

	//Dar de alta en la base de datos un curso
	public boolean altaCurso(Curso c1) throws ClassNotFoundException, SQLException {
		// 1. Declarar variables
		String sql = "call academia.alta_curso(?, ?, ?);";
		CallableStatement sentencia = null;
		int registros = 0;

		// 2. Abrir la conexion
		abrirConexion();

		// 3. Obtener el Statement de la conexion
		sentencia = miConexion.prepareCall(sql);

		// 3a. Asignamos los parametros
		sentencia.setString(1, c1.getIdCurso());
		sentencia.setString(2, c1.getCurso());
		sentencia.setString(3, c1.getC_profesionalidad());

		// 4. Ejecutar el Statement
		registros = sentencia.executeUpdate();

		// 5. Cerrar
		sentencia.close();
		cerrarConexion();

		// 6. Devolver el resultado
		return registros > 0;

	}// fin altaCurso
	
	//Dar de alta en la base de datos un alumno
	public boolean altaAlumno(Alumno a1) throws ClassNotFoundException, SQLException {
		// 1. Declarar variables
		String sql = "call academia.alta_alumno(?, ?, ?, ?, ?);";
		CallableStatement sentencia = null;
		int registros = 0;

		// 2. Abrir la conexion
		abrirConexion();

		// 3. Obtener el Statement de la conexion
		sentencia = miConexion.prepareCall(sql);

		// 3a. Asignamos los parametros
		sentencia.setString(1, a1.getDNI());
		sentencia.setString(2, a1.getNombre());
		sentencia.setString(3, a1.getApellidos());
		sentencia.setString(4, a1.getTelefono());
		sentencia.setString(5, a1.getEmail());

		// 4. Ejecutar el Statement
		registros = sentencia.executeUpdate();

		// 5. Cerrar
		sentencia.close();
		cerrarConexion();

		// 6. Devolver el resultado
		return registros > 0;

	}// fin altaAlumno
	
	//Eliminar de la base de datos un alumno
	public boolean bajaAlumno(String dni) throws ClassNotFoundException, SQLException {
		// 1. Declarar variables
		String sql = "call academia.eliminar_alumno(?);";
		CallableStatement sentencia = null;
		int numRegistros = 0;

		// 2. Abrir la conexion
		abrirConexion();

		// 3. Obtener el Statement de la conexion
		sentencia = miConexion.prepareCall(sql);

		// 3a. Asignamos los parametros
		sentencia.setString(1, dni);

		// 4. Ejecutar el Statement
		numRegistros = sentencia.executeUpdate();

		// 5. Cerrar
		sentencia.close();
		cerrarConexion();

		// 6. Devolver el resultado
		return numRegistros > 0;

	}// fin bajaAlumno

	public boolean modificarAlumno(Alumno a1) throws ClassNotFoundException, SQLException {
		// 1. Declarar variables
		String sql = "call academia.modifica_alumno(?, ?, ?, ?, ?);";
		CallableStatement sentencia = null;
		int numRegistros = 0;

		// 2. Abrir la conexion
		abrirConexion();

		// 3. Obtener el Statement de la conexion
		sentencia = miConexion.prepareCall(sql);

		// 3a. Asignamos los parametros
		sentencia.setString(1, a1.getDNI());
		sentencia.setString(2, a1.getNombre());
		sentencia.setString(3, a1.getApellidos());
		sentencia.setString(4, a1.getTelefono());
		sentencia.setString(5, a1.getEmail());
		
		// 4. Ejecutar el Statement
		numRegistros = sentencia.executeUpdate();

		// 5. Cerrar
		sentencia.close();
		cerrarConexion();

		// 6. Devolver el resultado
		return numRegistros > 0;

	}// fin modificarAlumno

}// fin clase AccesoBD
