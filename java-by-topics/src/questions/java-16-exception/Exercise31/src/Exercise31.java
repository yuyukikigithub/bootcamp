/**
 * Exercise:
 * Implement exception handler for ArithmeticException thrown from somewhere
 * So that the expected output can be generated 
 * Tips: What scenario will throw ArithmeticException, and Exception.getMessage() can get the error message
 */
/**
 * Expected Output:
 * / by zero
 */
class Exercise31 {

    // Method 1
    static int divideByZero(int a, int b) {

        int i = a / b;

        return i;
    }

    // Method 2
    // The runTime System searches the appropriate Exception handler in method
    static int computeDivision(int a, int b) {

        int res = 0;

        // Try block to check for exceptions
        try {
            res = divideByZero(a, b);
        }
        // Catch block to handle NumberFormatException
        // exception, which doesn't matches with ArithmeticException
        catch (NumberFormatException ex) { // cannot catch this exception
            // Display message when exception occurs
            System.out.println(
                    "NumberFormatException is occurred");
        }
        return res;
    }

    

    public static void main(String args[]) {

        int a = 1;
        int b = 0;

        // Think about how to catch exception
        // int i = computeDivision(a, b);
        // System.out.println(i);

        try{
            int i = computeDivision(a, b);
            System.out.println(i);
        } catch(NumberFormatException ex){
            System.out.println("hey here is number format exception");
        }catch(ArithmeticException ex){
            System.out.println(
                    ex.getMessage());
        }

        
        
    }
}