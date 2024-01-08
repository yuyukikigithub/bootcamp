public class DemoThread {

    // Process? 
    // Thread? non-stop monitoring , e.g. jvm
    public static void main(String[] args)   { // main thread
        System.out.println("main start");
        // Runnable
        Runnable task1 = ()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
            }
            System.out.println("Thread ID: "+Thread.currentThread().getId()+", Thread Name: "+Thread.currentThread().getName());
            System.out.println("task 1 running");
        };

        Runnable task2 = ()->{
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                
            }
            System.out.println("Thread ID: "+Thread.currentThread().getId()+", Thread Name: "+Thread.currentThread().getName());
            System.out.println("Task 2 running");
        };

        //Thread
        Thread thread1 = new Thread(task1);  // implements Runnable 
        thread1.start(); // main thread split itself, another thread is created
        // start still need time

        Thread thread2 = new Thread(task2);
        thread2.start();

        CustomThread customThread = new CustomThread(); // your task is defined in the class
        customThread.start();

        // for (int i = 0; i < 1_000_000; i++) { // part of main
        // }
        try {
            thread1.join();
            thread2.join();
            customThread.join();
        } catch (InterruptedException e) {
            System.out.println("ehlo");
        }
        
        System.out.println("main end"); // main finished

    }
}
