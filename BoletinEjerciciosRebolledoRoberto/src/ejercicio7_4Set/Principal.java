package ejercicio7_4Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="La riberilla 2", atendido="Rumano",nombreP;
		int menu,id,cant;
		double precio;
		Set <LineaVenta> lista = new HashSet <LineaVenta>();
		CrudLineaVenta crud = new CrudLineaVenta(lista);
		Venta vent = new Venta (nombre,atendido,crud);
		
		vent.getCrud().add(new LineaVenta(new Producto(111,"manzana",2.1),1));
		vent.getCrud().add(new LineaVenta(new Producto(222,"pesaco",5.6),1));
		vent.getCrud().add(new LineaVenta(new Producto(333,"jamon",150),1));
		vent.getCrud().add(new LineaVenta(new Producto(444,"fanta",1.5),1));
		vent.getCrud().add(new LineaVenta(new Producto(555,"coca",1.5),1));
		
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
				
			case 1:
				
				vent.getCrud().print();
				
				break;
			case 2:
				
				System.out.println("Introduzca nombre");
				nombreP=Leer.dato();
				System.out.println("INtroduzca precio");
				precio=Leer.datoDouble();
				System.out.println("Introduzca id");
				id=Leer.datoInt();
				System.out.println("Introduzca cantidad");
				cant=Leer.datoInt();
				
				vent.getCrud().add(new LineaVenta(new Producto(id,nombreP,precio),cant));
				
				
				break;
			case 3:
				System.out.println("Introduzca el id");
				id=Leer.datoInt();
				vent.getCrud().del(id);
				
				
				break;
			case 4:
				System.out.println("Introduzca el id");
				id=Leer.datoInt();
				System.out.println(vent.getCrud().findById(id));
				
				break;
			case 5:
				System.out.println("Introduzca el nuevo precio");
				precio=Leer.datoDouble();
				System.out.println("Introduzca el id");
				id=Leer.datoInt();
								
				
				break;
			case 6:
				Set <LineaVenta> listao = new TreeSet <LineaVenta>(lista); 
				vent.getCrud().print(listao);
				
				break;
			case 7:
				
				
				
				break;
			case 8:
				
				
				
				break;
			case 9:
				
				
				
				break;
						
			}
			
			
		}while(menu!=0);
		
	}
	public static void menu() {
		
		System.out.println("1.-Mostrar Lista");
		System.out.println("2.-Añadir producto");
		System.out.println("3.-Borrar producto");
		System.out.println("4.-Buscar producto");
		System.out.println("5.-Modificar producto");
		System.out.println("6.-Ordenar Producto");
		
		
	}
}
