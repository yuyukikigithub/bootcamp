public class DemoExample {
    public static void main(String[] args)  {
        //most popular run time exception
        // run time exception == unchecked exception
        String s=null;
        // s.length(); //java.lang.NullPointerException

        int x=0;
        // if (x==0) {
        //     double aver=100/1; // java.lang.ArithmeticException
        // }else {
        //     double aver=100/x; // java.lang.ArithmeticException
        // }
        
        double aver=100/x; // java.lang.ArithmeticException

        Object s2 = "Hello";
        // Double result=(Double) s2; //java.lang.ClassCastException


    }
}
