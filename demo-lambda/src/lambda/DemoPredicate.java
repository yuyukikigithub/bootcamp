package lambda;

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
    }
    public static boolean predicate(int age){
        return age>=18;
    }
    
}
