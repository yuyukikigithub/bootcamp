import java.util.Arrays;

public class DemoMethod2 {
    public static void main(String[] args) {
        System.out.println(append("hello", " world"));
        System.out.println(getLastChar("iamsilly"));
        System.out.println(isStartWith("la", "baby"));
        System.out.println(remove("abcabcdbcbcdabc","bcd"));
        // integer append into string
        System.out.println(addStr(10, " years ago"));
        // turn the fist 2 characters to the last 2 and move the remaining to the left
        System.out.println(left2("hello"));
        System.out.println(middleThree("charles"));
        sound("cat"); // void -> no return, no need System.out.println
        System.out.println(sound2("onohg"));
        System.out.println(notifyCustomer1());
    }

    // void -> no return
    // warning -> void cannot return a value
    public static void sound(String animal) {
        // Early Return
        if ("ABC".equals(animal)){
            return;
        }
        if ("dog".equals(animal)) {
            System.out.println("wo wo");
            return;
        } else if ("cat".equals(animal)) {
            System.out.println("meow");
            return;
        }
        System.out.println("default");
    }
    // return vs System.out.println()
    // return -> early leave the method
    // System.out.println() -> just print out the result
    public static String sound2(String animal) {
        if ("ABC".equals(animal)){
            return "ABC sound";
        }
        if ("dog".equals(animal)) {
            return "wo wo";
        } else if ("cat".equals(animal)) {
            return "meow";
            // add code after return -> it is bended as it is unreachable
        }
        return "default sound";
    }

    // how to call void method? directly call other method to do sth
    public static void notifyCustomer() {
        if (sendEmail()) {
            return;
        }
        sendSMS();
    }
    public static boolean notifyCustomer1() {
        if (sendEmail()||sendSMS()) { // can call method in if
            // sendEmail() is determined first
            return true;
        }
        return false;
    }
    public static boolean notifyCustomer2() {
        return (sendEmail()||sendSMS()); // return boolean directly
        // programmer do it directly
    }

    public static boolean sendEmail() {
        return false;
    }

    public static boolean sendSMS () {
        return false;
    }

    public static String append(String a, String b) {
        return a.concat(b);
    }

    public static char getLastChar(String a) {
        return a.charAt(a.length()-1);
    }

    public static boolean isStartWith(String a, String b) {
        // if (b.indexOf(a)==0) {
        //     return true;
        // } else {
        //     return false;
        // }
        // b.startsWith(a)
        boolean result = (b.indexOf(a) == 0);
        return result;
        
    }

    public static String remove(String a, String toBeRemove) {
        String newStr = a.replace(toBeRemove, "");
        // if (a.contains(toBeRemove)) {
        //     String[] arrStr = a.split(toBeRemove);
        //     String newStr = "";
        //     for (int i = 0; i < arrStr.length; i++) {
        //         newStr = newStr.concat(arrStr[i]);
        //     }
        //     return newStr;
        // } else {
        //     return "no character to be removed";
        // }
        return newStr;
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

      public static String middleThree (String str) {
        if (str.length()<3 || str.length()%2==0) {
            return "";
        }else {
            int middleInt = str.length()/2+1;
            String resultStr = "";
            for (int i = middleInt-2; i < middleInt+1; i++) {
                resultStr += str.charAt(i);
            }
            return resultStr;
        }
      }
}
