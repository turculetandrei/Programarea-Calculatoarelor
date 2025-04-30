
public class Main {

	public static void main(String[] args) {


		Contribuabil ion = new Contribuabil("Ion Popescu", "434124431");
		ion.adaugaProprietate(new Cladire(new Adresa("Strada V Parvan ", 2), 20));
		ion.adaugaProprietate(new Teren(new Adresa("Strada V Parvan", 2), 20, 1));
		ion.adaugaProprietate(new Cladire(new Adresa("Strada Lujon", 4), 25));
		ion.adaugaFluturas();

		
	}

}
