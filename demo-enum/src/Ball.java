public class Ball {
    //private String color;
    private Color color; // relatively finite numbers

    public Ball(Color color){
        this.color=color;
    }

    public Color getColor(){
        return this.color;
    }
    public static void main(String[] args) {
        // before the main method starts, class load-> new Color("RED")("YELLOW")("BLACK")
        // Color.red (sth like public static final, but Color.red is an object)
        // you cannot new the Color object by yourself

        Ball b1 = new Ball(Color.RED);
        Ball b2 = new Ball(Color.BLACK);
        Ball b3 = new Ball(Color.BLACK);
        Ball b4 = new Ball(Color.YELLOW);

        System.out.println(b2==b3); // false, new object
        System.out.println(b2.getColor()==b3.getColor()); // true, same color
        System.out.println(b1.getColor()==b4.getColor());
    }


}
