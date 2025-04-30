import java.util.ArrayList;
import java.util.List;

public class Contribuabil {

	private String nume;
	private String cnp;
	List<Proprietate> proprietati;

	
	public Contribuabil(String nume, String cnp) {

		this.nume = nume;
		this.cnp = cnp;
		this.proprietati =  new ArrayList<>();

	}
	public void adaugaProprietate(Proprietate p) {

		proprietati.add(p);
	}

	public double calculeazaTotal() {
		double total = 0;
		for(Proprietate p : proprietati) {
			total += p.calculeazaCost();
		}

		return total;
	}

	public void adaugaFluturas() {
		System.out.println("Contribuabil: " + nume);
		System.out.println("Proprietati: ");
		for(Proprietate p : proprietati) {
			System.out.println(p.getAfisare());
		}
		
		System.out.println("Suma totala: " + calculeazaTotal());
	}

}
