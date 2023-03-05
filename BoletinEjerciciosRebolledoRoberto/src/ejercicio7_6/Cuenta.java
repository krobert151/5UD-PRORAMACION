package ejercicio7_6;

public abstract class Cuenta {

	private String nombre;
	private String apellidos;
	private double saldoB;
	private int registro;

	
	public Cuenta(String nombre, String apellidos, double saldoB, int registro) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.saldoB = saldoB;
		this.registro = registro;
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
	public double getSaldoB() {
		return saldoB;
	}
	public void setSaldoB(double saldoB) {
		this.saldoB = saldoB;
	}

	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	public void print() {
		
		System.out.printf("%s\t%s\t%.2f\t%d\t",nombre,apellidos,saldoB,registro);
		
	}
	
	public void ingresarDinero(double ingreso) {
		
		saldoB+=ingreso;
		registro++;
	}
	public void reintegrarDinero(double integro) {
		
		saldoB-=integro;
		registro++;
		
	}
	
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", apellidos=" + apellidos + ", saldoB=" + saldoB + ", registro=" + registro
				+ "]";
	}
	
	public abstract double calcularExtr();
	public abstract void printExt();
	public abstract double calcularSaldoT(); 
	
	
}
