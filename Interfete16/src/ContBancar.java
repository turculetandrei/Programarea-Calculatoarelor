public class ContBancar implements SumaTotala {
    private String numarCont;
    private float suma;

    public ContBancar(String numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public float getSumaTotala() {
        return getSuma();
    }
}
