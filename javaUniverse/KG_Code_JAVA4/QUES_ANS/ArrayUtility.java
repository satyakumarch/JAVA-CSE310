import java.util.Scanner;
public class ArrayUtility{
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("please Enter the number of element:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.print("please Elment the number of element:");
            nums[i]=sc.nextInt();
            i++;

        }
        return nums;
    }
}