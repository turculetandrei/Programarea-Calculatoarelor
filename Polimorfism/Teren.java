
public class Teren extends Proprietate {
	private int rang;


	public Teren(Adresa adresa, String suprafata, int rang) {
		super(adresa, suprafata);
		this.rang = rang;

	}

	public double calculeazaCost() {
		return 300 * suprafata / rang;

		
	}
	
	

}
