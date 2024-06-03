import java.util.Scanner;
public class OddSum{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Welcome to Odd sum number");
        System.out.println("Enter the number:");
        int num=Sc.nextInt();
        int sum=sumOdd(num);
        System.out.println("sum of odd from till " +"num is :"+" = "+sum);

    }
    public static int sumOdd(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            i+=2;


        }
        return sum;
    }
}