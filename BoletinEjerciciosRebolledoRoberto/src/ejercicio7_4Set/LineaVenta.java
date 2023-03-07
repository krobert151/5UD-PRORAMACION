package ejercicio7_4Set;

public class LineaVenta implements Comparable <LineaVenta>{
	private Producto p;
	private int cant;
	public LineaVenta(Producto p, int cant) {
		super();
		this.p = p;
		this.cant = cant;
	}
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	@Override
	public String toString() {
		return "CrudLineaVenta [p=" + p + ", cant=" + cant + "]";
	}
	@Override
	public int compareTo(LineaVenta o) {
		// TODO Auto-generated method stub
		if(this.p.getPreciU()>o.getP().getPreciU())
			return 1;
		else {
			if (this.p.getPreciU()<o.getP().getPreciU())
				return -1;
			else
				return 0;
		}
	}
	
	
}
