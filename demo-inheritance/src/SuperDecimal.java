import java.math.BigDecimal;

// BigDecimal has NO 'final' keyword, so SuperDecimal can inherit it
public class SuperDecimal extends BigDecimal{
    public SuperDecimal(){
        super(0);// new BigDecimal(0)
    }

    //Constructor
    public SuperDecimal(double val) {
        super(String.valueOf(val)); // to obtain all things of parent, new BigDecimal(3.0)
    }
    public static SuperDecimal valueOf(double val){
        return new SuperDecimal(val);
    }

    // to override parent's class multiply(BigDecimal)
    // @Override 
    public SuperDecimal multiply(SuperDecimal value){
        BigDecimal val = this; // upcast
        BigDecimal bdVal = value;
        return new SuperDecimal( val.multiply(bdVal).doubleValue());
    }

    public static void main(String[] args) {
        SuperDecimal sd = new SuperDecimal(3);// calling BigDecimal()
        System.out.println(sd);

        SuperDecimal sd1=new SuperDecimal(2.0);

        //SuperDecimal inherit all BighDecimal public instance methods
        SuperDecimal ssd1=sd1.multiply(sd);
        System.out.println(ssd1);
        
    }
}
