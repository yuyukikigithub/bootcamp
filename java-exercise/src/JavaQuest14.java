import java.util.Arrays;

public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false
  // otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or
  // from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res1 = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);
   
  }

  // Code a method here to return true if the integer is palindrome, otherwise
  // false
  public static boolean palindrome(int num) {
    // code here ...
    String num1= Integer.toString(num);
    char[] charArr = num1.toCharArray();
    if (charArr.length<=1) {
      return true;
    }else {
      boolean[] boo =  new boolean[charArr.length/2];
      for (int i = 0; i < charArr.length/2; i++) {
        if ((charArr[i]==charArr[charArr.length-1-i])) {
          boo[i] =true;
        }else{
          boo[i]=false;
        }
      }
      for(boolean b : boo) if(!b) return false;
        return true;
    }
    
  }
}
