import java.util.Scanner;

public class function {
    public static void printMyname(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter your name:");
      Scanner sc=new Scanner(System.in)  ;
      String name=sc.next();
      printMyname(name);
    }
    
}
