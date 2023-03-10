package ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Clase {
	private String curso;
	private Set<Alumno> lista;
	
	public Clase(String curso, Set<Alumno> lista) {
		super();
		this.curso = curso;
		this.lista = lista;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Set<Alumno> getLista() {
		return lista;
	}
	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}
	
	public void mostarTodos() {
		
		for(Alumno a : lista ) {	
			System.out.println(a);
		}
	}
	public void mostrarTodos(Set <Alumno> lista) {
		
		for (Alumno a : lista) {
			System.out.println(a);
		}
		
	}
	public void añadir(Alumno a) {
		lista.add(a);
		
	}
	public void mostrarTodosv2() {
		Iterator<Alumno> it= lista.iterator();
		 while(it.hasNext()) {
			 
			 System.out.println(it.next()); 
		 }
	}
	public double calcularNotaM() {
		double nota=0;
		for (Alumno a : lista) {
			nota+=a.getNotaM();
		}
		if(!lista.isEmpty())
			return nota/lista.size();
		else
			return 0;
	}
	public int cuantosSuspensos() {
		int sus=0, aprobado=5;
		Iterator <Alumno> it= lista.iterator();
		while(it.hasNext()){
			if(it.next().getNotaM()<aprobado)
				sus++;
		}
		return sus;
		
	}
	public Alumno findByDni(String dni) {
		Iterator<Alumno>it = lista.iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			if(a.getDni().equalsIgnoreCase(dni)) {
				return a;
				
			}	
		}
		return null;
		
	}
	public Set<Alumno> findByName(String nombre) {
		Iterator<Alumno>it = lista.iterator();
		Set <Alumno> alum = new HashSet<Alumno>();
		while(it.hasNext()) {
			Alumno a=it.next();
			if(a.getNombre().equalsIgnoreCase(nombre)) {
				alum.add(a);
			}
		}
		
		if(!alum.isEmpty())
			return alum;
		
		return null;
	}
	public void editNotaM(String dni, double nota) {
		findByDni(dni).setNotaM(nota);	
		
	}
	@Override
	public String toString() {
		return "Clase [curso=" + curso + ", lista=" + lista + "]";
	}

	
}
