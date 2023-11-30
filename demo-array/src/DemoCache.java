public class DemoCache {
    public static void main(String[] args) {
        String s1 = "Tom";
        String s2 = "Tom";
        System.out.println(s1.equals(s2)); // true same value and address

        // ==, check if they are same object

        System.out.println(s1==s2);//check if s1 s2 are same object, in this case true

        String s3 = new String("Tom");//強行俾多個新地址
        System.out.println(s1.equals(s3));//true as they have same value
        System.out.println(s1==s3);// false as s3 is newString, different object

        String s4 = String.valueOf("Tom");// 無create new object, so follow 
        System.out.println(s1.equals(s4));//true , same value
        System.out.println(s1==s4);//true //s4's String Object is in literal pool
        System.out.println(s2==s4);//true //s4's String Object is in literal pool
        System.out.println(s3==s4);//false 

        s1 = "Tom2";
        System.out.println(s1);// Tom2
        System.out.println(s2);//Tom
        System.out.println(s4);//Tom
        System.out.println(s1==s4);//false as diff value
        System.out.println(s2==s4);//true as same value 

        s1 = "Tom3";
        System.out.println(s1);//Tom3
        System.out.println(s2);//Tom
        System.out.println(s4);//Tom
        System.out.println(s1==s4);//false as diff value
        System.out.println(s2==s4);//true as same value

        s2 = s2 +"2";
        System.out.println(s1);//Tom3
        System.out.println(s2);//Tom2
        System.out.println(s4);//Tom
        System.out.println(s2==s4);//false as diff value
        System.out.println(s1==s4);//false as same value

        String d1 = "John";
        String d2 = "John";
        String d3 = new String("John");
        String d4 = String.valueOf("John");
        System.out.println(d1==d2);//true
        System.out.println(d1==d3);//false
        d2+='3';
        

    }
}
