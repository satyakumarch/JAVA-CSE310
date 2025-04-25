import java.util.Scanner;
public class axis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        System.out.print("Enter the value of y:");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("it belong on x-axis");
        }else if(x==0){
            System.out.println("it belong on y axis");
        }else if(y==0){
            System.out.println("it belong on x axis");
        }else{
            System.out.println("nothing");
        }
    }
}