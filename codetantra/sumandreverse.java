
package codetantra;


public class sumandreverse {
    public static void main(String[] args) {
        int x=Integer.parseInt(System.in);

    }
    public static void sumandreverse(int num){
        int temp=num;
        int rev=0;
        int rem=0;
        int sum=0;
        while (temp>0) {
            rem=temp%10;
            sum+=rem;
            rev=rev*10+rem;
            temp=temp/10;

            
        }
        System.out.println(sum);
        System.out.println(rev);
    }
}
