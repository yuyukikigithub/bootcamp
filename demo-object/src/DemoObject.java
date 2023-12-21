

public class DemoObject { // implicitly extends Object, if not listout, auto extend

    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) throws Exception {
        Object o1 = new Object();
        System.out.println(o1.toString()); // java.lang.Object@36baf30c

        // Example 1
        DemoObject do2 = new DemoObject();
        Object o2 = do2; // upcast
        System.out.println(o2.toString()); // Object's method
        System.out.println(o2 == do2); // true // 唔同指針 指向同一object
        // compile time => o2 is a object ref with the type of object, able to itself
        // method
        // runtime must be ok if upcast

        // Example 2
        // DemoObject do1 = (DemoObject) o1; // downcast// no sure whether subclass method run --> dont downcast
        // do1.run(); // compile time good-- do1 is a object ref with the type if
        // DemoObject. able to call run()
        // but run time... once do1 found object [new Object()], there is NO run()
        // method.
        // System.out.println(do1==o1);

        // getClass()
        DemoObject do3 = new DemoObject();
        if (do3.getClass()==DemoObject.class) { // instance of // "DemoObject.class" is value
            System.out.println("it's true");
        }
        if (do3 instanceof DemoObject) { // instance of
            System.out.println("it's true2");
        }
        Class<?> clas= do3.getClass();
        System.out.println(clas.getName());

        // equals() hashCode()
        String s1 = "hello";
        String s2 = "sdf";
        System.out.println(s1.equals(s2));

        Cat1 cat1 = new Cat1("Prince", 10);
        Cat1 cat2 = new Cat1("Kimberley", 15);
        Cat1 cat3 = cat1;
        Cat1 cat4 = new Cat1("Prince", 10);
        // System.out.println(cat1.getEyes().toString());
        // System.out.println(cat4.getEyes());
        
        // System.out.println(cat1.equals(cat3));//true
        System.out.println(cat1.equals(cat4)); // true
        

    }
    // String
    // public boolean equals(Object anObject) {
    //     if (this == anObject) {
    //         return true;
    //     }
    //     return (anObject instanceof String aString)
    //             && (!COMPACT_STRINGS || this.coder == aString.coder)
    //             && StringLatin1.equals(value, aString.value);
    // }
    //Object
    // public boolean equals(Object obj) {
    //     return (this == obj); // check same object?
    // }
}
