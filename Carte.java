class Carte {
    int numarPagini;

    Carte(int pagini) {
        numarPagini = pagini;
    }

    boolean esteCarteIdentica(Carte c) {
        return numarPagini == c.numarPagini;
    }

    public static void main(String[] args) {
        Carte c1 = new Carte(500);
        Carte c2 = new Carte(500);
        Carte c3 = new Carte(100);

        System.out.println(c1.esteCarteIdentica(c2)); 
        System.out.println(c1.esteCarteIdentica(c3)); 
    }
}
