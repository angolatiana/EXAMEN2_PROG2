import java.util.ArrayList;
import java.util.List;

public class CarteMada {
    private List<Endroit> endroits;

    public CarteMada(List<Endroit> endroits) {
        this.endroits = endroits;
    }

    public void addeEndroit(Endroit endroit) {
        this.endroits.add(endroit);
    }

    public Hotel findBestHotel(){
        Hotel hotel = null;
        int maxParc = 0;

        for (Endroit endroit : this.endroits) {
            if(endroit instanceof Hotel){
                Hotel hotel1 = (Hotel) endroit;
                int nombreParc = Hotel.hotelProche().size();
                if(nombreParc > maxParc){
                    hotel =hotel1;
                    maxParc = nombreParc;
                }
            }
        }
        return hotel;

    public void getAllPLaceInside(double minLat, double maxLat, double minLong , double  maxLong){
        List <Endroit> filtreEndroits = new ArrayList<>();
                for (Endroit endroit : this.endroits) {
                    if (endroit.getLatitude() >=minLat
                    && endroit.getLatitude() <= maxLat
                    && endroit.getLongitude() >=minLong && endroit.getLongitude() <= maxLong){
                        filtreEndroits.add(endroit);
                    };
                }
           return filtreEndroits;
        }

    }
}
