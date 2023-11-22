public class DemoString {
    public static void main(String[] args) {
        String Sentance;
        double doublee;
        float floatt;
        Sentance = "Sentance example"; 
        doublee = 45.644984919191991984879;
        floatt = 78.6f;
        floatt= floatt + 1;
        System.out.println(Sentance+" is not the same as "+doublee+" and "+floatt+".");
        System.out.println(Sentance.equals("Sentance exaple"));

        // = -- means assignment
        // == -- means equal

        int x1 = 3;
        int x2 = 4;
        if (x1 == x2 ) { // asking if they are equal
            // return false
            System.out.println("x1 is equal to x2");
        } else {
            System.out.println("x1 is not equal to x2");
            System.out.println("oh no");
        }
        // string is not a primitive, so you cannot use == to compare their values
        String s1 = "hello";
        String s2 = "hello";
        if (s1.equals(s2)){
            System.out.println("sq is equql to s2");
        }
        // if (s1.equals("hello")) dont do it
        if ("hello".equals(s1)){
            System.out.println("s1 is hello");
        }
        // if always true, no need if
        if ("hello".equals("hello")) {
            System.out.println("abc");
        }
        // string is not used to compare
        // if (s1>13)



        // if we want to get last character of the string
        // charAt()
        s1 = "terrylau";
        char c = s1.charAt(s1.length()-1);
        System.out.println(c);

        s2 = "celia";
        char d = s2.charAt(s2.length()-1);
        System.out.println(d);

        String s3 = "oh no my god";
        int lastChar = s3.length()-1;
        char t = s3.charAt(lastChar);
        System.out.println(t);

        // use string to initiate method 


        

        // String s4 = "i:am:hungry";
        // System.out.println(s3.split(":",6));
        

    }
}
