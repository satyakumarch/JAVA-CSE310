import java.util.Scanner;

// if,else
// else if
// switch
// break


        // if else statement
public class conditional {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of the person:");
        int age=sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }  
    }
    
 }
// output
// Enter the age of the person:23
// Adult







// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int x=sc.nextInt();

//         if(x%2==0){
//             System.out.println(x +" is a even number");
//         }else{
//             System.out.println(x +" is a odd number");
//         }
//     }
// }
// output
// Enter the number:31
// 31 is a odd number


//greater than or equal to 
//   public class conditional {
  
//     public static void main(String[] args) {
//         Scanner sc=new  Scanner(System.in);
//         System.out.print("Enter the number a:");
//         int a=sc.nextInt();
//         System.out.print("Enter the number b:");
//         int b=sc.nextInt();

//         if(a==b){
//             System.out.println("A and b are equall");
//         }else if (a<b){
//             System.out.println("a is less than b");
//         }else if(a>b){
//             System.out.println("a is greater than b.");
//         }else{
//             System.out.println("Non of the above.");
//         }
//     }
//   }
//   output
//   Enter the number a:34
// Enter the number b:56
// a is less than b




//switch statement
// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int button =sc.nextInt();
//         switch (button) {
//             case 1: System.out.println("hello");
//             break;
//             case 2: System.out.println("Namesta");
//             break;
//             case 3: System.out.println("jai sri ram");
//             break;
//             case 4: System.out.println("jai mahakal");
//             break;
//             default:System.out.println("no thing");
//             break;
//         }
//     }
// }
// output
// Enter the number:4
// jai mahakal



//1) write a program switch case which cover the following operator with expression
// 1:mathematical
// 2:Logical
// 3:Relational

public class conditional {

    public static void main(String[] args) {
        System.out.println("1.Arithmetic operator \n 2.Logical operator\n 3.Relational operator\n\t\t(choice=1)\n");
        int choice=1;
        int a=10,b=5,c;
        switch (choice) {
            case 1:
                System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nVALUES OF a  AND b ARE 10 AND 5 RESPECTIVELY\n\t\t(choice=3)\n");
                int achoice=3;
                switch (achoice) {
                    case 1:
                        c=a+b;
                        System.out.println("Addition of a and b is:"+c+"\n");
                        break;
                    case 2:
                        c=a-b;
                        System.out.println("Subtraction of a and b is:"+c+"\n");
                        break;
                    case 3:
                        c=a*b;
                        System.out.println("multiplicationof a and b is:"+c+"\n");
                        break;
                    case 4:
                        c=a/b;
                        System.out.println("Division of a and b is:"+c+"\n");
                        break;
                
                    default:
                    System.out.println("Please enter right choice.");
                        break;

                        case 2:
                        System.out.println("1.Logical AND\n2.Logical OR\n3.NOT operator\n");
                        int lchoice=1;
                        switch (lchoice) {
                            case 1:
                            int age=25;
                            if(age>18 && age<50)
                            System.out.println("(AGE=25)\n you are eligible for this job.\n");
                                
                                break;
                            case 2:
                                int salary=3000;
                                if(salary<5000|| salary>2000)
                                System.out.println("(SALARY=3000)\n The job is offordable.\n");
                                break;
                            case 3:
                            int Age=20;
                            if(Age!=18 || Age>18)
                            System.out.println("(Age=20)\n You are not eligible for voiting\n");
                            break;


                            default:
                            System.out.println("Please enter right choice");
                           
                        }
                        break;
                        case 3:
                        System.out.println("1.greater than operator\n2.Less than operator\n3.Greater than or equal operator\n4.Less than or equal operator\n");
                        int mchoice=4;
                        switch (mchoice) {
                            case 1:
                            int aage=20;
                            if(aage>18)
                            System.out.println("(age=20)you are eligible for having a drivimg licens.");

                             break;
                             int A=10;
                             if(A<18)
                             System.out.println("(Age=10)you are not eligible for having a driving license");
                             break;

                             case 3:
                             int p=18;
                             if(p>=18)
                             System.out.println("(Age=18)you are eligible for having a driving license");

                            break;

                            case 4:
                            int q=13;
                            if(q<=18)
                            System.out.println("(Age=13)you are not eligible for having a driving license");
                            break;

                            default:
                            System.out.println("Please enter right choice");
                                break;
                        }
                        break;
                        
                        default:
                        System.out.println("Please enter right choice");

                        }

                }
               
        }
        
    }
