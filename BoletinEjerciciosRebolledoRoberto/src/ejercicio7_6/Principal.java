package ejercicio7_6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		String nombreBanco="LaRiberilla",nombre,apellidos,key;
		int menu;
		double extra,saldoB,money;
		Map <String,Cuenta> lista = new HashMap <String,Cuenta>();
		CrudCuenta crud = new CrudCuenta (lista);
		Banco bank = new Banco(crud,nombreBanco,0);
		
		bank.getCrud().add("juanperez", 	new CuentaCorriente("Juan ", "Pérez    ", 1000.0, 12345, 2));
		bank.getCrud().add("margonzalez", 	new CuentaCorriente("María", "González ", 5000.0, 67890, 3));
		bank.getCrud().add("pramirez", 		new CuentaCorriente("Pedro", "Ramírez  ", 7500.0, 13579, 1));
		bank.getCrud().add("anamar38", 		new CuentaCorriente("Ana  ", "Martínez ", 2000.0, 24680, 2));
		bank.getCrud().add("luisfer42", 	new CuentaCorriente("Luis ", "Fernández", 3000.0, 35791, 2));
		
		bank.getCrud().add("sofilop123", 	new CuentaJoven("Sofía   ", "López    ", 500.0, 24680, 50.0));
		bank.getCrud().add("diesanch456", 	new CuentaJoven("Diego   ", "Sánchez  ", 1000.0, 13579, 75.0));
		bank.getCrud().add("marcela341", 	new CuentaJoven("Marcela ", "Gutiérrez", 750.0, 12345, 25.0));
		bank.getCrud().add("adndresvergas", new CuentaJoven("Andrés  ", "Vargas   ", 2000.0, 35791, 100.0));
		bank.getCrud().add("crisroja14",  	new CuentaJoven("Cristina", "Rojas    ", 3000.0, 67890, 150.0));
		
		bank.getCrud().add("impresionessa", new CuentaEmpresa("Impresiones S.A.  ", "de C.V.     ", 15000.0, 13579, 5.0));
		bank.getCrud().add("graphicsa", 	new CuentaEmpresa("Diseño Gráfico    ", "S.A.        ", 25000.0, 35791, 7.5));
		bank.getCrud().add("distrib345", 	new CuentaEmpresa("Distr de Alimentos", "S.A. de C.V.", 20000.0, 24680, 6.0));
		bank.getCrud().add("automotriz", 	new CuentaEmpresa("Taller Mecánico   ", "Automotriz  ", 30000.0, 12345, 10.0));
		bank.getCrud().add("inmueblessa", 	new CuentaEmpresa("Const && Delvelop ", "S.A. de C.V.", 50000.0, 67890, 12.5));
		
		do{
			
			menu();
			menu=Leer.datoInt();
			
			switch(menu) {
			
			case 1:
				
				bank.getCrud().print();
				
				break;
			case 2:
				
				bank.getCrud().printCC();

				break;
			case 3:
				
				bank.getCrud().printCJ();

				break;
			case 4:
				
				bank.getCrud().printCE();

				break;
			case 5:
				
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca Apellidos");
				apellidos=Leer.dato();
				System.out.println("Introduzca mantenimiento");
				extra=Leer.datoDouble();
				System.out.println("Introduzca Saldo Base");
				saldoB=Leer.datoDouble();
				System.out.println("Introduzca una clave para su cuenta bancaria");
				key=Leer.dato();
				bank.getCrud().add(key, new CuentaCorriente(nombre,apellidos,saldoB,0,extra));
				
				break;
			case 6:
				
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca Apellidos");
				apellidos=Leer.dato();
				System.out.println("Introduzca regalo");
				extra=Leer.datoDouble();
				System.out.println("Introduzca Saldo Base");
				saldoB=Leer.datoDouble();
				System.out.println("Introduzca una clave para su cuenta bancaria");
				key=Leer.dato();
				bank.getCrud().add(key, new CuentaJoven(nombre,apellidos,saldoB,0,extra));
				
				break;
			case 7:
				
				System.out.println("Introduzca nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca Apellidos");
				apellidos=Leer.dato();
				System.out.println("Introduzca impuesto");
				extra=Leer.datoDouble();
				System.out.println("Introduzca Saldo Base");
				saldoB=Leer.datoDouble();
				System.out.println("Introduzca una clave para su cuenta bancaria");
				key=Leer.dato();
				bank.getCrud().add(key, new CuentaEmpresa(nombre,apellidos,saldoB,0,extra));
				
				break;
			case 8:
				
				System.out.println("Introduzca la clave");
				key=Leer.dato();
				bank.getCrud().del(key);
				System.out.println("Cuenta borrada");
				
				
				break;
			case 9:
				Map <String,Cuenta> lista2 = new TreeMap <String,Cuenta>(new OrdenarClave());
				lista2.putAll(lista);
				bank.getCrud().print(lista2);
				
				break;
			case 10:
				
				System.out.println("Introduzca la clave se su cuenta");
				key=Leer.dato();
								
				break;
				
			case 11:
				
				System.out.println("Seleccione la clave de su cuenta");
				key=Leer.dato();
				System.out.println("Seleccione el dinero a ingresar");
				money=Leer.datoDouble();
				bank.getCrud().ingresarDinero(key, money);
				
				break;
				
			case 12:
				
				System.out.println("Seleccione la clave de su cuenta");
				key=Leer.dato();
				System.out.println("Seleccione el dinero a reintegrar");
				money=Leer.datoDouble();
				bank.getCrud().reintegrarDinero(key, money);
				
				break;
			
			}
			
			
			
		}while(menu!=0);
		
		
	}
	public static void menu() {
		System.out.println("1.-Ver todas las cuentas");
		System.out.println("2.-Ver las CC");
		System.out.println("3.-Ver las CJ");
		System.out.println("4.-Ver las CE");
		System.out.println("5.-AñadirCC");
		System.out.println("6.-AñadirCJ");
		System.out.println("7.-AñadirCE");
		System.out.println("8.-EliminarC");
		System.out.println("9.-OrdenarC por claves");
		System.out.println("10.-Ver sueldoT");
		System.out.println("11.-Integrar Dinero");
		System.out.println("12.-Sacar Dinero");
		
	}

}
