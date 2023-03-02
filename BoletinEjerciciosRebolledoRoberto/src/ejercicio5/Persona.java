package ejercicio5;
    
import java.util.Objects;
    
public class Persona implements Comparable <Persona> {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	public Persona(String dni, String nombre, String apellidos, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
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
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, edad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(nombre, other.nombre);
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(o.dni);
	}
		
}   
    