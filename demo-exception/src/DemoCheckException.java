

public class DemoCheckException {
    public static void main(String[] args)  {
        // checked exception - compiler requires the exception to be handled during the compile time
        //1. if you throw checked exception, you have to handle it.
        //1a) Sign the unchecked exception in method signature // Signature of method做
        // isEmailValid("osdnosnononononnonoonono@gmailmc.om"); // mehtod caller -compile error 
        // method caller still need to handle unchecked exception even method throws already
        //1b) try-catch to handle
        try{
            // int[] inin=new int[]{2,5,6,7};
            // System.out.println(inin[5]);
            System.out.println(isEmailValid("sdgsdggbgdbfgbhdhdhffsg@gmail.com"));
        }catch(BusinessExeception e){
            //can do everything or nothing
            // throw new BusinessExeception("cannot handle message");
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

    // if method throw exception, must be try catch when calling


    //1a
    public static boolean isEmailValid(String emailAddr) throws BusinessExeception {
        if (emailAddr==null ||emailAddr.length()>20) 
            // return false;
            // throwable or lower
            throw new BusinessExeception("email address is too long. should be<= 20");
        return true;
    }
    public static boolean isEmailValid2(String emailAddr) throws BusinessExeception {
        
        if (emailAddr !=null && emailAddr.length()==8) {
            return true;
        }
        if (emailAddr ==null || emailAddr.length()<8) {
            return false;
        }
        // for unexpected case
        throw new BusinessExeception("hello");
    }
    // public static boolean isEmailValid2(String emailAddr) throws BusinessExeception {
    //     if (emailAddr !=null && emailAddr.length()>20) {
    //         return true;
    //     }
    //     if (emailAddr ==null || emailAddr.length()<20) {
    //         throw new BusinessExeception("the address is too short");
    //     }
    //     throw new BusinessExeception("hello");
    // }
}
