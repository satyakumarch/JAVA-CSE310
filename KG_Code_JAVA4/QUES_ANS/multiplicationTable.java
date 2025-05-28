// import java.util.Scanner;
// public class multiplicationTable{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
// System.out.println("Welcome to multiplication table");
// System.out.print("Enter the number:");
// int num=sc.nextInt();
// multiplication(num);

//     }
//     public static void multiplication(int num){
//         int i=1;
//         while(i<=10){
//             System.out.println(num+"x"+i+"="+(num*i));
//             i++;
//         }

//     }
// }

import java.util.Scanner;
public class multiplicationTable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to print the table.");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println((num)+" * "+(i)+" = "+(num*i));
        }
    }
}