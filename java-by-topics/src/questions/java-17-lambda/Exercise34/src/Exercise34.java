import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Print all Elements in ArrayList integers:
 * 10
 * 13
 * 14
 * 29
 * Duplicate the Even number from ArrayList
 * [10, 13, 14, 29, 11, 15]
 * Print the Odd Numbers from the ArrayList
 * 13
 * 29
 * 11
 * 15
 */
class Exercise34 {
    public static void main(String args[]) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(13);
        integers.add(14);
        integers.add(29);

        // Using lambda expression to invoke forEach() method to print all elements in ArrayList integers
        System.out.println("Print all Elements in ArrayList integers:");
        integers.stream().forEach(System.out::println);

        // Using lambda expression to invoke forEach() method
        // Print Odd Number in the ArrayList integers
        // And add a copy of (Even Numbers +1) in ArrayList). 
        // For example, [2, 3, 4] -> [2, 3, 4, 3, 5], because 2 and 4 are even numbers, 3=2+1, 5=4+1.
        // Thus, we add 3 and 5 to the arraylist.
        integers.addAll(integers.stream().filter(e->e%2==0).map(e->e+1).collect(Collectors.toList()));
        System.out.println("Duplicate the Even number from ArrayList");
        System.out.println(integers);
        
        System.out.println("Print the Odd Numbers from the new ArrayList");
        integers.stream().filter(e->e%2==1).forEach(System.out::println);
    }
}
