import java.util.Arrays;

public class StringQueue implements Addable,Pollable{
    private String[] queue;

    public StringQueue(){
        this.queue=new String[0];
    }
    @Override
    public void add(String s){ // 封裝 element
        addTail(s);
    }
    @Override
    public String poll(){
        return pollHead();
    }

    public boolean isEmpty(){
        return queue.length==0;
    }

    public void clear(){
        this.queue=new String[0];
    }

    public String peak(){
        return this.queue[0];
    }

    private String pollHead(){
        if (queue.length==0) return null;
        String[] newArr=new String[queue.length-1];
        String head=queue[0];
        int idx=0;
        for (int i = 1; i < queue.length; i++) {
            newArr[idx++]=queue[i];
        }
        this.queue=newArr;
        return head;
    }

    public void addTail(String s){
        String[] newArr=Arrays.copyOf(queue, queue.length+1);
        newArr[queue.length]=s;
        queue=newArr;
    }



    public static void main(String[] args) {
        StringQueue sq1=new StringQueue();
        sq1.add("frist");
        sq1.add("second");
        sq1.add("third");



        // if other one wants more function but not amend this class
        // -> extends this class


        int[]nums1 = new int[]{4,3,2,3,1}; 
        int[]nums2 = new int[]{2,2,5,2,3,6} ;
        int[]results=new int[2];
        boolean[] common1=new boolean[100];
        boolean[] common2=new boolean[100];
        
        for (int i = 0; i < nums1.length; i++) {
            common1[nums1[i] - 1] = true;
        }
        for (int i = 0; i < nums2.length; i++) {
            common2[nums2[i] - 1] = true;
        }
        for (int i = 0; i < nums1.length; i++) {
            if (common2[nums1[i] -1])
                results[0]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (common1[nums2[i] - 1])
                results[1]++;
        }
        System.out.println(results);

        String s1 = "wxyz";//abcd wxyz yuki
        String s2 = "fzwx";//cdab yxwz ykui
        int sum1 = (int) s1.charAt(0)+s1.charAt(1)+s1.charAt(2)+s1.charAt(3);
        int sum2 = (int) s2.charAt(0)+s2.charAt(1)+s2.charAt(2)+s2.charAt(3);
        System.out.println(sum1==sum2);
        String str1=(s2.substring(s2.indexOf(s1.charAt(0)), s2.length()));
        String str2=s2.substring(0, s2.indexOf(s1.charAt(0)));
        System.out.println((s1.charAt(0)==s2.charAt(2)&&s1.charAt(2)==s2.charAt(0))||(s1.charAt(1)==s2.charAt(3)&&s1.charAt(3)==s2.charAt(1)||s1.equals(s2)));
        
        
        


    }
    public boolean  canBeEqual(String s1, String s2) {
        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(2) != s2.charAt(2))
            if (s1.charAt(0) != s2.charAt(2) || s1.charAt(2) != s2.charAt(0))
                return false;
        if (s1.charAt(1) != s2.charAt(1) || s1.charAt(3) != s2.charAt(3))
            if (s1.charAt(1) != s2.charAt(3) || s1.charAt(3) != s2.charAt(1))
                return false;
        return true;
    }
}
