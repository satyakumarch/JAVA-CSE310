import java.util.Scanner;
// public class triangle{
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the number a:");
//     int a=sc.nextInt();
//     System.out.print("Enter the number b:");

//     int b=sc.nextInt();
//     System.out.print("Enter the number c:");

//     int c=sc.nextInt();
//     if((a+b)>c && (b+c)>a && (c+a)>b ){
//         System.out.println("it is a triangle");
//     }else{
//         System.out.println("it is not a triangle");
//     }
    
//    }
// }


public class triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 || n%3==0)
        // {
        //     if(n%15!=0){
        //         System.out.println("number is divisible by 5 and 3 but not 15");
        //     }else{
        //         System.out.println("not matching the rewquired eleement");
        //     }
        // }
        else{
            System.out.println("not matching required condition");
        }
       
        
    }
}