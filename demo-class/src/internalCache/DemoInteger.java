package internalCache;

public class DemoInteger {
    public static void main(String[] args) {
        Integer i1 = 10; // 10 is int value, auto-box -> Integer
        System.out.println(i1);

        Integer i2=new Integer(10); // new an object
        System.out.println(i2);

        System.out.println(i1==i2); // false, due to new
        System.out.println(i1.compareTo(i2)); // 0
        System.out.println(i1.equals(i2)); // true

        Integer i3=10;
        System.out.println(i1==i3); // true, Integer cache (-128 to 127)

        Integer i4=127;
        Integer i5=127;
        System.out.println(i4==i5); // true, Integer cache (-128 to 127)

        Integer i6=128;
        Integer i7=128;
        System.out.println(i6==i7); // false, out of Integer cache

        Byte b1=-128;
        Byte b2=-128;
        System.out.println(b1==b2); // ture
        Byte b3=new Byte("-128");
        System.out.println(b1==b3); // false 

        Byte b4=Byte.valueOf((byte) -128); //return ByteCache.cache[(int)b + offset];
        System.out.println(b1==b4); // true

        Boolean n1=true;
        Boolean n2=true;
        System.out.println(n1.equals(n2));
        System.out.println(n1==n2); // true, internal cache
        Boolean n3=new Boolean(true);
        System.out.println(n1==n3); // false

        Character c1='a';
        Character c2='a';
        System.out.println(c1==c2); // true
        Character c3 = new Character('a');
        System.out.println(c1==c3); // false

        Short s1=127;
        Short s2=127;
        System.out.println(s1==s2); // true, Integer cache (只限 -128 to 127)
        Short s3=new Short((short) 127);
        System.out.println(s1==s3); // false

        Long l1=(long) 127;
        Long l2=(long) 127;
        System.out.println(l1==l2); // true
        Long l3= new Long("127");
        System.out.println(l1==l3); // false
        
        
    }
}
