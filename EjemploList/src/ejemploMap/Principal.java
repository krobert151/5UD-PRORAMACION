package ejemploMap;

import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static void main(String args[]) {
		Map <Integer,Alumno> mapa = new HashMap <Integer,Alumno>();
		mapa.put(3, new Alumno("Pan",3,4));
		mapa.put(4, new Alumno("Pan4",3,4));
		mapa.put(5, new Alumno("Pan5",3,4));
		mapa.put(6, new Alumno("Pan6",3,4));
		mapa.put(7, new Alumno("Pan7",3,4));
		System.out.println(mapa);
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());

		}
}
