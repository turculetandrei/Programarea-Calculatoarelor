class Piramida {
    int n;

    Piramida(int n) {
        this.n = n;
    }

    public void Piramida() {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < (n - i + 1); j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
        Piramida p1 = new Piramida(4);
        Piramida p2 = new Piramida(5);
        Piramida p3 = new Piramida(6);

        p1.Piramida();
        p2.Piramida();
        p3.Piramida();
    }
}
