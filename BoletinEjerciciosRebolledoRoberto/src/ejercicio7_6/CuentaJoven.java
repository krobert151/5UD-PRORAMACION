package ejercicio7_6;

public class CuentaJoven extends Cuenta{

	private double regalo;

	public CuentaJoven(String nombre, String apellidos, double saldoB, int registro, double regalo) {
		super(nombre, apellidos, saldoB, registro);
		this.regalo = regalo;
	}

	public double getRegalo() {
		return regalo;
	}

	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + "]";
	}

	@Override
	public double calcularSaldoT() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}
	
	@Override
	public void printExt() {

		System.out.printf("extra-%.2f€t\ttotal=%.2f€",calcularExtr(),calcularSaldoT());
		
	}

	@Override
	public void reintegrarDinero(double integro) {
		// TODO Esbozo de método generado automáticamente
		super.reintegrarDinero(integro);
	}

	@Override
	public void ingresarDinero(double ingreso) {
		// TODO Esbozo de método generado automáticamente
		super.ingresarDinero(ingreso);
	}
	
	@Override
	public double calcularExtr() {
		// TODO Esbozo de método generado automáticamente
		return regalo*super.getRegistro();
	}
	
	
	
	
}
