

public class DemoUncheckedException {
    private int balance;
    public static void main(String[] args) {
        //unchecked exception == runtime exception
        // 1. You are not required to handle exception thrown in the method
        double result=0.0;
        //example1 int/int
        try {
            System.out.println("before");
            result=divide(10,0);
            // result=10/0;
            if (Double.isInfinite(result)) {
                System.out.println("infinite");
            }
            System.out.println("after");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            result=0.0;
        }

        // divide(3,0); // I can call divide(int,int) without handling runtime exception
        
        //example2 double/double -> 10.0/0.0 infinite
        try {
            System.out.println("before");
            // result=divide(10.0,0.0);
            result=divide(10.0,0.0);
            if (Double.isInfinite(result)) {
                System.out.println("infinite");
            }
            System.out.println("after");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            result=0.0;
        }
        System.out.println("result="+result);
    }
    public static int divide (int x, int y)throws ArithmeticException{
        return x/y; // arithmeticException
    }
    public static double divide (double x, double y){
        return x/y; // arithmeticException
    }
    public  boolean deposit(double amount){
        if (amount<=0.0d) {
            throw new IllegalArgumentException();
        }
        this.balance+=amount;
        return true;
    }
}
