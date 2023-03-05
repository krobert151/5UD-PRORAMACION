package ejercicio7_5;

public abstract class Empleado {

	/*Crear una clase Empleado con los atributos nombre, apellidos, sueldo base y nº de Empleado.*/
	
	private String nombre;
	private String apellidos;
	private double sueldoB;
	private int numEmp;
	
	public Empleado(String nombre, String apellidos, double sueldoB, int numEmp) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoB = sueldoB;
		this.numEmp = numEmp;
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

	public double getSueldoB() {
		return sueldoB;
	}

	public void setSueldoB(double sueldoB) {
		this.sueldoB = sueldoB;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}
	
	public abstract double calcularST();

	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoB=" + sueldoB + ", numEmp=" + numEmp
				+ "]";
	}
	
	
	

}
