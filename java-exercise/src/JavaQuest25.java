
/*
 * Question : Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 * 
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0 isBlank
    System.out.println(countWords("")); // 0 isEmpty
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1 trim




  }

  public static int countWords(String s) {
    // code here ...

    int cnt=0;
    if (s.length()>0 && !(s.isBlank())) {
      String ss=s.trim();
      String[] charArr = ss.split(" ");
      cnt=charArr.length;
    }
    return cnt;

  }
}
