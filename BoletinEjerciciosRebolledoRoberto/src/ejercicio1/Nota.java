package ejercicio1;

public class Nota {
	
	private int numNota;
	private String titulo;
	private String contenido;
	public Nota(int numNota, String titulo, String contenido) {
		super();
		this.numNota = numNota;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	public int getNumNota() {
		return numNota;
	}
	public void setNumNota(int numNota) {
		this.numNota = numNota;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Nota [numNota=" + numNota + ", titulo=" + titulo + ", contenido=" + contenido + "]";
	}
	
	
	
	
}
