import java.io.IOException;

public class DemoMultipleMethod {
    // difference of throwing checked or unchecked exception
    // 1. for checked exception, you have to handle it by try-catch at the end
    //2. for unchecked exception, you can either program fix to 'avoid' risk or agree to 'accept' the result
        // notes 'avoid'
    //3. for checked/ unchecked, there is still polymorphism between parent and child exception 
    public static void main(String[] args) {
        // int result=0;
        // try {
        //     System.out.println("before");
        //    result=methodA(9, 0);    
        // } catch (BusinessRuntimeException e) {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println(result);
        // System.out.println(methodA(9, 0));

        // call method chain, with checked exception handling
        try {
            System.out.println("start try");
            System.out.println(methodA(9, 0)); // comment
            
            System.out.println("end try");
        } catch (Exception e) {
            if (e instanceof IOException) {
                System.out.println("e is IOException"); //can do 
            }
        } finally{
            System.out.println("finally try"); //e.g. reset sth
        }
        System.out.println("end main");

        
    }
    public static int methodA(int x, int y)throws Exception{
        return methodB(x,y); // if throws IOException, cannot
    }
    public static int methodB(int x, int y)throws Exception{
        // return methodC(x,y); // unchecked
        return methodD(x,y); // checked
    }
    public static int methodD(int x, int y) throws Exception{
       if (x+y>10) return x+y;
        throw new IOException();
    }
    public static int methodC(int x, int y) throws RuntimeException{ // polymorphism
        // what is diff between throwing checked or unchecked exception in methodC?
        
        // if (y==0) {
        //     throw new BusinessRuntimeException("Business Runtime Exception");
        // }
        // return x+y/y;

        //unchecked
        if (x+y>10) return x+y;
        throw new IllegalArgumentException(); //unchecked
    }
    
}

