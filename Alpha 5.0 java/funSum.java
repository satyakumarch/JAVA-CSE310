import java.util.Scanner;
public class funSum{
    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        sum(a,b);
        

    }
}