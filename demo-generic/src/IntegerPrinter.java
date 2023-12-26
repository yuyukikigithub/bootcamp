public class IntegerPrinter {
    private Integer x;
    // private Object x;

    public IntegerPrinter(Integer x){
        this.x=x;
    }
    // public Printer(Object x){
    //     this.x=x;
    // }

    // public Integer getX(){
    //     return this.x;
    // }
    public Object getX2(){
        return this.x;
    }
    public static void main(String[] args) {
        IntegerPrinter p = new IntegerPrinter(10);
        // System.out.println(p.getX());
        System.out.println(p.getX2());

        Object o = p.getX2();
        System.out.println(o);
    }
}
