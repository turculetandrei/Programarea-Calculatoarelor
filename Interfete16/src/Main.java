public class Main {
    public static void main(String[] args) {
        ContBancar[] conturi1 = {
            new ContLei("RO123", 1000),
            new ContEuro("EU456", 600)
        };

        ContBancar[] conturi2 = {
            new ContLei("RO789", 300),
            new ContEuro("EU000", 400)
        };

        Client c1 = new Client("Andrei", "Oradea", conturi1);
        Client c2 = new Client("Maria", "Cluj", conturi2);

        Banca b = new Banca("BNK1");
        b.add(c1);
        b.add(c2);

        b.afisareClient("Andrei");
        b.afisareClient("Maria");
        b.afisareClient("Ion");
    }
}
