package ejercicio1;

import java.util.Comparator;

public class OrderByDur implements Comparator <Cancion>{

	@Override
	public int compare(Cancion o1, Cancion o2) {
		// TODO Auto-generated method stub
		if(o1.getDuracionMin()>o2.getDuracionMin())
			return -1;
		else {
			if(o1.getDuracionMin()<o2.getDuracionMin())
				return 1;
			else
				return 0;			
		}
		
	}

}
