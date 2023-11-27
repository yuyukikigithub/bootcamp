public class DemoStringMethod {
    public static void main(String[] args) {
        String str = " hello world! ";
       
        if (!str.isEmpty()) {
            System.out.println("String= " +str);
        
        }

        // even number index of char
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)%2==0) {
                System.out.print(str.charAt(i)+" ");
            }
        }

        // substring --> substring
        // if print all char ==> substring(0) <-- begin index
        // String newStr = str.substring(1, str.length()-1);//(index,index)
        String newStr = str.substring(0);
        System.out.println("newStr="+newStr);

        // trim --> remove all space at head and tail
        System.out.println("strtrim="+str.trim());
        // trim --> print all char if no space at head and tail
        String str1 = "hello";
        System.out.println("str1trim="+str1.trim());

        // toUpperCase, toLowerCase
        String s2 = "Hello World!";
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());

        //equals()
        //equalsIgnoreCase()
        System.out.println(s2.equals("hello world!"));
        System.out.println(s2.equalsIgnoreCase("hello world!"));

        //startsWith
        //endsWith

        System.out.println(s2.startsWith("Hello")); // true
        System.out.println(s2.startsWith("")); // true? always true, not good in practice

        System.out.println(s2.endsWith("woRld!")); // false
        System.out.println(s2.endsWith("")); // true? always true, not good in practice

        String s3 = "1234567890";
        //try 2 methods and use && operator to check true/false
        //return true
        System.out.println(s3.startsWith("12")&&s3.endsWith("90"));

        System.out.println(s3.charAt(s3.length()-1)=='0');

        // string diff: equals vs ==
        System.out.println(s3.substring(2, 5).equals("345"));
        System.out.println(s3.substring(2, 5)=="345");

        // indexOf()
        System.out.println(s3.indexOf('5'));
        System.out.println(s3.indexOf('m')); // -1, not exist in string
        System.out.println(s3.indexOf('7',5));// search start from index5 // 6
        System.out.println(s3.indexOf('7',7));// search start from index7 // -1
        System.out.println(s3.indexOf('4', 3));

        // lastIndexOf()
        String s4 = "123451234590";
        System.out.println(s4.lastIndexOf('5'));// return the first index
        System.out.println(s4.indexOf('5')); // return the last index

        System.out.println(s4.lastIndexOf("45"));
        System.out.println(s4.indexOf("45"));
        System.out.println(s4.lastIndexOf("54"));

        System.out.println(s4.lastIndexOf('3',9));// for lastIndexOf, 'fromIndex' -->由頭數到幾多 in this case if fromIndex:1, -1

        String s5 = "ABabc_abcdef";
        System.out.println(s5.lastIndexOf("abc")==6 && s5.endsWith("def") && s5.indexOf("abc")==2 && s5.startsWith("ABa")&& s5.length()>10);

        String s6 = "abc";
        String s7 = "def";
        String s8 = s6.concat(s7);// dont use '+' for string, use concat instead
        if (s5.contains(s8)) {
            System.out.println("s5.contains(s8)");
        }
        if (!(s5.indexOf(s8)==-1)) {
            System.out.println("!(s5.indexOf(s8)==-1)");
        }
        if (s5.contains("tr")) {
            System.out.println("s5.contains(\"tr\")");
        }

        // chain method
        String result = s5.toUpperCase();
        String result2 = result.substring(3,5);//substring endIndex <--排第幾
        System.out.println(result2);

        String result3 = s5.toUpperCase().substring(3,5);
        System.out.println(result3);

        String result4 = s5.toUpperCase().substring(3,5).concat(" 255");
        System.out.println(result4);

        String result5 = s5.toUpperCase().substring(0,2).concat("BA");
        System.out.println(result5);

        String result6=s5.substring(2, 5).toUpperCase().concat(" are charaters");
        System.out.println(result6);

        
    }
}
