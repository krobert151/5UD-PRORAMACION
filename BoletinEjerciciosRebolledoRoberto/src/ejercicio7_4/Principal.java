package ejercicio7_4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args)  {
		String atiende="Cristina",tienda="La Riverilla",nombre,color,nombre2;
		int id=1,menu,tipo,code,dias,cant;
		double precio,iva=21;
		
		Map<Integer, LineaVenta> lista= new HashMap<Integer, LineaVenta>();
		Crud crud= new Crud(lista);
		Venta venta= new Venta(crud,atiende,tienda);
		
		venta.getCrud().add(id, new LineaVenta(new Producto(563, "Consola PS5 ", 399.99),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(983, "Mochila viaje", 89.99),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(267, "Altavoz Bluetoth  ", 49.99),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(184, "Cámara de acción", 149.99),2),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(104, "Smartwatch        ", 199.99),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(105, "Chaqueta de lana", 79.99, "Gris"),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(106, "Pantalón militar", 149.99, "Negro"),2),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(109, "Vestido de seda", 99.99, "Rojo"),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(108, "Chaleco     ", 59.99, "Verde"),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(107, "Botas de cuero", 129.99, "Marrón"),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(292, "Leche desnatada", 1.19, 3),2),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(313, "Manzanas      ", 0.99, 5),6),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(130, "Salmón fresco", 15.99, 2),1),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(170, "Queso cheddar", 2.99, 4),10),iva);
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(157, "Pollo entero", 7.99, 1),1),iva);
		id++;
                
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				venta.imprimirTicket();
				break;
			case 2:
				do {					
					System.out.println("1.-Producto");
					System.out.println("2.-Alimento");
					System.out.println("3.-Ropa");
					tipo=Leer.datoInt();
				}while(tipo<1||tipo>3);
				
				System.out.println("Inserte codigo");
				code=Leer.datoInt();
				System.out.println("Inserte nombre");
				nombre=Leer.dato();
				System.out.println("Inserte precio");
				precio=Leer.datoDouble();
				do {
				System.out.println("¿Que cantidad va a comprar?");
				cant=Leer.datoInt();
				}while(cant<1);
				
				switch(tipo) {
				
					case 1:
						venta.getCrud().add(id,new LineaVenta(new Producto(code,nombre,precio),cant),iva);
						id++;
						break;
						
					case 2:
						System.out.println("Selecciona los dias en que va caducar");
						dias=Leer.datoInt();
						venta.getCrud().add(id, new LineaVenta(new Alimento(code,nombre,precio,dias),cant),iva);
						id++;
						break;
						
					case 3:
						System.out.println("Selecciona el color de la ropa");
						color=Leer.dato();
						venta.getCrud().add(id, new LineaVenta(new Ropa(code,nombre,precio,color),cant),iva);
						id++;
						break;
						
				}
				
				break;
			case 3:
				System.out.println("Introduzca el nombre del producto");
				nombre=Leer.dato();
				System.out.println("Introdzca la nueva cantdad");
				cant=Leer.datoInt();
				venta.getCrud().modifyCant(nombre, cant);
				break;
			case 4:
				System.out.println("Introduzca el nombre del producto");
				nombre=Leer.dato();
				System.out.println("Introdca el nuevo precio");
				precio=Leer.datoDouble();
				precio= precio + precio*iva/100;
				venta.getCrud().modifyPrecio(nombre, precio);
				
				break;
				
			case 5:
				System.out.println("Introduzca el nombre del producto");
				nombre=Leer.dato();
				System.out.println("Introdzca el nuevo nombre");
				nombre2=Leer.dato();
				venta.getCrud().modifyName(nombre, nombre2);
				
				break;
			
			case 6:
				System.out.println("Seleccione el id de la lista(no del producto)");
				cant=Leer.datoInt();
				venta.getCrud().del(cant);
				if(cant==id-1)
					id--;
				
				break;
				
				
			case 7:
				Map<Integer,LineaVenta> tlista2 = new TreeMap<Integer,LineaVenta>(new OrdenReverso());
				tlista2.putAll(lista);
				venta.getCrud().imprimir(tlista2);
				break;
			
			}
		}while(menu!=0);
		
	}
	public static void menu() {
		System.out.println("1.-Ver lista");
		System.out.println("2.-Añadir a la lista");
		System.out.println("3.-Modificar cantidad de un producto");
		System.out.println("4.-Modificar precio de un producto");
		System.out.println("5.-Modificar nombre de un producto");
		System.out.println("6.-Borrar");
		System.out.println("7.-Ordenar por orden inverso");

		
	}

}
