import java.util.Scanner;
public class ReverseTheDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to reverse number");
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int reverse=reverse( num);
        System.out.println("Reverse of your number is :"+reverse);
        
    }
    public static int reverse(int num){
 int newNum=0;
 while(num>0){
    int digit=num%10;
    newNum=newNum*10+digit;
    num/=10;
 }
 return newNum;
    }
}