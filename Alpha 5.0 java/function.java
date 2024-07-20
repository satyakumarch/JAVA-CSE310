
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
    public static void main(String[] args){
        printhelloworld();//function call
        System.out.println(sum(3,4));
        System.out.println(sum(2,3,4));

    }
}