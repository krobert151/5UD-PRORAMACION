package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/*Crear una clase Trabajador con los siguientes atributos:
		Nombre, DNI, Horas trabajadas y sueldo final (este se puede calcular de cualquier manera
		sencilla de las que hemos visto anteriormente).
		Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados según
		el número de horas trabajadas (de menor a mayor y viceversa) o según el sueldo (del que
		menos al que más cobra). Se deben usar las interfaces comparable y/o comparator.*/
		double sueldoHora=25;
			
		List <Trabajador> lista = new ArrayList <Trabajador>();
		
		lista.add(new Trabajador("Manolo","10101010A",50));
		
		
		
		
	}

}
