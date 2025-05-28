import java.util.Scanner;
public class function{
    public static void main(String[] args){
       operation();
    }
    public static void operation(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the first number:");
       int a=sc.nextInt();
       System.out.print("Enter the second number:");
       int b=sc.nextInt();
       System.out.println("The addition of the number is:"+(a+b));
       System.out.println("The subtraction of the number is:"+(a-b));
       System.out.println("The multiplication of the number is:"+(a*b));
       System.out.println("The division of the number is:"+(a/b));

       
    }
}