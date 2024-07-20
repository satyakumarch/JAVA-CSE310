
public class function{
    //function to calculate sum of 2 nums
    public static int sum(int a,int b){
return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;

    }
    public static void printhelloworld(){
        System.out.println("hello world welcome to you");
        return;
    }
    //func to calculate int sum
    public static int sum1(int a,int b){
        return a+b;
    } 
    public static float sum2(float a,float b){
        return a+b;
    }
    public static void main(String[] args){
        printhelloworld();//function call
        // System.out.println(sum(3,4));
        // System.out.println(sum(2,3,4))
        System.out.println(sum1(3,4));
        System.out.println(sum2(7.2f,5.3f));

        ;

    }
}