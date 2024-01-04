import java.util.Arrays;

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
        
        char kno= 'k';
        int kn = (char) kno;
        System.out.println(kn);

        String message = "sidbfiuf";
        String key="jsigob";
        char[] asKey = message.replace(" ","").toCharArray();
        // char[] temp = key.toCharArray();
        // char[] result = new char[temp.length];
        // for(int i=0; i<temp.length;i++){
        //     result[i]=(temp[i]==' ')? ' ': (char)asKey.indexOf(temp[i])+96;
        // }
        // return String.valueOf(result);
    }
}
