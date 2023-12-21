import java.util.LinkedList;
import java.util.List;
import java.util.prefs.NodeChangeEvent;

public class DemoLinkedList {
    public static void main(String[] args) {
        // LinkedList<String> ls = new LinkedList<>();
        List<String> ls = new LinkedList<>();
        ls.add("100");
        ls.add("200");
        ls.add("300");
        ls.remove("200"); // vs
        System.out.println(ls.size());

        // for-each, contains(), isEmpty()

        LinkedList ll1 = new LinkedList<>();
        LinkedList ll2 = new LinkedList<>(List.of("1234","abcd"));
        String i1 = "iamstring";
        ll1.add(i1);
        ll1.add(ll2);
        System.out.println(ll1);
        Node n1=new Node(1);
        Node n2=new Node(2);
        n1.setNext(n2);
        System.out.println(n2.prev());


    }
}
