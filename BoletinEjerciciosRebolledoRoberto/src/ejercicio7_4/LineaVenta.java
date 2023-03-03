package ejercicio7_4;

public class LineaVenta {
	
	private Producto p;
	private int cantidad;
	public LineaVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}
	
	public Producto getP() {
		return p;
	}
	
	public void setP(Producto p) {
		this.p = p;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double calcPrecioT() {
		
		return p.getPrecio()*cantidad;
		
	}
	public void imprimir() {
		
		p.imprimir();
		System.out.print("   ");
		System.out.print(getCantidad());
		System.out.printf("\t│     %.2f€\t│",calcPrecioT() );
		if(p instanceof Ropa) 
			((Ropa) p).printColor();
		else {
			if(p instanceof Alimento) 
				((Alimento) p).printDias();
			else {
				System.out.print("\t\t│");
	
			}
		
		}
			
		System.out.println(" ");
		
		
	}	
	@Override
	public String toString() {
		return "LineaVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}


		
	
}
