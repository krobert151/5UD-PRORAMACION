package ejercicio7_6;

import java.util.Map;

public class CrudCuenta {
	Map <String,Cuenta> lista;

	public CrudCuenta(Map<String, Cuenta> lista) {
		super();
		this.lista = lista;
	}

	public Map<String, Cuenta> getLista() {
		return lista;
	}

	public void setLista(Map<String, Cuenta> lista) {
		this.lista = lista;
	}

	
	public void add(String user, Cuenta cuenta) {
		
		lista.put(user, cuenta);
		
	}
	
	public void print() {
		
		for (String c : lista.keySet()) {
			
			System.out.print(c+"\t");
			lista.get(c).print();
			
			if(lista.get(c) instanceof CuentaCorriente)
				lista.get(c).printExt();
			if(lista.get(c) instanceof CuentaJoven)
				lista.get(c).printExt();
			if(lista.get(c) instanceof CuentaEmpresa)
				lista.get(c).printExt();
			
			System.out.println(" ");
		}
	}
	
	public void printCC() {
		
		for (String c : lista.keySet()) {
			
			if(lista.get(c) instanceof CuentaCorriente) {
				System.out.print(c+"\t");
				lista.get(c).print();
				lista.get(c).printExt();
				System.out.println(" ");
			}
		}	
	}
	
	public void printCJ() {
		
		for (String c : lista.keySet()) {
			
			if(lista.get(c) instanceof CuentaJoven) {
				System.out.print(c+"\t");
				lista.get(c).print();
				lista.get(c).printExt();
				System.out.println(" ");
			}
		}
	}
	
	public void printCE() {
		
		for (String c : lista.keySet()) {
			
			if(lista.get(c) instanceof CuentaEmpresa) {
				System.out.print(c+"\t");
				lista.get(c).print();
				lista.get(c).printExt();
				System.out.println(" ");
			}
		}	
	}
	
	public void del(String key) {
		
		lista.remove(key);
	}
	
	public Cuenta findByKey(String key) {
		
		if(lista.containsKey(key))
			return lista.get(key);
		else
			return null;
		
	}
	public void ingresarDinero(String key, double ingreso) {
		
		findByKey(key).ingresarDinero(ingreso);
	}
	
	public void reintegrarDinero(String key, double reintegro) {
		
		findByKey(key).reintegrarDinero(reintegro);
	}
	
	@Override
	public String toString() {
		return "CurdCuenta [lista=" + lista + "]";
	}
	
	
	
}
