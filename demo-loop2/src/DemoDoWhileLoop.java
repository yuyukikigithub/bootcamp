public class DemoDoWhileLoop {
    public static void main(String[] args) {
        int j = 0;
        while (++j<5) {
            System.out.println("iamj "+j);
            //j++;
        }
        for (int k = 0; k < args.length; k++) {
            
        }
        // Do-while : always execute once, no matter the condition
        j=0;
        do {
            System.out.println("j="+ ++j);
        } while (j<4);
    }
}
