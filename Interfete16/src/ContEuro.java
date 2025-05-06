public class ContEuro extends ContBancar {
    public ContEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public float getDobanda() {
        if (getSuma() > 500) {
            return 0.3;
        } else {
            return 0;
        }
    }

    public float getSumaTotala() {
        return getSuma() * 36;
    }
}
