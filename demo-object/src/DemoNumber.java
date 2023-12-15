import java.math.BigInteger;


public class DemoNumber {
    public static void main(String[] args) {
        Float f1 = Float.valueOf(60000.0f); //vs 3.0
        Number n1 = f1;// upcast 
          
        System.out.println(n1.shortValue());
        
        // Long, Short, Byte, Integer
        System.out.println(add(6,10000)); // just call the nearest method Integer
        
        Number x=10;
        Number y=15;
        BigInteger b1 =BigInteger.valueOf((Integer)x);
        BigInteger b2 =BigInteger.valueOf((Integer)y);
        System.out.println(b1.add(b2));
        System.out.println(add(12,15));
    }
    public static Number add(Number x, Number y){
        
        long l1 = 0L;
        if (x instanceof Long) { // true -> means, the object of x is created by Long.class
        l1 = (Long) x;
        } else if (x instanceof Short) {
        l1 = (Short) x;
        } else if (x instanceof Byte) {
        l1 = (Byte) x;
        } else if (x instanceof Integer) {
        l1 = (Integer) x;
        }
        long l2 = 0L;
        if (y instanceof Long) { // true -> means, the object of y is created by Long.class
        l2 = (Long) y;
        } else if (y instanceof Short) {
        l2 = (Short) y;
        } else if (y instanceof Byte) {
        l2 = (Byte) y;
        } else if (y instanceof Integer) {
        l2 = (Integer) y;
        }
        return BigInteger.valueOf(l1 + l2);
    }
    // public static Number add(Integer x, Integer y){
    //     return 2;
    // }
}
