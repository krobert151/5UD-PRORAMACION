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
				clb.getCrud().agregar(new Socio(numSocio,nombre,apellidos,dinero));
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
			
				
			case 4:
				
				System.out.println("Seleccion el numero del socio que quiera borrar");
				num=Leer.datoInt();
				clb.getCrud().eliminar(clb.getCrud().findBynum(num));
				break;
				
			case 5:
				
				System.out.println("Diga el número del socio");
				num=Leer.datoInt();
				System.out.println("Diga la nueva cuota del socio");
				dinero=Leer.datoDouble();
				clb.getCrud().editar(num, dinero);
				
				break;
			
			case 6:
				
				System.out.println(clb.calcGanancia());
				
				break;
			}
			
		}while(menu!=0);
		

	}
	public static void menu(){
		System.out.println("1.-Registrar socio");
		System.out.println("2.-Buscar socio");
		System.out.println("3.-Modificar socio");
		System.out.println("4.-Borrar socio");
		System.out.println("5.-Editar");
		System.out.println("6.-Calcular Ganancias");
		
		
	}

}
