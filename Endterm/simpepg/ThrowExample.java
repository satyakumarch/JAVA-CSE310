import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        // int age = Integer.parseInt(args[0]);
        // int wt = Integer.parseInt(args[1]);
        int age=20;
        int wt=30;
        System.out.println("Welcome to registration process");
        if (age > 12 && wt < 40) {
            System.out.println("You are eligible for registration");
        } else {
            System.out.println("You are not eligible for registration");
        }
    }
}