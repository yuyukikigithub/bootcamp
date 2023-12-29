import java.util.ArrayList;
import java.util.List;

public class Student4 {

    // Builder pattern Advantage
    //1. if you want to control the access to setter after object created, builder patter is good choice
    //2. dont have to create too much constructor according to no of attribute
    

    private String name;
    private int age;
    private List<String> subjects;

    private Student4 (String name, int age, List<String> subjects){
        this.name=name;
        this.age=age;
        this.subjects=subjects;
    }

    private Student4 (Builder builder){
        this.name=name;
        this.age=age;
        this.subjects=subjects;
    }
    public static Builder Builder(){
        return new Builder();
    }

    public static class Builder{ // 分身 of outer class, producer 
        private String name;
        private int age;
        private List<String> subjects;
        public Builder name(String name){ // setter
            this.name=name;
            return this; // return 自己
        }
        public Builder age(int age){ // setter
            this.age=age;
            return this; // return 自己
        }
        public Builder subjects(List<String> subjects){ // setter
            this.subjects=subjects;
            return this; // return 自己
        }

        public Student4 build(){
            // return new Student4(this.name, this.age, this.subjects);
                return new Student4(this);
        }
    }
    public static void main(String[] args) {
        Student4 student = new Student4("john", 4, new ArrayList<>(List.of("Maths", "English")));
        // new sth without new
        Student4 student2 = new Student4.Builder().name("Peter").age(10).subjects(new ArrayList<>(List.of("Maths", "English"))).build();
        Student4 student3=Student4.Builder().name("Peter").age(10).subjects(new ArrayList<>(List.of("Maths", "English"))).build();
    
        student3.name="sljdfo";
        System.out.println(student3.name);
    }
}
