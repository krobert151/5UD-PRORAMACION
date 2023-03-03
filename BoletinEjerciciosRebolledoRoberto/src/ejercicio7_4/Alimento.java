package ejercicio7_4;

public class Alimento extends Producto {
	private int diasCd;

	public Alimento(int id, String nombre, double precio, int diasCd) {
		super(id, nombre, precio);
		this.diasCd = diasCd;
	}

	public int getDiasCd() {
		return diasCd;
	}

	public void setDiasCd(int diasCd) {
		this.diasCd = diasCd;
	}
	
	public void printDias() {
		
		System.out.print("diasCaduca="+diasCd+"\t│");
	}
	
	@Override
	public void calcularPrecio(double iva) {
		if(diasCd<3)
			 super.calcularPrecio(1);
		else
			 super.calcularPrecio(iva);
	}

	@Override
	public String toString() {
		return "Alimento [diasCd=" + diasCd + "]";
	}

	
	
	
	
}
