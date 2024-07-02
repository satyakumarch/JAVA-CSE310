import java.util.Scanner;
public class swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        
        System.out.println("The value of A:"+a);
        System.out.println("The value of B:"+b);

    }
}