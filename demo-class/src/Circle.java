import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Circle {
    //-------------------
    //attribute -> raw data to describe object
    private double radius;
    private String color;
    //-------------------------------
    //constructor -> create object
    public Circle() {

    }

    // always write 'this' in constructor and method !!!
    // this 內在 attribute, 外來 pass parameter,thats it

    public Circle(double radius){
        this.radius = radius;
    }
    //getter
    public double getRadius(){
        return this.radius;
    }
    // setter
    public void setRadius(double radius){
        this.radius = radius;
    }
    //直徑
    public double diameter(){
        return this.radius*2;
    }
    //area
    public double area(){
        // return (this.radius*this.radius*Math.PI);
        return Math.pow(this.radius,2)*Math.PI;
    }

    public static double area(double radius){
        BigDecimal r = BigDecimal.valueOf(radius);// to string
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        return r.multiply(r).multiply(pi).doubleValue();//to double value
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.14);
        System.out.println("c1's radius = "+c1.getRadius());
        System.out.println("c1's diameter = "+c1.diameter());
        System.out.println("c1's area = "+c1.area());

        Circle c2 = new Circle(3.15);
        System.out.println("c2's radius = "+c2.getRadius());
        System.out.println("c2's diameter = "+c2.diameter());
        System.out.println("c2's area = "+c2.area());

        c1=c2;
        System.out.println("c1's radius = "+c1.getRadius());
        System.out.println("c1's diameter = "+c1.diameter());
        System.out.println("c1's area = "+c1.area());

        Cat cat=new Cat();//empty constructor
    }

}
