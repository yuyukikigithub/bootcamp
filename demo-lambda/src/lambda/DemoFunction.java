package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {

    public static void main(String[] args) {
        // function
        //f(x) = x+3
        //y=x+3

        //R apply (T,t) R..Integer , T String
        Function<String , Integer> stringLength =(str)->{
            return str.length();
        }  ;

        System.out.println(stringLength.apply("hello"));
        System.out.println(stringLength.apply("eiebriwbi"));

        Function<String, String> stringReturn=(str)->{
            return str.concat("abc");
        };
        System.out.println(stringReturn.apply("bilibala "));

        BiFunction<List<String>, Integer, String> getByInd = (strings, index)->{
            return strings.get(index);
        };

        System.out.println(getByInd.apply(new ArrayList<>(List.of("hello","GoodMorning","GoodAfternoon")), 1));
        
        Map<String, String> dicMap=new HashMap<>();
        dicMap.put("jsohn","hello");
        dicMap.put("Marry","ehoh");

        BiFunction<String, String, String> remapFunc = (key,oldValue)->{
            if (oldValue==null) {
                return "hello";
            }
            if (oldValue.length()<=2) {
                return null;
            }
            return oldValue.concat("end");
        };
        // dicMap.compute("Marry", (key,oldvalue)->oldvalue.concat("end"));
        dicMap.compute("Marry", remapFunc);

        System.out.println(dicMap.get("Marry"));
        dicMap.compute("Peter",remapFunc);
        System.out.println(dicMap.get("Peter"));
        System.out.println(dicMap.size());
    }
}
