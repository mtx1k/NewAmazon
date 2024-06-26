public class Book implements Product {
    private long productId;
    private int price;
    private String title;
    private String author;

    public Book(long productId, String title, String author, int price) {
        this.productId = productId;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book: " +
                " Id: " + getProductId() +
                "| Title: " + getTitle() +
                "| Author: " + getAuthor() +
                "| Price: " + getPrice();
    }
}