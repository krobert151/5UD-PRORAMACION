package ejercicio2;

import java.util.List;

public class Crud {
	private List<Socio> lista;

	public Crud(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Crud [lista=" + lista + "]";
	}
	
	public void agregar(Socio s) {
		lista.add(s);		
	}
	public void eliminar(Socio s) {
		lista.remove(s);
	}
	/*Si en este metodo busco un número, primero tendré que buscarlo*/
	public Socio findBynum(int num) {
		int i=0;
		boolean verda = false;
		while(!verda&&i<lista.size()) {
			
			if(num==lista.get(i).getNumSocio()) 
				verda=true;
			else
				i++;	
			
		}
		if(verda)
			return lista.get(i);
		else
			return null;		
	}
	public void editar(int num, double nuevaCuota) {
		Socio s= findBynum(num);
		s.setPago(nuevaCuota);
	}
	
	
}	
