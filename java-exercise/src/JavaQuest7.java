/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here
    int sum = 0;

    // Write a loop to sum up all value in the int array
    // code here
    for (int i = 0; i < 11; i++) {
      sum+=i;
    }

    System.out.println("The sum is " + sum);
  }
}