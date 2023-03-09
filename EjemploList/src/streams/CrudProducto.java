package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CrudProducto {
	
	private List <Producto> lista;

	public CrudProducto(List<Producto> lista) {
		super();
		this.lista = lista;
	}

	public List<Producto> getLista() {
		return lista;
	}

	public void setLista(List<Producto> lista) {
		this.lista = lista;
	}

	public void add(Producto p) {
		
		lista.add(p);
		
	}
	public void print(List<Producto> lista) {
		
		for (Producto p : lista) {
			System.out.println(p);
		}
		
	}

	public List<Producto> empiezaPor(String a) {
		
		return lista.stream().filter(x -> x.getNombre().startsWith(a.toUpperCase())).collect(Collectors.toList());
				
	}
	public List<Producto> ordenarPorPrecio() {
		
		 return lista.stream().sorted().collect(Collectors.toList());
		
	}
	public List<Producto> findLow(double precio) {
		
		return lista.stream().filter(x -> x.getPrecioU()< precio).collect(Collectors.toList());
		 
	}
	public Producto findFirst(double precio) {
		
		if(!lista.stream().filter(x -> x.getPrecioU()==precio).findFirst().isEmpty())
			return lista.stream().filter(x -> x.getPrecioU()==precio).findFirst().get();
		else
			return null;
		
	}
	
	@Override
	public String toString() {
		return "CrudProducto [lista=" + lista + "]";
	}

	
	
}
