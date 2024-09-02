import java.util.Scanner;
public class divisible{
    public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println(n+" it is divisible by 5 and 3");
        }else{
            System.out.println(n+" is not divisible by 5 and 3");
        }
    }
}