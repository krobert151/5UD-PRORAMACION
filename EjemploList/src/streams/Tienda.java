package streams;

public class Tienda {
	
	private String nombre;
	private CrudProducto crud;
	public Tienda(String nombre, CrudProducto crud) {
		super();
		this.nombre = nombre;
		this.crud = crud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CrudProducto getCrud() {
		return crud;
	}
	public void setCrud(CrudProducto crud) {
		this.crud = crud;
	}
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", crud=" + crud + "]";
	}
	
	
	
}
