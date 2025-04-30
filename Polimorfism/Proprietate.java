
public abstract class Proprietate {

	protected Adresa adresa;

	protected String suprafata;
	
	public Proprietate(Adresa adresa, String suprafata) {

		this.adresa = adresa;
		
		this.suprafata = suprafata;
	}
	
	public abstract double calculeazaCost();
	public abstract String getAfisare();
}
