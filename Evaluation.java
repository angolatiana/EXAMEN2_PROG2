import java.util.List;

public interface Evaluation {
    List<AvisClients>  getAllReviews();
    void addreview(AvisClients avis);

    void addReview(AvisClients avisClients);

    List<AvisClients> getAllReview();
}
