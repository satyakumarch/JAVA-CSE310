import java.util.Scanner;
public class GreatestOfThreeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third number:");
        int c=sc.nextInt();
        if(a>b & a>c){
            System.out.print((a)+" is a greatest number:");
        }else if(b>a & b>c){
            System.out.print((b)+" is a greatest number.");
        }else{
            System.out.print((c)+" is a greatest number:");
        }

    }
}