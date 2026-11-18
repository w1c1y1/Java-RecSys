public interface Recommender {
    public List<Recommendation> recommend(int userId, int k);
}