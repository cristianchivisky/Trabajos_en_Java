package ejemploPatronStrategy;

public class Contexto {
	private Estrategia estrategia;
	
	public Contexto(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public String dispararArma() {
		return this.estrategia.disparar();
	}
	
}
