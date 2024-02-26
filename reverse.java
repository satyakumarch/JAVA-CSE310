import java .util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
         ans=ans*10+n%10;
         n/=10;
        }
        System.out.println("reverse number is :"+ans);
    }
}