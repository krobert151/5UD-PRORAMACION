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

	@Override
	public double calcularPrecio(double iva) {
		if(diasCd<3)
			return super.calcularPrecio(1);
		else
			return super.calcularPrecio(iva);
	}

	@Override
	public String toString() {
		return "Alimento [diasCd=" + diasCd + "]";
	}

	
	
	
	
}
