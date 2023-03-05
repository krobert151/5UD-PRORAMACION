package ejercicio7_6;

public class CuentaCorriente extends Cuenta {

	private double mantenimiento;

	public CuentaCorriente(String nombre, String apellidos, double saldoB, int registro, double mantenimiento) {
		super(nombre, apellidos, saldoB, registro);
		this.mantenimiento = mantenimiento;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@Override
	public double calcularSaldoT() {
		// TODO Esbozo de método generado automáticamente
		return super.getSaldoB()-mantenimiento;
	}

	@Override
	public void printExt() {
		
		System.out.printf("mantenimiento-%.2f€\ttotal=%.2f€",mantenimiento,calcularSaldoT());
		
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
		return mantenimiento;
	}

}
