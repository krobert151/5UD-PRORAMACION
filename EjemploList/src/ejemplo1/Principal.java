package ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		Alumno a= new Alumno ("Miguel", 19,0.1);
		Alumno b= new Alumno ("Angel",47,10);
		
		List <Alumno> listado= new ArrayList <Alumno>(); 
		
		listado.add(0,a);
		listado.add(0,b);
		System.out.println(listado);
		System.out.println(listado.size());
		System.out.println(listado.get(1));
		
		List <String> lista2=new ArrayList <String>();
		lista2.add("Paco");
		lista2.add("Pan");
		System.out.println(lista2);
		
		List <Integer> lista3= new ArrayList <Integer>();
		lista3.add(3);
		lista3.add(4);
		lista3.add(5);
		System.out.println(lista3);
		lista3.remove(0);
		System.out.println(lista3);
		lista3.removeAll(lista3);
		System.out.println(lista3.isEmpty());
	}

}
