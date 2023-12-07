
/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

import java.util.Arrays;
import java.util.Random;

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
    System.out.println(Arrays.toString(nums));

  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  // public static int[] sumToZero(int num) {
  //   int[] result = new int[num];
  //   int sum = 0;
  //   int count = 0;

  //   do {
  //     int ran=new Random().nextInt(0-num,num);
  //     if (!isRepeat(result, ran)) {
  //       result[count]=ran;
  //       sum+=ran;
  //       count++;
  //     }
  //   } while (count<num && sum!=0);
  //   return result;
  // }

  // public static boolean isRepeat(int[]num, int num1){
  //   for (int i : num) {
  //     if (i==num1) {
  //       return true;
  //     }
  //   }
  //   return false;
  // }

  public static int[] sumToZero(int num) {
    int[] result = new int[num];
    int sum=0;
    for (int i = 0; i < num-1; i++) {
      result[i]=new Random().nextInt();
      sum+=result[i];
    }
    result[num-1]=0-sum;
    return result;
  }

}
