// blueprint to produce Person objects
public class Person { // 藍圖
    // attribute
    // private String name ;// default null
    private String firstName;
    private String lastName;

    private int age; // default int 0

    private double height;

    private String occupation;

    // ------------------------------------------------

    // constructor (produce Person's object)

    public Person() {// create object
        
    }

    public Person(String lastname) {// create object
        this.lastName = lastname;
    }

    // constructor () / method ?
    public Person(String lastName, String firstName, int age) {// create object with string
        this.lastName = lastName; // this -> this object's _______ , in this case this.attribute/工具
        this.firstName = firstName;
        this.age = age;
    }

    // constructor name cannot be different from class name
    public Person(String lastName, String firstName, double height, int age, String occu) {
        // this.lastName = lastName;
        // this.firstName = firstName;
        // this.age = age;
        this(lastName,firstName,age); //overloading , use above constructor's this
        this.height = height;
        this.occupation = occu;
    }



    // ------------------------------------------------

    // 工具

    // instance/object method, 工具即在object中 (vs static, stand alone from object)

    // setter
    public void setName(String lastName, String firstName) { // object's 工具// put something into param -> 和外界溝通/修改
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setOccupation(String occu) {
        this.occupation = occu;
    }

    // getter
    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFullName() {
        return this.lastName==null? this.firstName: this.firstName + " " + this.lastName;
    }

    public String firstLetterUpper(String abc) {
        return abc.substring(0,1).toUpperCase().concat(abc.substring(1, abc.length()));
        //String.valueOf
    }

    public String getNameFullLetter() {
        String lastName = this.lastName;
        String firstName = this.firstName;
        return firstLetterUpper(lastName)
                .concat(" ")
                .concat(firstLetterUpper(firstName));
    }

    public String getFullName(boolean isCapital) {
        String result = this.firstName+ " " + this.lastName;
        return isCapital?result.toUpperCase():result.toLowerCase();
    }


    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public String getOccupationRole(int num) {
        return this.getOccupation().concat(" " + num);
    }

    public static void swimming(){// cannot use object data
        System.out.println("im swimming");
    }

    public void swim() {// void method can be with 'return' or without 'return'
        int a=0;
        if (a==1) {
            return;
        }
        System.out.println(this.lastName+" is swimming");
    }

    public int eat(){// int method must be with return
        int b=0;
        if (b>10) {
            return 10;
        }
        return -1;
    }

    // -----------------------------------------------
    // testing

    public static void main(String[] args) {
        // Person()
        Person p1 = new Person();
        p1.setName("john", "Soon");
        System.out.println(p1.lastName);
        Person p2 = new Person();
        p2.setName("peter", "suen");

        Person p3 = p1;
        System.out.println(p1.lastName);
        p3.setName("mary", "Lou");
        System.out.println(p1.lastName); // as p3 point to p1 (same address), when p3 change address, p1 also change
                                         // address, so p1 is "mary"
        System.out.println(p3.lastName);

        p2.setName("Peter", "Bei");
        p2 = p1;// as p2 point to p1, as p1 is mary, p2 also mary,
        p2.setName("Peter", "Hui");
        System.out.println(p1.firstName);// as p2 point to p1, as p2 is Peter, p1 also Peter

        // Person(String x)
        Person s1 = new Person("hello", "world", 10);
        System.out.println(s1.lastName);
        System.out.println(s1.age);

        Person p4 = new Person("Tommy", "Lie", 20);
        p4.setName("Jenny", "Wo");
        System.out.println(p4.getLastName());
        p2 = p4;
        p4 = p1;
        System.out.println(p2.getFirstName());
        System.out.println(p1.getLastName());

        Person p5 = new Person("Rooo", "hel", 23);
        p5.setAge(25);
        p5.setHeight(167.45);
        System.out.println(p5.getHeight());
        System.out.println(p5.getAge());

        Person p6 = new Person();
        p6.setOccupation("CO");
        System.out.println(p6.getOccupation());
        System.out.println(p6.getAge());
        System.out.println(p6.getOccupationRole(1));

        Person p7 = new Person("Ku", "Rosa", 22);
        System.out.println(p7.getFullName());

        Person p8 = new Person("Lam", "Racoon", 127.3, 57, "programmer");
        System.out.println(p8.getOccupationRole(1));
        System.out.println(p8.getFullName());
        System.out.println(p8.getFullName(true));
        System.out.println(p8.getFullName());

        Person p9 =new Person("koala", "tree", 50, 10, "Snapping");
        System.out.println(p9.getFullName(false)+" with "+p9.height+"cm and "+p9.age+" year-old is "+p9.occupation);

        System.out.println(p9.getNameFullLetter());

        // static vs instance method
        Person p10=new Person("last");
        p10.swim(); // instance method, work with attribute
        Person.swimming();// static method, not belong to object cannot use object attribute, belong to class
        

    }
}
