package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        Consumer<String>sendEmailFunction=emailAdd -> sendEmail(emailAdd);
        List<String> emails = new ArrayList<>(List.of("1234@gmail.com","5678@gmail.com"));
        emails.forEach(sendEmailFunction);

        emails.forEach(x->{
            sendEmail(x);
        });

        List<BookLam> books=new ArrayList<>(List.of(new BookLam(12.3),new BookLam(12.4),new BookLam(12.5)));
        books.add(new BookLam(12.6));

        for(BookLam book:books){
            System.out.println(book.getPrice());
        }
        books.forEach(e->{
            System.out.println(e.getPrice());
        });


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        Consumer<String> printName = name -> System.out.println(name);

        names.forEach(printName);

        // Comparator<Integer> comparator = (Integer a, Integer b) -> {
        //     // Code that uses the parameters 'a' and 'b'
        // };
        // ```
        
        // Example (with type inference):
        // ````java
        // Comparator<Integer> comparator = (a, b) -> {
        //     // Code that uses the parameters 'a' and 'b'
        // };

        BiConsumer<String, String> printName1 = (name1, name2) -> System.out.println("Couple is ("+name1+", "+name2+")");
        Map<String,String> listCouple=new HashMap<>();
        listCouple.put("Barbie","Ken");
        listCouple.put("Ann","Billy");
        listCouple.forEach(printName1);
        // Couple is (Ann, Billy)
        // Couple is (Barbie, Ken)

        printName1.accept("Bar", "Cat"); // Couple is (Bar, Cat)
        
        // List<List<String>> keyValue = new ArrayList<>();
        // keyValue.add(new ArrayList<>(List.of("Anna", "Barbeque")));
        // keyValue.add(new ArrayList<>(List.of("Babrara","Calvin")));
        // SuperConsumer
        SuperConsumer<String,Integer,String> superConsumer = (s1,i1,s2)->{
            System.out.println(new StringBuilder(s2).append(s1.charAt(i1)));
        };
        superConsumer.accept("carry", 4, "hello ");
        CommonConsumer<String> commonConsumer = (s1,s2,s3)->{
            
        };
    }
    public static boolean sendEmail(String emailAdd){
        
        System.out.println("I am sending email "+emailAdd);
        return true;
    }
}
