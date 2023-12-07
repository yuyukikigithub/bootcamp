package staticvariable;


public class Librarian {
    public static Librarian librarian;
    private String name;

    public Librarian(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        Librarian lib1=new Librarian("may");
    }
}
