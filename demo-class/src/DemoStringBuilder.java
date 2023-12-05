import org.xml.sax.SAXException;

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

        StringBuilder ss1=new StringBuilder("");

        int counter=5;
        
        // for (int i = 0; i < counter*3; i+=3) {
        //     ss1.append(i+1);
        //     ss1.append(i+2);
        //     ss1.append(i+3);
        //     ss1.append(" ");
        // }
        int num=0;
        while (counter-->0) {
            // ss1.append(++num).append(++num).append(++num);
            for (int i = 0; i < 3; i++) {
                ss1.append(++num);
            }
            if (counter>0) {
                ss1.append(" ");   
            }
        }

        System.out.println(ss1);


        StringBuilder ss2 = new StringBuilder();
        int ccounter  =5;
        char cc2 = 'a';
        while (ccounter-->0) {
            for (int i = 0; i < 3; i++) {
                ss2.append(cc2);
            }
            if (ccounter>0) {
                ss2.append(" ");
            }
            cc2++;
        }
        System.out.println(ss2);

        System.out.println(ss2.reverse().toString());

        // StringBuilder vs String
        // StringBuilder revise character bu string new object
        System.out.println(ss2.insert(2, "sdrg"));

        System.out.println(ss2.delete(1, 4).toString());

        ss2.setCharAt(2, 'k');

        System.out.println(ss1.charAt(3));

        System.out.println(ss2.replace(2, 4, "dfg"));
    
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2=new StringBuilder("abc");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));

        //isEmpty(), length(), substring, compareTo
        // == check object , equals check class

        System.out.println(stringconcat());
        System.out.println(stringBuilderAppend());


    }

    public static long stringconcat(){
        // long start=System.currentTimeMillis();
        long start=System.nanoTime();
        String s="";
        for (int i = 0; i <1000; i++) {
            s=s.concat("a");
        }
        long end=System.nanoTime();
        return end-start;
    }
    //StringBuilder faster 
    public static long stringBuilderAppend(){
        long start=System.nanoTime();
        StringBuilder s=new StringBuilder();
        for (int i = 0; i <1000; i++) {
            s=s.append("a");
        }
        long end=System.nanoTime();
        return end-start;
    }
}
