public class DemoStringBuilder {
    public static void main(String[] args) {
        // String: +=
        // concat

        // StringBuffer --> reference
        // String --> object value

        
        String s1 = "abc";
        s1 += "def"; // new object
        s1 = s1.concat("def");//** */ // new object so need s1= // vs  s1.concat("def")
        System.out.println(s1);//return new string, pass by value, new object created

        // sb
        // 
        // there is an object called StringBuilder Object to save the change
        // call the same object however it changes
        // same as array, pass by reference
        StringBuffer y = new StringBuffer("abc");
        y.append("def").append("def");//*** */ y is the same object
        System.out.println(y.toString()); //the same object, pass by reference

        StringBuilder z=new StringBuilder("abc");
        z.append("def").append("def");
        System.out.println(z.toString());
    }
}
