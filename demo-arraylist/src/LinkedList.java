import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;

    public LinkedList(){
        
    }
    public void add(int value){
        if (head==null) {
            head= new Node(value);
            return;
        }
        Node current = this.head;
        while (current.next()!=null) {
            current = current.next();
        }
        current.setNext(new Node(value));
    }

    public void remove(int value){
        if (this.head==null) {
            return;
        } 
        if (this.head.getValue()==value) {
            this.head=this.head.next();
        }   
        Node current = this.head;
        while (current!=null) {
            if (current.getValue()==value) {
                current.prev().setNext(current.next());
            }
            current = current.next();
        }
        
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder("LinkedList[");
        Node curNode=this.head;
        while (curNode!=null) {
            sb.append(curNode.getValue()).append(", ");
            curNode=curNode.next();
        }
        return sb.append("]").toString();
    }
    

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.add(23);
        ll.add(3);
        ll.add(4);
        ll.add(120);
        ll.remove(120);
        ll.remove(4);
        // System.out.println(ll);

        List<String> ls1 = new ArrayList<>(100);// capacity
        // initiate array with 100 rooms
        System.out.println(ls1.size()); //0, no of elements
        
    }

}
