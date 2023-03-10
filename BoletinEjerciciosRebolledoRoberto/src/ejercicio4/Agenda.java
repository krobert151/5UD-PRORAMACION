package ejercicio4;

import java.util.Iterator;
import java.util.Map;

public class Agenda {
	private Map <Contacto,Integer> contactos;

	public Agenda(Map<Contacto, Integer> contactos) {
		super();
		this.contactos = contactos;
	}

	public Map<Contacto, Integer> getContactos() {
		return contactos;
	}

	public void setContactos(Map<Contacto, Integer> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		return "Agenda [contactos=" + contactos + "]";
	}
	
	public void agregar(Integer num, Contacto c) {
		
		contactos.put(c, num);
		
	}
	public void mostrarTodos() {
		
		for (Contacto contacto : contactos.keySet()) {
	        System.out.println("Contacto: " + contacto.toString() + " - Número: " + contactos.get(contacto));
	    }
		
	}
	public void mostrarTodos(Map<Contacto, Integer> lista) {
		
		for (Contacto contacto : lista.keySet()) {
	        System.out.println("Contacto: " + contacto.toString() + " - Número: " + lista.get(contacto));
	    }
		
	}
	public Contacto findById(int id) {
		Contacto c;
		Iterator<Contacto> it =contactos.keySet().iterator();
		while(it.hasNext()) {
			c = it.next();
			if(c.getId()==id) {
				return c;
			}
		}	
		return null;		
	}
	public void borrar(int id) {
		
		contactos.remove(findById(id));
				
	}
	public void editarNombre(int id,String nombre) {
		findById(id).setNombre(nombre);
	}
	public void editarCorreo(int id,String correo) {
		findById(id).setCorreo(correo);
		
	}

}
