public class DemoWrapper {
    public static void main(String[] args) {

        // 有class 有 method
        //int -> Integer
        int i1 = 3;
        Integer i2 = 4; // 4 is int value ->autoboxing
        int i3 = i2; // auto-unbox

        Integer i4 = new Integer(5); // not suggested
        Integer i5 = Integer.valueOf(3);

        int result = i4.compareTo(i2);
        System.out.println(result);
        

        // if class (Integer), please do not use operator '== > < '
        if (i2.compareTo(i4)==0) { // asking if i2==i4
            
        }
        if (i2 == i4) { // 自己UN BOX comparing the 2 int values
            
        }

        //double -> Double
        double d1 = 462.6;
        Double d2 = Double.valueOf(559.3); // self box
        Double d3 = 462.6; // auto box
        Double d4 = new Double(462.6);
        double d5 = 653.3;
        System.out.println(Double.compare(d2, d4));

        //char-> Character
        //boolean -> Boolean
        boolean isOkay = true;
        Boolean isPassed = true; // autobox
        Boolean isPassed2 = Boolean.valueOf(true); // 自己box
        Boolean isPassed3 = new Boolean(true);


        //Long
        Long l1 = 10L;
        //Integer i6 = l1; Long x->Integer
        //Long -> Integer
        // Long -> long
        // Integer -> int
        // int <-> long
        Integer i6 = (int)(long)l1; // int ->Integer autobox Long->long->int->Integer from right to left
        Long l2 = (long)(int)i6; // long -> Long autobox Integer->int->long->Long
            
        Integer i7 = 10;
        int i7i = i7; 
       
        
    }
}
