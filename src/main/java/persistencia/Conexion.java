package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	protected Connection miConexion;
	
	 public void abrirConexion() throws ClassNotFoundException, SQLException{
		 //Indicar el nombre del dirver
	  Class.forName("com.mysql.cj.jdbc.Driver");
	   //2. Formar el string de conexion gestor, BD, nombre usuario y contrase�a
	   //2. Abrir la conexi�n - Para esto debemos tener un String de Conexion con: 
			//  con: gestor, BD, nombre usuario y contrase�a
	  String stringConexion = "jdbc:mysql://localhost:3306/ejerciciosweb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	        miConexion = DriverManager.getConnection(stringConexion,"root","CONTRASENIA_BD");//CAMBIAR USUARIO(root) Y CONTRASE�A
	        
	        System.out.println("�xito al abrir la conexi�n");
	 }//fin abrirConexion
	 public void cerrarConexion() throws SQLException {
	  miConexion.close();
	 }//fin cerrarConexion
	

}//fin clase Conexion
