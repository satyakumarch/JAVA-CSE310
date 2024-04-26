import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        // Check if there are enough arguments
        if (args.length < 2) {
            System.out.println("Please provide at least 2 command line arguments.");
            return;
        }

        try {
            // Parse command line arguments
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            
            // Perform division and print the result
            System.out.println("Result = " + (x / y));
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Exception caught: divide by zero occurred.");
        } catch (NumberFormatException e) {
            // Handle invalid input format
            System.out.println("Invalid input: Please provide valid integer values.");
        }
    }
}
