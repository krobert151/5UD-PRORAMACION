package ejercicio3;

import java.util.Set;

public class Clase {
	private String curso;
	private Set<Alumno> alumn;
	public Clase(String curso, Set<Alumno> alumn) {
		super();
		this.curso = curso;
		this.alumn = alumn;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Set<Alumno> getAlumn() {
		return alumn;
	}
	public void setAlumn(Set<Alumno> alumn) {
		this.alumn = alumn;
	}
	@Override
	public String toString() {
		return "Clase [curso=" + curso + ", alumn=" + alumn + "]";
	}
	
	public void añadirAlumno()
	
}
