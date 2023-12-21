import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String name;
    public Book(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Book ("+this.name+")";
    }

    @Override
    public boolean equals(Object ob){
        if (this==ob) {
            return true;
        }
        if (!(ob instanceof Book)) {
            return false;
        }
        Book book = (Book) ob;
        // return book.getName().equals(this.name);
        return Objects.equals(book.getName(),this.name );
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }

    public static void main(String[] args) {
        List<Book> bookList1 = new ArrayList<>(List.of(new Book("Alice Dream"),new Book("Cooking")));
        Book b1=new Book("About Science");
        bookList1.add(b1); // add method from 'List'
        bookList1.add(new Book("About Singing"));
        bookList1.remove(1);
        System.out.println(bookList1.size());
        System.out.println(bookList1);
        System.out.println(bookList1.contains(b1)); // true
        // vs System.out.println(bookList1.contains(new Book("About Science"))) // true
        // 
        Book b2 = new Book("About Science");
        System.out.println(b1.equals(b2)); //true


        // boolean found = false;
        // for (Book book : bookList1) {
        //     if ("About Science".equals(b1.getName())) {
        //         found=true;
        //     }
        // }
        // System.out.println(found); // true
        // bookList1.remove(b1);

        
    }
}
