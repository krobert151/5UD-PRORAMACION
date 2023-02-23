package ejercicio4;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Contacto>{

	@Override
	public int compare(Contacto o1, Contacto o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
