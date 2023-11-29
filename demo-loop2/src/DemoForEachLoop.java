import java.util.Arrays;

public class DemoForEachLoop {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{100,332,65};

        // for each loop, cannot add length
        // loop within array
        for (Integer i : integers) {
            System.out.println(i); // vs for loop, in for each loop, i is already the element
            
        }
        // vs
        // for loop: loop within index i
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]); // in for each loop, i is index/counter
        }
        String str = "abc/def/ijk/xyz";
        String[] arrStr = str.split("/");
        // System.out.println(Arrays.toString(arrStr));
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }
        for (String i : arrStr) {
            System.out.println(i);
        }

        String str2 = "hello";

        // use class for initialization 
        str2 = new String("hello");
        str2 = String.valueOf("hello");

        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1.3d));
        System.out.println(String.valueOf(1.6f));
        System.out.println(String.valueOf(1L));
        System.out.println(String.valueOf(new char[] {'a','b'}));

        byte b = 100;
        System.out.println(String.valueOf(b));
        // System.out.println(String.valueOf(new int[] {23,6,87})); //[I@7a81197d

        // Replace
        String str1 = "abcabcabcabcabcabc";
        String result = str1.replace('a', 'c');
        System.out.println(result);
        System.out.println(str1);

        System.out.println(str1.replaceAll("ab", "ij"));


        
    }
}
