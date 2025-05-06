public class Banca {
    private Client[] clienti;
    private String codBanca;

    public Banca(String codBanca) {
        this.codBanca = codBanca;
        this.clienti = new Client[0];
    }

    public void add(Client c) {
        Client[] clientiNou = new Client[clienti.length + 1];
        System.arraycopy(clienti, 0, clientiNou, 0, clienti.length);
        clientiNou[clienti.length] = c;
        clienti = clientiNou;
    }

    public void afisareClient(String nume) {
        for (Client client : clienti) {
            if (client.getNume().equals(nume)) {
                client.afisare();
                return;
            }
        }
        System.out.println("Clientul cu numele " + nume + " nu a fost gasit.");
    }
}
