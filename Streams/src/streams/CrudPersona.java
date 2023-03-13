package streams;

import java.util.List;

public class CrudPersona {
	
	private List<Persona>lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}
	
	public void add(Persona p) {
		
		lista.add(p);
		
	}
	
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	
	
}
