import java.util.Objects;

public class Cat1 {

    private String name;
    private int age;
    private final Eye[] eyes=new Eye[2]; // final the right hand object, so that fix object ,but content can be amended

    public Cat1(){

    }

    public Cat1 (String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    // public Eye[] getEyes(){
    //     return this.eyes;
    // }

    // to create @Override method, because there is the same method in Objects
    @Override
    // compile class, usually have 'equal'
    // to decide what is equal, equal all attribute
    public boolean equals(Object obj){
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Cat1)) {
            return false;
        }
        Cat1 cat = (Cat1) obj;
        //認是否同一object, 介定all attributes is equal 
        // return cat.getAge()==this.getAge() && cat.getName().equals(this.name);
        return Objects.equals(cat.getAge(), this.age) 
            && Objects.equals(cat.getName(), this.name);
            // && Objects.equals(cat.getEyes(), this.eyes);
    }

    @Override
    public int hashCode(){ // hashcode -> object address
        return Objects.hash(this.name, this.age);//認同一object, write all attributes in blanket
    }
}
