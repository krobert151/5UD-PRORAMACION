package ejercicio7_4;

import java.util.Iterator;
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

	public void add (Integer i, LineaVenta l,double iva) {
		
		lista.put(i, l);
		l.getP().calcularPrecio(iva);
		
	}
	
	public void del(int i) {
		
		lista.remove(i);
		
	}
	
	public void imprimir() {
		System.out.println("┌───────┬───┬───────────────────┬───────────────┬───────┬───────────────┬───────────────┐");
		System.out.println("│  ID   │num│       Nombre      │     Precio    │ units │    Precio F   │     Extra     │"); 
		System.out.println("├───────┼───┼───────────────────┼───────────────┼───────┼───────────────┼───────────────┤");
		for (Integer i : lista.keySet()) {
			System.out.print("│   "+i+"\t");
			lista.get(i).imprimir();
		}
		System.out.println("└───────┴───┴───────────────────┴───────────────┴───────┴───────────────┴───────────────┘");

	}
	public void imprimir(Map <Integer,LineaVenta> lista) {
		System.out.println("┌───────┬───┬───────────────────┬───────────────┬───────┬───────────────┬───────────────┐");
		System.out.println("│  ID   │num│       Nombre      │     Precio    │ units │    Precio F   │     Extra     │"); 
		System.out.println("├───────┼───┼───────────────────┼───────────────┼───────┼───────────────┼───────────────┤");
		for (Integer i : lista.keySet()) {
			System.out.print("│   "+i+"\t");
			lista.get(i).imprimir();
		}
		System.out.println("└───────┴───┴───────────────────┴───────────────┴───────┴───────────────┴───────────────┘");
		
	}
	public LineaVenta findById(int id) {
		LineaVenta l;
		Iterator<LineaVenta> it=lista.values().iterator();
		while(it.hasNext()) {
			l=it.next();
			if(l.getP().getId()==id) {
				return l;	
			}
		}
		return null;
		
	}
	public LineaVenta findByName(String name) {
		LineaVenta l;
		Iterator<LineaVenta> it=lista.values().iterator();
		while(it.hasNext()) {
			l=it.next();
			if(l.getP().getNombre().equalsIgnoreCase(name)) 
				return l;		
		}
		return null;
	}
	
	public void modifyCant(String name,int cant) {
		LineaVenta l=findByName(name);
		l.setCantidad(cant);
	}
	public void modifyPrecio(String name,double precio) {
		LineaVenta l = findByName(name);
		l.getP().setPrecio(precio);
	}
	public void modifyName(String name,String nombre) {
		LineaVenta l = findByName(name);
		l.getP().setNombre(nombre);
	}
	@Override
	public String toString() {
		return "Crud [lista=" + lista + "]";
	}
	
	
	
}
