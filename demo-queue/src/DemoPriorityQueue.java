
import java.util.PriorityQueue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> qs=new PriorityQueue<>();
        qs.add("hello");
        qs.add("x");
        qs.add("a");
        System.out.println(qs); // auto-sorting each add

        PriorityQueue<String> ps=new PriorityQueue<>(new SortByDesc());//new SortByDesc()
        ps.add("abc");
        ps.add("cde");
        ps.add("bcd");
        ps.add("def");
        System.out.println(ps);

        System.out.println(ps.poll());;

        // ArrayList
        // HashSet
        // LinkedList
        // HashMap
    }
}
