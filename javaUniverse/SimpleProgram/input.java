import java.util.*;
// public class input{
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);//to take input from user
// System.out.println("Enter your name:");
// String name=sc.nextLine();
// System.out.println("Enter your age:");
// int  name1=sc.nextInt();
// System.out.println("Enter your salary:");
// float name2=sc.nextFloat();
// System.out.println("your name is:"+name);
// System.out.println("your roll no is:"+name1);
// System.out.println("your salary is:"+name2);
// }
// }
// output
// Enter your name:
// Satya kumar chaudhary
// Enter your age:
// 23
// Enter your salary:
// 23000000.0909
// your name is:Satya kumar chaudhary
// your roll no is:23
// your salary is:2.3E7


public class input{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a:");
            int a=sc.nextInt();
            System.out.print("Enter the value of b:");
            int b=sc.nextInt();
            int sum=a+b;
            int sub=a-b;
            int mux=a*b;
            int div=a/b;
      
            System.out.print("The sum of two variable a and b is:");
            System.out.println(sum);
            System.out.print("The sub of two variable a and b is:");
            System.out.println(sub);
            System.out.print("The mux of two variable a and b is:");
            System.out.println(mux);
            System.out.print("The div of two variable a and b is:");
            System.out.println(div);
        }
}
}
// output
// Enter the value of a:30
// Enter the value of b:20
// The sum of two variable a and b is:50
// The sub of two variable a and b is:10
// The mux of two variable a and b is:600
// The div of two variable a and b is:1