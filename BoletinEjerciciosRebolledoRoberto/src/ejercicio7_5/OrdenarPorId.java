package ejercicio7_5;

import java.util.Comparator;

public class OrdenarPorId implements Comparator <Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Esbozo de método generado automáticamente
		if(o1.getNumEmp()>o2.getNumEmp())
			return 1;
		else {
			if(o1.getNumEmp()<o2.getNumEmp())
				return -1;
			else
				return 0;			
		}
	}

}
