import java.util.Arrays;

public class DemoStringArray {
    public static void main(String[] args) {

        String[] strings = new String[]{"abc","ijk","xyz"};
        String[] strings2 = new String[3];

        for (int i = 0; i < strings2.length; i++) {
            // if(i==strings2.length-1){
            //     strings2[i] = strings[i].concat("!");
            // }else {
            //     strings2[i] = strings[i].concat(strings[i+1]);
            // }

            if(i<strings2.length-1){
                strings2[i] = strings[i].concat(strings[i+1]);
            }else {
                strings2[i] = strings[i].concat("!");
            }

            // if(i<strings2.length-1){
            //     strings2[i] = strings[i].concat(strings[i+1]);
            //     System.out.println(strings2[i]);
            //     continue;
            // }
            // strings2[i] = strings[i];
            // System.out.println(strings2[i]);
                
            
        }
        System.out.println(Arrays.toString(strings2)); // outside the loop, print the last result of looping by array

        String[] family = new String[5];
        String member = "!";
        for (int i = 0; i < family.length; i++) {
            if(i==0){
                family[i] = member;
            }else{
                family[i] = family[i-1].concat("!");
            }
            
            System.out.println(family[i]);
            
        }
    }
}
