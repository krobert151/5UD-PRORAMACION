package ejercicio7_5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear una clase Empleado con los atributos nombre, apellidos, sueldo base y nº de Empleado.
		Introducir los métodos necesarios y oportunos.
		Crear una clase derivada de ella, llamada Vendedor que tenga como atributos la cantidad de ventas y
		un incentivo (un porcentaje de las ventas realizadas en un mes sumado a su sueldo base) y los métodos
		apropiados para manejarla.
		Otra clase hija puede ser Gerente, cuyo sueldo es el base, pero al que se le quita un % de impuestos
		(consideraremos que al vendedor no se le quita nada para que el ejercicio tenga algo más de sentido).
		Crear una clase Oficina caracterizada por una lista de Empleados donde se incluya un método que
		calcule el sueldo de un empleado pasándole como parámetro un empleado y otro método que calcule
		lo gastado por la oficina en total por el pago de sueldos a todos los empleados.
		Probar el programa en una clase principal, instanciando un array de empleados guardando varios tipos
		incluyendo un empleado genérico y mostrando su sueldo. Si el empleado es un vendedor se le debe
		felicitar con un mensaje por pantalla cuando haya vendido más de una cantidad pasada como parámetro
		que será su objetivo de ventas.*/
		String nombreOf="La Riberilla 2",nombre,apellidos;
		int menu,id,ventas;
		double sueldoB,incentivo,impuesto;
		Set <Empleado> lista = new HashSet <Empleado>();
		CrudEmpleado crud = new CrudEmpleado (lista);
		Oficina ofi = new Oficina (crud,nombreOf,0);
		
		ofi.getCrud().add(new Vendedor("Juan     ", "Pérez    ", 2000, 1001, 10, 50));
		ofi.getCrud().add(new Vendedor("María    ", "González ", 2200, 1002, 20, 100) );
		ofi.getCrud().add(new Vendedor("Pedro    ", "López    ", 1900, 1003, 15, 75));
		ofi.getCrud().add(new Vendedor("Laura    ", "Sánchez  ", 2100, 1004, 30, 150));
		ofi.getCrud().add(new Vendedor("Javier   ", "Martínez ", 1800, 1005, 5, 25));
		ofi.getCrud().add(new Vendedor("Ana      ", "Hernández", 1900, 1006, 10, 50));
		ofi.getCrud().add(new Vendedor("Luis     ", "Fernández", 1950, 1007, 25, 125));
		ofi.getCrud().add(new Vendedor("Carla    ", "Ruiz     ", 2300, 1008, 15, 75));
		ofi.getCrud().add(new Vendedor("Sofía    ", "Díaz     ", 2100, 1009, 20, 100));
		ofi.getCrud().add(new Vendedor("Diego    ", "Gómez    ", 2000, 1010, 10, 50));
		ofi.getCrud().add(new Vendedor("Alejandro", "Alonso   ", 1900, 1011, 5, 25));
		ofi.getCrud().add(new Vendedor("Carmen   ", "García   ", 2400, 1012, 35, 175));
		ofi.getCrud().add(new Vendedor("Antonio  ", "Jiménez  ", 1800, 1013, 5, 25));
		ofi.getCrud().add(new Vendedor("Isabel   ", "Torres   ", 2200, 1014, 20, 100));
		ofi.getCrud().add(new Vendedor("Gabriela ", "Ramos    ", 2000, 1015, 10, 50));
		ofi.getCrud().add(new Gerente ("Jorge    ", "Sánchez  ", 3000, 2001, 500));
		ofi.getCrud().add(new Gerente ("Lorena   ", "Gómez    ", 3200, 2002, 700));
		
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				ofi.getCrud().print();
				break;
			case 2:
				System.out.println("Introduzca el id del empleado");
				id=Leer.datoInt();
				System.out.println("Introduzca el nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca el apellido");
				apellidos=Leer.dato();
				System.out.println("Introduzca su suelod base");
				sueldoB=Leer.datoDouble();
				System.out.println("Introduzca la cantidad de ventas");
				ventas=Leer.datoInt();
				System.out.println("Introduzca el incentivo");
				incentivo=Leer.datoDouble();
				
				ofi.getCrud().add(new Vendedor(nombre,apellidos,sueldoB,id,ventas,incentivo));
				
				break;
			case 3:
				System.out.println("Introduzca el id del empleado");
				id=Leer.datoInt();
				System.out.println("Introduzca el nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca el apellido");
				apellidos=Leer.dato();
				System.out.println("Introduzca su suelod base");
				sueldoB=Leer.datoDouble();
				System.out.println("Introduzca el impuesto");
				impuesto=Leer.datoDouble();
				
				ofi.getCrud().add(new Gerente(nombre,apellidos,sueldoB,id,impuesto));
				
				break;
			case 4:
				
				System.out.println("Introduzca el id del empleado");
				id=Leer.datoInt();
				ofi.getCrud().delete(id);				
				break;
				
			case 5:

				Set <Empleado> idlist = new TreeSet <Empleado>(new OrdenarPorId());
				idlist.addAll(lista);
				ofi.getCrud().print(idlist);
				
				break;
			case 6:
				
				System.out.printf("El mantener a todos los empleados le custa a la oficina un total de %.2f€\n",ofi.getCrud().calcularCoste());
				
				break;
			
			
			}
			
			
			
		}while(menu!=0);
		
		
	}
	public static void menu() {
		
		System.out.println("1.-Mostrar Lista");
		System.out.println("2.-Añadir Empleado");
		System.out.println("3.-Añadir Gerente");
		System.out.println("4.-Eliminar un empleado");
		System.out.println("5.-Ordenar por id");
		System.out.println("6.-Calcular el mantenimiento de los empleados");
		
		
		
	}

}
