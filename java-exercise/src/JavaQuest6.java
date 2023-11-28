import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int[] arrResult = new int[15];
    for (int i = 0; i < 15; i++) {
      if (i==0 || i ==1) {
        arrResult[i] = 1;
        
      }else {
        arrResult[i] = arrResult[i-2]+arrResult[i-1]; 
      }
    }
    System.out.println(Arrays.toString(arrResult));
  }
}