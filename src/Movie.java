public class Movie implements Product, Comparable<Movie> {
    private long productId;
    private int price;
    private String title;
    private MovieGenre genre;

    public Movie(long productId, String title, MovieGenre genre, int price) {
        this.productId = productId;
        this.price = price;
        this.title = title;
        this.genre = genre;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String description = "Movie: " +
                " Id: " + getProductId() +
                "| Title: " + getTitle() +
                "| Genre: " + getGenre() +
                "| Price: " + getPrice();
        return description;
    }

    @Override
    public int compareTo(Movie o) {
        if(this.productId < o.productId) {
            return -1;
        } else if (this.productId > o.productId) {
            return 1;
        }
        return 0;
    }
}