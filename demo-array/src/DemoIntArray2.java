
public class DemoIntArray2 {
    public static void main(String[] args) {
        int[] arr = new int[] {10,8,6,4,2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        // int max = 0;
        int max = Integer.MIN_VALUE;
        int max2nd = Integer.MIN_VALUE;
        // int min=20;
        int min = Integer.MAX_VALUE;
        

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }else if(arr[i]!=max && arr[i]>max2nd){
                max2nd = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
        System.out.println("max2nd="+max2nd);
        //find second max value
        int maxSecond = max;// must be less than max but the biggest of the remaining
        int diffmax = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if ((max - arr[i])< diffmax && (max - arr[i])>0) {
                diffmax = (max - arr[i]);
                maxSecond = arr[i];
            }
        }
        System.out.println("maxSecond="+maxSecond);

        int[] strr = new int[] {23, 56, 150, 97, 100};
        int max1 = Integer.MIN_VALUE;
        int max12nd = Integer.MIN_VALUE;
        // for (int i = 0; i < strr.length; i++) {
        //     if(strr[i]>max1){
        //         max1 = strr[i];
        //     } else if(strr[i]>max12nd && strr[i]!=max1){
        //         max12nd = strr[i];
        //     }
        // }
        // System.out.println("max1="+max1);
        // System.out.println("max12nd="+max12nd);

        // int maxSecond1 = max1;
        // int diffmax1 = Integer.MAX_VALUE;
        // for (int i = 0; i < strr.length; i++) {
        //     if (max1-strr[i]<diffmax1 && max1-strr[i]>0) {
        //         diffmax1 = max1-strr[i];
        //         maxSecond1 = strr[i];
        //     }
        // }
        // System.out.println("maxSecond1="+maxSecond1);

        //1.16
        //2.10
        //3.56
        for (int i = 0; i < strr.length; i++) {
            if (strr[i]>max1) {
                max12nd = max1; // stay the last max
                max1 = strr[i]; // input biggest
                
            }else if(strr[i]>max12nd){ // max12nd the last max
                max12nd = strr[i]; // input last biggest
            }
        }
        System.out.println("max1="+max1);
        System.out.println("max12nd="+max12nd);

    }
}