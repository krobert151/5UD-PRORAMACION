package ejercicio5;

import java.util.Comparator;

public class CompararEdad implements Comparator <Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
			
		int edad1 = o1.getEdad();
		int edad2 = o2.getEdad();	
		
		if(edad1>edad2)
			return 1;
		else {
			if(edad1<edad2)
				return -1;
			
			else
				return 0;
			
		}
	}

}
