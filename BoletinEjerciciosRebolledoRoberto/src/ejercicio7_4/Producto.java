package ejercicio7_4;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	
	public Producto(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void calcularPrecio(double iva) {
		precio= precio +precio*iva/100;
	}
	public void imprimir() {
		
		System.out.printf("│%d│%s\t│   %.2f€\t│",id,nombre,precio);
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
