import java.util.Scanner;

public class method{
    public static String addition(int a,int b){
        int c=a+b;
        if(c>0)
            return "positive number";
        else
            return "Negative number";
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter numbers X: ");
    int x=sc.nextInt();
    System.out.print("Enter numbers Y: ");
    int y=sc.nextInt();

        System.out.println(addition(x,y));
    }
}