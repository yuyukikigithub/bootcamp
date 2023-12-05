import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
    public static void main(String[] args) {
        //problem: addition
        double d=0.1+0.2;
        System.out.println("d="+d);
        if (d>0.3) {
            System.out.println("d>3");
        }

        //solution
        BigDecimal bd1=new BigDecimal("0.2");
        BigDecimal bd2=new BigDecimal("0.1");
        BigDecimal bd3=bd1.add(bd2);
        System.out.println(bd3.doubleValue());

        BigDecimal bd4=BigDecimal.valueOf(0.2); // valueOf ->toString
        BigDecimal bd5=BigDecimal.valueOf(0.1);
        BigDecimal bd6=bd4.add(bd5);
        System.out.println(bd6.doubleValue());


        //problem: substract
        double d1=0.3-0.1;
        System.out.println(d1);  // 0.19999999999999998

        // BigDecimal substrct by method
        BigDecimal b1=BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
        System.out.println(b1);
        System.out.println(b1.doubleValue());

        //multiple
        double d2=(0.3-0.1)*.3;// 0.2*0.1
        System.out.println(d2);
        BigDecimal b2=BigDecimal.valueOf(0.3).multiply(BigDecimal.valueOf(0.2));
        System.out.println(b2.doubleValue()); // doublevalue -> getvalue

        //divide
        double d3=0.3/0.1;
        System.out.println(d3);
        BigDecimal b3=BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
        System.out.println(b3);

        System.out.println(sum(0.2,0.1));

        //comparison, same 0, a1>a2 1, a1<a2 -1
        System.out.println(BigDecimal.valueOf(0.1).compareTo(BigDecimal.valueOf(0.3)));
        BigDecimal a1=new BigDecimal(0.3);
        BigDecimal a2=new BigDecimal(0.1);
        if (a1.compareTo(a2)>0) {
            System.out.println("a1 > a2");
        }

        // new BigDecimal() string inside ()
        // .valueOf -> call new 

        // divide have deprecate version

        BigDecimal roundingBigDecimal= BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),2,RoundingMode.DOWN)
                                        .add(BigDecimal.valueOf(2));
        System.out.println(roundingBigDecimal);


        // comparison
        // == compare objects value
        // equals compare class

        // BigDecimal can solve float double problem
    
    }

    public static double sum(double d1, double d2){
        return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue(); 
    }

    


    
}
