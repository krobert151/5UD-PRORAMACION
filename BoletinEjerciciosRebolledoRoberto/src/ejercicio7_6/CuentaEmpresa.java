package ejercicio7_6;

public class CuentaEmpresa extends Cuenta {

	private double impuestoUso;
	public CuentaEmpresa(String nombre, String apellidos, double saldoB, int registro, double impuestoUso) {
		super(nombre, apellidos, saldoB, registro);
		this.impuestoUso = impuestoUso;
	}

	public double getImpuestoUso() {
		return impuestoUso;
	}

	public void setImpuestoUso(double impuestoUso) {
		this.impuestoUso = impuestoUso;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [impuestoUso=" + impuestoUso + "]";
	}

	@Override
	public double calcularSaldoT() {
		// TODO Esbozo de método generado automáticamente
		return super.getSaldoB()+calcularExtr();
	}

	@Override
	public double calcularExtr() {
		// TODO Esbozo de método generado automáticamente
		return impuestoUso*super.getRegistro();
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
	public void printExt() {
		
		System.out.printf("impuesto-%.2f\ttotal=%.2f€",calcularExtr(),calcularSaldoT());
		
	}

}
