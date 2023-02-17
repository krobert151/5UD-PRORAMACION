package ejemploMap;

public class Alumno {
	private String nombre;
	private int edad;
	private double notaM;
	public Alumno(String nombre, int edad, double notaM) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notaM = notaM;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getNotaM() {
		return notaM;
	}
	public void setNotaM(double notaM) {
		this.notaM = notaM;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", notaM=" + notaM + "]";
	}
	
}
