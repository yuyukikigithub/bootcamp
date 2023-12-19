package trytrytry;

public class ReadItCarefully {
    static final String string = "IamFinalString";
    private static char c= 'C';
    static {
        char[] chars = string.toCharArray();
        c=chars[2];
    }
    public static void main(String[] args) {
        ReadItCarefully read = new ReadItCarefully();
        System.out.println(read.c);
    }
}
