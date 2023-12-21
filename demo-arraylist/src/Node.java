public class Node {
    private int value;
    private Node next; // reference --> store object reference of another Node object 
    private Node prev;

    public Node(int value){ // Node --> other node address
        this.value=value;
    }
    public void setNext(Node next){
        if (next!=null) {
            next.setPrev(this);    
        }
        this.next=next;
    }
    private void setPrev(Node prev){
        this.prev=prev;
    }
    public Node prev(){
        return this.prev;
    }
    public Node next(){
        return this.next;
    }
    public int getValue(){
        return this.value;
    }
    @Override
    public String toString(){
        return "Node(value:"+this.value+")";
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        Node node1 = new Node(101);
        head.setNext(node1);

        System.out.println(node1.prev());
        Node node2=new Node(102);
        node1.setNext(node2);
        System.out.println(node2.prev());
        
        System.out.println(head.next().next().getValue());
        System.out.println(head.next().next().prev().getValue());
        System.out.println(node1.next());
        // 1st next() --> node1
        // 2nd next() --> 102 node
        // getValue() --> 102
       
    }

}
