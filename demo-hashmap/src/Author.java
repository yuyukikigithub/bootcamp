import java.util.Objects;

public class Author {
    private String name;
    
    public Author(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    

    @Override
    public boolean equals(Object ob){
        if (this == ob) {
            return true;
        }
        if (!(ob instanceof Author)) {
            return false;
        }
        Author auth = (Author) ob;
        return Objects.equals(this.name,auth.getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }
    @Override
    public String toString(){
        return "Author("+this.name+")";
    }

    public static void main(String[] args) {
        
    }
}
