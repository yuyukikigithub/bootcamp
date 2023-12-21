import java.util.Objects;

public class Eye {
    private String color;
    private double radius;

    public Eye(String color,double radius){
        this.color=color;
        this.radius=radius;
    }

    public String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Eye)) {
            return false;
        }
        Eye eye =(Eye) obj;
        return Objects.equals(eye.getColor(), this.color)
            && Objects.equals(eye.getRadius(), this.radius);
    }

    @Override
    public int hashCode() {// hashCode -> represent object address
        return Objects.hash(this.color, this.radius);
    }
    @Override
    public String toString(){
        return  "Eye("+this.color+","+this.radius+")";
    }
    public static void main(String[] args) {
        Eye e1 = new Eye("Red", 2);
        Eye e2 = new Eye("Red", 2);
        System.out.println(e1.equals(e2));
    }
}
