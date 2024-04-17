public class Movie extends Product {
    private String title;
    private MovieGenre genre;

    public Movie(long productId, String title, MovieGenre genre, int price) {
        super(productId, price);
        this.title = title;
        this.genre = genre;
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
        String description = "--- Movie Details ---" +
                "\nId: " + getProductId() +
                "\nTitle: " + getTitle() +
                "\nGenre: " + getGenre() +
                "\nPrice: " + getPrice();
        return description;
    }
}