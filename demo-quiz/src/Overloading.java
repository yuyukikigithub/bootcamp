public class Overloading {

    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a-b;
    }
    public static double add(Double a, Double b){
        return a*b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(add(1.0,2.0));
        System.out.println(add((int)1.0,(int)2.0));
        
    }
}
