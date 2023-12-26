public class App {

    // public static Object sum(Object k1, Object k2){ // Object 萬能KEY, so the same as below

    // }
    public static <K> K sum(K k1, K k2){ // <K> declare the scope of K
        return k1;
    }

    // public static Double calculate (Number u1, Number u2){ // same signature as below

    // }
    public static <U extends Number> Double calculate(U u1, U u2){
        // Integer result = (Integer) u1+ (Integer) u2;
        // return (U) result;
        double result=0;
        if (u1 instanceof Byte) {
            result+=(Byte) u1;
        }
        if (u1 instanceof Short) {
            result+=(Short) u1;
        }
        if (u1 instanceof Integer) {
            result+=(Integer) u1;
        }
        if (u1 instanceof Double) {
            result+=(Double) u1;
        }
        if (u2 instanceof Long) {
            result+=(Long) u2;
        }
        if (u2 instanceof Float) {
            result+=(Float) u2;
        }
        if (u2 instanceof Byte) {
            result+=(Byte) u2;
        }
        if (u2 instanceof Short) {
            result+=(Short) u2;
        }
        if (u2 instanceof Integer) {
            result+=(Integer) u2;
        }
        if (u2 instanceof Double) {
            result+=(Double) u2;
        }
        if (u2 instanceof Long) {
            result+=(Long) u2;
        }
        if (u2 instanceof Float) {
            result+=(Float) u2;
        }
        return result;

    }
    public static void main(String[] args) throws Exception {
        System.out.println(calculate(1, 2));
    }
}
