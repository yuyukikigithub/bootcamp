package literalPool;

public class DemoString {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";// check if "hello" exist in String Literal Pool
        //so that JVM can reuse "hello" object by various object reference
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1==str2); // true literal pool, different object but due to reuse in literal pool

        String str3="hello!";
        System.out.println(str1.equals(str3));//false
        System.out.println(str1==str3);// false due to different value

        String str4=new String("hello");// same as "hello"
        System.out.println(str1.equals(str4));//true
        System.out.println(str1==str4);//false, force creating object

        String str5=String.valueOf("hello");
        System.out.println(str1==str5);//true, look up literal, reuse

        // "==" is same object?
        // "equal" just check value

        //concatentation
        String str7="abc";
        String str8=str7+"def";// there wil be 2 string object in literal pool
        System.out.println(str7==str8);

        String str9="aaa";
        String str10=new String("aabb"); // new string in heap memory
        String str11="aabb";
        System.out.println(str10==str11); // false

        String str12="aaa";
        String str13=new String("aabb").intern(); // str13 -> literal pool "aabb"
        String str14="aabb";
        System.out.println(str13==str14); // true

        if ("hello".equals(str5)) { // best practice to check the value of String
            System.out.println("str5 is equal to hello");
        }

        // String str6=null; // Java compiler would not look at the value assigned to object refernce during compile time
        // if (str6.equals("hello")) { // null object, cannot process .equal -> error: NullPointerException
        //     System.out.println("it is not good practice to check value");
        // }

        // int ii=4;
        // System.out.println(Integer.toString(ii));

        
        
    }
}
