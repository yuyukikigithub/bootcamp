import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bag<T> { // <T> is a scope (No scope - you can put any class for T), <T> 出現,收窄範圍
    // <T>=<T extends Object>

    T thing;
    static String thin;

    public T eat() {// instance method, 跟 object, so scope of T is limited to <T> from Bag object
        // scope of T is syn with Bag<T>
        // no longer need to define scope of T
        return null;
    }

    public static <T> T get(T t) { // stand alone from class

        return t;
    }
    public static void setThin(String thi){
        thin=thi;
    }

    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<>();
        Bag<Long> bag2 = new Bag<>();
        Bag.get("ehfo");
        Bag.setThin("iamthin");
        System.out.println(Bag.thin);

        
        
    }
}
