public class DemoIntArray {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] {2,5,7,4};
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
        // 2D array row x column
        int[][] array=new int[][] {{1,2,3},{20,30,40},{25,35,45},{20,40,50}};

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.println(
                    "row="+row+", col="+col+", value="+array[row][col]
                );
            }
        }

        // sum up elements with odd row index and even column index
        int sum1=0;
        for (int row = 0; row < array.length; row++) {
            if (row%2==0) {
                continue;
            }
            for (int col = 0; col < array[0].length; col++) {
                if (col%2!=0) {
                    continue;
                } 
                sum1+=array[row][col];
            }
        }
        System.out.println(sum1);
        
    }
}
