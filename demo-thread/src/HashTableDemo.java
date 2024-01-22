
import java.math.BigDecimal;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) throws InterruptedException {
        // HashTable (thread-safe) vs HashMap (non-thread-safe)
        // put()
        Map<String, String> str = new HashMap<>();
        Map<String, String> str2 = new Hashtable<>();
        Runnable task1 = () -> {
            for (int i = 0; i < 1000000; i++) {
                str.merge("x", "s", (s1, s2) -> s1.concat(s2));
            }
            // System.out.println("task1 is working");
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 1000000; i++) {
                str2.merge("x", "s", (s1, s2) -> s1.concat(s2));
            }
            // System.out.println("task2 is working");
        };
        Thread worker1 = new Thread(task1);
        Thread worker2 = new Thread(task1);

        // worker1.start();
        // worker2.start();

        // worker1.join();
        // worker2.join();

        // System.out.println("worker1 "+str.get("x").length());
        // System.out.println("worker2 "+str2.get("x").length());
        // System.out.println(gcdByBruteForce(45,60));
        // System.out.println(countBeautifulPairs(new int[]{2,5,1,4}));
        System.out.println(gcd(5,9));
        
        // int gcd = 0;
        // for (int k = 4; k > 1; k--) {
        //     if (4 % k == 0) {
        //         gcd = k;
        //     }
        // }
        // System.out.println(gcd);
    }

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcdByBruteForce1(int n1) {
        int gcd = 1;
        for (int i = 1; i <= n1 ; i++) {
            if (n1 % i == 0 ) {
                gcd = i;
            }
        }
        return gcd;
    }

    // int gcd = 0;
    //     for (int k = 4; k > 1; k--) {
    //         if (4 % k == 0) {
    //             gcd = k;
    //         }
    //     }
    // System.out.println(gcd);

    public static int countBeautifulPairs(int[] nums) {
        int result = 0;
        int tempi = 0;
        int tempj = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int gcd1 = 0;
            int gcd2=0;
            if (nums[i] == 1) {
                gcd1 = 1;
            } else {
                tempi = (int) String.valueOf(nums[i]).toCharArray()[0] - 48;
                for (int k=1;k<tempi;k++) {
                    if (tempi % k == 0) {
                        gcd1 = k;
                    }
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                tempj = (int) String.valueOf(nums[j]).toCharArray()[String.valueOf(nums[j]).toCharArray().length - 1]
                        - 48;
                for (int k=1;k<tempj;k++) {
                    if (tempj % k == 0 ) {
                        gcd2=k;
                    }
                }
                if (gcd1==1 && gcd2==1) {
                    result++;
                }
            }
            
        }
        return result;
    }
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }

}