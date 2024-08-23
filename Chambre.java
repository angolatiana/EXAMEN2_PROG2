public class Chambre {
    private String numero;
    private double tarifNuite;

    public Chambre(String numero, double tarifNuite) {
        this.numero = numero;
        this.tarifNuite = tarifNuite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTarifNuite() {
        return tarifNuite;
    }

    public void setTarifNuite(double tarifNuite) {
        this.tarifNuite = tarifNuite;
    }
}
