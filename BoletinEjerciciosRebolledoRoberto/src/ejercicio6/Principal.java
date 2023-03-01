package ejercicio6;
        
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;
        
public class Principal {
        
	public static void main(String[] args) {
		/*Crear una clase Trabajador con los siguientes atributos:
		Nombre, DNI, Horas trabajadas y sueldo final (este se puede calcular de cualquier manera
		sencilla de las que hemos visto anteriormente).
		Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados según
		el número de horas trabajadas (de menor a mayor y viceversa) o según el sueldo (del que
		menos al que más cobra). Se deben usar las interfaces comparable y/o comparator.*/
		double sueldoHora=25;
		int menu,horas;
		String nombre, dni;
		List <Trabajador> lista = new ArrayList <Trabajador>();
		
		lista.add(new Trabajador("Manolo","10101010A",50));
		lista.get(lista.size()-1).calcularSaldo(sueldoHora);
		lista.add(new Trabajador("Pan","20202020B",70));
		lista.get(lista.size()-1).calcularSaldo(sueldoHora);
		lista.add(new Trabajador("Montero","00000000Z",1));
		lista.get(lista.size()-1).calcularSaldo(sueldoHora);
		lista.add(new Trabajador("Julio","30303030C",100));
		lista.get(lista.size()-1).calcularSaldo(sueldoHora);
		lista.add(new Trabajador("Patapan","99999999X",2));
		lista.get(lista.size()-1).calcularSaldo(sueldoHora);
		
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				
				break;
			case 2:
				
				System.out.println("Seleccione el nombre del nuevo trabajador");
				nombre=Leer.dato();
				System.out.println("Seleccione el dni del trabajador");
				dni=Leer.dato();
				System.out.println("Seleccione las horas trabajadas");
				horas=Leer.datoInt();
				lista.add(new Trabajador (nombre,dni,horas));
				lista.get(lista.size()-1).calcularSaldo(sueldoHora);
				
				break;
			
			case 3:
				
				Collections.sort(lista, new CompararMasH());
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				break;
			case 4:
				
				Collections.sort(lista, new CompararMenosH());
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				
				break;
			case 5:
				
				Collections.sort(lista);
				for (Trabajador t : lista) {
					System.out.println(t);
				}
				
				break;
			
			}
						
		}while(menu!=0);
				
	}   
	public static void menu() {
		
		System.out.println("1.-Ver trabajadores");
		System.out.println("2.-Añadir trabajador");
		System.out.println("3.-Ver trabajadores por horas trabajadas asx");
		System.out.println("4.-Ver trabajadores por horas trabajadas desc");
		System.out.println("5.-Ver por el que mas cobra");
				
	}   
        
}       
