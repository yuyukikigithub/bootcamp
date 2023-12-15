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
}
