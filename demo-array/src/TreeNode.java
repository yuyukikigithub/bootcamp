class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        ListNode temp=this;
        int idx = 1;
        sb.append(temp.val);
        while (temp.next!=null) {
            
            if (temp.next!=null) {
                temp=temp.next;
                sb.append(", ").append(temp.val);
            }
            idx++;
        }
        return sb.append("] "+idx).toString();
    }

    public static void main(String[] args) {
        ListNode nono = new ListNode(2);
        nono.next=new ListNode(8);
        nono.next.next=new ListNode(5);
        nono.next.next.next=new ListNode(6);

        System.out.println(nono);
        
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("["+this.val+", ");
        TreeNode temp=this;
        while (temp!=null) {
            result.append(temp.left.val).append(", ");
            temp=temp.right;
            while(temp!=null){
                result.append(temp.val).append(", ");
                temp=temp.left;
            }
        }
        return result.append("]").toString();
    }

    public static void main(String[] args) {
    TreeNode original = new TreeNode(7);
    original.left=new TreeNode(4);
    original.left.left=new TreeNode(4);
    original.left.right=new TreeNode(7);
    original.right=new TreeNode(3);
    original.right.left=new TreeNode(6);
    original.right.right=new TreeNode(19);
    System.out.println(original);
    }


  }