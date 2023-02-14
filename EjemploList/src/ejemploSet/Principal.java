package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Set<Alumno> listaAlumnos = new HashSet <Alumno>();

		Alumno a = new Alumno("pepe",30,8.5);
		
		listaAlumnos.add(a);
		listaAlumnos.add(new Alumno("manolo",15,4.0));
		listaAlumnos.add(new Alumno("Pan",19,4.0));
		listaAlumnos.add(new Alumno("23",23,4.0));
		listaAlumnos.add(new Alumno("No",133,4.0));
		listaAlumnos.add(new Alumno("A vecs",134,4.0));
		listaAlumnos.add(new Alumno("Ese",13,4.0));
		listaAlumnos.add(new Alumno("Rufian",96,4.0));

		System.out.println(listaAlumnos);
		
	}

}
