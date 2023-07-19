package ejemploPatronStrategy;

public class Ametralladora extends Estrategia {
	
	public Ametralladora() {
		super();
	}
	
	@Override
	public String disparar() {
		return "Disparando una Ametralladora";
	}
	
}
