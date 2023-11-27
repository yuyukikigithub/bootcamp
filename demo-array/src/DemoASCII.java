import java.rmi.StubNotFoundException;

public class DemoASCII {
    public static void main(String[] args) {

        // capital letter is diff from smaill letter
        char value = 'C';
        int ascii = value;
        System.out.println(ascii);//67
        System.out.println(value=='C'); //true
        // char can be directly transformed to ascii
        System.out.println(value==67); //true
        System.out.println(value>64); // true
        System.out.println(value<64); //false

        char value1 = 'k';
        int ascii1 = value1;
        System.out.println(ascii1); //107

        // String cannot be changed to int
        // String value2 = "BC";
        // int ascii2 = value2;

        //48==>0,65==>A,97==>a

        char c = '我';
        int ascii3 = c;
        System.out.println(ascii3); //25105

        // char is numnber, auto convert number to char
        char cc = 25105;
        // char ascii4 = cc;
        System.out.println(cc); //我

        String s1 = "abcdef";
        String s2 = "banana";
        String s3 = "ABCDEF";
        String s4 = "acbdef";
        String s5 = "abcdef";
        String s6 = "+-9464";
        String s7 = "abcd";
        String s8 = "abcA";
        //compare to first char
        System.out.println(s2.compareTo(s1)); // 1, b-a
        System.out.println(s1.compareTo(s2)); //-1 a-b
        System.out.println(s3.compareTo(s1)); // 65-97

        System.out.println(s4.compareTo(s1)); // 1, c-b, compare second char

        // compare with other primitive
        // for String
        // comparison, not use operator, use method

        System.out.println(s5.compareTo(s1)); // 0 ascii IDENTICAL
        System.out.println(s5.equals(s1)); //true
        System.out.println();
        char c1 = '!';
        System.out.println(c1+c1); // 66
        System.out.println(c1*2); // 66
        System.out.println('!'+'!'); //66
        System.out.println("!"+"!"); // !!, "" string

        System.out.println(s6.compareTo(s1)); //-54
        System.out.println(s7.compareTo(s1)); // -2
        System.out.println(s8.compareTo(s1)); //-35, A-d

        char unknown = '';
        int unknown1 = unknown;
        System.out.println(unknown1);
        
        

    }
}
