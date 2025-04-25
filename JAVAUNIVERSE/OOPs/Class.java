import java.util.Scanner;
public class Class{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("you can see what you can write on you page");
        System.out.println("Enter the number a:");
        int a=sc.nextInt();
        System.out.println("Enter the number b:");
        int b=sc.nextInt();

        System.out.println("sum"+sum(a,b));
        System.out.println("sub"+sub(a,b));
    }
        public static int sum(int a,int b){
            return a+b;

        }
        public static int sub(int a,int b){
            return a-b;
        }



    
}