import java.util.Scanner;
public class arraycc{
    public static void main(String[] args){
        int marks[]=new int[1000];

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the phy mark:");


        marks[0]=sc.nextInt();
        System.out.print("Enter the math mark:");

        marks[1]=sc.nextInt();
        System.out.print("Enter the che mark:");

        marks[2]=sc.nextInt();

        System.out.println("phy:"+marks[0]);
        System.out.println("math:"+marks[1]);

        System.out.println("chem:"+marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2]/3);
        System.out.println("percentage:"+percentage);


    


    }
}
