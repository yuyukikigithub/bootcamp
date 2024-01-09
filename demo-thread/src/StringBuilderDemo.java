public class StringBuilderDemo {
    public static void main(String[] args)  {
        
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf=new StringBuffer();
        // sbf.append("ehhlo").append("owndo");
        // System.out.println(sbf.toString());

        //StringBuilder vs StringBuffer
        // Runnable -> append "x" 1_000_000 times -> StringBuilder
        // Runnable -> append "x" 1_000_000 times -> StringBuffer

        Runnable appendStringBuilder = ()->{
            for (int i = 0; i < 1_000_000; i++) {
                sb.append("x");
            }
        };
        Runnable appendStringBuffer = ()->{
            for (int i = 0; i < 1_000_000; i++) {
                sbf.append("x");
            }
        };

        Thread worker1 = new Thread(appendStringBuilder);
        Thread worker2 = new Thread(appendStringBuffer);

        sb.setLength(0);
        worker1.start();
        worker2.start();
        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(sb.length());
        System.out.println(sbf.length());
        
    }
}
