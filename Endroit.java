import java.util.List;
public abstract class Endroit implements Evaluation,Position {
    private String nom;
    private double latitude;
    private double longitude;
    private String description;
    private List<AvisClients> avisClients;

    public Endroit(String nom, double latitude, double longitude, String description, List<AvisClients> avisClients) {
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.avisClients = avisClients;
    }

    @Override
    public void addReview(AvisClients avisClients){
        this.avisClients.add(avisClients);
    }

    @Override
    public List<AvisClients> getAllReview(){
        return avisClients;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
