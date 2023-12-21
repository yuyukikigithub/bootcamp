import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        

        //before Java 1.5 (No generic)
        //
        ArrayList<String> ss= new ArrayList<String>();

        // after 1.7
        ArrayList<String> strings=new ArrayList<>();
        strings.add("abc");
        strings.add("cde");
        strings.add("fgh");
        strings.add("hij");
        System.out.println(strings.size());

        strings.remove(2);
        System.out.println(strings); // vs String[] toString inside ArrayList

        strings.remove("cde"); // check whether the value is the same, ArrayList line 624

        
        for (String s : strings) {
            System.out.println(s);
        }

        // create arraylist
        ArrayList<String> anotherList = new ArrayList<>(List.of("1234","2345","4567"));
        strings.addAll(anotherList);
        System.out.println(strings);
        
        ArrayList<String> removedList = new ArrayList<>(List.of( "2345", "4567"));
        System.out.println(strings.removeAll(removedList));
        System.out.println(strings);

        strings.add(1, "abc");
        System.out.println(strings);
        strings.set(1,"adsdf");
        System.out.println(strings);

        System.out.println(strings.subList(1, 4));
        System.out.println(strings.indexOf("hij"));

        // Iterator <String> it=strings.iterator(); // retrieve as object, 樣 before toString
        // System.out.println(it);

        // List<> is an Interface implemented by ArrayList.class
        List<String> strings2 = new ArrayList<>(); // List -->parent/interface
        // left, object reference type, interface
        strings2.add("ABC"); // method on List
        strings2.add("snake");
        strings2.add("pig");
        strings2.remove("ABC");// method on List
        
        System.out.println(strings2.subList(0, 1));// 用list instead of arraylist 接住
        System.out.println(strings2.contains("pig"));
        System.out.println(strings2.isEmpty());

        List<String> arrlist1 =new ArrayList<>(List.of("Yuki","Holy"));
        List<String> arrlist2 =(List.of("Yuki","Holy"));
        
        arrlist1.add("Betty");
        arrlist1.remove("Yuki");

        // arrlist2.add("Betty"); // java.lang.UnsupportedOperationException
        // arrlist2.set(0, "Betty"); // java.lang.UnsupportedOperationException
        
    
    }
}
