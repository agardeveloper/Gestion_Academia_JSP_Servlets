package modelo;

public class Profesor {
	//ATRIBUTOS
	private String dni;
	private String nombre;
	private String apellidosr;
	private String telefono;
	private String email;
	private String titulacion;
	private String diligencia;
	
	
	//CONSTRUCTORES
	//Constructor vacio
	public Profesor() {
	}//fin constructor vacio
	
	//Constructor con argumentos
	public Profesor(String dni, String nombre, String apellidosr, String telefono, String email, String titulacion,
			String diligencia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidosr = apellidosr;
		this.telefono = telefono;
		this.email = email;
		this.titulacion = titulacion;
		this.diligencia = diligencia;
	}//fin constructor argumentos
	
	
	//METODOS
	//Sobreescritura método toString
	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidosr=" + apellidosr + ", telefono=" + telefono
				+ ", email=" + email + ", titulacion=" + titulacion + ", diligencia=" + diligencia + "]";
	}//fin método toString

	//Sobreescritura método hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidosr == null) ? 0 : apellidosr.hashCode());
		result = prime * result + ((diligencia == null) ? 0 : diligencia.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((titulacion == null) ? 0 : titulacion.hashCode());
		return result;
	}//fin hashCode
	
	//Sobreescritura método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (apellidosr == null) {
			if (other.apellidosr != null)
				return false;
		} else if (!apellidosr.equals(other.apellidosr))
			return false;
		if (diligencia == null) {
			if (other.diligencia != null)
				return false;
		} else if (!diligencia.equals(other.diligencia))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
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
		if (titulacion == null) {
			if (other.titulacion != null)
				return false;
		} else if (!titulacion.equals(other.titulacion))
			return false;
		return true;
	}//fin equals
	
	
	//SETTERS Y GETTERS
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidosr() {
		return apellidosr;
	}

	public void setApellidosr(String apellidosr) {
		this.apellidosr = apellidosr;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getDiligencia() {
		return diligencia;
	}

	public void setDiligencia(String diligencia) {
		this.diligencia = diligencia;
	}//fin setDiligencia
	
	
	
}//fin clase Profesor
