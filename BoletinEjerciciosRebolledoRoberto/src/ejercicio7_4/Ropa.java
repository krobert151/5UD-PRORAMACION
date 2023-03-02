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

	@Override
	public double calcularPrecio(double iva) {
		// TODO Esbozo de método generado automáticamente
		return super.calcularPrecio(iva);
	}

	@Override
	public String toString() {
		return "Ropa [color=" + color + "]";
	}
		
}
