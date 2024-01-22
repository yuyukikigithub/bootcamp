public class Square extends Shape {

    private int length;
    private String color;
    public Square(){

    }

    public Square(int length){
       
        this.length=length;
    }

    @Override
    double area() {
        return Math.pow(this.length,2);
    }
    
    
}
