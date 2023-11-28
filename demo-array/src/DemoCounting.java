import java.util.Arrays;

public class DemoCounting {
    public static void main(String[] args) {
        int[] num = new int[] {10,2,200,2000,2000,2,2};
        // int[] counts = new int[]
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i]>max) {
                max = num[i];
            }
            if (num[i]<min) {
                min = num[i];
            }
        }
        System.out.println("min "+min +" max "+max);

        int[] counts = new int[max-min+1];
        // System.out.println(counts.length);//1999
        for (int i = 0; i < num.length; i++) {
            counts[num[i]-min]++; // ++轉化為次數, 
        }
        // System.out.println(Arrays.toString(counts));
        int maxCount = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i]!=0 && counts[i]>maxCount) {
                maxCount = counts[i];
            }
        }
        System.out.println("maxCount "+maxCount);

        String random=  "abcabcfuffigoaa";
        char[] chch = new char[26];
        for (int i = 0; i < random.length(); i++) {
            chch[random.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(chch));
        int maxx = 0;
        for (int i = 0; i < chch.length; i++) {
            if (chch[i]!=0 && chch[i]>maxx) {
                maxx = chch[i];
                // maxx = (char)(i+'a');
            }
        }
        System.out.println("maxx "+maxx);

    
    }
}
