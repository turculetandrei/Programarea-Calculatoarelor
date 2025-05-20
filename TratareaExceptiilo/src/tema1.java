
class E1 extends Exception {
    public String toString() {
        return "Exceptia E1 a fost aruncata";
    }
}


class E2 extends RuntimeException {
    public String toString() {
        return "Exceptia E2 a fost aruncata";
    }
}


class Exemplu {
    public void doSomething(int i) {
        try {
            if(i == 0) throw new E1();
            else throw new E2();
        } catch(E1 e) {
            System.out.println("Prins");
        }
    }
}
