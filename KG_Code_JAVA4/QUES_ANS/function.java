import java.util.Scanner;
// public class function{
//     public static void main(String[] args){
//        operation();
//     }
//     public static void operation(){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the first number:");
//        int a=sc.nextInt();
//        System.out.print("Enter the second number:");
//        int b=sc.nextInt();
//        System.out.println("The addition of the number is:"+(a+b));
//        System.out.println("The subtraction of the number is:"+(a-b));
//        System.out.println("The multiplication of the number is:"+(a*b));
//        System.out.println("The division of the number is:"+(a/b));

       
//     }
// }

public class function{
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "level";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}