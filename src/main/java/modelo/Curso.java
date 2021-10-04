package modelo;

public class Curso {
	//ATRIBUTOS
	private String idcurso;
	private String curso;
	private String c_profesionalidad;
	
	
	//CONSTRUCTORES
	//Constructor vacio
	public Curso() {
	}//fin constructor vacio
	
	//Constructor con argumentos
	public Curso(String idcurso, String curso, String c_profesionalidad) {
		super();
		this.idcurso = idcurso;
		this.curso = curso;
		this.c_profesionalidad = c_profesionalidad;
	}//fin constructor con argumentos
	
	
	//METODOS
	//Sobreescritura método toString
	@Override
	public String toString() {
		return "Curso [idCurso=" + idcurso + ", curso=" + curso + ", c_profesionalidad=" + c_profesionalidad + "]";
	}//fin toString
	
	//Sobreescritura método hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_profesionalidad == null) ? 0 : c_profesionalidad.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((idcurso == null) ? 0 : idcurso.hashCode());
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
		Curso other = (Curso) obj;
		if (c_profesionalidad == null) {
			if (other.c_profesionalidad != null)
				return false;
		} else if (!c_profesionalidad.equals(other.c_profesionalidad))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (idcurso == null) {
			if (other.idcurso != null)
				return false;
		} else if (!idcurso.equals(other.idcurso))
			return false;
		return true;
	}//fin método equals
	
	
	//SETTERS Y GETTERS
	public String getIdCurso() {
		return idcurso;
	}//fin getIdCurso

	public void setIdCurso(String idCurso) {
		this.idcurso = idCurso;
	}//fin setIdCurso

	public String getCurso() {
		return curso;
	}//fin getCurso

	public void setCurso(String curso) {
		this.curso = curso;
	}//fin setCurso

	public String getC_profesionalidad() {
		return c_profesionalidad;
	}//fin getC_profesionalidad

	public void setC_profesionalidad(String c_profesionalidad) {
		this.c_profesionalidad = c_profesionalidad;
	}//fin setC_profesionalidad
		
	
	
}//fin clase Curso
