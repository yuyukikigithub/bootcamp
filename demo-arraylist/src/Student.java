public class Student {
    private int number;
    private Student prev;
    private Student next;

    public Student(int number){
        this.number=number;
    }
    public void setPrev(Student prev){
        this.prev=prev;
    }
    public void setNext(Student next){
        next.setPrev(this);
        this.next=next;
    }
    public Student getPrev (){
        return this.prev;
    }
    public Student getNext (){
        return this.next;
    }
}
