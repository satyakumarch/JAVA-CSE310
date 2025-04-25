import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to sum of digit number");
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int sum=sum(num);
        System.out.println("The sum of the digit number is:"+sum);

    }
    public static int sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;

    }
}