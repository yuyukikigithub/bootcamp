import java.util.Objects;

public class Book1 {
    private String name;
    public Book1(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return  "Book1("+this.name+")";
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) {
            return true;
        }
        if (!(ob instanceof Book1)) {
            return false;
        }
        Book1 auth = (Book1) ob;
        return Objects.equals(this.name,auth.getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }
}
