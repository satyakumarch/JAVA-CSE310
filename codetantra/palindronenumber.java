package codetantra;

public class palindronenumber {
    public static void isNumber(int number) {
        int temp=number;
        int rem=0;
        int  equal=0;
        while (temp!=0) {
            rem=temp%10;
            temp=temp/10;
            equal=equal*10+rem;
            
        }
        if(equal==number){
            System.out.println(number+"is a palindrome number");
        
        }else{
            System.out.println(number+"is not a palindrome number");
        }
       
    }
public static void main(String args[]){
    int x=Integer.parseInt(args[0]);
    isNumber(x);
}
}