import java.util.Scanner;
public class operator{
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a=sc.nextInt();
        System.out.print("Enter the number b:");
        int b=sc.nextInt();
        System.out.println("the addition of "+a+" and "+b+"is :"+(a+b));
        System.out.println("the subtraction of "+a+" and "+b+"is :"+(a-b));
        System.out.println("the multiplication of "+a+" and "+b+"is :"+(a*b));
        System.out.println("the devision of "+a+" and "+b+ "is :"+(a/b));
    }
}