import java.util.Scanner;
public class PositiveNegativeZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.print((num)+" is a positive number");
        }else if(num<0){
            System.out.print((num)+" is a negative number:");

        }else{
            System.out.println("Number is zero");
        }

    }
}