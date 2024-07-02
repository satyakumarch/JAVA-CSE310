import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is an Armstrong number.");
        } else {
            System.out.println("Your number is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int digitCount = noofDigit(num);
        int finalNumber = 0;
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            finalNumber += pow(digit, digitCount);
        }
        return finalNumber == originalNum;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noofDigit(int num) {
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num /= 10;
        }
        return digitCount;
    }
}
