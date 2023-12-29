import java.io.IOException;

public class Try {
    public static void main(String[] args) {
        try {
            methodA(9, 0);
        } catch (Exception e) {
           System.out.println("hello");
        }

        
    }

    public static int methodA(int x, int y)throws Exception{
        return methodB(x,y); // if throws IOException, cannot
    }
    public static int methodB(int x, int y)throws Exception{
        return methodC(x,y); // unchecked
        // return methodD(x,y); // checked
    }
    public static int methodD(int x, int y) throws Exception{
       if (x+y>10) return x+y;
        throw new IOException();
    }
    public static int methodC(int x, int y) { // polymorphism
        // what is diff between throwing checked or unchecked exception in methodC?
        
        // if (y==0) {
        //     throw new BusinessRuntimeException("Business Runtime Exception");
        // }
        // return x+y/y;

        //unchecked
        if (x+y>10) return x+y;
        throw new ClassCastException(); //unchecked
    }
}
