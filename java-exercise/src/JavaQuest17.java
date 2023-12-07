/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5.
 * Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 :
 * Input : num = 3535
 * Output : 3333
 * 
 * Example 2 :
 * Input: num = 5555
 * Output: 3355
*/

import java.util.Arrays;

public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

    
  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {
    String num1 = String.valueOf(num);
    char[] charArr=num1.toCharArray();
    StringBuilder intArr=new StringBuilder("");
    int count=0;
    for (int i = 0; i < charArr.length; i++) {
      // intArr.append(charArr[i]);
      if (charArr[i]!='5') {
        intArr.append(charArr[i]);
        continue;
      }
      if (count<2) {
        intArr.append('3');
        count++;
      }else {
        intArr.append(charArr[i]);
      }
    } 
    return Integer.parseInt(String.valueOf(intArr));
  }
}
