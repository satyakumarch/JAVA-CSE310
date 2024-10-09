import java.util.Scanner;
public class method {
    public static String grade(int mark) {
        if (mark >= 90) {
            return "A++";
        } else if (mark >= 80) {
            return "A";
        } else if (mark >= 70) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int num = sc.nextInt();
        System.out.println("Your grade is: " + grade(num));
    }
}
