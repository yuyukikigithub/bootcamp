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
        


    }
}
