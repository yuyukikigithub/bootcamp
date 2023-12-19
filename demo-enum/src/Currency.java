public enum Currency {
    HKD(1,"Hong Kong Dolloar"),
    USD(2,"US Dolloar"),
    CNY(3,"RMB"),
    JPY(4,"Japan Yen"),
    ;

    private String desc;
    private int dbValue;

    private Currency(int dbValue, String desc){
        this.dbValue=dbValue;
        this.desc=desc;
    }

    public static Currency fromDbValue(int dbValue){
        for (Currency curr : Currency.values()) {
            if (curr.dbValue==dbValue) {
                return curr;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Currency.fromDbValue(4));

        int i1= -(-10);
        System.out.println(i1);
    }

}
