import java.util.ArrayList;
import java.util.List;

public class Parc extends Endroit{
    private List<Hotel> hotels;

    public Parc(String nom, double latitude, double longitude, String description, List<AvisClients> avisClients, List<Hotel> hotels) {
        super(nom, latitude, longitude, description, avisClients);
        this.hotels = new ArrayList<>();
    }


    @Override
    public List<AvisClients> getAllReviews() {
        return List.of();
    }

    @Override
    public void addreview(AvisClients avis) {

    }

    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotels;
    }
}
