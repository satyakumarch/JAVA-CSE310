import java.util.Scanner;
public class findarea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
       

        int l=sc.nextInt();
        System.out.print("Enter the breadth:");
        int b=sc.nextInt();
        int area=l*b;
        int ptr=2*(l+b);
        System.out.println("area: "+area);
        System.out.println("paramter is: "+ptr);
        if(area>ptr){
            System.out.println("area is grater than parameter:");
        }else if(area==ptr){
            System.out.println("both are equal");
        }else{
            System.out.println("parameter is greater than area");
        }
        
    }
}