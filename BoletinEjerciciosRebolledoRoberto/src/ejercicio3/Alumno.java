package ejercicio3;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private double notaM;
	public Alumno(String dni, String nombre, String apellidos, int edad, double notaM) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notaM = notaM;
	}
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getNotaM() {
		return notaM;
	}
	public void setNotaM(double notaM) {
		this.notaM = notaM;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", notaM="
				+ notaM + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, edad, nombre, notaM);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaM) == Double.doubleToLongBits(other.notaM);
	}
	@Override
	public int compareTo(Alumno o) {
		if(this.notaM>o.getNotaM())
			return 1;
		else {
			if(this.notaM<o.getNotaM())
				return -1;
			else
				return 0;
		}
	}
	
	
	
	
	
	
	
	
}
