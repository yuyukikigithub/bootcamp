package staticvariable;

import java.util.Arrays;

public class Library {
    private static int bookCounter=0;
    private Book[] books;

    //share read write
    public static Librarian librarian; // can by controlled by public and related to all object of this class

    public Library(Librarian librarian){
        this.books=new Book[0];
        Library.librarian=librarian; // Library.librarian vs this.librarian , refer to self class 
    }

    public String librarianName(){
        return Library.librarian.getName();
    }

    public void addBook(Book book) {
        bookCounter++;
        Book[] newBook= Arrays.copyOf(this.books,this.books.length+1);
        newBook[this.books.length]=book;
    }

    public int bookCount(){
        return bookCounter;
    }
    public Book[] getBooks(){
        return this.books;
    }
    public static void main(String[] args) {
        Librarian libn1=new Librarian("tomey");
        Library li1=new Library(libn1);
        System.out.println(li1.librarianName());

        Librarian libn2=new Librarian("Mary");
        Library li2=new Library(libn2);
        System.out.println(li2.librarianName());

        li1=li2; //pass by reference
        System.out.println(li1.librarianName());

        
        
    }
}
