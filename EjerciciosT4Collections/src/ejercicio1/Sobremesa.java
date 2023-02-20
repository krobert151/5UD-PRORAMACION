package ejercicio1;

public class Sobremesa extends Ordenador {

	private double precioMont;
	
	public Sobremesa(int numO, String marca, int nucleos, int ram, int hdd, double precio) {
		super(numO, marca, nucleos, ram, hdd, precio);
		// TODO Esbozo de constructor generado automáticamente
	}

	public double getPrecioMont() {
		return precioMont;
	}

	public void setPrecioMont(double precioMont) {
		this.precioMont = precioMont;
	}
	
	@Override
	public double calcularPrecio() {
		return super.getPrecio()+precioMont;
	}

}
