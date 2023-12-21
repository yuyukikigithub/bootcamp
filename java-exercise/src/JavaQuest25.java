
/*
 * Question : Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 * 
*/



public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0 isBlank
    System.out.println(countWords("")); // 0 isEmpty
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1 trim

    // String s = " .  ";
    // String[] str = s.split(" ");
    // ArrayList arr = new ArrayList<>(List.of(str));
    // System.out.println(arr.size());

  }

  public static int countWords(String s) {
    // code here ...
    char[] charArr = s.toCharArray();
    int idx=0;
    int cnt=0;
    while (idx<charArr.length) {
      if (!(charArr[idx]==(' '))) {
        cnt++;
      }
      idx++;
    }
    return cnt;
    
  }
}
