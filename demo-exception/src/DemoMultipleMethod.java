public class DemoMultipleMethod {
    public static void main(String[] args) {
        int result=0;
        try {
            System.out.println("before");
           result=methodA(100, 0);    
        } catch (BusinessRuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
    public static int methodA(int x, int y){
        return methodB(x,y);
    }
    public static int methodB(int x, int y){
        return methodC(x,y);
    }
    public static int methodC(int x, int y) throws BusinessRuntimeException{
        // what is diff between throwing checked or unchecked exception in methodC?
        if (y==0) {
            throw new BusinessRuntimeException("Business Runtime Exception");
        }
        return x+y/y;
    }
}
