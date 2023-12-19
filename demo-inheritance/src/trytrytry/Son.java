package trytrytry;

public class Son extends Father{
    int level=2;
    private String name;
    private int age;
    public Son(String name, int age, String school) {
        super(name, age);
        this.school=school;
    }
    private String school;
    String getSchool(){
        return this.school;
    }
    public String eat(String food){
        return "[Son] I am eating "+food+".. .";
    }
    public static void main(String[] args) {

        // int age=Son.level; // Cannot make a static reference to the non-static field Son.level
        
        //overloading
        //compile time: son object can access which methods
        Father fa = new Son("peter",10,"St. Paul");
        System.out.println(fa.eat());; // son reference is declared by Father
        // run time: find the object pointing to
        
        Father fa2 = new Father("chi", 35);
        System.out.println(fa2.eat());


        Father f1 = new Son("peter",10,"St. Paul");
        Father.ancester = "HingLing";
        System.out.println();
        System.out.println(f1.getAge());
        System.out.println(f1.getName());
        Son s1=(Son) f1;
        System.out.println(s1.getSchool());;
    }
}
