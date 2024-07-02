import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 6, 89, 69, 54, 25, 36, 47, 25, 12};
        System.out.println("Welcome to array Searching");
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();

        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number is found in the array.");
        } else {
            System.out.println("Your number is not found in the array.");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == num) {
                return true;
            }
        }
        return false;
    }
}
