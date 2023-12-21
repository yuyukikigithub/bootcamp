import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) throws Exception {
        List<String> strings=new ArrayList<>();
        // Map: 
        //1. key value pair -> <key, value>
        //2. key must be unique
        Map<String, Integer> ageBook = new HashMap<>();
        //put method
        ageBook.put("John", 20);
        ageBook.put("John",30); //update 20 to 30, coz John is key
        ageBook.put("Peter", 18); // new entry

        System.out.println(ageBook.size());

        for (Map.Entry<String, Integer> en : ageBook.entrySet()) {
            System.out.println(en.getKey()+" "+en.getValue());
        }

        // get method
        System.out.println(ageBook.get("John"));

        Map<Integer, String> pollList = new HashMap<>();
        pollList.put(1,"Kelvin Lo");
        pollList.put(2,"Kok Tam");
        pollList.put(3,"Jame Lee");
        pollList.put(4, "Nancy Sit");

        for (Map.Entry<Integer, String> keyValue :pollList.entrySet()) {
            System.out.println("There is candidate "+keyValue.getKey()+". "+keyValue.getValue());
        }

        System.out.println(pollList.get(3));

        Map<Integer, Node> nodeList=new HashMap<>();
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        nodeList.put(1, n1);
        nodeList.put(2, n2);
        nodeList.put(3, n3);
        for (Map.Entry<Integer, Node> en : nodeList.entrySet()) {
            System.out.println("Pair set: "+en.getKey()+". "+en.getValue());
        }
        System.out.println(nodeList.get(2));

        Map<String, Book1> bookList = new HashMap<>();
        bookList.put("Sally", new Book1("All Best"));
        bookList.put("Betty", new Book1("Good Morning"));
        bookList.put("Cindy", new Book1("Cooking Menu"));

        for (Map.Entry<String, Book1>en : bookList.entrySet()) {
            System.out.println("BookList("+en.getKey()+","+en.getValue()+")");
        }

        System.out.println(bookList.get("Sally"));

        // Map <Author, Book1>
        Map<Author, Book1> list1 = new HashMap<>();
        Author a1=new Author("John");
        list1.put(new Author("John"), new Book1("GoodMOrning"));
        list1.put(new Author("Peter"),new Book1("Travelling in Japan"));
        list1.put(new Author("John"), new Book1("GoodAfternoon")); 

        System.out.println(list1.size());
        // check whether same Author name is the same key
        // no equals/hashCode method, cannot check isSame object with same name-> 2 new John
        // has equals/hashCode method, can check isSame object with same name-> 1 john

        // if no equals/hash method, 2 john new entries -> 3 objects
        // have equals/hash method, auto-update john -> 2 objects
        for (Map.Entry<Author, Book1> en : list1.entrySet()) {
            System.out.println(en.getKey()+" "+en.getValue());
        }
        System.out.println(list1.get(new Author("John"))); // if has no equals method, null
        // no equals, no checking whether is the same object
        // new object -> there is no value of a new object
        // null

        // no hashCode
        // null

        System.out.println(list1.containsKey(new Author("John"))); // true, if has equal method in AUthor
        System.out.println(list1.containsValue(new Book1("GoodMOrning")));//true , have this value?

        System.out.println(list1.putIfAbsent(a1, new Book1("Travelling in Japan")));
        // put a keyValue pair if there is no such keyValue pair
        // output original value of key
        // if new key, put new keyValue pair
         
        System.out.println(list1);
    }
}
