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
        try{
            int num=Integer.parseInt("satya");
            System.out.println("String result is :"+num);
        }
        catch(NumberFormatException e){
            System.out.println("numberformatexception occured");
        }
        try{
            int a[]=new int[5];
            a[7]=9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound.");

        }
    }
}