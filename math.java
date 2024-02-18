import java.util.Scanner;
public class math{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int  x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        if(((x1-x2)/(y1-y2))==((x2-x3)/(y2-y3))){
System.out.println("it is a number between two point");
        }else{
            System.out.println("it is not number betwwen two point");
        }
    }
}