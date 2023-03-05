package ejercicio7_5;

public class Vendedor extends Empleado {
	 /*Crear una clase derivada de ella, llamada Vendedor que tenga como atributos la cantidad de ventas y
		un incentivo (un porcentaje de las ventas realizadas en un mes sumado a su sueldo base) y los métodos
		apropiados para manejarla.*/
	
	private int ventas;
	private double incentivo;
	public Vendedor(String nombre, String apellidos, double sueldoB, int numEmp, int ventas, double incentivo) {
		super(nombre, apellidos, sueldoB, numEmp);
		this.ventas = ventas;
		this.incentivo = incentivo;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public String toString() {
		return "Vendedor [ventas=" + ventas + ", incentivo=" + incentivo + "]";
	}
	@Override
	public double  calcularST() {
		if(ventas>10)
			return super.getSueldoB()+incentivo;
		else
			return super.getSueldoB();
		
	}
	
	
	
	
}
