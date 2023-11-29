import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        // for (int i = 0; i < 5; i++) {
        //     sum+=i;
        // }
        // System.out.println(sum);

        // while loop, initialization index can be declared outside
        int j=0;
        // while (j<5) {
        //     sum+=j++; // j; j++;
        // }
        // System.out.println(sum+" "+j);

        //continue break

        // 1,3,5,7,9
        int k = 0;
        int sum1 = 0;
        // while (k<11) {
        //     if (k>0 && k%2==0) {
        //         continue;
        //     }
        //     sum1 +=k++;
        // }
        while (++k<=10) {
            // if(k>5) break;
            if (k%2==0) {
                continue;
            }
            sum1+=k;
            // System.out.println(k);
        }
        // System.out.println(sum1);
        // System.out.println("k is  sum1 is ");

        int x = 10;
        int y = 5;
        while (x>0 && y>0) {
            // System.out.println("x is "+x+" y is "+y);
            y--;
            x--;
        }

        // 0 1 1 2 3 5 8 13 21 ... 1000
        int z =0 ;
        int z1=1;
        int e = -1;
        int result = 0;
        while (e<10) {
            if (e==-1) {
                result = z;
                e++;
                System.out.println(result);
            }else if (e==0) {
                result = z1;
                e++;
                System.out.println(result);
            }else{
                result = z+z1;
                z = z1;
                z1 = result;
                e++;
                System.out.println(result);
            }
            
            
        }



        int[] arr4 = new int[] {46,12,34,25,6};
        

        

    }
}
