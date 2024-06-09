import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.println("Please enter the number up to which series you want to print:");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci series:");
        printFibonacci(num);
    }

    public static void printFibonacci(int num) {
        if (num < 0) {
            return;
        }
        System.out.println("0");
        if (num == 0) {
            return;
        }
        System.out.print("1");

        int firstFibonacci = 0, secondFibonacci = 1;
        while (firstFibonacci + secondFibonacci <= num) {
            int thirdFibonacci = firstFibonacci + secondFibonacci;
            System.out.print(" " + thirdFibonacci);
            firstFibonacci = secondFibonacci;
            secondFibonacci = thirdFibonacci;
        }
    }
}
