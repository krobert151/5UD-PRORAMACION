package ejercicio1;

public class Cancion implements Comparable<Cancion>{
	
	private int id;
	private String titulo;
	private String interprete;
	private int numEscuchas;
	private boolean gratis;
	private double duracionMin;
	public Cancion(int id, String titulo, String interprete, int numEscuchas, boolean gratis, double duracionMin) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.numEscuchas = numEscuchas;
		this.gratis = gratis;
		this.duracionMin = duracionMin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getNumEscuchas() {
		return numEscuchas;
	}
	public void setNumEscuchas(int numEscuchas) {
		this.numEscuchas = numEscuchas;
	}
	public boolean isGratis() {
		return gratis;
	}
	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}
	public double getDuracionMin() {
		return duracionMin;
	}
	public void setDuracionMin(double duracionMin) {
		this.duracionMin = duracionMin;
	}
	public void print() {
		
		System.out.printf("id-%d|  %s / %s - %.2f min - Escuchadas %d veces - gratis=%b\n",id,interprete,titulo,duracionMin,numEscuchas,gratis);
		
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", numEscuchas="
				+ numEscuchas + ", gratis=" + gratis + ", duracionMin=" + duracionMin + "]";
	}
	@Override
	public int compareTo(Cancion o) {
		// TODO Auto-generated method stub
		return this.interprete.compareTo(o.getInterprete());
	}
	
	
	
	
	
}
