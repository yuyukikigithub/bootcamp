
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString(){
        return "ListNode("+this.val+")";
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2=new ListNode(2);
        n1=new ListNode(1,n2);
        System.out.println(n1.next);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode no = head;
        ListNode temp = null;

        while(no!=null){
            temp=no;
            while(temp.next!=null && no.val==temp.next.val){
                temp=temp.next;
            }
            no.next=temp.next;
            no=no.next;
        }
        return head;
    }
}
