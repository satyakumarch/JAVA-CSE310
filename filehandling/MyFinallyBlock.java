import java.util.*;

public class MyFinallyBlock {
    public static void main(String[] args) {
        // Check if there are enough arguments
        if (args.length < 4) {
            System.out.println("Please provide at least 4 command line arguments.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Result of the integer values division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Inside the 1st catch block: Division by zero.");
        } finally {
            System.out.println("Inside the 1st finally block");
        }

        try {
            float x = Float.parseFloat(args[2]);
            float y = Float.parseFloat(args[3]);
            System.out.println("Result of float values division: " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Inside the 2nd catch block: Division by zero.");
        } finally {
            System.out.println("Inside the 2nd finally block");
        }
    }
}
