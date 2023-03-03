package ejercicio7_4;

public class Ropa extends Producto {
	private String color;

	public Ropa(int id, String nombre, double precio, String color) {
		super(id, nombre, precio);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printColor() {
		
		System.out.print("color="+color+"\t│");
		
	}
	@Override
	public void calcularPrecio(double iva) {
		// TODO Esbozo de método generado automáticamente
		 super.calcularPrecio(iva);
	}

	@Override
	public String toString() {
		return "Ropa [color=" + color + "]";
	}
		
}
