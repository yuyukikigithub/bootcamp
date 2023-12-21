import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) throws Exception {
        List<String> ls = new LinkedList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("ijk");
        // linked Object right hand side
        // add remove
        ls.remove(1); // 可以攞中間
        System.out.println(ls);
        System.out.println(ls.size());
        Queue<String> qs=new LinkedList<>(); // 不能攞中間, first in first out
        qs.offer("abc");
        qs.add("def");
        qs.add("ijk");
        qs.poll();//"abc"
        qs.poll();//"def"
        System.out.println(qs);
        System.out.println(qs.size());

        Deque<String> dq1 = new LinkedList<>();
        dq1.add("ABC");
        dq1.addFirst("123");
        dq1.addLast("2345");
        dq1.addFirst("0123");
        System.out.println(dq1);
        dq1.removeLast();
        System.out.println(dq1);
                System.out.println(dq1.peekLast());
        dq1.pollLast();
        System.out.println(dq1);
        dq1.pollFirst();
        System.out.println(dq1);
        // System.out.println(dq1.peek());
        // dq1.pollLast();
        // dq1.pollLast();
        // dq1.removeLast();
        // dq1.removeLast();
        System.out.println(dq1);

        // removeLast vs pollLast
        // offer vs add

        Deque dq2 = new LinkedList<>();
        
        
        

    }
}
