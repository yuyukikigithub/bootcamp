package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoOperator {
    public static void main(String[] args) {
        BinaryOperator<String> concatStrings=(s1,s2)-> s1.concat(s2);
        BiFunction<String, String, String> concatString2=(s1,s2)->s1.concat(s2);
        
        UnaryOperator<String> strings = (s1)->s1.replace(" ","");
        System.out.println(strings.apply("kenb fv"));

        
    }
}
