public class Demo {
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    public void methodA(){
        // synchronized (lock1){
            try {
                Thread.sleep(2000, 0);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("method a working");
            methodB();
        // }
        System.out.println("method a outside");
    }
    public void methodB(){
        synchronized (lock2){
            System.out.println("method b working");
            // methodA();
        }
        System.out.println("method b outside");
    }
    public static void main(String[] args) {
        Thread workerz = new Thread(()->new Demo().methodA());
        // Thread workery = new Thread(()->new Demo().methodB());
        workerz.start();
        // workery.start();

    }
    
}
