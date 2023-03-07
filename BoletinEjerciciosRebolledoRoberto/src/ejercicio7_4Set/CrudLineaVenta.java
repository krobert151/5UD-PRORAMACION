package ejercicio7_4Set;

import java.util.Iterator;
import java.util.Set;

public class CrudLineaVenta {
	
	private Set<LineaVenta> lista;

	public CrudLineaVenta(Set<LineaVenta> lista) {
		super();
		this.lista = lista;
	}

	public Set<LineaVenta> getLista() {
		return lista;
	}

	public void setLista(Set<LineaVenta> lista) {
		this.lista = lista;
	}

	public void add(LineaVenta lv) {
		
		lista.add(lv);
	}
	public void print() {
		
		for (LineaVenta lv : lista) {
			System.out.println(lv.getP()+""+lv.getCant());
		}
		
	}
	public void print(Set<LineaVenta> lista) {
		
		for (LineaVenta lv : lista) {
			System.out.println(lv.getP()+""+lv.getCant());
		}
		
	}
	
	public LineaVenta findById(int id) {
		
		Iterator<LineaVenta> it = lista.iterator();
		
		while(it.hasNext()) {
			LineaVenta lv = it.next();
			if(lv.getP().getId()==id) 
				return lv;
		}
		return null;	
	}
	
	public void modifyPrecio(double precio,int id) {
		
		findById(id).getP().setPreciU(precio);
		
	}
	
	public void del(int id) {
		
		lista.remove(findById(id));
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "CrudLineaVenta [lista=" + lista + "]";
	}
	
	
	
	
	
	
}
