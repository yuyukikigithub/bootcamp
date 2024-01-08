import java.util.Arrays;

public enum OrderStatus{
    CONFIRMED(1,"ordered"),
    PAID(2,"paid"),
    READY_TO_SHIP(3,"ready to ship"),
    DELIVERED(4,"delivered"),
    UNKNOWN(99,"unknown")
    ;

    private final int code;
    private final String desc;

    private OrderStatus(int code, String desc){
        this.code=code;
        this.desc=desc;
    }
    
    public int getCode(){
        return this.code;
    }
    public String getDesc(){
        return this.desc;
    }
    public OrderStatus fromCode(int code){
        return Arrays.stream(OrderStatus.values())
                .filter(e->e.getCode()==code)
                .findFirst()
                .orElseGet(()->OrderStatus.UNKNOWN);
    }
}
