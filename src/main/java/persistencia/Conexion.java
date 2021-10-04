package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	protected Connection miConexion;
	
	 public void abrirConexion() throws ClassNotFoundException, SQLException{
		 //Indicar el nombre del dirver
	  Class.forName("com.mysql.cj.jdbc.Driver");
	   //2. Formar el string de conexion gestor, BD, nombre usuario y contraseña
	   //2. Abrir la conexión - Para esto debemos tener un String de Conexion con: 
			//  con: gestor, BD, nombre usuario y contraseña
	  String stringConexion = "jdbc:mysql://localhost:3306/ejerciciosweb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	        miConexion = DriverManager.getConnection(stringConexion,"root","CONTRASENIA_BD");//CAMBIAR USUARIO(root) Y CONTRASEÑA
	        
	        System.out.println("Éxito al abrir la conexión");
	 }//fin abrirConexion
	 public void cerrarConexion() throws SQLException {
	  miConexion.close();
	 }//fin cerrarConexion
	

}//fin clase Conexion
