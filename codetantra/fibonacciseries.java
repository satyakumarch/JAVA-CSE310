package codetantra;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=Integer.parseInt(args[0]);
        int a=0;
        int b=1;
        int c=0;
        do{
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
            if(c<=x){
                System.out.println(" ");
            }
            while (c<=x) {
                
            }
        }
    }
    
}
