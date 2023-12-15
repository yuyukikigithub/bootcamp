/*

Question : Given an integer array nums and an integer k,
 return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.

*/

//hints : Math.abs() is a method to find absolute value
public class JavaQuest24 {
  public static void main(String[] args) {
    System.out.println(absolute(new int[] { 1, 2, 2, 1 }, 1)); // 4
    System.out.println(absolute(new int[] { 3, 2, 1, 5, 4 }, 2));// 3
    System.out.println(absolute(new int[] { 5, 3, 1 }, 1));// 0
    System.out.println(absolute(new int[] { 5, 3, 2, 4 }, 1));// 3
  }

  public static int absolute(int[] nums, int target) {
    int idx = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i!=j && j>i && Math.abs(nums[i]-nums[j])==target) {
          idx++;
        }
      }
    }
    return idx;
  }
}
