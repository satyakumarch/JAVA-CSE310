import java.util.Scanner;
public class LCM{
    public static void main(String[] aegs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Enter the first number:");
        int first=sc.nextInt();
        System.out.print("Enter the second number:");
        int second=sc.nextInt();
        int lcm=lcm(first,second);
        System.out.println("LCM of the two number is :"+lcm); 
    }
    public static int lcm(int first,int second){
        int i=1;
        while(true){
            int factor=first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }

    }
}