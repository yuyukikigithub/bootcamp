public class Demo {
    public static void main(String[] args) {
        String str = new String("hello");
        //call Person's constructor
        Person p1 = new Person();// p1's name -> null, p1's age -> 0
        
    }

    public int maximum69Number (int num) {
        String num1= Integer.toString(num);
        String num2="";


        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i)!='6') {
                num2+=num1.charAt(i);
                continue;
            }
           
                num2+='9';
                for (int j = i; j < num1.length(); j++) {
                    num2+=num1.charAt(j);
                }
                break;
            }
            
        
        return Integer.parseInt(num2);
    }
}
