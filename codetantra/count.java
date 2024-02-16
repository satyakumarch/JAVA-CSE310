package codetantra;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            return;
        }
        int count=0;
        while(n!=0){
            count++;
            n/=0;
        }
        System.out.println(count);
            
        
    }
}
