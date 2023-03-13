package streams;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List <Persona> lista = new ArrayList<Persona>();
		
		CrudPersona crud= new CrudPersona(lista);
		
		crud.add(new Persona (1,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (2,"Manola","Suarez",40,'M'));
		crud.add(new Persona (3,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (4,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (5,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (6,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (7,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (8,"Manolo","Suarez",40,'M'));
		crud.add(new Persona (9,"Manolo","Suarez",40,'M'));

	}

}
