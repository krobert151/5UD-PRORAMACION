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

	
	
}
