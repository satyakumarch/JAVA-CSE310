import java.util.Scanner;
public class CPSP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your selling price");
        int sp=sc.nextInt();
        System.out.print("Enter your cost price");
        int cp=sc.nextInt();
        if(sp>cp){
            
            System.out.println("profit "+(sp-cp));
        }else{
            System.out.println("loos "+(cp-sp));
        }
    }


    }