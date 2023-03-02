package ejercicio7_4;

public class Venta {
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
		
		crud.imprimir();
		
	}
	
}
