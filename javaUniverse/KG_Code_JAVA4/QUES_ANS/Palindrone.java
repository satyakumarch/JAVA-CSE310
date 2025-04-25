import java.util.Scanner;
public class Palindrone{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to palindrone number:");
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean isPalindrone=isPalindrone(num);
        if(isPalindrone){
            System.out.println("your number is palindrone number:");
        }else{
            System.out.println("Your number is not a palindrone number:");
        }
    }
    public static boolean isPalindrone(int num){
        int reverse=reverse(num);
        return num==reverse;

    }
}