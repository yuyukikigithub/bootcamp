import java.math.BigInteger;


public class DemoNumber {
    public static void main(String[] args) {
        Float f1 = Float.valueOf(60000.0f); //vs 3.0
        Number n1 = f1;// upcast 
          
        System.out.println(n1.shortValue());
        
        // Long, Short, Byte, Integer
        System.out.println(add(6,10000)); // just call the nearest method Integer
        
    }
    public static Number add(Number x, Number y){
        
        BigInteger b1 =BigInteger.valueOf((Integer)x);
        BigInteger b2 =BigInteger.valueOf((Integer)y);
        return b1.add(b2);
    }
    // public static Number add(Integer x, Integer y){
    //     return 2;
    // }
}
