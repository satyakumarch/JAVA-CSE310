import java.util.Scanner;
public class clsperson{
   
    Scanner sc=new Scanner(System.in);
    
   int age=sc.nextInt();
   String name=sc.nextLine();





    public static void main(String[] args){
        System.out.println("Enter the age:");

        clsperson satya=new clsperson();
        System.out.println("The age of the person is:"+satya.age);
        System.out.print("Enter the Name:");

        System.out.println("The name of the person is:"+satya.name);

        
    }
}