public class ABC {
    private static int number=2;
    private int value=10;
    private static String str="helo"; //static --> before main
    
    // static block will be executed no matter you have static variable or not
    static{
        System.out.println("start static block, number="+number);
        number=3;
        System.out.println("end static block, number="+number);
    }
    // instance block will be executed only when you new an object of ABC.class
    // similar to constructor
    {
        System.out.println("start instance block, value="+this.value);
        this.value++;
        System.out.println("end instance block, value="+this.value);
    }

    public static void main(String[] args) {
        ABC a1=new ABC();
        System.out.println(a1.value);
    }
}
