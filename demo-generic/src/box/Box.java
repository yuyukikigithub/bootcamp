package box;

import java.util.ArrayList;
import java.util.List;

public class  Box<T> { // will use type T in the class
    T t;

    public Box(){
        
    }
    public Box(T ini){
        this.t=ini;
    }
    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return this.t;
    }
    public static <T> Box<T> createBox(T t){
        Box<T> box=new Box<>();
        box.setT(t);
        return box;
    }

    public static double calculate(Box<Shape> box){
        return box.getT().area();
    }

    // public static void addShape(List<Shape> ls, Shape shape){
    //     ls.add(shape); // work
    // }
    public static <U extends Shape> void xxx(U u){
        u.area(); 
    }
    // public static <T extends Shape> void addShape(List<T> ls, Shape shape){
    //     ls.add(shape); // 炒粉 // ls extends method of Shape
    // }
    public static void addShape(List<Shape > ls, Shape shape){
        ls.add(shape); //  
    }
    public static  void addShape2(List<? extends Shape > ls, Shape shape){// Shape -- upper bound
        List<Shape> ls2=(List<Shape>) ls; // fix the content of List to Shape
        ls2.add(shape); 
    }
    public static void addShape3(List<? super Circle > ls, Shape shape){ // Circle -- lower Bound
        // List<Object> ls2 = (List<Object>) ls;
        // ls2.add(shape); //  
        ls.add(new SmallCircle(3.2)); // SmallCircle can be added directly coz lower than Circle
        ls.add(new Circle(1.2)); // Circle can be add coz same as Circle upper bound
    }
    public static double area(Box<Shape> box){
        return box.getT().area();
    }

    // public static <T extends Animal> void makeSound(Box<T> b){
    // }
    // // same
    // public static void makeSound(Box<Animal> b){
    // }
    
    public static void main(String[] args) {
        Box<Circle> circleBox=new Box<>();
        
        circleBox.setT(new Circle(2.0));

        // even when Shape and Circle is parent relationship, Box<Shape> and Box<Circle> is not Parent relationship
        // Box<Shape> and Box<Circle> is different type of object
        // calculate(circleBox); //  error , Box<Circle> <--> Box<Shape> is not Parent relationship
        // area(circleBox);

        Box<Shape> shapeBox=new Box<>();
        shapeBox.setT(new Shape());
        calculate(shapeBox);
        area(shapeBox);

        // ? 
        

        List<?> lss=new ArrayList<Circle>();
        // lss.add(new Circle(2.0));

        List<? extends Object> xs = new ArrayList<Circle>(); // ? vs T
        // xs.add(new Circle(1.0));

        List<? extends Shape> ls = new ArrayList<Circle>(); // ? vs T
        // ls.add(new Circle(4.0)); // compile error: List cannot define the content type
        System.out.println(ls instanceof ArrayList);
        List<Shape> ll=(List<Shape>) ls; // downcast
        System.out.println(ll instanceof List<Shape>);
        ll.add(new Shape());
        ls= new ArrayList<Circle>();

        Shape s=new Circle(3.2);
        System.out.println(s.area());
        s=new Shape();
        System.out.println(s.area()); // -1.0

        List<? extends Circle> cir1=new ArrayList<SmallCircle>();
        List<? super Circle> cir2 = new ArrayList<>();
        cir2.add(new SmallCircle(54.2));
        
        
        
    }
}
