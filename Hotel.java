import java.util.Collection;
import java.util.List;

public class Hotel extends Endroit {
    private List <Chambre> chambres;

    public Hotel(String nom, double latitude, double longitude, String description, List<AvisClients> avisClients, List<Chambre> chambres) {
        super(nom, latitude, longitude, description, avisClients);
        this.chambres = chambres;
    }

    public static Collection<Object> hotelProche() {
        return List.of();
    }

    public void addChambre(Chambre chambre) {
        this.chambres.add(chambre);
    }

    public List<Chambre> getChambres() {
        return null;
    }
    @Override
    public List<AvisClients> getAllReviews() {
        return List.of();
    }

    @Override
    public void addreview(AvisClients avis) {

    }
}
