
public class SharedResources {
    private boolean hasData = false;  // share resource

    // 1: both 2 thread start at the same time
    // 2. producer thread -> synchronized void produce() -> acquire the lock
    // 3. Consumer thread is waiting outside synchronized void consume()
    // 4. producer thread -> producing the data -> notify other thread
    // 5. producer thread -> wait() -> release the lock
    // 6. Consumer thread -> get the lock , get into synchronized void consume()
    // waiting thread has to be notified by someone
    // synchronized instance method can only be accessed when the thread has the key(lock) 

    public synchronized void produce() throws InterruptedException{ // 
        while (hasData) {
            System.out.println("producer waiting");
            wait(); // wait control current thread to sleep, release key
        }
        System.out.println("ThreadID: "+Thread.currentThread().getId()+" producing data...");
        Thread.sleep(2000); // simulate produce process
        hasData=true;
        System.out.println("produced data");
        notify(); // notify consumer thread to proceed
        Thread.sleep(500);
    }

    public synchronized void consume() throws InterruptedException{
        while (!hasData) {
            System.out.println("consumer waiting");
            wait(); // Object.wait() notify(), release key
            
        }
        System.out.println("ThreadID: "+Thread.currentThread().getId()+" consuming data...");
        Thread.sleep(2000);
        hasData=false;
        System.out.println("consumed data");
        notify();
    }

    public static void main(String[] args) {
        System.out.println("main start");
        SharedResources sharedResources = new SharedResources();

        Runnable produceData=()->{
            while (true) {
                try {
                    sharedResources.produce();
                } catch (InterruptedException e) {
                    System.out.println("interrupt produce data");
                }
            }
            
        } ;

        Runnable consumeData=()->{
            while (true) {
                try {
                    sharedResources.consume();
                } catch (InterruptedException e) {
                    System.out.println("interrupt consume data");
                }
            }
            
        };

        Thread producer = new Thread(produceData);
        Thread consumer= new Thread(consumeData);

        producer.start();
        consumer.start();
        System.out.println("main end");
    }
}
