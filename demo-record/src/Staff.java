import java.util.Objects;

public class Staff {
    private final String name;
    private final int age;
    public Staff(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return "Staff[Name= "+this.name+", Age= "+this.age+"]";
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff staff = (Staff) obj;
        return Objects.equals(this.name, staff.getName()) && Objects.equals(this.age, staff.getAge());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.age);
    }
    
}
