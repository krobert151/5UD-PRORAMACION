package streams;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String nombreT="LaRiberilla",empieza;
		int menu;
		double precio;
		List <Producto> lista=new ArrayList<Producto> ();
		CrudProducto crud= new CrudProducto(lista);
		Tienda tienda = new Tienda(nombreT,crud);
		
		
		
		
		tienda.getCrud().add(new Producto(1,"Manzana",0.2));
		tienda.getCrud().add(new Producto(2,"Pera",0.4));
		tienda.getCrud().add(new Producto(3,"Play",500));
		tienda.getCrud().add(new Producto(4,"XBox",500));
		tienda.getCrud().add(new Producto(5,"Pan",1));
		tienda.getCrud().add(new Producto(6,"CocaDeVidrio",1.5));
		tienda.getCrud().add(new Producto(7,"Pan2",2));

		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				
				empieza=Leer.dato();
			    tienda.getCrud().print(tienda.getCrud().empiezaPor(empieza));  
				
				break;
				
			case 2:
				tienda.getCrud().print(tienda.getCrud().ordenarPorPrecio());
							
				break;
				
			case 3:
				System.out.println("Inserte precio");
				precio=Leer.datoDouble();
				System.out.println(tienda.getCrud().findFirst(precio));
				break;
				
			case 4:
				System.out.println("Inserte precio");
				precio=Leer.datoDouble();
				tienda.getCrud().print(tienda.getCrud().findLow(precio));
			}
			
		}while(menu!=0);
		
		
		
		
		
	}
	public static void menu() {
		System.out.println("1.- empieza por....");
		System.out.println("2.- Ordenar por precio U");
		System.out.println("3.- Ver uno que tenga el precio x");
		System.out.println("4.-Ver los que cuestan menos de ");
	}
}
