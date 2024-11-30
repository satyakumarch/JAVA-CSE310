public class throwsException{
    static void avg() throws ArithmeticException
    {
        System.out.println("Inside avg function");
        throw new ArithmeticException("Demo exception is occurred");
    }
    public static void main(String[] args){
        try{
            avg();
        }
        finally{
            System.out.println("Caught");
        }
    }
}