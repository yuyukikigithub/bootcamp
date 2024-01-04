package lambda;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        int age=17;
        boolean isAdult=age>=18;
        System.out.println(isAdult);
        Predicate<Integer> isAdult2 = x -> x>=18; 
        System.out.println(isAdult2.test(10));
        System.out.println(isAdult2.test(20));
        System.out.println(predicate(36));

        Function<Integer,Boolean> predicateFunction =x->x>=18;
        Predicate<Integer> isOdd = y -> y%2==1;
        Predicate<Integer> isEvenAndPositive=x->x%2==0 && x>0;
        Predicate<Integer> isPositive = x->x>=0;
        System.out.println(isOdd.and(isPositive).test(-9));
        System.out.println(isOdd.or(isPositive).test(2));
        // System.out.println(isOdd.test(18));
        // if (isOdd.test(19)) {
        //     System.out.println("is odd");
        // }
        // System.out.println(isisOdd(789));

        //check fi the charAt is vowel
        BiPredicate<String, Integer> isVowel = (str,ind)->{
            // if (ind>=str.length()||ind<0) {
            //     return false;
            // }
            
            // Objects.nonNull(str); // throw NPE
            // Objects.nonNull(ind); // throw NPE
            // // if (str==null || ind==null) {
            //     return false;
            // }
            if(str.charAt(ind)=='a'||str.charAt(ind)=='e'||str.charAt(ind)=='i' 
                ||str.charAt(ind)=='o'||str.charAt(ind)=='u') 
                return true;
                return false;
        };

        // System.out.println(isVowel.test("String",null));

        BiPredicate <String, String> isEqual = (s1,s2)->{
            return s1.compareTo(s2)==0;
        };
        System.out.println(isEqual.test(new String("String"),new String("String")));

        System.out.println("ab".indexOf('b'));
    }

    public static boolean predicate(int age) {
        return age >= 18;
    }

    public static String isisOdd(int in) {
        Predicate<Integer> isOdd = y -> y % 2 == 1;
        if (isOdd.test(in)) {
            return "yes is odd";
        }
        return "no is not odd";
    }
}
