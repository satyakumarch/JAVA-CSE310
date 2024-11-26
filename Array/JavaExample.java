// import java.util.Scanner;

// class DisplayOverloading {
//     // Adding two integer numbers
//     int add(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     // Adding three integer numbers
//     int add(int a, int b, int c) {
//         int sum = a + b + c;
//         return sum;
//     }
// }

// class JavaExample {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter the third number: ");
//         int c = sc.nextInt();

//         DisplayOverloading obj = new DisplayOverloading();

//         System.out.println("The sum of the first number and second number is: " + obj.add(a, b));
//         System.out.println("The sum of the first number, second number, and third number is: " + obj.add(a, b, c));

//         sc.close(); // Closing the Scanner to avoid resource leaks
//     }
// }
import java.util.Scanner;
class  DisplayOverloading{
  int add(int a,int b){
    int sum=a+b;
    return sum;
  
  }
  int  mux(int a,int b){
    int mul=a*b;
    return mul;
  }
};


public class JavaExample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Ente the second number:");
        int b=sc.nextInt();
        DisplayOverloading obj=new DisplayOverloading();
        System.out.println("The sum of the first number and second number is:"+obj.add(a,b));
        System.out.println("The multiplication of the first number and second number is:"+obj.mux(a,b));
        
    }
}