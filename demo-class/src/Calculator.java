import java.math.BigDecimal;

public class Calculator {

    private BigDecimal x;
    private BigDecimal y;

    public Calculator(BigDecimal x, BigDecimal y){
        this.x = x;
        this.y=y;
    }

    // simplify new Calculator
    public static Calculator of(double x, double y){
        return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    public double add(){
        return this.x.add(this.y).doubleValue(); // with / without this?
    }

    public double subtract(){
        return this.x.subtract(this.y).doubleValue();
    }

    public static void main(String[] args) {
        Calculator c1=new Calculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));
        Calculator c2=Calculator.of(0.1, 0.2);
    }
}
