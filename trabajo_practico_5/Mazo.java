package trabajo_practico_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	private List<Naipe> naipes;
	public Mazo() {
		this.naipes = new ArrayList<Naipe>();
		inicializar();
	}
	
	public List<Naipe> getNaipes() {
		return naipes;
	}

	private void inicializar() {		
		for(int i = 1; i <= 12; i++) {
			naipes.add(new Naipe(i, Familia.ESPADA));
			naipes.add(new Naipe(i, Familia.BASTO));
			naipes.add(new Naipe(i, Familia.ORO));
			naipes.add(new Naipe(i, Familia.COPA));
		}		
	}
	public void barajar() {
		Collections.shuffle(naipes);
	}
	
	public Naipe getNaipeArriba() {
		if(naipes.isEmpty())
			return null;
		else
			return naipes.remove(0);	
	}
	
	public Naipe getNaipeAbajo() {
		if(naipes.isEmpty())
			return null;
		else
			return naipes.remove(naipes.size()-1);		
	}

	@Override
	public String toString() {
		
		String resultado = "";
		
		for(Naipe n : this.naipes) {
			resultado += n + "\n";
		}
		
		return resultado;
	}
	
	public void cortar(Integer x) {
		if(x>0 && x< naipes.size()) {
			List<Naipe> a= naipes.subList(0, x-1);
			List<Naipe> b= naipes.subList(x, naipes.size());
			b.addAll(a);
			naipes = b;
		}
	}
	
	public Integer cantidad() {
		return naipes.size();
	}
	
}
