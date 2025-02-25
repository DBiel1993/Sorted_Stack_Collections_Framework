
/** The original code containing linked lists has been updated with a stack due 
 * to the reduction in resource utilization of stacks compared to linked lists */

import java.util.Stack; // Code Reuse: Using Java's built-in Stack instead of custom implementation
import java.util.Collections; // Code Reuse: Using Java's Collections utility class for sorting
import java.util.Scanner; // Code Reuse: Using Scanner for input handling instead of manual parsing

/**
 * The SortedStack program reads a list of integers from the user input,
 * stores them in a Stack, sorts them in ascending order, and prints them.
 * The list can be sorted in reverse order by changing the order of the
 * arguments in the Collections.sort() method.
 * 
 * This program utilizes Java's Collections Framework for sorting and follows
 * best practices.
 * It is designed to be executed from the command line.
 * 
 * Code Reuse Examples:
 * 
 * Stack: Uses Java’s built-in Stack instead of implementing from scratch.
 * Collections.sort(): Uses Java’s optimized sorting algorithm instead of
 * writing our own.
 * Scanner: Uses Java’s standard input handling instead of manual parsing.
 * System.out.println(): Uses built-in output handling instead of custom print
 * logic.
 * 
 * 
 * Best Practices Used:
 * 
 * Encapsulation: Uses Stack for efficient data storage.
 * Collections Framework: Uses built-in sorting instead of custom logic.
 * Input Validation: Ensures only valid integers are added.
 * Resource Management: Closes Scanner to prevent memory leaks.
 * Modularity: Structured for easy maintenance and reuse.
 * 
 * 
 * @author Dylan Bielser
 * @version 1.2
 * @since 2025
 */
public class SortedStack {

    /**
     * The main method drives the program execution.
     *
     * Reads integers from standard input, adds them to a Stack,
     * sorts the Stack, and prints the sorted numbers.
     * 
     * Code Reuse Examples:
     * 
     * Uses a Stack from the Java Collections Framework.
     * Sorts the stack efficiently using {@code Collections.sort()}.
     * Uses Scanner to handle input instead of custom parsing.
     * Uses built-in System.out.println() for output.
     *
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Code Reuse: Using built-in Scanner for input handling
        Stack<Integer> numbers = new Stack<>(); // Code Reuse: Using Java’s Stack instead of manual
                                                // linked list implementation

        System.out.println("Enter integers (type 'done' to finish):");
        System.out.flush(); // Ensures immediate output visibility in some terminal environments

        // Code Reuse: Using Scanner's built-in methods to validate input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.push(scanner.nextInt()); // Encapsulation: Stores values in a reusable Stack
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                    System.out.flush();
                }
            }
        }
        scanner.close(); // Best Practice: Closing Scanner to prevent resource leaks

        // Code Reuse: Using Collections.sort() instead of writing our own sorting
        // algorithm
        Collections.sort(numbers);

        // Code Reuse: Using built-in System.out.println() instead of custom print logic
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}