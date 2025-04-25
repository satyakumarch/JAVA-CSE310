import java.util.Scanner;
public class threedigitnum{
    public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=99 && n<1000){
            System.out.println(n+" is a three digit number:");
        }else{
            System.out.println(n+" is not three  digit number");
        }
       
    }
}