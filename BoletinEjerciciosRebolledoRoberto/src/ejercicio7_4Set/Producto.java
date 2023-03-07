package ejercicio7_4Set;

public class Producto {
	
	private int id;
	private String nombre;
	private double preciU;
	public Producto(int id, String nombre, double preciU) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.preciU = preciU;
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
	public double getPreciU() {
		return preciU;
	}
	public void setPreciU(double preciU) {
		this.preciU = preciU;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", preciU=" + preciU + "]";
	}
	
	
	
	
}
