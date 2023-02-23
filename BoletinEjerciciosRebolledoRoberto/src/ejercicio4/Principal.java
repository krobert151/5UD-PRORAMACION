package ejercicio4;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
		int i;
		Map <Contacto,Integer> lista = new HashMap <Contacto,Integer>();
		
		Agenda ag = new Agenda(lista);
		
		ag.agregar(111111111, new Contacto(1,"pepito","pepito@"));
		ag.agregar(222222222, new Contacto(2,"manue","manue@"));
		ag.agregar(333333333, new Contacto (3,"manola","manola@"));
		
		ag.mostrarTodos();
		
		System.out.println("num");
		i=Leer.datoInt();
		System.out.println(ag.findById(i));

		Map<Contacto,Integer>tLista=new TreeMap <Contacto,Integer>(lista);
		System.out.println(tLista);
		Map<Contacto,Integer>tLista2=new TreeMap <Contacto,Integer>(new OrdenarPorNombre());
		System.out.println(tLista2);
		
	}

}
