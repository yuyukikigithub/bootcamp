package lambda;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomInteger=()-> new Random().nextInt(100);
        System.out.println(randomInteger.get());

        Supplier<BookLam> emptyBook = ()-> new BookLam();
        System.out.println(emptyBook.get());


        
    }
    
}
