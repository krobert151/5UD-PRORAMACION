package ejercicio7_4;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		String atiende="Cristina",tienda="riverilla";
		int id=1,menu;
		
		Map<Integer, LineaVenta> lista= new HashMap<Integer, LineaVenta>();
		Crud crud= new Crud(lista);
		Venta venta= new Venta(crud,atiende,tienda);
		
		venta.getCrud().add(id, new LineaVenta(new Producto(1, "Consola de videojuegos", 399.99),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(2, "Mochila de viaje", 89.99),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(3, "Altavoz Bluetooth", 49.99),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(4, "Cámara de acción", 149.99),2));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Producto(5, "Smartwatch", 199.99),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(6, "Chaqueta de lana", 79.99, "Gris"),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(7, "Pantalón de cuero", 149.99, "Negro"),2));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(8, "Vestido de seda", 99.99, "Rojo"),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(9, "Chaleco acolchado", 59.99, "Verde"),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Ropa(10, "Botas de cuero", 129.99, "Marrón"),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(11, "Leche desnatada", 1.19, 3),2));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(12, "Manzanas", 0.99, 5),6));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(13, "Salmón fresco", 15.99, 2),1));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(14, "Queso cheddar", 2.99, 4),10));
		id++;
		venta.getCrud().add(id, new LineaVenta(new Alimento(15, "Pollo entero", 7.99, 1),1));
		id++;
                
		do {
			menu();
			menu=Leer.datoInt();
			switch(menu) {
			
			case 1:
				venta.imprimirTicket();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				
			
			
			}
		}while(menu!=0);
		
	}
	public static void menu() {
		System.out.println("1.-Ver lista");
		System.out.println("2.-Añadir a la lista");
		System.out.println("3.-Modificar un producto");
		System.out.println("4.-Calcular el precio final");
		System.out.println("5.-Ordenar por precio final");
		
	}

}
