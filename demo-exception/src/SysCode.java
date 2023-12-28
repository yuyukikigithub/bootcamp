public enum SysCode {
    //1-1000 reserved for error
    SERVER_TIMEOUT(1, "server time out"),
    

    //1001-2000 reserved for warning
    DB_TIMEOUT(1, "timeout"),
    

    //2001-3000 reserved for warning
    EMAIL_TOO_LONG(1, "Email too long")
    ;
    private int code;
    private String message;
    private SysCode(int code, String message){
        this.code=code;
        this.message=message;
    }

    public int getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
