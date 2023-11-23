public class DemoOperator {
    public static void main(String[] args) {
        int x = 3;
        // x++; // 4
        // ++x; // 5
        x +=3; // 8
        x = x +10; // 18
        

        // difference between a++ and ++a
        int a = 5;
        int preIncrement = ++a; // a is increment by 1 first, and then being assigned
        // a -> 6 first, then preIncrement -> 6
        System.out.println("preIncrement="+preIncrement);
        System.out.println("a="+a);
        // Pre-Increment(++i): We use ++i in our statement if we want to increment the value of i by 1 and then use it in our statement.


        int b = 5;
        int postIncrement = b++; // assign the value of variale b to prostincrement first
        //postincrement -> 5, b ->6
        System.out.println("postIncrement="+postIncrement);
        System.out.println("b="+b); 
        //if we want to use the current value, and then we want to increment the value of i by 1. 


        int c = 5;
        int preDeduction = --c;
        System.out.println("preDeduction="+preDeduction);
        System.out.println("c="+c);

        int d = 5;
        int postDeduction= d--;
        System.out.println("postDeduction="+postDeduction);
        System.out.println("d="+d);

        int e = 5;
        // System.out.println("++e is "+ ++e);
        // System.out.println("e++ is "+ e++);
        // System.out.println("++e is "+ ++e);
        e++;
        
        e++;
        System.out.println("e is "+e);
        




        // condition operator
        // a==true
        // b==false
        // (a||b) --> true
        // (a&&b) --> false

        if (a==6 ){ // true
            System.out.println("a==6");
        }
        if (c==5){ // false
            System.out.println("c==5");
        }
        if (d==4){ // true
            System.out.println("d==4");
        }
        if (a==6 && (c==5)){ // false
            System.out.println("yes");
        }
        if (a==6 && (c==5||d==4)){ // true
            System.out.println("yes");
        }
        if (c==5 && a==6 ){ // if the left false, other will not execute
            System.out.println("right condition not execute");
        }

        
        int r =4;
        int y = (r++ + 3)*r++;
        System.out.println(y);

        int q = 5;
        int w = (++q + 3)*++q;
        System.out.println(w);

        int grade = 59;
        boolean isPassed = true;
        char letterGrade = 'Z';

        if (grade<=0 || grade>100){
            throw new IllegalArgumentException("All grade should be positive integer and maximum grade should be 100");
        } else {
            if (grade>=50){
                isPassed = true;
                if (grade>=90){
                    letterGrade = 'A';
                } else if (grade>=80){
                    letterGrade = 'B';
                } else if (grade>=70){
                    letterGrade='C';
                } else if (grade>=60){
                    letterGrade='D';
                }else if (grade>=50){
                    letterGrade='E';
                }
            } else {
                isPassed = false;
                letterGrade = 'F';
            }
        }
        if (isPassed){
            System.out.println("This student can pass");
        } else {
            System.out.println("This student cannot pass");
        }
        System.out.println("because");
        System.out.println("The Grade is "+grade);

        switch (letterGrade) {
            case 'A':
                System.out.println("That is excellent");
                break;
            case 'B':
                System.out.println("That is good");
                break;
            case 'C':
                System.out.println("That is fair");
                break;
            case 'D':
                System.out.println("do good next time");
                break;
            case 'E':
                System.out.println("let me have extra class with you");
                break;
            case 'F':
                System.out.println("see you next year");
                break;
            default:
                break;
        }
        System.out.println("Letter grade is "+letterGrade);

        // comparison operator not only exist in if statement
        boolean isYukiHungry = false;
        boolean isLunchTime = false;
        if (isYukiHungry||isLunchTime){
            System.out.println("let's go for lunch");
        } else {
            System.out.println("let's class");
        }

        boolean finishHomework = true;
        boolean goShower = false;
        boolean haveDinner = false;
        boolean goSleep = finishHomework && goShower || haveDinner;
        if (goSleep){
            System.out.println("You can go to sleep");
        } else {
            System.out.println("You cannot go to sleep");
        }
        
        boolean c1 = true;

        if (c1 == false) {// !c1? do it
            System.out.println("c1 is false");
        }
        if (c1) { // c1 == true? do it
            System.out.println("c1 is true");
        }
        if (!c1){
            System.out.println("c1 is false");
        }
        if (c1==true){
            System.out.println("c1 is true");
        }

        boolean isSincere = false;
        int giveYouMark = isSincere?100:0;
        System.out.println("How many mark can you get in character? "+giveYouMark);

        int var1  =4;
        int var2 = 10;
        int result = var1>=var2?var2:var1;
        System.out.println("min= "+result);
        int result1 = var1>var2?var1:var2;
        System.out.println("max= "+result1); 
        
        // int n1 = 13;
        // boolean isOdd = n1/2!=0?true:false;
        // System.out.println("13 is odd number? "+isOdd);

        int n2 = 16;
        boolean isOdd1 = n2%2>0?true:false;
        System.out.println("16 is odd number? "+isOdd1 );

        int com1 = 14;
        int com2 = 22;
        int com3 = 16;
        int com4 = 20;
        int tempGreater1 = com1>com2?com1:com2;
        int tempGreater2 = com3>com4?com3:com4;
        int greatest = tempGreater1>tempGreater2?tempGreater1:tempGreater2;
        System.out.println("greatest number is "+greatest);
        int tempSmaller1 = com1<com2?com1:com2;
        int tempSmaller2 = com3<com4?com3:com4;
        int smallest = tempSmaller1<tempSmaller2?tempSmaller1:tempSmaller2;
        System.out.println("The smallest number is "+ smallest);

        double totalAmount = 0d;
        double itemTotal = 3000d;
        double transfee = itemTotal>3000?0d:itemTotal*0.03d;
        totalAmount  = itemTotal + transfee;
        
        System.out.println("Total amount is "+totalAmount);

        
        int barbie = 47;
        int gundum = barbie/10<1?0:barbie/10;
        int totalToy = barbie+(int)gundum;
        System.out.println("barbie is "+(int)barbie+"gumdum is "+(int)gundum+" and total toy is "+totalToy);
        
        String url = "http://www.google.com"; // no string in C

        if (url.length()<10|| "google".equals(url)|| url.contains("google")) {
            System.out.println("it is google.com");
        } else {
            System.out.println("it is not google");
        }

        String empty = ""; // empty string, length = 0
        empty += "go ahead";
        if (!empty.isEmpty()){
            System.out.println("String is not empty");
        } else {
            System.out.println("String is empty");
        }
        


    }
}
