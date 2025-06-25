import java.util.ArrayList;

public class Firma {
    private ArrayList<Angajat> angajati = new ArrayList<>();

    
    public boolean angajeaza(Angajat a) {
        if (angajati.contains(a)) {
            return false;
        }
        angajati.add(a);
        return true;
    }

    
    
    public double salariuMediu() {
        if (angajati.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        for (Angajat a : angajati) {
            total += a.calculSalar();
        }
        return total /  angajati.size();
    }
    

    public void afiseazaAngajati() {
        for (Angajat a : angajati) {
            System.out.println(a);
        }
    }
}
