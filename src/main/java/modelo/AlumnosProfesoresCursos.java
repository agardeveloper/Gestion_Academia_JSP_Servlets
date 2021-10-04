package modelo;

import java.time.LocalDate;

public class AlumnosProfesoresCursos {
	//ATRIBUTOS
	private String dniAlumno;
	private String dniProfesor;
	private String idCurso;
	private LocalDate fechaInicioCurso;
	private LocalDate fechaFinCurso;
	private String practicas;
	private LocalDate fechaInicioPracticas;
	private LocalDate fechaFinPracticas;
	
	
	//CONSTRUCTORES
	//Constructor vacio
	public AlumnosProfesoresCursos() {
	}//fin constructor vacio
	
	//Constructor con argumentos
	public AlumnosProfesoresCursos(String dniAlumno, String dniProfesor, String idCurso, LocalDate fechaInicioCurso,
			LocalDate fechaFinCurso, String practicas, LocalDate fechaInicioPracticas, LocalDate fechaFinPracticas) {
		super();
		this.dniAlumno = dniAlumno;
		this.dniProfesor = dniProfesor;
		this.idCurso = idCurso;
		this.fechaInicioCurso = fechaInicioCurso;
		this.fechaFinCurso = fechaFinCurso;
		this.practicas = practicas;
		this.fechaInicioPracticas = fechaInicioPracticas;
		this.fechaFinPracticas = fechaFinPracticas;
	}//fin constructor con argumentos
	
	
	//METODOS
	//Sobreescritura método toString
	@Override
	public String toString() {
		return "AlumnosProfesoresCursos [dniAlumno=" + dniAlumno + ", dniProfesor=" + dniProfesor + ", idCurso="
				+ idCurso + ", fechaInicioCurso=" + fechaInicioCurso + ", fechaFinCurso=" + fechaFinCurso
				+ ", practicas=" + practicas + ", fechaInicioPracticas=" + fechaInicioPracticas + ", fechaFinPracticas="
				+ fechaFinPracticas + "]";
	}//fin método toString
	
	//Sobreescritura método hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dniAlumno == null) ? 0 : dniAlumno.hashCode());
		result = prime * result + ((dniProfesor == null) ? 0 : dniProfesor.hashCode());
		result = prime * result + ((fechaFinCurso == null) ? 0 : fechaFinCurso.hashCode());
		result = prime * result + ((fechaFinPracticas == null) ? 0 : fechaFinPracticas.hashCode());
		result = prime * result + ((fechaInicioCurso == null) ? 0 : fechaInicioCurso.hashCode());
		result = prime * result + ((fechaInicioPracticas == null) ? 0 : fechaInicioPracticas.hashCode());
		result = prime * result + ((idCurso == null) ? 0 : idCurso.hashCode());
		result = prime * result + ((practicas == null) ? 0 : practicas.hashCode());
		return result;
	}//fin método hashCode
	
	//Sobreescritura método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlumnosProfesoresCursos other = (AlumnosProfesoresCursos) obj;
		if (dniAlumno == null) {
			if (other.dniAlumno != null)
				return false;
		} else if (!dniAlumno.equals(other.dniAlumno))
			return false;
		if (dniProfesor == null) {
			if (other.dniProfesor != null)
				return false;
		} else if (!dniProfesor.equals(other.dniProfesor))
			return false;
		if (fechaFinCurso == null) {
			if (other.fechaFinCurso != null)
				return false;
		} else if (!fechaFinCurso.equals(other.fechaFinCurso))
			return false;
		if (fechaFinPracticas == null) {
			if (other.fechaFinPracticas != null)
				return false;
		} else if (!fechaFinPracticas.equals(other.fechaFinPracticas))
			return false;
		if (fechaInicioCurso == null) {
			if (other.fechaInicioCurso != null)
				return false;
		} else if (!fechaInicioCurso.equals(other.fechaInicioCurso))
			return false;
		if (fechaInicioPracticas == null) {
			if (other.fechaInicioPracticas != null)
				return false;
		} else if (!fechaInicioPracticas.equals(other.fechaInicioPracticas))
			return false;
		if (idCurso == null) {
			if (other.idCurso != null)
				return false;
		} else if (!idCurso.equals(other.idCurso))
			return false;
		if (practicas == null) {
			if (other.practicas != null)
				return false;
		} else if (!practicas.equals(other.practicas))
			return false;
		return true;
	}//fin método equals
	
	
	//SETTERS Y GETTERS
	public String getDniAlumno() {
		return dniAlumno;
	}//fin getDniAlumno

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}//fin setDniAlumno

	public String getDniProfesor() {
		return dniProfesor;
	}//fin getDniProfesor

	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}//fin setDniProfesor

	public String getIdCurso() {
		return idCurso;
	}//fin getIdCurso

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}//fin setIdCurso

	public LocalDate getFechaInicioCurso() {
		return fechaInicioCurso;
	}//fin getFechaInicioCurso

	public void setFechaInicioCurso(LocalDate fechaInicioCurso) {
		this.fechaInicioCurso = fechaInicioCurso;
	}//fin setFechaInicioCurso

	public LocalDate getFechaFinCurso() {
		return fechaFinCurso;
	}//fin getFechaFinCurso

	public void setFechaFinCurso(LocalDate fechaFinCurso) {
		this.fechaFinCurso = fechaFinCurso;
	}//fin setFechaFinCurso

	public String getPracticas() {
		return practicas;
	}//fin getPracticas

	public void setPracticas(String practicas) {
		this.practicas = practicas;
	}//fin setPracticas

	public LocalDate getFechaInicioPracticas() {
		return fechaInicioPracticas;
	}//fin getFechaInicioPracticas

	public void setFechaInicioPracticas(LocalDate fechaInicioPracticas) {
		this.fechaInicioPracticas = fechaInicioPracticas;
	}//fin setFechaInicioPracticas

	public LocalDate getFechaFinPracticas() {
		return fechaFinPracticas;
	}//fin getFechaFinPracticas

	public void setFechaFinPracticas(LocalDate fechaFinPracticas) {
		this.fechaFinPracticas = fechaFinPracticas;
	}//fin setFechaFinPracticas
	
	

}//fin clase AlumnosProfesoresCursos
