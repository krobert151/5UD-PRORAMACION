package ejercicio6;

import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {
	/*Crear una clase Trabajador con los siguientes atributos:
	Nombre, DNI, Horas trabajadas y sueldo final (este se puede calcular de cualquier manera
	sencilla de las que hemos visto anteriormente).
	Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados según
	el número de horas trabajadas (de menor a mayor y viceversa) o según el sueldo (del que
	menos al que más cobra). Se deben usar las interfaces comparable y/o comparator.*/
	
	
	private String nobre;
	private String dni;
	private int horas;
	private double sueldo;
	public Trabajador(String nobre, String dni, int horas) {
		super();
		this.nobre = nobre;
		this.dni = dni;
		this.horas = horas;
	}
	public String getNobre() {
		return nobre;
	}
	public void setNobre(String nobre) {
		this.nobre = nobre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Trabajador [nobre=" + nobre + ", dni=" + dni + ", horas=" + horas + ", sueldo=" + sueldo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, horas, nobre, sueldo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni) && horas == other.horas && Objects.equals(nobre, other.nobre)
				&& Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}
	
	public void calcularSaldo(double sueldohora) {
		sueldo=horas*sueldohora;
	}
	@Override
	public int compareTo(Trabajador o) {
		if(this.sueldo>o.getSueldo())
			return -1;
		else {
			
			if(this.sueldo<o.getSueldo())
				return 1;
			else
				return 0;
		}
		
	}
	
	
}
