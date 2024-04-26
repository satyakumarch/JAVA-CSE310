import java.util.Scanner;
public class ThrowExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Welcome to registation process");
        if(a>12 && b>40){
            System.out.println("Student Entry is valid");
            System.out.println("have a nice day");

        }else{
            System.out.println("java.lang ArithmeticException: Student is not eligible for registation.");
        }
    }
}