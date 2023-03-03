package ejercicio7_4;

import java.util.Comparator;

public class OrdenReverso implements Comparator <Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1>o2)
			return -1;
		else{
			if(o1<o2)
				return 1;
			else
				return 0;
			
		}
	}

	

	
	
}
