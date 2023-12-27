package calculator;

public class Bookbook implements Adjustment{
    private double price;

    @Override
    public double adjust(double y) {
        return price*y;
    }
    
}
