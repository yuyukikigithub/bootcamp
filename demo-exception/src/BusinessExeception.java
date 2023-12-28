public class BusinessExeception extends Exception {
    
    private int code;
    public BusinessExeception(SysCode sysCode){
        this(sysCode.getCode(),sysCode.getMessage()); // call below
    }
    
    // no attribute

    // public BusinessExeception(String message){ // "Server is unavailable." 
    //     super(message);
    // }

    private BusinessExeception(int code, String message){ // "Server is unavailable." 
        super(message);
        this.code=code;
    }
    // out of expected behaviour -- logging (to be found)
    public static void main(String[] args) {
        try {
            throw new BusinessExeception(SysCode.SERVER_TIMEOUT);
        } catch (Exception e) {
            
        }
    }
}
