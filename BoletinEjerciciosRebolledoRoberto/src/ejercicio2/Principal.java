package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Crear un programa para gestionar los socios de un club de Campo. Se debe poder guardar
		Socios con sus datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos
		(operaciones CRUD). Usar la clase ArrayList. Este ejercicio es para empezar, así que no es
		necesario hacer nada más, aunque se podrían agregar funcionalidades como alquilar pistas,
		pagar cuotas, etc. (¡Para aburridos!).
		Debemos usar la clase Socio, la clase gestión Club y la principal como mínimo. Puedes
		probar a separar "las operaciones CRUD" en una clase CRUDSocio de gestión Club.*/
		
		int menu,numSocio=1, num;
		String nombre, apellidos;
		double dinero;
		List <Socio> listaSocio = new ArrayList<Socio>();
		Crud crud = new Crud (listaSocio);
		GestionClub clb = new GestionClub ("La riberilla 3",crud,10000);
		
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
				
			case 1:
				
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca apellido");
				apellidos=Leer.dato();
				System.out.println("Introduzca el dinero que va a aportar al club");
				dinero =Leer.datoDouble();
				Socio s= new Socio (numSocio,nombre,apellidos,dinero);
				clb.getCrud().agregar(s);
				numSocio++;
				
				break;
				
			case 2:
				
				System.out.println("Introduce el numero de socio");
				num=Leer.datoInt();
				System.out.println(clb.getCrud().findBynum(num));
				break;
			
			case 3:
				System.out.println("Introduce el numero de socio que quieras modificar");
				num=Leer.datoInt();
				System.out.println("Seleccione el nuevo nombre");
				nombre=Leer.dato();
				System.out.println("Seleccione el nuevo apellido");
				apellidos=Leer.dato();
				System.out.println("Seleccione la nueva cantidad a aportar");
				dinero=Leer.datoDouble();
				
				Socio so=new Socio (num,nombre,apellidos,dinero);
				
				clb.getCrud().getLista().set(num-1, so);
				
								
				
				
				
				break;
				
			}
			
		}while(menu!=0);
		

	}
	public static void menu(){
		System.out.println("1.-Registrar socio");
		System.out.println("2.-Buscar socio");
		System.out.println("3.-Modificar socio");
		System.out.println("4.-Borrar socio");
		
		
	}

}
