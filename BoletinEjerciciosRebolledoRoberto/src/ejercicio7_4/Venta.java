package ejercicio7_4;

import java.util.Comparator;

public class Venta implements Comparator <LineaVenta>{
	private Crud crud;
	private String atendio;
	private String tiendaName;
	public Venta(Crud crud, String atendio, String tiendaName) {
		super();
		this.crud = crud;
		this.atendio = atendio;
		this.tiendaName = tiendaName;
	}
	public Crud getCrud() {
		return crud;
	}
	public void setCrud(Crud crud) {
		this.crud = crud;
	}
	public String getAtendio() {
		return atendio;
	}
	public void setAtendio(String atendio) {
		this.atendio = atendio;
	}
	public String getTiendaName() {
		return tiendaName;
	}
	public void setTiendaName(String tiendaName) {
		this.tiendaName = tiendaName;
	}
	
	public void imprimirTicket() {
		System.out.println("\n\nTienda: "+getTiendaName());
		System.out.println("\nAtendido por: "+getAtendio()+"\n");
		crud.imprimir();
		System.out.println("\nGracias por su compra\n\n");
	}
	@Override
	public int compare(LineaVenta o1, LineaVenta o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
