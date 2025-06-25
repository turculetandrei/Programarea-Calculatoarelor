public abstract class Angajat {
    private String nume;

    
    
    public Angajat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract double calculSalar();

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Angajat alt = (Angajat) obj;
        return this.nume.equals(alt.nume);
    }

    
    
    @Override
    public String toString() {
        return "Angajat: " + nume + " salariu: " + calculSalar();
    }
}
