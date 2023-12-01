// blueprint to produce Person objects
public class Person { // 藍圖
    //attribute
    private String name ;// default null

    private int age; // default int 0

    private double height;

    private String occupation;

    //------------------------------------------------

    // constructor (produce Person's object)
    public Person() {// create object
        
    }

    //constructor () / method ? 
    public Person(String name, int age) {// create object with string
        this.name = name; // this -> this object's _______ , in this case this.attribute/工具 
        this.age = age;
    }

    //------------------------------------------------

    //工具

    //instance/object method, 工具即在object中 (vs static)
    
    //setter
    public void setName(String name){ // object's 工具// put something into param -> 和外界溝通/修改
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setOccupation(String occu){
        this.occupation = occu;
    }

    
    

    //getter
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
    public String getOccupation() {
        return this.occupation;
    }
    public String getOccupationRole( int num) {
        return this.getOccupation().concat(" "+num);
    }

    //-----------------------------------------------
    // testing

    public static void main(String[] args) {
        //Person()
        Person p1 = new Person();
        p1.setName("john");
        System.out.println(p1.name);
        Person p2 = new Person();
        p2.setName("peter");

        Person p3 = p1;
        System.out.println(p1.name);
        p3.setName("mary");
        System.out.println(p1.name); // as p3 point to p1 (same address), when p3 change address, p1 also change address, so p1 is "mary"
        System.out.println(p3.name);

        p2.setName("Peter");
        p2 = p1;// as p2 point to p1, as p1 is mary, p2 also mary, 
        p2.setName("Peter");
        System.out.println(p1.name);// as p2 point to p1, as p2 is Peter, p1 also Peter

        //Person(String x)
        Person s1 = new Person("hello",10);
        System.out.println(s1.name);
        System.out.println(s1.age);

        Person p4 = new Person("Tommy",20);
        p4.setName("Jenny");
        System.out.println(p4.getName());
        p2 = p4;
        p4 = p1;
        System.out.println(p2.getName());
        System.out.println(p1.getName());

        Person p5 = new Person("Rooo", 23);
        p5.setAge(25);
        p5.setHeight(167.45);
        System.out.println(p5.getHeight());
        System.out.println(p5.getAge());

        Person p6 = new Person();
        p6.setOccupation("CO");
        System.out.println(p6.getOccupation());
        System.out.println(p6.getAge());
        System.out.println(p6.getOccupationRole(1));


    }
}

