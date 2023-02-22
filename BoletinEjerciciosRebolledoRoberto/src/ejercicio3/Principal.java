package ejercicio3;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar
	y borrar los que se quiera de forma individual, es decir, el usuario debe decir quién quiere
	mostrar, modificar o borrar. Se puede crear otra clase con funcionalidades como sacar nota
	media del curso, dar el número de suspensos en total, media de suspensos, etc. Usa la
	interfaz Set implementada por HashSet.*/
		String curso="1DAM",dni,nombre,apellido;
		int menu;
		double notaM;
		Set <Alumno > alumnos = new HashSet <Alumno>();
		Clase dam = new Clase(curso,alumnos);
		alumnos.add(new Alumno("20202020S","Mamonlo","Manolez",20,4.5));
		alumnos.add(new Alumno("30303030Q","Federico","Fandaro",22,5.5));
		
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				
				dam.mostrarTodosv2();
				
				break;
			
			case 2:
				
				System.out.println(dam.calcularNotaM());
				
				break;
			case 3:
				
				System.out.println(dam.cuantosSuspensos());
				
				break;
				
			case 4:
				System.out.println("Introduzca DNI");
				dni=Leer.dato();
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduce apellidos");
				apellido=Leer.dato();
				System.out.println();
				
				break;
			default:
				
				break;
			case 0:
				
				break;
			
			}
			
			
		}while(menu!=0);
		dam.mostrarTodosv2();
		
		
	}
	public static void menu() {
		System.out.println("1.-Mostrar");
		System.out.println("2.-Calcular nota media");
		System.out.println("3.-Mostrar Suspensos");
		System.out.println("4.-Mostrar uno");		
		
	}
}
