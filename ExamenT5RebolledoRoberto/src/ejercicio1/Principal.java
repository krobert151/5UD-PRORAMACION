package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu,id,selPago,num;
		boolean pago;
		String interprete;
		List <Cancion> lista = new ArrayList <Cancion>();
		MiMusica musica = new MiMusica(lista);
		
		musica.add(new Cancion(1,"Let there be rock","ACDC",10,true,5.5));
		musica.add(new Cancion(2,"Afterlife","AvengedSevenfold",15,true,6.4));
		musica.add(new Cancion(3,"Back in Black","ACDC",50,true,5));
		musica.add(new Cancion(4,"PANAMA","VanHalen",60,true,4.5));
		musica.add(new Cancion(5,"IronMan","BlackSabath",5,true,4.4));
		musica.add(new Cancion(6,"Felices los 4","Maluma",1,false,3.20));
		musica.add(new Cancion(7,"Fuel","Metalica",30,true,5));
		musica.add(new Cancion(8,"Candy","PlanB",1,false,3.10));
		musica.add(new Cancion(9,"MiVecinita","PlanB",1,false,3.20));
		musica.add(new Cancion(10,"Thunderstruck","ACDC",50,true,5.5));
		musica.add(new Cancion(11,"DemonFire","ACDC",30,true,4.4));
		musica.add(new Cancion(12,"Hot for teacher","VanHalen",20,true,5.1));
		musica.add(new Cancion(13,"All nightmare long","Metalica",35,true,5.5));
		musica.add(new Cancion(14,"Battery","Metalica",25,true,4.5));
		musica.add(new Cancion(15,"JUMP","VanHalen",40,true,5.2));
		musica.add(new Cancion(16,"Master of puppets","Metalica",35,true,8.5));

		System.out.println("Bienvenido al programa");
		do {
			menu();
			menu=Leer.datoInt();
			
			switch(menu) {
			
			case 1:
				
				musica.printFree();
				
				break;
			case 2:
				
				musica.findLongDur().print();
				
				break;
			case 3:
				System.out.println("Seleccione el interprete");
				interprete=Leer.dato();
				musica.findByInterprete(interprete);
				
				break;
			case 4:

				musica.findMostUsed().print();

				
				break;
			case 5:
				
				do {
					
					System.out.println("Introduzca el id de la cancion");
					id=Leer.datoInt();
					
				}while(id>lista.size()||id<1);
				do {
					System.out.println("¿Quieres que sea gratis?");
					System.out.println("1.-Si");
					System.out.println("2.-No");
					selPago=Leer.datoInt();
					if(selPago==1)
						pago=true;
					else
						pago=false;
				}while(selPago>2||selPago<1);
				
				musica.modifyPago(pago, id);
				
				break;
			case 6:
				Collections.sort(lista);
				musica.print();
				
				break;
			case 7:
				Collections.sort(lista, new OrderByDur());
				musica.print();
				
				break;
			case 8:
				List <Cancion> shufle = new ArrayList<Cancion>();
				shufle.addAll(lista);
				Collections.shuffle(shufle);
				System.out.println("Diga cuantas canciones quiere en aleatorio");
				num=Leer.datoInt();
				musica.print(musica.createShufle(num, shufle));;
				
				break;
			case 9:
				System.out.printf("La duración media de tus canciones es de %.2f min \n",musica.mediaDuracion());
				break;
			case 10:
				musica.print();
				
				break;
			default:
				System.out.println("Se ha confundido de numero");
				break;
			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			}	
		}while(menu!=0);	
	}
	public static void menu() {
		
		System.out.println("\n1.-Buscar canciones gratis");
		System.out.println("2.-Buscar la canción con mayor duración");
		System.out.println("3.-Buscar todas las canciones del mismo interprete");
		System.out.println("4.-Buscar la canción que mas veces ha sido escuchada");
		System.out.println("5.-Modificar una canción");
		System.out.println("6.-Ordenar lista por interprete");
		System.out.println("7.-Ordenar por duracion");
		System.out.println("8.-Shuffle");
		System.out.println("9.-Calcular la media de duracion de las canciones");
		System.out.println("10.-Ver canciones");
		System.out.println(" ");
		System.out.println("0.-Salir\n");	
		
	}
}
