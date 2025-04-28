// import java.util.Scanner;

// public class GCD {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int n1 = sc.nextInt();

//         System.out.print("Enter the second number: ");
//         int n2 = sc.nextInt();

//         int hcf = hcf(n1, n2);

//         // Corrected printf statement with format specifiers
//         System.out.printf("G.C.D of %d and %d is %d.%n", n1, n2, hcf);

//         sc.close(); // Close the scanner40
//     }

//     public static int hcf(int n1, int n2) {
//         if (n2 != 0)
//             return hcf(n2, n1 % n2);
//         else
//             return n1;
//     }
// }
import java.util.Scanner;
public class GCD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1=sc.nextInt();
        System.out.print("Enter second number:");
        int n2=sc.nextInt();
        
        int hcf=hcf(n1,n2);
        System.out.printf("The GCD of the %d and %d is %d.%n ",n1,n2,hcf);


    }
    public static int hcf(int n1,int n2){
        if(n2!=0){
            return hcf(n2,n1 % n2);
        }else{
            return n1;
        }
    }
}