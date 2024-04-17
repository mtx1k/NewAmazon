import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> myProducts = new ArrayList<>();
        myProducts.add(new Book(2001, "Lord of the Rings", "J. R. R. Tolkien", 10));
        myProducts.add(new Book(2002, "Hitchhiker's Guide to the Galaxy", "Douglas Adams", 5));
        myProducts.add(new Book(2003, "Harry Potter", "J. K. Rowling", 10));
        myProducts.add(new ChildrensBook(3001, "Thomas the tank engine", "Some guy", 10, "3 years and up"));
        myProducts.add(new Movie(1001, "The Matrix", MovieGenre.ACTION, 10));
        myProducts.add(new Movie(1002, "The Barbie Movie", MovieGenre.COMEDY, 15));
        myProducts.add(new Movie(1003, "Mr. Bean the movie", MovieGenre.COMEDY, Integer.MAX_VALUE));
        myProducts.add(new MovieWithDirector(1004, "One flew over the cuckoo's nest", MovieGenre.DRAMA, 10, "Milos Forman"));
        myProducts.add(new MovieWithDirector(1005, "The Prestige", MovieGenre.DRAMA, 10, "Christopher Nolan"));

        for (Product product : myProducts) {
            product.printDetails();
        }

        // Example of casting at work
        //Product cb = new ChildrensBook(3002, "Big red dog", "someone", 10, "2 and up");
        //((Book)cb).printDetails();

    }
}