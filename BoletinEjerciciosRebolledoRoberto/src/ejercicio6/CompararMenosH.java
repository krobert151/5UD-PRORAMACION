package ejercicio6;

import java.util.Comparator;

public class CompararMenosH implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		int h1=o1.getHoras(),h2=o2.getHoras();
		if(h1>h2)
			return -1;
		else {
			if(h1<h2)
				return 1;
			else
				return 0;
			
		}
		
	}
	
}
