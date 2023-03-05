package ejercicio7_5;


public class Oficina {
	private CrudEmpleado crud;
	private String nombre;
	private double gastoEmp;
	public Oficina(CrudEmpleado crud, String nombre, double gastoEmp) {
		super();
		this.crud = crud;
		this.nombre = nombre;
		this.gastoEmp = gastoEmp;
	}
	public CrudEmpleado getCrud() {
		return crud;
	}
	public void setCrud(CrudEmpleado crud) {
		this.crud = crud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getGastoEmp() {
		return gastoEmp;
	}
	public void setGastoEmp(double gastoEmp) {
		this.gastoEmp = gastoEmp;
	}
	

	
	
	
	@Override
	public String toString() {
		return "Oficina [crud=" + crud + ", nombre=" + nombre + ", gastoEmp=" + gastoEmp + "]";
	}
	
	
	
	
}
