import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output:
 * Writer: Susan
 * Writer: Tracy
 * Book Name: Book A, Book Price: 34.9
 * Book Name: Book B, Book Price: 78.9
 * Book Name: Book C, Book Price: 104.9
 * Book Name: Book D, Book Price: 449.9
 * The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...
record Book(double price, String name) {

}

// Implement Wrtier Class
// Code here ...
record Writer(String name, List<Book> books) {

}

// Implement a Comparator to compare the book price
// Code here ...

class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = Arrays.asList(new Book(34.9, "Book A"), new Book(78.9, "Book B"));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = Arrays.asList(new Book(104.9, "Book C"), new Book(449.9, "Book D"));
        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = Arrays.asList(w1, w2);
        // Print all Writers names
        // Code here ...
        writers.stream().forEach(e -> System.out.println("Writer: " + e.name()));

        // Use flatMap method to return all books written by our writers, storing in a
        // List<Book>
        // Just return the Books!
        // Code here ...
        books = writers.stream().flatMap(e -> e.books().stream()).collect(Collectors.toList());
        // Print out all books' Name and Price.
        // Code here
        books.stream().forEach(e -> System.out.println("Book Name: " + e.name() + ", Book Price: " + e.price()));
        // Create Comparator for stream max() method use, aims to find the most
        // expensive book
        // Book maxPriceBook = ...
        Book maxPriceBook =books.stream().max((a1,a2)->a2.price()>a1.price()?-1:1).get();
        // Print out the most expensive book
        // System.out.println("Name:" + maxPriceBook.getName() + ", Price:" + maxPriceBook.getPrice());
        System.out.println("The Most Expensive Book: Name=" + maxPriceBook.name() + ", Price=" + maxPriceBook.price());

    }
}
