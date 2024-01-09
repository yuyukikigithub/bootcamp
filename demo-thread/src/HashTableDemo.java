import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) throws InterruptedException {
        // HashTable (thread-safe) vs HashMap (non-thread-safe)
        // put()
        Map<String, String> str = new HashMap<>();
        Map<String, String> str2 = new Hashtable<>();
        Runnable task1 = ()->{
            for (int i = 0; i < 1000000; i++) {
                str.merge("x", "s", (s1,s2)->s1.concat(s2));
            }
            // System.out.println("task1 is working");
        };
        Runnable task2=()->{
            for (int i = 0; i < 1000000; i++) {
                str2.merge("x", "s", (s1,s2)->s1.concat(s2));
            }
            // System.out.println("task2 is working");
        };
        Thread worker1 = new Thread(task1);
        Thread worker2 = new Thread(task1);
        
        worker1.start();
        worker2.start();
        
        worker1.join();
        worker2.join();

        System.out.println("worker1 "+str.get("x").length());
        System.out.println("worker2 "+str2.get("x").length());
        
    }
}
