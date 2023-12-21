import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class DemoArrayDeque {
    public static void main(String[] args) {
        Queue<String> qs = new ArrayDeque<>();
        qs.add("AAA");
        qs.add("BBB");
        qs.add("CCC");
        System.out.println(qs.poll());
        System.out.println(qs.peek());

        Deque<String> ds=new ArrayDeque<>();
        ds.addFirst("AAA");
        ds.add("BBB");
        ds.addFirst("CCC");
        ds.add("DDD");
        ds.add("EEE");
        ds.removeLast();
        System.out.println(ds.pollLast());
        String s1=  "";
        String[] s2= s1.split(" ");
        System.out.println();

        List<String> ls = new ArrayList<>(List.of(s2));
        System.out.println(ls.size());
        
    }
}
