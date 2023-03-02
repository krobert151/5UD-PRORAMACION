package ejercicio7_4;

import java.util.Map;

public class Crud {
	private Map<Integer, LineaVenta> lista;

	public Crud(Map<Integer, LineaVenta> lista2) {
		super();
		this.lista = lista2;
	}

	public Map<Integer, LineaVenta> getLista() {
		return lista;
	}

	public void setLista(Map<Integer, LineaVenta> lista) {
		this.lista = lista;
	}

	public void add (Integer i, LineaVenta l) {
		
		lista.put(i, l);
		
	}
	public void imprimir() {
		
		for (Integer i : lista.keySet()) {
			System.out.println("nº"+i+"\t\t"+lista.get(i));
		}
		
	}
	
	@Override
	public String toString() {
		return "Crud [lista=" + lista + "]";
	}
	
	
	
}
