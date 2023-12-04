public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.pow(9,0.5));
        System.out.println(Math.pow(2,-1)); // 1/2
        System.out.println(Math.pow(2,-2));

        // abs, absolute value
        System.out.println(Math.abs(-8.6));

        //ceil(), floor()
        System.out.println(Math.ceil(3.4));
        System.out.println(Math.ceil(3.7));

        System.out.println(Math.floor(3.2));
        System.out.println(Math.floor(3.7));

        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.6));
        System.out.println(Math.round(4.45)); // 1 decimal place,

        int[] arr = new int[] {-2,20,100,-40};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // if (arr[i]>max) {
            //     max = arr[i];
            // }
            max = Math.max(arr[i],max);

        }

        System.out.println(Math.min(7.5, 6.8));

        double d1 = Math.sqrt(-81);
        System.out.println(d1);
        if (Double.isNaN(d1)) {
            System.out.println("d1 is NaN");
        }

        // new Random().nextInt(4) //0,1,2,3

        int random2 = (int) Math.random()*10+1; // 0.0-1.0 inclusive
        System.out.println(random2);

        int x=10;
        x+=3.5;
        // x=x+3.5;
        
    }
}
