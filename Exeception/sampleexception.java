public class sampleexception{
    public static void main(String[] args){
        try{
            int a=20,b=2;
            int c=a/b;
            System.out.println("result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot run the code error is occured ");
        }
    }
}