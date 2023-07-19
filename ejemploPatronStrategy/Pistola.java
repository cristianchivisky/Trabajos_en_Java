package ejemploPatronStrategy;

public class Pistola extends Estrategia {
	
	public Pistola() {
		super();
	}

	@Override
	public String disparar() {
		return "Disparando una Pistola";
	}

}
