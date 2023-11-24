public class DemoNestedLoop {
    public static void main(String[] args) {

        // for (int i = 0; i <5; i++) {
        //     System.out.print("*");
        // }

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("i="+i);
        //     for (int j = 0; j < 4; j++) {
        //         System.out.println("x="+i+"j="+j);
        //     }
        // }

        // sysout is written before/inside/after break
        // before break -->  print after one
        // inside break --> only print break one
        // after break --> print previous one
        // for (int i = 0; i < 4; i++) { // outer loop

        //     System.out.println("this is week "+(i));
        //     for (int j = 0; j < 7; j++) { // inner loop
        //         if (i>1&&j>2){
        //             break;
        //         }
        //         System.out.println("and the "+(j)+" day of week");
        //     }
        // }

        // String i1 = "!";
        // String j1 = "?";

        // for (int i = 0; i < args.length; i++) {
        //     i1+="!";
        //     for (int j = 0; j < args.length; j++) {
        //         j1+="?";
        //         System.out.println("i1 is "+i1+" j1 is "+j1);
        //     }
        // }

        // println vs print ===> new line vs not new line
        // for (int i = 0; i < 5; i++) {
        //     // System.out.println("");
        //     for (int j = 0; j <4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <(4-i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        String str1 ="abcdefghijk";
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
            if (i>0 && (i+1)%4==0) {
                System.out.println("");
            }
        }

        // String str1 ="abcdefghijk";
        // int count = 0;
        // for (int i = 0; i < str1.length(); i++) {
        //     System.out.print(str1.charAt(i));
        //     if (++count%4==0|| i==str1.length()-1) {
        //         System.out.println("");
        //     }
        // }

        // why there is 2 nest for loop
        // represent different pattern
        // how many group (i)
        // how is each group inside (j)

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print(" ");
        // }

        // Example 4a
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            if (!(i==5)) {
                System.out.print(" ");
            }
        }
        System.out.println("");

        // Example 4b
        for (int i = 0; i < 6; i++) {
            if (!(i==5)) {
                System.out.print("*** ");
            } else {
                System.out.print("***");
            }
        }

    }
}
