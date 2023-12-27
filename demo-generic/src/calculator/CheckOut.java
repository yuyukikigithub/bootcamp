package calculator;

import java.util.List;

public class CheckOut {

    // call formula()
    // Force method caller to pass object implementing Adjustment interface
    public static <T extends Adjustment> double calculate(List<T> items, double adjust){
        double result=0;
        // because T is bounded by a contract Adjustment.class
        for (T t : items) {
            result+=t.adjust(adjust); 
        }
        return result;
    }
}
