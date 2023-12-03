public class DemoConversion {
    public static void main(String[] args) throws Exception {
        //byte -> short -> int -> long
        byte b =2;
        short s1 = b; // upcast, no precision loss
        int r = s1;
        long ong = r;
        // no conflict before run
        System.out.println(ong);

        //long -> int -> short -> byte
        //downcast
        long l2 = 4L;
        short s2 = (short) l2; // ls vs s2 relationship, potentially precision loss, +(short) 強行做
        l2 = 40000; // 40000 is int
        s2 = (short) l2; // int to short is upcast // overflow
        System.out.println(s2);

        short s3 = 130;

        byte b2 = (byte)s3; // overflow 
        System.out.println(b2);//130- = -126

        int i2 = 130;
        short s4 = (short)i2;
        System.out.println(s4); // 130

        // byte b3 = (byte)128;
        byte b3 = 127;
        System.out.println(b3);

        float f1 = (float) 1.3d; //downcast
        double d1 = 5.2f; //upcast

        float f2 = 3.5f;
        long l3 = (long)f2; // without (long), cannot
        float f3 = 10L; // upcast 

        //char up--> int
        int i3='a'; 
        char c3 = (char)i3; // downcast

        int i4 = 65650;
        char c4 = (char) i4;
        System.out.println(c4); // 65650 - 65535 = r

        short ss1 = (short) 32768;
        System.out.println(ss1);

        int i1 = Integer.MAX_VALUE;
        int j = i1+20;
        System.out.println(j);

        byte value = 127;
        for (int i = 0; i < 10; i++) {
            value++;
            System.out.println(value);
        }
    }
}
