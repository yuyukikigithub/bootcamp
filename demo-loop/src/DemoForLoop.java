public class DemoForLoop {
    public static void main(String[] args) {
        int x = 2;

        System.out.println("The value of 'x' is "+x);
        // count initialization; counter's continue condition; counter's movement
        // Step 1: int i = 0
        // Step 2: i < 4? i is 0
        // Step 3: yes - do inside: x*=2 System.out.println
        // Step 4: i++
        // Step 5: i<4? i is 1
        // Step 6: yes - do inside: x*=2 System.out.println
        // Step 7: i++
        // Step 8: i<4? i is 2
        // Step 9: yes - do inside: x*=2 System.out.println
        // Step 10: i++
        // Step 11: i<4? i is 3
        // Step 12: yes - do inside: x*=2 System.out.println
        // Step 13: i++
        // Step 14: i<4? i is 4
        // Step 15: no- end loop
        
        for (int i=0; i < 4; i++){ 
            x*=2;
            System.out.println("x is "+x);
        }
        // for (int i = 0; i <10; i++) {
        //     x*=2;
        // }
        // System.out.println("The second value of 'x' is "+x);

        // not suggest to change the initializationa and counter movement
        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        // for (int i = 1; i <=4 ; i++) {
        //     System.out.println("this is "+i+" count");
        // }

        System.out.println("Endless debug process");
        for (int i = 0; i < 3; i++) {
            if (i==0){
                System.out.println("I have debuged for "+(i+1)+" time.");
            } else{
                System.out.println("I have debuged for "+(i+1)+" times.");
            }
            
        }

        System.out.println("There is a hungry person who have many meals");
        for (int i = 0; i < 7; i++) {
            if (i==0){
                System.out.println("The person have "+(i+1)+" meal today.");
            }
            System.out.println("The person have "+(i+1)+" meals today.");
        }

        for (int i = 0; i < 12; i++) {
            if (i==0){
                System.out.println("There is 1 tart");
            }else if (i==11){
                System.out.println("There is a dozen of tarts");
            } else {
                System.out.println("There is "+(i+1)+" tarts");
            }
        }
        
        String append = "";
        for (int i = 0; i < 10; i++) {
            append = "Your computer have "+(i+1)+" GB RAM, ";
            if (i<8){
                append += "which is not enough.";
            } else {
                append += "which is enough.";
            }
            System.out.println(append);
        }
        int totalNum = 0;
        for (int i = 0; i <11; i++) {
            totalNum +=i;
        }
        System.out.println("Total number is "+totalNum);

        int totalEven = 0;
        for (int i = 0; i <10 ; i++) {
            if ((i+1)%2==0){
                totalEven+=(i+1);
            }
        }
        System.out.println("Total sum of even number is "+totalEven);

        
        for (int i = 0; i < 5; i++) {
            if ((i+1)%2==0){
                System.out.println((i+1)+" is even number."); 
            } else {
                System.out.println((i+1)+" is odd number.");
            }
        }

        // System.out.println("We will train the logical thinking this week.");
        // for (int i = 0; i < 90; i++) {
        //     if ((i+1)%10==0) {
        //         System.out.println("This is the "+(i+1)+"th day of course");
        //     } 
        // }


        //if (0-50), odd sum1
        // if (51-100) even sum2
        //total sum1 x sum2
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 101; i++) {
            
            // if (i%2==1 && i<=50){
            //     sum1+=i;
            // }
            // if (i%2==0 && i>50){
            //     sum2+=i;
            // }

            if (i<=50){
                if (i%2==1){
                    sum1+=i;
                }
            }else {
                if (i%2==0){
                    sum2+=i;
                }
            }
        }
        System.out.println("When sum1 ("+sum1+") multiply sum2 ("+sum2+") the result will be "+(sum1*sum2));
        for (int i = 0; i < 102; i++) {
            if (i==101){
                System.out.println("It is time to watch 101 dogs");
            } else if (i>90 && i%2==0) {
                System.out.println("It is day ("+i+") and it is time to work");
            }
        }

        // continue
        //sum up all odd number (0-100)
        int sum=0;
        for (int i = 0; i < 9; i++) {
            // skip even number : continue
            if (i%2==0){
                continue;// go to the next iteration, skip the rest of codes
                // *******continue should not be the bottom of block******
            }
            // For even number, the following code will skipped
            sum+=i;
            // .....also skip futher code
        }
        // sum = 0
        // i=0, sum+0=0
        // i=1, sum+1=1
        // i=2, sum+0=1
        // i=3, sum+3=4
        // i=4, sum+0=4

        System.out.println("sum is "+sum);

        String SearchP = "Pepper Pig is picking the packet.";
        int countP = 0;
        for (int i = 0; i < SearchP.length(); i++) {
            if (SearchP.charAt(i)=='P'|| SearchP.charAt(i)=='p'){
                countP+=1;
            }
        }
        System.out.println("The number of P/p is "+countP);

        //break
        // jump out the loop
        // sum up all odd number (0-100), 
        // sum <=200
        // the loop should be ended at which number of i
        // find i and sum
        int i10 = 0;
        int sum10 = 0;
        for (i10 = 0; i10 < 101; i10++) {
            if (i10%2==0){
                continue;
            }
            sum10+=i10;
            // System.out.println(sum10);
            if (sum10+i10>200){
                // sum10+=i10;
                // System.out.println("i is "+i10+" and sum is "+sum10);
                break; 
                
            }
            // sum10+=i10;
            // System.out.println("i is "+i10+" and sum is "+sum10);
            // sum10+=i10;

        }

        System.out.println("i is "+i10+" and sum is "+sum10);
        
    }
}
