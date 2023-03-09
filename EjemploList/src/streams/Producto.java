package streams;

public class Producto implements Comparable <Producto>{
	
	private int id;
	private String nombre;
	private double precioU;
	public Producto(int id, String nombre, double precioU) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioU = precioU;
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
	public double getPrecioU() {
		return precioU;
	}
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precioU=" + precioU + "]";
	}
	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		if(this.precioU>o.getPrecioU())
			return 1;
		else {
			if(this.precioU<o.getPrecioU())
				return -1;
			else
				return 0;			
		}
	}
	
	
	
}
