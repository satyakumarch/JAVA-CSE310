import java.util.Scanner;
public class elsecode{
    public static void main(String[] args){
        System.out.print("Enter your marks:");
       Scanner sc=new Scanner(System.in);
       int mark=sc.nextInt();
       if(mark>=90 && mark<=100){
        System.out.println("Excellent");
       }else if(mark>=80 && mark<=90){
        System.out.println("very good");
       }else if(mark>=70 && mark <=80){
        System.out.println("Good");
       }else if(mark>=60 && mark<=70){
        System.out.println("can do better");
       }else if(mark>=50 && mark<=40){
        System.out.println("Averrage");
       }else if(mark<40){
        System.out.println("fail");
       }
       

    }
}