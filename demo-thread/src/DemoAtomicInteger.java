import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {
    AtomicInteger atmInt;
    public DemoAtomicInteger(){
        atmInt = new AtomicInteger(); // default 0
    }
    public static void main(String[] args) {
        DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();
        // demoAtomicInteger.atmInt.incrementAndGet();
        // int result = demoAtomicInteger.atmInt.incrementAndGet();
        // System.out.println(result);

        Runnable atomicIncrement = ()->{
            for (int i = 0; i < 100_000; i++) {
                demoAtomicInteger.atmInt.getAndIncrement();    
            }
        };
        Thread worker1=new Thread(atomicIncrement);
        Thread worker2=new Thread(atomicIncrement);
        
        worker1.start();
        worker2.start();
        
        System.out.println("main start");
        System.out.println("main end");
        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(demoAtomicInteger.atmInt.get());
        
        
        
    }
}
