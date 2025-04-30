
public class Adresa {
	private String strada;
	private int numar;
	
	public Adresa(String strada, int numar) {
		this.strada = strada;
		this.numar = numar;
	}

	@Override
	public String toString() {
		return  strada + " Nr. " + numar ;
	}
	
	
	
	

}
