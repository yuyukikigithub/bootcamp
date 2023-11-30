import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {
        int target = new Random().nextInt(100)+1;
        int upperLimit = 100;
        int lowerLimit = 0;

        Scanner input = new Scanner(System.in);
        int inputNum ;
        // 估 1 number
        // do {
        //     System.out.println("Please input a number");
        //     inputNum = input.nextInt();
        // } while (!(inputNum==target));
        // input.close();
        // System.out.println("congras");

        //guess number within range
        do {
            System.out.println("Please input between "+lowerLimit+" and "+upperLimit);
            inputNum = input.nextInt();
            if (inputNum>target) {
                upperLimit = inputNum-1;
            }else if (inputNum<target) {
                lowerLimit = inputNum+1;
            } 
        } while (!(inputNum==target));
        System.out.println("congrats");
    }
}
