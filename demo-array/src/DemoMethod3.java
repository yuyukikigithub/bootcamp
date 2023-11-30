import java.util.Arrays;

public class DemoMethod3 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {5,12,23,34,37,45,47};
        // System.out.println("sum="+sum(arr1));
        // System.out.println("addOne="+Arrays.toString(addOne(arr1)));
        addOne2(arr1);
        System.out.println("afterAddOne="+Arrays.toString(arr1));
        // System.out.println(sumEven(arr1));
        // System.out.println(sumOdd(arr1));
        // System.out.println(sum(arr1)==(sumEven(arr1)+sumOdd(arr1)));
    }
    
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //wrong approach
    public static int[] addOne(int[] arr) {
        int[] newArr = new int[arr.length]; // new address without element
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i]+1; // put element into new address
        }
        return newArr; // return new address


    }
    // pass by reference vs pass by value

    //correct approach
    // input any fake address
    // process content
    // old array -> new content of old array
    // array object change
    public static void addOne2(int[] arr) { // pass by reference
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    //wrong approach
    public static void concathello(String s) { // string is "pass by value"
        s.concat("hello");
    }
    //correct approach
    public static String con(String s) {
        return s.concat("hello");
    }

    // Primitive + wrapper classes + String (17 types) -> pass by value
    // array and classes -> pass by reference
    public static int sumEven(int[] evenSum) {
        int sum=0;
        for (int i = 0; i < evenSum.length; i++) {
            if (!(evenSum[i]%2==0)) {
                continue;
            }
            sum+=evenSum[i];
        }
        return sum;
    }

    public static int sumOdd(int[] oddSum) {
        int sum = 0;
        for (int i = 0; i < oddSum.length; i++) {
            if (!(oddSum[i]%2==1)) {
                continue;
            }
            sum+=oddSum[i];
        }
        return sum;
    }

    public static int[] addOneWhile(int[] arr) {
        int idx = arr.length;
        while (idx>0) {
            arr[idx]+=1;
            idx--;
        }
        return arr;
    }

}
