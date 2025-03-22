class Suma {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b, int c) {
        return suma(suma(a, b), c);
    }

    public static int suma(int a, int b, int c, int d) {
        return suma(suma(a, b, c), d);
    }

    public static void main(String[] args) {
        int rezultat1 = suma(3, 5);
        int rezultat2 = suma(1, 2, 3);
        int rezultat3 = suma(4, 5, 6, 7);

        System.out.println("Suma a doua numere: " + rezultat1); 
        System.out.println("Suma a trei numere: " + rezultat2); 
        System.out.println("Suma a patru numere: " + rezultat3); 
    }
}
