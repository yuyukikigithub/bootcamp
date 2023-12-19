package trytrytry;

public class Father {
    int level=1;
    public static String ancester;
    private String name;
    private int age;
    

    public Father(String name, int age){
        this.name=name;
        this.age=age;
    }

    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }
    public String eat(){
        return "[Father] I am eating";
    }

    public static void main(String[] args) {
        
    }
}
