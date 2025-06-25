public class Main {
    public static void main(String[] args) {
        AngajatCuSalarFix a1 = new AngajatCuSalarFix("Turculet Andrei", 3000);
        AngajatCuSalarFix a2 = new AngajatCuSalarFix("Samuele Tiboca", 3500);

        
        AngajatCuOra b1 = new AngajatCuOra("Firulescu Sergiu", 160, 20);
        AngajatCuOra b2 = new AngajatCuOra("ERic Predit", 170, 18);

        
        Firma firma = new Firma();

        
        System.out.println("Angajare a1: " + firma.angajeaza(a1));
        System.out.println("Angajare a2: " + firma.angajeaza(a2));
        System.out.println("Angajare b1: " + firma.angajeaza(b1));
        System.out.println("Angajare b2: " + firma.angajeaza(b2));
        

        System.out.println("Salariu mediu: " + firma.salariuMediu());

        System.out.println("Angajare a1 din nou: " + firma.angajeaza(a1));

        
        a1.schimbaSalarFix(4000);
        b1.schimbaSalarPeOra(25);
        

        System.out.println("Salariu mediu dupa modificari: " + firma.salariuMediu());

        System.out.println("Angajati:");
        firma.afiseazaAngajati();
    }
}
