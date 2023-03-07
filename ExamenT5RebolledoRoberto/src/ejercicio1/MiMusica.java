package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiMusica {
	
	private List <Cancion> lista;

	public MiMusica(List<Cancion> lista) {
		super();
		this.lista = lista;
	}

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}
	
	public void add(Cancion c) {
		
		lista.add(c);
		
	}
	public void print() {
		Iterator<Cancion>it=lista.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
	}
	
	public void print(List<Cancion>lista) {
		Iterator<Cancion>it=lista.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
	}
	
	public void printFree() {
		for (Iterator<Cancion> iterator = lista.iterator(); iterator.hasNext();) {
			Cancion c = iterator.next();
			if (c.isGratis())
				c.print();
			
		}
	}
	public Cancion findLongDur() {
		
		Cancion maxDur = lista.get(0);
		for (Cancion c : lista) {
			if(c.getDuracionMin()>maxDur.getDuracionMin())
				maxDur=c;
		}
		return maxDur;
	}
	public Cancion findMostUsed() {
		Cancion maxUse = lista.get(0);
		for (Cancion c : lista) {
			if(c.getNumEscuchas()>maxUse.getNumEscuchas()) 
				maxUse=c;
		}
		return maxUse;
		
	}
	public Cancion findById(int id) {
		
		for (Cancion c : lista) {
			if(c.getId()==id)
				return c;
		}
		return null;
		
	}
	public void modifyPago(boolean boo,int id) {
		
		findById(id).setGratis(boo);
		
		
	}
	public void findByInterprete(String inter) {
		
		for (Cancion c : lista) {
			if(c.getInterprete().equalsIgnoreCase(inter))
				c.print();
		}
	}
	public List<Cancion> createShufle(int num,List<Cancion>lista){
		List<Cancion>shufle = new ArrayList<Cancion>();
		for (Cancion c : lista) {
			if(lista.indexOf(c)<num)
				shufle.add(c);
			else
				return shufle;
		}
		return null;
	}
	public double mediaDuracion() {
		double dTotal=0;
		for (Cancion c : lista) {
			dTotal+=c.getDuracionMin();
		}
		return dTotal/lista.size();
	}
	@Override
	public String toString() {
		return "MiMusica [lista=" + lista + "]";
	}
	
	
	
}
