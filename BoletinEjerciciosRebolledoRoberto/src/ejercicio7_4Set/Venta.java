package ejercicio7_4Set;

public class Venta {
	
	private String nombre;
	private String atendido;
	private CrudLineaVenta crud;
	public Venta(String nombre, String atendido, CrudLineaVenta crud) {
		super();
		this.nombre = nombre;
		this.atendido = atendido;
		this.crud = crud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAtendido() {
		return atendido;
	}
	public void setAtendido(String atendido) {
		this.atendido = atendido;
	}
	public CrudLineaVenta getCrud() {
		return crud;
	}
	public void setCrud(CrudLineaVenta crud) {
		this.crud = crud;
	}
	@Override
	public String toString() {
		return "Venta [nombre=" + nombre + ", atendido=" + atendido + ", crud=" + crud + "]";
	}
	
	
	
}
