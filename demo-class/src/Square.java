public class Square {
    private int side;
    public Square(){

    }
    public Square(int side){
        this.side = side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }

    public int getArea(){
        return this.side*this.side;
    }

    public static void main(String[] args) {
        Square s1 = new Square(9);
        System.out.println(s1.getSide());
        System.out.println(s1.getArea());

        Square s2 = new Square();
        s2.setSide(10);
        System.out.println(s2.getArea());
    }
}
