package ejercicio3;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar
	y borrar los que se quiera de forma individual, es decir, el usuario debe decir quién quiere
	mostrar, modificar o borrar. Se puede crear otra clase con funcionalidades como sacar nota
	media del curso, dar el número de suspensos en total, media de suspensos, etc. Usa la
	interfaz Set implementada por HashSet.*/
		String curso="1DAM",dni,nombre,apellidos;
		int menu,edad;
		double notaM;
		Set <Alumno > alumnos = new HashSet <Alumno>();
		Clase dam = new Clase(curso,alumnos);
		alumnos.add(new Alumno("20202020S","Mamonlo","Joe",20,9.5));
		alumnos.add(new Alumno("30303030Q","Federico","Fandaro",22,8.5));
		alumnos.add(new Alumno("40404040A","Federico","Fandaro",21,7.5));
		alumnos.add(new Alumno("50505050B","Manola","Joe",23,6.5));
		alumnos.add(new Alumno("60606060H","Manola","Fandaro",24,5.5));
		alumnos.add(new Alumno("70707070N","Manola","JHoe",25,4.5));
		alumnos.add(new Alumno("80808080K","Ese","Joe",32,3.5));

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
				System.out.println(dam.findByDni(dni));
				
				break;
				
			case 5:
				System.out.println("Introduce el DNI");
				dni=Leer.dato();
				System.out.println("introduce la nota Media");
				notaM=Leer.datoDouble();
				dam.editNotaM(dni, notaM);
				
				break;
				
			case 6:
				System.out.println("Introduzca el nombre del alumno");
				nombre=Leer.dato();
				dam.mostrarTodos(dam.findByName(nombre));
				
				break;
				
			case 7:
				System.out.println("Introduzca dni");
				dni=Leer.dato();
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca apellidos");
				apellidos=Leer.dato();
				System.out.println("Introduzca edad");
				edad=Leer.datoInt();
				System.out.println("Introduzca nota media");
				notaM=Leer.datoDouble();
				dam.añadir(new Alumno(dni, nombre,apellidos,edad,notaM));
							
				break;
				
			case 8:
				
				
				
				
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
		System.out.println("5.-Modificar notaM");
		System.out.println("6.-Buscar por nombre");
		System.out.println("7.-Añadir alumno");
		System.out.println("8.-Ordenar por nota media");
	}

}
