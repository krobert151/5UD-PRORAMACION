package streams;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
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
	public void noTiene(String nombre) {
		if(!lista.stream().noneMatch(x -> x.getNombre().equalsIgnoreCase(nombre)))
			System.out.println("hay"+nombre);
		else
			System.out.println("no hay");
		
	}
	public void todosSon(double precio) {
		
		if(lista.stream().allMatch(x -> x.getPrecioU()<precio))
			System.out.println("todos son mas baratos");
		else
			System.out.println("Hay al menos 1 que es mas caro");
			
		
	}
	public Producto mostExpensive() {
		
		return lista.stream().max((x,y) -> x.getPrecioU()>y.getPrecioU()?1:(x.getPrecioU()<y.getPrecioU()?-1:0)).get();
		
	}
	public Producto cheapest() {
		
		return lista.stream().min((x,y) -> x.getPrecioU()>y.getPrecioU()?1:(x.getPrecioU()<y.getPrecioU()?-1:0)).get();

		
	}
	public void reduceSimple() {
		
		System.out.println(lista.stream()
				.map(x -> x.getNombre().concat(" - "))
				.reduce("Productos que hay disponible", (x, y) -> x+y ));
		
	}
	public void reduceOptional() {
		
		System.out.println(lista.stream()
				.map(x-> x.getNombre().concat(" - "))
				.reduce((x,y)-> x+y).get());
		
	}
	public void reduceComplex() {
		BiFunction<Double,Producto,Double> func= (x1,x2) -> x1+x2.getPrecioU(); 
		
		lista.stream().reduce("Precios Con descuentos", func, (x1,x2)->x1+x2);
		
	}
	@Override
	public String toString() {
		return "CrudProducto [lista=" + lista + "]";
	}

	
	
}
