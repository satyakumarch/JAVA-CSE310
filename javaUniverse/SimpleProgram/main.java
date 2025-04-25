// import java.util.Scanner;

// class Alzebra {
//     int add(int a, int b) {
//         int ans = a + b;
//         return ans;
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         Alzebra obj = new Alzebra();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The sum of the numbers is: " + obj.add(a, b));
//     }
// }

import java.util.Scanner;
class Alzeb{
    int add(int x,int y){
        int ans=x+y;
        return ans;
    }
    int sub(int x,int y){
        int ans=x-y;
        return ans;
    }
    int mul(int x,int y){
        int ans=x*y;
        return ans;
    }
    int div(int x,int y){
        int ans=x/y;
        return ans;
    }

}
public class main{
    public static void main(String args[]){
        Alzeb obj=new Alzeb();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  fist number :");
        int a=sc.nextInt();
        System.out.print("Enter the second number :");

        int b=sc.nextInt();
        System.out.println("The sum of the two numebr is :"+obj.add(a,b));
        System.out.println("The sub of the two numebr is :"+obj.sub(a,b));
        System.out.println("The mul of the two numebr is :"+obj.mul(a,b));
        System.out.println("The div of the two numebr is :"+obj.div(a,b));

    }
}