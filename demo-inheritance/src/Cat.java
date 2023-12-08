import java.util.Arrays;

public class Cat extends Animal{

    public Cat(int age){
        super(age); // based on access to Aninal's constructor
        super.setAge(age);//based on access to Animal's method
        // super(); implicitly call Animal() constructor
    }

    
    public static void main(String[] args) {
        Cat cat=new Cat(10);
        System.out.println(cat.getAge());

        char sfsf= 'a';
        System.out.println((int)sfsf-97);

        int ssoo=0;
        char so = (char)(ssoo+97);
        System.out.println(so);

        String[] a= new String[] {"flower","flow","flight"};

        int[] b = new int[] {5,56,97,47};
        
        int size = a.length;
 

 
        /* sort the array of strings */
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
 
        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());
        System.out.println(end);
 
        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;
 
        String pre = a[0].substring(0, i);
        System.out.println(pre);

    }
}
