public class AngajatCuOra extends Angajat {
    private int oreLuna;
    private double salarPeOra;

    
    
    public AngajatCuOra(String nume, int oreLuna, double salarPeOra) {
        super(nume);
        this.oreLuna = oreLuna;
        this.salarPeOra = salarPeOra;
    }

    
    @Override
    public double calculSalar() {
        return oreLuna * salarPeOra;
    }

    
    
    public void adaugaOre(int ore) {
        oreLuna += ore;
    }

    public void schimbaSalarPeOra(double nou) {
        salarPeOra = nou;
    }
}
