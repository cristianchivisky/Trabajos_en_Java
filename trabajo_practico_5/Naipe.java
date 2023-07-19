package trabajo_practico_5;

public class Naipe {
	private Integer numero;
	private Familia familia;
	public Naipe(Integer numero, Familia familia) {
		super();
		this.numero = numero;
		this.familia = familia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	
	public Boolean equals(Naipe naipe) {
		if(this.numero == naipe.getNumero() &&
				this.familia.equals(naipe.getFamilia())){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	@Override
	public String toString() {
		return "Naipe [numero=" + numero + ", familia=" + familia + "]";
	}
	

}
