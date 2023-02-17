package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son
		calificaciones de clase). Usaremos la clase ArrayList y el listado debe guardar objetos tipo
		Nota (tú decides los atributos que debe tener una nota). Se podrán mostrar de manera
		individual (sin necesidad de buscar, solo diciendo cuál de la lista mostrada), dar información
		del número de notas guardadas, agregar una nueva nota, un método que borre una de las
		notas guardadas comprobando antes que la lista no está vacía. Se borrará por número (la
		nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con todas las notas (en un
		método) y su número correspondiente, el usuario introducirá el número de la que quiera
		borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas ¿y si hay miles
		de ellas?). */
		int menu, numNota=4,num;
		String titulo, contenido;
		Nota a = new Nota (1,"Ejemplo","nota de ejemplo");
		Nota b = new Nota (2,"Ejemplo 1","nota de ejemplo1");
		Nota c = new Nota (3,"Ejemplo 2","nota de ejemplo2");

		
		List <Nota> listaNotas = new ArrayList <Nota>();
		
		listaNotas.add(a);
		listaNotas.add(b);
		listaNotas.add(c);
			
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				
				for (Nota nota : listaNotas) {
			        System.out.println("ID: " + nota.getNumNota());
			        System.out.println("Título: " + nota.getTitulo());
			        System.out.println("Contenido: " + nota.getContenido());
			        System.out.println("------------------------");
			    }
				
				break;
			
			case 2:
				
				System.out.println("La longuitud de la lista es de "+listaNotas.size());
				
				break;
			
			case 3:
				
				System.out.println("Introduzca el titulo para la nota");
				titulo=Leer.dato();
				System.out.println("Introduzca la nota");
				contenido=Leer.dato();
				listaNotas.add(new Nota(numNota,titulo,contenido));
				numNota++;				
				
				break;
				
			case 4:
				
				System.out.println("Seleccione el numero de la nota que quieres borrar");
				num=Leer.datoInt();
				listaNotas.remove(num-1);
				
					
				
				break;
				
			case 5:
				
				System.out.println("Seleccione el numero de la nota que quieres ver");
				num=Leer.datoInt();
				listaNotas.get(num-1);
				
				break;
				
				
			}
			
		}while(menu!=0);
		
		
	}
	public static void menu() {
		
		System.out.println("1.-Ver notas");
		System.out.println("2.-Contar notas");
		System.out.println("3.-Añadir nota");
		System.out.println("4.-Borrar nota");
		System.out.println("5.-Ver la nota");
	}
}
