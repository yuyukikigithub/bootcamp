package box;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    public double area(){
        return -1.0;
    }

    public static <T extends Shape> double area1(List<T > shapes){
        // List<Shape> ls = (List<Shape>) shapes;
        double sum = 0.0d;
        for (T shape : shapes) { // no T when run time
            sum+=shape.area();
        }
        return sum;
    }
    public static double area3(List<? extends Shape> shapes){ // Shape以下
        double sum = 0.0d;
        for (Shape shape : shapes) { // either Square or Circle, polumorthism
            sum+=shape.area();
        }
        return sum;
    }
    public static void add(List<? super Shape> shapes, Shape shape){ // Shape 以上, area4?
        shapes.add(shape);
    }
    public static double area2(List<Shape> shapes){
        double sum = 0.0d;
        for (Shape shape : shapes) {
            sum+=shape.area();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Circle c1=new Circle(0.1);
        Circle c2=new Circle(0.2);
        Circle c3=new Circle(2.1);

        List<Circle> circles=new ArrayList<>();
        circles.add(c1);
        circles.add(c2);
        circles.add(c3);
        System.out.println(circles);

        List<Square> squares = new ArrayList<>();
        Square q1=new Square(0.1);
        Square q2=new Square(0.2);
        Square q3=new Square(2.1);
        squares.add(q1);
        squares.add(q2);
        squares.add(q3);
        System.out.println(squares);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.1));
        shapes.add(new Square(1.2));

        area3(shapes);
        area1(shapes);
        area2(shapes); // only accept shapes


    }

}
