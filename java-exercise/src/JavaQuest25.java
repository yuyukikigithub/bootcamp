
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

    String s = "Hello, my name is John.";
    s.trim();
    String[] sa=s.split(" ");
    System.out.println(s);
    Queue<String> ss = new LinkedList<>();
    // ss.offer(sa);
    System.out.println(ss.size());
    

    // String[] str = s.split(" ");
    // ArrayList arr = new ArrayList<>(List.of(str));
    // System.out.println(arr.size());



  }

  public static int countWords(String s) {
    // code here ...

    int cnt=0;
    // char[] charArr = s.toCharArray();
    // int idx=0;
    // while (idx<charArr.length) {
    //   if (!(charArr[idx]==(' '))) {
    //     cnt++;
    //   }
    //   idx++;
    // }
    return cnt;


    
  }
}
