public class DemoRecursion {
    public static void main(String[] args) {
        //1+2+3+4+5
        int sum=0;
        for (int i = 1; i <= 5; i++) {
            sum+=i;
        }
        System.out.println(sum);  //15
        
        //recursion: given int n, n+(n-1)+(n-2)...+1
        System.out.println(sum(5)); // 15
        //recursion: given int n, 
        // n is odd, return n+(n-2)+(n-4)...+1
        // n is even, return n+(n-2)+(n-4)...+2
        System.out.println(mul(10));

        System.out.println(factorial(5));

        int idx=10;
        int result=1;
        while (idx>1) {
            result*=idx;
            if (idx==1||idx==2) {
                break;
            }
            idx=idx-2;
        }
        System.out.println(result);

        int sumDigit=0;
        String temp=Integer.toString(15);
        for(int j=0;j<temp.length();j++){
            System.out.println(Integer.valueOf(temp.charAt(j))-48 )  ;
        }
        // System.out.println(sumDigit);

    }

    //space / time complexity win
    public static int sum(int n){
        //recursion, call self
        //base criteria
        if (n==1) {
            return 1;
        }
        return n+sum(n-1); //用自己return nothing
        //return 5+sum(4);15 ;sum(5)
        //return 4+sum(3);10 ;sum(4)
        //return 3+sum(2);6 ;sum(3)
        //return 2+sum(1);3 ;sum(2)
        //return 1+sum(0);1 ;sum(1)

        // output as input next time
    }

    public static int mul(int n){
        if (n%2==0) {
            if (n==2) {
                return 2;
            }
        }
        if (n==1) {
            return 1;
        }
        return n*mul(n-2);
        //mul(8)
        //return 8*mul(6); mul(8); 384;
        //return 6*mul(4); mul(6); 48;
        //return 4*mul(2); mul(4); 8;
        //return 2*mul(0); mul(2); 2;

        //mul(9)
        //return 9*mul(7); mul(9); 945;
        //return 7*mul(5); mul(7); 105;
        //return 5*mul(3); mul(5); 15;
        //return 3*mul(1); mul(3); 3;
        //return           mul(1); 1;
        
    }

    public static int factorial(int n){
        if (n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    

}
