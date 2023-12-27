package box;

public class Square extends Shape{
    private double side;

    public Square(double side){
        this.side=side;
    }
    @Override
    public double area(){
        return Math.pow(side, 2);
    }
    @Override
    public String toString(){
        return "Square("+this.side+")";
    }
}
