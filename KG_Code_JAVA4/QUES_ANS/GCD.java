import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        int gcd = gcdOfNumber(first, second);
        System.out.println("The GCD of two numbers is: " + gcd);
    }

    public static int gcdOfNumber(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = Math.min(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
