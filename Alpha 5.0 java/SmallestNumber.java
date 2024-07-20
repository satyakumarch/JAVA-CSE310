import java.util.*;
public class SmallestNumber{
    public static int getSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
            
        }
        return smallest;
    }
    public static void main(String[] args){
        int numbers[]={1,2,3,4,5,20};
        System.out.println("smallest value:"+getSmallest(numbers));

    }
}