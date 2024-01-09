import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {
        List<String> vector = new Vector<>();
        List<String> aStrings = new ArrayList<>();

        Runnable vectorAdd = () -> {
            for (int i = 0; i < 100000; i++) {
                vector.add("x");
            }
        };

        Runnable aStringsAdd = () -> {
            for (int i = 0; i < 100000; i++) {
                aStrings.add("x");
            }
        };

        Thread worker1 = new Thread(vectorAdd);
        Thread worker2 = new Thread(vectorAdd);
        worker1.start();
        worker2.start();
        worker1.join();
        worker2.join();
        System.out.println(vector.size());

        worker1 = new Thread(aStringsAdd);
        worker2 = new Thread(aStringsAdd);
        worker1.start();
        worker2.start();
        worker1.join();
        worker2.join();
        System.out.println(aStrings.size());
    }

}
