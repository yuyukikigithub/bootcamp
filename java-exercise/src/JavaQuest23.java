/*
 * Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static boolean sameNumberOfVowels(String s) {
    // code here
    int length = s.length()/2;
    String a = s.substring(0, length);
    String b = s.substring(length,s.length());
    int aContain = 0;
    for (int i = 0; i < a.length(); i++) {
      if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'
        ||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'){
          aContain++;
      }
    }
    int bContain = 0;
    for (int i = 0; i < b.length(); i++) {
      if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'
        ||b.charAt(i)=='A'||b.charAt(i)=='E'||b.charAt(i)=='I'||b.charAt(i)=='O'||b.charAt(i)=='U'){
          bContain++;
      }
    }
    if (aContain==bContain) {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("abedABCE"));
    
  }
}
