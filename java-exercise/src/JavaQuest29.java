
/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// 1,000
    System.out.println(separator(123987405));// $123,987,405

   

  }

  public static String separator(int n) {
    // code here ...
    int idx=1;
    StringBuilder sb = new StringBuilder("$"+String.valueOf(n));

    for (int i = sb.length()-1; i >0 ; i--) {
      if (idx%3==0 && i!=1) {
        sb.insert(i, ",");
      }
      idx++;
    }
    
    return (sb.toString());
  }

}
