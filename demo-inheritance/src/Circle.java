import java.math.BigDecimal;

public class Circle extends Shape {
    private double radius;
    private String color;

    // Circle extend shape, it has to override all abstract method in parent class
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color){
        super(color); // Shape 保管
        this.radius=radius;
    }

    //circle extend shape
    // so it must impliment all abstract method in parent abstract class
    @Override
    public double area(){
        BigDecimal rad =  BigDecimal.valueOf(this.radius);
        return rad.multiply(rad).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    }
    // public String getColor(){
    //     return this.color;
    // }
    public double getRadius(){
        return this.radius;
    }

    public static void main(String[] args) {
        Circle cir = new Circle(2.3d, "red");
        System.out.println(cir.getRadius());
        Shape sh=cir;
        System.out.println(sh==cir); // true
        // System.out.println(sh.getRadius());
    }

}
