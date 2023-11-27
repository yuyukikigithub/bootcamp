import java.util.Arrays;

public class DemoIntArray3 {
    public static void main(String[] args) {
        int[] arr = new int[] {100,-100,34};

        // swapping --> let temparay variable
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        // System.out.println(Arrays.toString(arr));


        //[100, 4, 100, 500, -20]
        int[] arr2 = new int[] {100, -20, 4, 100, 500};
        int targetIndex = 1;
        int targetInt = arr2[targetIndex];
        for (int i = 0; i < arr2.length; i++) {
            if (i<arr2.length && (i>targetIndex)) {
                arr2[i-1] = arr2[i];
            } 
        }
        arr2[arr2.length-1]= targetInt;
        System.out.println(Arrays.toString(arr2));
    }
    
}
