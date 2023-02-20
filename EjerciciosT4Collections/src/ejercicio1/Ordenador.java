package ejercicio1;

public abstract class Ordenador {
	private int numO;
	private String marca;
	private int nucleos;
	private int ram;
	private int hdd;
	private double precio;
	public Ordenador(int numO, String marca, int nucleos, int ram, int hdd, double precio) {
		super();
		this.numO = numO;
		this.marca = marca;
		this.nucleos = nucleos;
		this.ram = ram;
		this.hdd = hdd;
		this.precio = precio;
	}
	public int getNumO() {
		return numO;
	}
	public void setNumO(int numO) {
		this.numO = numO;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNucleos() {
		return nucleos;
	}
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract double calcularPrecio();	
	
	@Override
	public String toString() {
		return "Ordenador [numO=" + numO + ", marca=" + marca + ", nucleos=" + nucleos + ", ram=" + ram + ", hdd=" + hdd
				+ ", precio=" + precio + "]";
	}
	
	
	
}
