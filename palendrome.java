import java.util.Scanner;

public class palendrome {
    public static void main(String[] args) {
        System.out.println("---------------Palindrone number--------------\n");
        int r,sum=0,temp;
        int n=345;
        
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("Palindrone number");
    else
        System.out.println("Not palindrone number");
    }

    
}
