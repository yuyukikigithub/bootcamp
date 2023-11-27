
public class DemoIntArray {
    public static void main(String[] args) {
        int x1 = 29;
        int x2 = 34;
        int x3 = 40;
        int x4 = 36;
        int x5 = 90;

        // new --> verb to generate new
        // define an array to store a list of integer
        // This array container can only store integer
        int[] arr = new int[9]; // [length of array], by index 0 - 8
        arr[0] = 40; // [index]
        arr[1] = x3; // 40
        arr[2] = 39;
        arr[3] = x2; // 34
        arr[4] = 80;
        arr[5] = x4; // 36
        arr[6] = 32;
        arr[7] = x1; // 29
        arr[8] = 39;

        for (int i = 0; i < arr.length; i++) {
            // arr[i] = (int)Math.random()*100;
            System.out.println("arr["+i+"] = "+arr[i]);
        }
        // System.out.println(arr[10]);


        // *** local variable must be explicitly assigned before use ***
        // int a;
        // System.out.println(a);

        // but arr[i] default = 0
        
        int a=0;
        System.out.println(a);

        // array cannot change the length once it is declared
        // array fix length
        // array fix how much it contains
        int[] arr1 = new int[5]; 
        int[] arr2 = new int[] {x1,x2,x3,x4,x5};

        double[] arr3 = new double[] {45.23,64.5,79.5,98.5,56.6,76.6};

        System.out.println(arr3.length);
        
        // arr2 --> object reference
        // new int[10] --> object address, where something happen
        arr2 = new int[10];// array length can be re-defined, but the initial content is changed to null
        // array supports for loop
        int a1 = 100; // a1 store 100
        a1 = 106; // a1 store 106
        System.out.println(a1);

        // type of array
        // 8 primitive + 1 string 
        // char
        // boolean
        // String
        // 
        boolean[] arrBoolean = new boolean[3] ; // boolean default false
        arrBoolean[0] = true;
        
        char [] arrChar = new char[] {'a','e','i','o','u'};
        String[] arrString = new String[] {"kenn","charlie","yuk","chung"};

        // System.out.println(arrBoolean);
        // System.out.println(arrChar);
        // System.out.println(arrString);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2["+i+"] = "+arr2[i]);
        }

        for (int i = 0; i < arrBoolean.length; i++) {
            System.out.println(arrBoolean[i]);
        }

        //default value of array {0,0,0}
        int[] arr4 = new int[3]; 
        for (int i = 0; i < arr4.length; i++) {
            // arr4 store address of array object
            // we use arr4[i] to find 3 values stored in the array object
            arr4[i] = (i+1);
            System.out.println(arr4[i]);
        }
        for (int i = arr4.length-1; i >= 0; i--) {
            // arr4 store address of array object
            // we use arr4[i] to find 3 values stored in the array object
            arr4[i] = (i+1);
            System.out.print(arr4[i]);
            if (!(i==0)) {
                System.out.print(" ");
            }
        }

        //sentance 1
        String str = "Hello"; // str2 is storing the address of String object Hello
        //sentance 2
        String str2 = new String ("Hello"); // str2 is storing the address of String object Hello
        //sentance 3
        String str3 = String.valueOf("Hello"); // str2 is storing the address of String object Hello

        // primitive not object
        // string is object
        

    }
}
