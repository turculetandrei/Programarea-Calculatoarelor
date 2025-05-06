public class ContLei extends ContBancar {
    public ContLei(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public void transfer(ContLei contDestinatie, float suma) {
        if (getSuma() >= suma) {
            setSuma(getSuma() - suma);
            contDestinatie.setSuma(contDestinatie.getSuma() + suma);
        }
    }

    public float getSumaTotala() {
        return getSuma();
    }
}
