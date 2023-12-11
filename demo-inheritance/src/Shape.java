import java.math.BigDecimal;

public abstract class Shape { // abstract class vs class
    // Difference
    // 1. abstract class cannot be new
    // 2. may contain abstract method(s),implicitly public

    // Same:
    // 1. may have instance variable (attribute)
    // 2. may have intance methods
    // 3. may have static methods
    // 4. must have constructor, but cannot be new, for super() only

    private String color;

    // constructor
    public Shape(){
        
    }

    public Shape(String color){
        this.color=color;
    }

    abstract double area(); // instance method, implicitly public (diff point 2)
    
    public String getcolor(){ // same point 1, instance method, can be called in children
        return this.color;
    };

    public static double totalArea(Shape[] shapes){
        BigDecimal result = BigDecimal.valueOf(0);
        for (Shape shape : shapes) {
            result = result.add(BigDecimal.valueOf(shape.area()));
        }
        return result.doubleValue();
    }

    public static void main(String[] args) {
        // Shape sh = new Shape() ;
        Shape s1 = new Circle(2.3,"red"); // polymorphism
        // java compile time : s1 has area() method, getColor(), getRadius()

        // left hand side, object reference 
        // left hand side store 形態
        // polymorphism
        System.out.println(s1.getcolor());
        // System.out.println(s1.getRadius()); // cannot get radius

        Circle c2 = (Circle) s1; // no new Circle, downcast, s1 範圍縮小, s1 == c2, same object, shape 高於 circle
        System.out.println(s1==c2); // true, the same object
        System.out.println(c2.getRadius()); // 2.3 can get radius

        Circle c3 = new Circle(2.4,"blue");
        System.out.println(c3.getRadius()); // 2.4
        Shape s2 = c3; // no new circle, upcast , 
        System.out.println(s2==c3); // true, the same object

        float f1 = 1.12f; 
        double d1 =  f1; // upcast float to double
        System.out.println(f1==d1); // true, the same object
        double d2 = 1.13;
        float f2 = (float) d2; // downcast double to float
        System.out.println(d2==f2); // false, not the same object

        long l2= (long) d2; // downcast double to long
        System.out.println(l2==d2); // false, not the same object
    }
}
