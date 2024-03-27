import java.util.Scanner;

public class assert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        
        // Assertion to check if the number is within the range
        assert number >= 1 && number <= 10 : "Number is not within the range";
        
        System.out.println("You entered: " + number);
        
        scanner.close();
    }
}
