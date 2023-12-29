public class Tryy extends Exception {
    
   
    
    // no attribute

    // public BusinessExeception(String message){ // "Server is unavailable." 
    //     super(message);
    // }

    // out of expected behaviour -- logging (to be found)
    public static void main(String[] args) {
        try {
            throw new BusinessExeception(SysCode.SERVER_TIMEOUT);
        } catch (Exception e) {
            
        }
    }
}
