package staticvariable;

public class Book {
    private String name;
    private String type;
    
    public Book(String name, String type){
        this.name= name;
        this.type=type;
    }

    @Override
    public String toString(){
        return "BookName: "+this.name+", BookType: "+this.type;
    }
    
}
