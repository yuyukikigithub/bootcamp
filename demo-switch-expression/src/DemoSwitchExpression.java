public class DemoSwitchExpression {
    public static void main(String[] args) {
        
    }

    // java 14 Switch Expression
    // 1. return type
    // 2. no break
    // 3. similar lambda expression 
    // 4. compiler help ensure all enums have been catered once
    public static int getCurrencyCode2(Currency currency){
        return switch (currency) {
            case HKD->1;
            case JPY->2;
            case USD->3;
        };
    }

    public static int getCurrencyCode3(Currency currency){
        return switch (currency) {
            case HKD->{
                String x = "";
                if (x.isEmpty()) 
                    yield 10;
                else 
                    yield 20;
            }
            case JPY->2;
            case USD->3;
        };
    }

    public static int getCurrencyCode3(String day){
        return switch (day) {
            case "Monday"->{
                String x = "";
                if (x.isEmpty()) 
                    yield 10;
                else 
                    yield 20;
            }
            case "Tuesday"->2;
            case "Wednesday"->3;
            case "Thursday"->4;
            default -> 5;
        };
    }

    // normal switch statement
    // no return type
    public static int getCurrencyCode(Currency currency){
        int code = -1;
        switch (currency) {
            case HKD:
                code=1;
                break;
            case JPY:
                code=2;
                break;
            case USD:
                code=3;
                break;
        }
        return code;
    }
}
