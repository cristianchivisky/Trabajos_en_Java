package ejemploPatronStrategy;

public class Bazooka extends Estrategia {
	
	public Bazooka() {
		super();
	}
	
	@Override
	public String disparar() {
		return "Disparando una Bazooka";
	}

}
