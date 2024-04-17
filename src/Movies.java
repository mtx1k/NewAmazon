import java.util.List;

public class Movies {
    public static Movie findMovieById(long productId, List<Movie> movies) {
        for (Movie movie : movies) {
            if (productId == movie.getProductId()) {
                return movie;
            }
        }
        return null;
    }
}