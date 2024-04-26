import java.util.Scanner;

public class AssertionDemo_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for x from the user
        System.out.println("Enter a positive integer for x:");
        int x = getPositiveInt(scanner.nextInt());

        // Get input for y from the user
        System.out.println("Enter a positive integer for y:");
        int y = getPositiveInt(scanner.nextInt());

        // Assert that x and y are positive
        assert (x > 0) : "x is not positive";
        assert (y > 0) : "y is not positive";

        // Calculate the total
        int total = x + y;
        System.out.println("Total = " + total);
    }

    // Method to get a positive integer, throws an exception if input is not positive
    public static int getPositiveInt(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }
        return num;
    }
}
