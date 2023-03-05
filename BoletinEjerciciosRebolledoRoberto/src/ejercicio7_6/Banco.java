package ejercicio7_6;

public class Banco {
	private CrudCuenta crud;
	private String nombre;
	private double saldoT;
	public Banco(CrudCuenta crud, String nombre, double saldoT) {
		super();
		this.crud = crud;
		this.nombre = nombre;
		this.saldoT = saldoT;
	}
	public CrudCuenta getCrud() {
		return crud;
	}
	public void setCrud(CrudCuenta crud) {
		this.crud = crud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldoT() {
		return saldoT;
	}
	public void setSaldoT(double saldoT) {
		this.saldoT = saldoT;
	}
	@Override
	public String toString() {
		return "Banco [crud=" + crud + ", nombre=" + nombre + ", saldoT=" + saldoT + "]";
	}
	
	
	
}
