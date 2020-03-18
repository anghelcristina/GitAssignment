package temaGit;

public class Scena implements InterfataCheltuieli {
	public static final float COST_PERSONAJ = 1000;
	private String denumireScena;
	private int numarPersonaje;
	private String descriere;
	
	public Scena(String denumireScena, int numarPersonaje, String descriere) {
		super();
		this.denumireScena = denumireScena;
		this.numarPersonaje = numarPersonaje;
		this.descriere = descriere;
	}

	@Override
	public float calculCostPerScena() {
		return COST_PERSONAJ * this.numarPersonaje;
	}
	
	
}
