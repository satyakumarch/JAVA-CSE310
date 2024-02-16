

public class palendrome {
    public static void main(String[] args) {
        System.out.println("---------------Palindrome number--------------\n");
        int r,sum=0,temp;
        int n=345;
        
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("Palindrome number");
    else
        System.out.println("Not palindrome number");
    }

    
}
