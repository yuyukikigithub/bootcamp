import java.util.Arrays;

public class DemoForEachLoop {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] { 100, 332, 65 };

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
        System.out.println(String.valueOf(new char[] { 'a', 'b' }));

        byte b = 100;
        System.out.println(String.valueOf(b));
        // System.out.println(String.valueOf(new int[] {23,6,87})); //[I@7a81197d

        // Replace
        String str1 = "abcabcabcabcabcabc";
        String result = str1.replace('a', 'c');
        System.out.println(result);
        System.out.println(str1);

        System.out.println(str1.replaceAll("ab", "ij"));

        // Example 1:
        String  str3= "abcdefghijk";
        System.out.println("Final String=" + evenIdx(str3));
        System.out.println("Final String=" + evenIdx("")); // ""
        System.out.println("Final String=" + evenIdx("abc")); // "ac"
        System.out.println("Final String=" + evenIdx("abcd")); // "ac"

        // Example 2:
        // Given String "abcdefg"
        // finalString "gfedcba"
        // char array
        System.out.println("Reversed String=" + reverse("abcdef")); // "fedcba"
        System.out.println("Reversed String=" + reverse("")); // ""
        System.out.println("Reversed String=" + reverse("abcde")); // "edcba"

    }

    public static String reverse(String s) {
        char[] result = s.toCharArray();
        // abcdefg (7 / 2 - 1) -> 2
        // abcefg (6 / 2 - 1)
        // a <-> g
        // b <-> f
        // when to stop?
        char temp; // local variable
        for (int i = 0; i < result.length / 2; i++) {
            temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }
        return String.valueOf(result);
    }

    public static String reverse2(String s) {
        String result = "";

        return result;
    }

    public static String evenIdx(String s) {
        char[] characters = s.toCharArray(); // toCharArray() -> new char[str2.length()]
        // finalString -> "acegik"
        int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        char[] result = new char[arrLength];
        int idx = 0;
        for (int i = 0; i < characters.length; i++) {
            if (i % 2 == 0)
                result[idx++] = characters[i];
        }
        return String.valueOf(result);

    }
}
