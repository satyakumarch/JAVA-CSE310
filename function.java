import java.util.Scanner;

// public class function {
//     public static void printMyname(String name){
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) {
//         System.out.print("Enter your name:");
//       Scanner sc=new Scanner(System.in)  ;
//       String name=sc.next();
//       printMyname(name);
//     }
    
// }


// public class function {

//     public static int sum(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static int sub(int a,int b){
//         int sub=a-b;
//         return sub;
//     }
//     public static int mul(int a,int b){
//         int mul=a*b;
//         return mul;
//     }
//     public static int div(int a,int b){
//         int div=a/b;
//         return div;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the first number:");
//         int a=sc.nextInt();
//         System.out.print("Enter the second number:");
//         int b=sc.nextInt();

//         int add=sum(a,b);
//         System.out.print("The sum of two number is :");
//         System.out.println(add);

//         int sub=sub(a,b);
//         System.out.print("The sub of two number is :");
//         System.out.println(sub);

//         int mul=mul(a,b);
//         System.out.print("The mul of two number is :");
//         System.out.println(mul);

//         int div=div(a,b);
//         System.out.print("The div of two number is :");
//         System.out.println(div);
//     }
// }



public class function {
public static void printfactorial(int n){
    if(n<0){

        System.out.println("invalid number");
        return ;
    }
    int factorial =1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;

    }
    System.out.println(factorial);
    return;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printfactorial(n);
        
    }
}