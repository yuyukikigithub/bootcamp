public class Triangle {

    private int base;
    private int height;

    public Triangle(){

    }
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public void setBase(int base){
        this.base = base;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public double getArea (){
        return (double) this.base*this.height/2;
    }
    
    public String noArea(){
        return "no area is calculated";
    }

    public void areaResponse(double area){
        if (!(area==0.0)) {
            getArea();
        }else {
            noArea();
        }
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3,5);
        System.out.println("t1's area = "+t1.getArea());        

        Triangle t2 = new Triangle();
        t2.setBase(7);
        t2.setHeight(9);
        // System.out.println("t2's aera = "+t2.getArea());
        t2.areaResponse(t2.getArea());
    }
}
