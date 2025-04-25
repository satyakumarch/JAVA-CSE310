import java.util.Scanner;
public class triangle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Here we want to print the trinale ");
        System.out.println("Enter the number a:");
        int a=sc.nextInt();
         
        System.out.println("Enter the number B:");
        int b=sc.nextInt();

        System.out.println("Enter the number C:");
        int c=sc.nextInt();

        System.out.println("The volume of the field is: "+volume(a,b,c));
        System.out.println("The area of the box is:"+area(a,b));
        System.out.println("The area of the trianle is:"+triangle(a,b));
        System.out.println("The area of the circle is:"+circle(a));
    }

        public static int volume(int a,int b,int c){
            return a*b*c;
        }
        public static int area(int a,int b){
            return a*b;
        }
        public static double triangle(int a,int b){
            return 0.5*(a*b);
        }
        public static int circle(int a){
            return 3*a*a;
        }

    
}