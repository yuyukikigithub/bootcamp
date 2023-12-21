import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args)  {
        Set<String> ss = new HashSet<>(); // Set is an interface, HashSet is a class
        List<String> ls = new ArrayList<>();
        ls.add("ABC");
        ls.add("ABC");
        ls.add("ABC");
        for (String string : ls) {
            System.out.println(ss.add(string));
        }
        System.out.println(ss);

        // Set and List has add(), remove(), contains()
        System.out.println(ss.size());
        

    }
   
}
