package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear una pequeña lista con los datos personales de algunas Personas, y mostrarla por
		pantalla de forma NO ordenada y de forma ordenada (elegid la forma de ordenar vosotros,
		podéis empezar con orden natural, es decir, alfabéticamente y después crear otra “no
		natural”).*/
		int menu;
		List <Persona> lista = new ArrayList <Persona>();
		
		lista.add(new Persona("20202020B","Pepito","Pepitez",60));
		lista.add(new Persona("40404040D","Pepita","Pan",20));
		lista.add(new Persona("30303030C","Guti","Gutierrez",40));
		lista.add(new Persona("10101010A","Manolo","Manolez",50));

		
		do {
			
			System.out.println("1.-Ver lista");
			System.out.println("2.-Ordenar por dni");
			System.out.println("3.-Ordenar por edad");
			menu=Leer.datoInt();
			switch(menu) {
				
			case 1:
				
				for (Persona p : lista) {
					System.out.println(p);
				}
				
				break;
			
			case 2:
				
				Collections.sort( lista);
				for (Persona p : lista) {
					System.out.println(p);
				}
				
				break;
				
			case 3:
				
				Collections.sort(lista, new CompararEdad());
				for (Persona p : lista) {
					System.out.println(p);
				}
				break;
			
			}
			
			
			
		}while(menu!=0);

		

	}

}
