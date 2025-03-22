class Patrat {
    int latura;

    Patrat() {
        latura = 10;
    }

    Patrat(int latura) {
        this.latura = latura;
    }

    void tiparestePatrat() {
        int aria = latura * latura;
        System.out.println("Patrat l " + latura + " Aria " + aria);
    }

    public static void main(String[] args) {
        Patrat p1 = new Patrat();
        Patrat p2 = new Patrat(5);
        Patrat p3 = new Patrat(7);

        p1.tiparestePatrat();
        p2.tiparestePatrat();
        p3.tiparestePatrat();
    }
}
