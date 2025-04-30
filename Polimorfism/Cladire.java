
public class Cladire extends Proprietate {
	
	 public Cladire(Adresa adresa, String suprafata) {
		 super(adresa, suprafata);
	 }


	public double calculeazaCost() {
		return 500 * suprafata;
	}


	public String getAfisare() {
		return "Cladire " + adresa + "\n" + "Suprafata " + suprafata + "Cost" + calculeazaCost();
		
	}
}
