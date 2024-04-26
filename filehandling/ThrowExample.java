import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if at least two arguments are provided
        if (args.length < 2) {
            System.out.println("Error: Please provide two arguments (a and b).");
            return;
        }

        try {
            // Parse the command-line arguments
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("Welcome to registration process");
            
            // Check the student's eligibility
            if (a > 12 && b > 40) {
                System.out.println("Student entry is valid.");
                System.out.println("Have a nice day.");
            } else {
                System.out.println("Student is not eligible for registration.");
            }
        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Error: Please provide valid integer arguments.");
        }
    }
}
