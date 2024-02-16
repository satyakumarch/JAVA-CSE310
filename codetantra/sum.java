package codetantra;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.print("Enter the sum of number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<=0){
            return;
        }
        int sum=0;
        for(int i=0;i<=x;i++){
            sum=sum+i;
        }
        System.out.println("The sum of the given number is:"+sum);
    }
    
}
// output
// Enter the sum of number:10
// The sum of the given number is:55