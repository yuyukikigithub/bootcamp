import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoStack {
    private static final String LinkdedList = null;

    public static void main(String[] args) {
        // LIFO Stack
        //
        // stack -- extension of List -- can get middle 
        List<String> stack = new Stack<>();
        // if use List as reference type, object reference has no push and pop scope
        Stack<String> stack2 = new Stack<>();
        stack2.push("Hello");
        stack2.push("Abc");
        System.out.println(stack2.pop()); 
        System.out.println(stack2.pop());// 1. cannot pop emtpy stack, otherwise Exception
        System.out.println(stack2);
        // 2. can access middle element
        stack2.push("aaa");
        stack2.push("bbb");
        stack2.push("ccc");
        System.out.println(stack2.get(0));
        System.out.println(stack2.get(1));
        // 3. slow
        long start = System.nanoTime();
        ArrayList<String> ll=new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            ll.add("a");
        }
        long end = System.nanoTime();
        System.out.println("stack push:"+(end-start));

        start=System.nanoTime();
        LinkedList<String> ls=new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            ls.add("a");
        }
        end=System.nanoTime();
        System.out.println("stack add:"+(end-start));
        // add is faster than push in Stack
        // ArrayList faster than LinkedList faster than Stack 


        stack2.remove(0);
        //LIFO, but it has index, can remove head
        System.out.println(stack2);


    }
}
