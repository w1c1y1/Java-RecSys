import java.util.*;

public class TopPopular extends Recommender {
    private RatingRepository database;
    private List<Movie> movieList;
    public TopPopular(RatingRepository database) {
        this.database = database;
        this.movieList = database.getMovies();
    }

    @Override
    public List<Recommendations> recommend(int userId, int k) {
        List<Rating> userRatingList = database.findByUser(userId);
        List<Recommendations> result;
        if (userRatingList.isEmpty()) {
            for (int i = 0; i < k; i++) {
                Recommendation rec = new Recommendation()
            }
        }
    }
}