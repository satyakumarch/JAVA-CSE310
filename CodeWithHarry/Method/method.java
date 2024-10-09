import java.util.Scanner;
public class method{
    public static int grade(int mark){
        if(mark>=90){
            return "A++";
        }else if(marks>=80){
            return "A";
        }else if(marks>=70)
{
return "B";
}else if(marks>=60){
    return "C";
}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ypur marks");
        int num=sc.nextInt();
        System.out.println("Your grade is "+grade(num));
    
    }
}