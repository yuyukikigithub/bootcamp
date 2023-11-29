import java.util.Arrays;

public class DemoMethod2 {
    public static void main(String[] args) {
        System.out.println(append("hello", " world"));
        System.out.println(getLastChar("iamprettyi"));
        System.out.println(isStartWith("ba", "baby"));
        System.out.println(remove("abcabcdbcbcdabc","bcd"));
        System.out.println(addStr(10, " years ago"));
        // turn the fist 2 characters to the last 2 and move the remaining forward
        System.out.println(left2("hello"));
    }

    public static String append(String a, String b) {
        return a.concat(b);
    }

    public static char getLastChar(String a) {
        return a.charAt(a.length()-1);
    }

    public static boolean isStartWith(String a, String b) {
        if (b.indexOf(a)==0) {
            return true;
        } else {
            return false;
        }
    }

    public static String remove(String a, String toBeRemove) {
        if (a.contains(toBeRemove)) {
            String[] arrStr = a.split(toBeRemove);
            String newStr = "";
            for (int i = 0; i < arrStr.length; i++) {
                newStr = newStr.concat(arrStr[i]);
            }
            return newStr;
        } else {
            return "no character to be removed";
        }
    }

    public static String addStr (int a, String b) {
        return a+b;
    }

    public static String left2(String str) {
        if (str.length()<=2){
          return str;
        }else {
          char c1 = str.charAt(0);
          char c2 = str.charAt(1);
          String newStr = "";
          for (int i = 0; i < str.length()-2; i++) {
            newStr += str.charAt(i+2);
          }
          newStr+=c1;
          newStr+=c2;
          return newStr;
          
        }
      }


}
