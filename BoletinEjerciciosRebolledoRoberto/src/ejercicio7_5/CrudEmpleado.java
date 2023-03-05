package ejercicio7_5;

import java.util.Set;

public class CrudEmpleado{
	private Set <Empleado> lista;

	public CrudEmpleado(Set<Empleado> lista) {
		super();
		this.lista = lista;
	}

	public Set<Empleado> getLista() {
		return lista;
	}

	public void setLista(Set<Empleado> lista) {
		this.lista = lista;
	}

	
	public void add(Empleado Emp) {
		
		lista.add(Emp);
		
	}
	public void print() {
		
		for (Empleado e : lista) {
			
			System.out.printf(".-%d\t%s\t%s\t%.2f€\t",e.getNumEmp(),e.getNombre(),e.getApellidos(),e.getSueldoB());
			if(e instanceof Vendedor)
				System.out.printf("cant %d\tincentivo %.2f€ \tSueldoTotal=%.2f€\n",((Vendedor) e).getVentas(),((Vendedor) e).getIncentivo(),((Vendedor)e).calcularST());
			if(e instanceof Gerente)
				System.out.printf("impuestos %.2f \t\tSueldoTotal=%.2f€\n",((Gerente) e).getImpuestos(),((Gerente)e).calcularST());
		}
	}
	public void print(Set <Empleado> lista) {
		
		for (Empleado e : lista) {
			
			System.out.printf(".-%d\t%s\t%s\t%.2f€\t",e.getNumEmp(),e.getNombre(),e.getApellidos(),e.getSueldoB());
			if(e instanceof Vendedor)
				System.out.printf("cant %d\tincentivo %.2f€ \tSueldoTotal=%.2f€\n",((Vendedor) e).getVentas(),((Vendedor) e).getIncentivo(),((Vendedor)e).calcularST());
			if(e instanceof Gerente)
				System.out.printf("impuestos %.2f \t\tSueldoTotal=%.2f€\n",((Gerente) e).getImpuestos(),((Gerente)e).calcularST());
		}
		
	}
	public double calcularCoste() {
		double coste=0;
		for (Empleado e : lista) {
			coste+=e.getSueldoB();
		}
		return coste;
		
	}
	public Empleado findById(int id) {
		
		for (Empleado e : lista) {
			if(e.getNumEmp()==id)
				return e;
			
		}
		return null;
	}
	public void delete(int id) {
		
		lista.remove(findById(id));
		
	}
	
	@Override
	public String toString() {
		return "CrudEmpleado [lista=" + lista + "]";
	}


	
	
	
}

