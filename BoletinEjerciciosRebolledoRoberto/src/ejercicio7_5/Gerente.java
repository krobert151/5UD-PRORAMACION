package ejercicio7_5;

public class Gerente extends Empleado {
		/*Otra clase hija puede ser Gerente, cuyo sueldo es el base, pero al que se le quita un % de impuestos
		(consideraremos que al vendedor no se le quita nada para que el ejercicio tenga algo más de sentido).*/
	
	private double impuestos;

		public Gerente(String nombre, String apellidos, double sueldoB, int numEmp, double impuestos) {
			super(nombre, apellidos, sueldoB, numEmp);
			this.impuestos = impuestos;
		}

		public double getImpuestos() {
			return impuestos;
		}

		public void setImpuestos(double impuestos) {
			this.impuestos = impuestos;
		}

		@Override
		public String toString() {
			return "Gerente [impuestos=" + impuestos + "]";
		}

		@Override
		public double calcularST() {
			// TODO Esbozo de método generado automáticamente
			return super.getSueldoB()-impuestos;
		}
	
	
	
}
