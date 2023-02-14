package ejercicio2;

public class Socio {
	private int numSocio;
	private String nombre;
	private String apellidos;
	private double pago;
	public Socio(int numSocio, String nombre, String apellidos, double pago) {
		super();
		this.numSocio = numSocio;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pago = pago;
	}
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	@Override
	public String toString() {
		return "Socio [numSocio=" + numSocio + ", nombre=" + nombre + ", apellidos=" + apellidos + ", pago=" + pago
				+ "]";
	}
	
	
}
