import java.util.*;

public interface RatingRepository {
    public List<Rating> findByUser(int userId);
    public List<Rating> findByItem(int movieId);
    public List<Rating> getAll();

}