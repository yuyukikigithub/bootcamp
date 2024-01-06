import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        var s= "hello";
        var w = 123;// <---  how if 
        var s2 = "djngo"; // after compile : var -> String
        
        System.out.println(s2.concat(s));
        System.out.println(w+2);

        var z = add(5,9);
        System.out.println(z);

        // s = 123; // error
        // s2 = 123; // error s2 is declared before, and pointing to a string object
        // cannot be reassgined to int value object

        List<DogInf> dogs = new ArrayList<>(List.of(new DogInf("abc"),new DogInf("erf")));
        for (DogInf dogInf : dogs) {
            System.out.println(dogInf.getName());
        }
        for (var dogInf : dogs) {
            System.out.println(dogInf.getName());
        }
        // Map<String, DogInf> dogMap = new HashMap<>();

        // dogMap.put("oo",new DogInf("onon"));
        // for (Map.Entry<String, DogInf> entry : dogMap.entrySet()) { // keySet() // values()
        //     System.out.println(entry.getKey()+entry.getValue());
        // }
        // public static var add(){ // return var not allowed
        // }

        // public static int add(var x){ // input param not allowed
        // }

        // if variable is declared by var, we have to assign value at the same time
        
        

    }
    public static int add(int x, int y){
            return x+y;
        }
}
