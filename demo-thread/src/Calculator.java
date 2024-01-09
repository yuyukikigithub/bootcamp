import javax.swing.event.TreeExpansionEvent;

public class Calculator {

    // synchronized : lock object, 2 threads cannot access to object at the same time, data accurate
    // not synchronized : not lock object, 2 thread can access at the same time, thread safe 線性安全

    // multi-thread environment encounter atomic problem (read-write issue on share resource)
    // one of the approach to solve it - 'synchronized'
    // when a thread access a 'synchronized' instance method, obtain a lock from object

    private int x;

    public synchronized void increment() {
        this.x++;
    }

    public synchronized void decrement() {
        this.x--;
    }

    public void increment2() {
        this.x++;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Runnable runIncre=()->{
             for (int i = 0; i < 100_000; i++) {
                calculator.increment();
            }
        };
        // Example 1: increment with synchronized
        Thread vincent = new Thread(runIncre);
        Thread oscar = new Thread(runIncre);
        // Thread vincent = new Thread(() -> {
        //     for (int i = 0; i < 100_000; i++) {
        //         calculator.increment();
        //     }
        // });
        // Thread oscar = new Thread(() -> {
        //     for (int i = 0; i < 100_000; i++) {
        //         calculator.increment();
        //     }
        // });

        vincent.start();
        oscar.start();
        try {
            vincent.join();
            oscar.join();
        } catch (InterruptedException e) {
        }
        System.out.println("calculator.x = " + calculator.x); //200000

        Runnable runIncre2=()->{
            for (int i = 0; i < 100_000; i++) {
                calculator.increment2();
            }
        };
        // Example 2: increment without synchronized
        vincent = new Thread(runIncre2);
        oscar = new Thread(runIncre2);
        // vincent = new Thread(() -> {
        //     for (int i = 0; i < 100_000; i++) {
        //         calculator.increment2();
        //     }
        // });
        // oscar = new Thread(() -> {
        //     for (int i = 0; i < 100_000; i++) {
        //         calculator.increment2();
        //     }
        // });

        vincent.start();
        oscar.start();
        try {
            vincent.join();
            oscar.join();
        } catch (InterruptedException e) {
        }
        System.out.println("calculator.x = " + calculator.x); //3xxxxx

        // Example 3: increment with synchronized and decrement with synchronized

        calculator.x=0;

        vincent = new Thread(runIncre);
        Runnable runDecre =()->{
            for (int i = 0; i < 100_000; i++) {
                calculator.decrement();
            }
        };
        oscar=new Thread(runDecre);
        // oscar = new Thread(() -> {
        //     for (int i = 0; i < 100_000; i++) {
        //         calculator.decrement();
        //     }
        // });
        vincent.start();
        oscar.start();
        try {
            vincent.join();
            oscar.join();
        } catch (InterruptedException e) {
        }
        System.out.println("calculator.x = " + calculator.x); //3xxxxx
    }
}
