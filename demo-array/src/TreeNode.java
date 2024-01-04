 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("["+this.val+", ");
        TreeNode temp=this;
        while (temp!=null) {
            result.append(temp.val).append(", ");
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
    original.right=new TreeNode(3);
    original.right.left=new TreeNode(6);
    original.right.right=new TreeNode(19);
    System.out.println(original);
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode result = new TreeNode(target.val);
        while(cloned!=null){
            while(cloned.left!=null){
                if(cloned.left==target) {
                    result = cloned.left;
                    break;
                }
                if(cloned.right==target) {
                    result = cloned.right;
                    break;
                }
            }
            while(cloned.right!=null){
                if(cloned.left==target) {
                    result = cloned.left;
                    break;
                }
                if(cloned.right==target) {
                    result = cloned.right;
                    break;
                }
            }
        }
        return result;
    }
  }