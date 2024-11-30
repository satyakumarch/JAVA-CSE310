import java.util.Scanner;
public class sumofOddEven{
    public static void main(String[] args){
        int n, sumE = 0, sumO = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of the element:");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.print("Enter the array element:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                sumE = sumE + a[i];
            } else {
                sumO = sumO + a[i];
            }
        }
        System.out.println("The sum of the even number is:" + sumE);
        System.out.println("The sum of the odd number is:" + sumO);
        
        System.out.println("Enter a number to find the sum of its digits:");
        int number = sc.nextInt();
        System.out.println("The sum of the digit is:" + sumofDigit(number));
    }

    public static int sumofDigit(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
