public class Demo {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("john", 30);
        // allow all-args constructor only
        System.out.println(student.name());
        // no empty constructor
        // no getter
        // no setter
        System.out.println(student);

        //equals
        StudentRecord student2 = new StudentRecord("john", 30);
        System.out.println(student.equals(student2)); // true

        //hashcode
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        CatRecord cat = new CatRecord("Kimberley", 10, new EyeRecord(12.0, "green"));
        CatRecord cat1 = new CatRecord("Kimberley", 11, new EyeRecord(12.0, "green"));
        System.out.println(cat1);
        cat1.eat();
        System.out.println(cat.equals(cat1));

    }
}
