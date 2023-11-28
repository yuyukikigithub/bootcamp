import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoIntArray3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, -100, 34 };

        // swapping --> let temparay variable
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        // System.out.println(Arrays.toString(arr));

        // [100, 4, 100, 500, -20]
        int[] arr2 = new int[] { 100, -20, 4, 100, 500 };
        int targetIndex = 1;
        int targetInt = arr2[targetIndex];
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length && (i > targetIndex)) {
                arr2[i - 1] = arr2[i];
            }
        }
        arr2[arr2.length - 1] = targetInt;
        System.out.println(Arrays.toString(arr2));

        // {500,100,200,300,400}
        int[] arrTry = new int[] { 100, 200, 300, 400, 500 };
        int targetIndex1 = 0;
        int temp1 = arrTry[targetIndex1];
        for (int i = 0; i < arrTry.length; i++) {
            if (i >= targetIndex1 && i <= arrTry.length - 2) {
                arrTry[i] = arrTry[i + 1];
            }
        }
        arrTry[arrTry.length - 1] = temp1;
        System.out.println(Arrays.toString(arrTry));
        // sir
        // for (int i = 0; i < arr2.length-1; i++) {
        // if (i>=targetIndex ) {
        // int temp2 = arr2[i];
        // arr2[i] = arr2[i+1];
        // arr2[i+1]=temp2;
        // }
        // }
        // System.out.println(Arrays.toString(arr2));

        // Find Max value, and move to the tail
        //{ 100, 4, 1050, 500, -20 }
        int[] arr3 = new int[] { 100, 4, 1050, 500, -20 };
        int maxx = Integer.MIN_VALUE;
        int targetIndex2 = 0;
        //by yuki


        // for (int i = 0; i < arr3.length; i++) {
        //     if (arr3[i]>maxx && i<arr3.length) {
        //         maxx = arr3[i];
        //         targetIndex2 = i;
        //     } 
        // }
        // int temp3 = arr3[targetIndex2];
        // for (int i = targetIndex2; i < arr3.length-1; i++) {
        //     arr3[i] = arr3[i+1];
        // }
        // arr3[arr3.length-1]=temp3;

        // System.out.println(Arrays.toString(arr3));

        //by sir
        // for (int i = 0; i < arr3.length; i++) {
        //     if (arr3[i]>maxx) {
        //         maxx=arr3[i];
        //         targetIndex2 = i;
        //     }
        // }
        // int temp3 = arr3[targetIndex2];
        // arr3[targetIndex2]=arr3[arr3.length-1];
        // arr3[arr3.length-1] = temp3;
        // System.out.println(Arrays.toString(arr3));
        //[4, 100, 500, -20, 1050]
        
        //[-20, 4, 100, 500, 1050]
        for (int i = 0; i < arr3.length-1; i++) {
            if (arr3[i]>arr3[i+1]) {
                int temp3 = arr3[i];
                arr3[i] = arr3[i+1];
                arr3[i+1] = temp3;
            }
        }
        System.out.println(Arrays.toString(arr3));
        int temp4 = 0;
        //[-20, 4, 100, 500, 1050]
        // by yuki
        // for (int i = 0; i < arr3.length; i++) {
        //     for (int j = 0; j < arr3.length; j++) {
        //         if(arr3[j]>arr3[i]){
        //             temp4 = arr3[j];
        //             arr3[j] = arr3[i];
        //             arr3[i] = temp4;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr3));

        // by sir
        for (int i = 0; i < arr3.length-1; i++) {
            for (int j = 0; j < arr3.length-1-i; j++) {
                if (arr3[j]>arr3[j+1]) {
                    temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));

        


    }

}
