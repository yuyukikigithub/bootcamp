public class DemoMethod {
    // main -> method name
    // public -> can be used by public, either public or private
    // static -> method need 'static', as tool
    // void -> void(no ruturn type) return type

    // main -> for testing result, maybe unneccessary

    // when call method: find method signature
    // name of method
    // type of parameter
    // number of parameter
    // error when more than one the same method signature
    public static void main(String[] args) { 
        // javac -> compile command, conver .java to .class
        // java -> run.class file
        int x = 2;
        int y = 10;
        x*=2;
        x+=y;
        System.out.println("x="+y);

        int result = sum(10,3);
        
        System.out.println("result "+result);

        System.out.println(sum(4,5));
        System.out.println(str("iamuglyy",'y'));
        System.out.println(subs(20,4,8));
        System.out.println(multipy(5, 1001));
        System.out.println(divide(90.5, 10.5));
        System.out.println(withouEnd2(" halo "));
        System.out.println(addString("Heyo", '!'));
        System.out.println(addString("Hey", " yo!"));
    }

    // Method name: sum
    // return type: int
    // parameter: no parameter, one or more than one parameter
    // f(x,y) = x+y
    // return value = x+y
    public static int sum(int x, int y) {
        int sum = x+y;
        return sum;
    }

    // void should be matched with return result
    public static String str(String a, char b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            
            if (a.charAt(i)==b) {
                count++;
                continue;
            }
        }
        if (count!=0) {
            if (count==1) {
                return "There is "+count+" '"+b+"' in the string. ";
            }else{
                return "There is "+count+" '"+b+"'s in the string. ";
            }
            
        } else {
            return "Not found.";
        }
    }
        

    public static int subs(int d, int e, int f) {
        return (d-e-f);
    }

    public static int multipy(int i, int j) {
        return i*j;
    }

    public static double divide (double d1, double d2) {
        // int /  int = double
        // ensure result is double, add(double)
        return (double)d1/d2; // d1 is double
    }

    public static String withouEnd2(String str) {
        if(str.length()<=2){
          return "";
        } else{
          String strNew = "";
          for(int i=1; i<str.length()-1; i++){
            strNew += str.charAt(i);
          }
          return strNew;
          
        }
    }

    public static String addString(String a, char b) {
        return a+=b;
    }

    public static String addString(String a, String b) {
        return a.concat(b);
    }
}
