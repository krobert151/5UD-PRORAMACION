package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el
		número de teléfono como valor). Crear aquellos métodos que se utilizan normalmente en
		una agenda, como agregar, borrar, mostrar, buscar por algún criterio (por ejemplo, por
		nombre), modificar algún dato, etc. Y un main para probar todo.
		*/
		int tlfn,menu,i=1,num;
		String nombre,email;
		Map <Contacto,Integer> lista = new HashMap <Contacto,Integer>();
		
		Agenda ag = new Agenda(lista);
		
		ag.agregar(111111111, new Contacto(i,"pepito","pepito@"));
		i++;
		ag.agregar(222222222, new Contacto(i,"manue","manue@"));
		i++;
		ag.agregar(333333333, new Contacto (i,"manola","manola@"));
		i++;
		
		ag.mostrarTodos();
		
		

		Map<Contacto,Integer>tLista=new TreeMap <Contacto,Integer>(lista);
		System.out.println(tLista);
		Map<Contacto,Integer>tLista2=new TreeMap <Contacto,Integer>(new OrdenarPorNombre());
		tLista2.putAll(lista);
		System.out.println(tLista2);
		
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				System.out.println("Introduzca el nº de tlfn");
				tlfn=Leer.datoInt();
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca email");
				email=Leer.dato();
				ag.agregar(tlfn, new Contacto(i,nombre,email));
				i++;
								
				break;
			case 2:
				
				ag.mostrarTodos();
				
				break;
			case 3:
				System.out.println("Seleccione el id del contacto");
				num=Leer.datoInt();
				ag.borrar(num);
				
				break;
			case 4:
				System.out.println("Seleccione el id del contacto");
				num=Leer.datoInt();
				System.out.println("Selecicone el nuevo nombre del contacto");
				nombre=Leer.dato();
				ag.editarNombre(num, nombre);
				
				break;
			
			case 5:
				System.out.println("Seleccione el id del contacto");
				num=Leer.datoInt();
				System.out.println("Seleccione el correo del contacto");
				email=Leer.dato();
				ag.editarCorreo(num, email);
				
				break;
			
			case 6:
				
				ag.mostrarTodos(tLista);
				
				break;
			case 7:
				
				ag.mostrarTodos(tLista2);
				
				break;
			
			}
			
		}while(menu!=0);
		
		
	}
	public static void menu() {
		System.out.println("1.-Añadir contacto");
		System.out.println("2.-Ver agenda");
		System.out.println("3.-Borrar contacto");
		System.out.println("4.-Editar nombre");
		System.out.println("5.-Editar Correo");
		System.out.println("6.-Ver agenda por orden de id");
		System.out.println("7.-Ver agenda por orden alfabético");
	}

}
