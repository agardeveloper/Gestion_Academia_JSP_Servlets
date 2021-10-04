package modelo;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private static final long serialVersionUID = -6722574901756283913L;
	
	
	//ATRIBUTOS
	private String DNI;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	
	
	//CONSTRUCTORES
	//Constructor vacio
	public Alumno() {
	}//constructor vacio
	
	//Constructor con argumentos
	public Alumno(String dNI, String nombre, String apellidos, String telefono, String email) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}//constructor con argumentos
	
	
	//METODOS
	//Sobreescribir toString
	@Override
	public String toString() {
		return "Alumno [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}//fin toString
	
	//Sobreescribir hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}//fin hashCode
	
	//Sobreescribir equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}//fin equals

	
	//SETTERS Y GETTERS
	public String getDNI() {
		return DNI;
	}//fin getDNI

	public void setDNI(String dNI) {
		DNI = dNI;
	}//fin setDNI

	public String getNombre() {
		return nombre;
	}//fin getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//fin setNombre

	public String getApellidos() {
		return apellidos;
	}//fin getApellidos

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}//fin setApellidos

	public String getTelefono() {
		return telefono;
	}//fin getTelefono

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}//fin setTelefono

	public String getEmail() {
		return email;
	}//fin getEmail

	public void setEmail(String email) {
		this.email = email;
	}//fin setEmail

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
}//fin clase Alumno
