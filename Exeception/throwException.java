public class throwException{
    static void avg(){
        try{
            throw new ArithmeticException("demo exception is occurred");

        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught");
        }
    }
    public static void main(String[] args){
        avg();
    }
}