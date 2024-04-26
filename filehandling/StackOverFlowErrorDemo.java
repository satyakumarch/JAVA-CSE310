public class StackOverflowErrorDemo{
    private static void main(String[] args){
        try{
            someMethod();
        }catch(Error ste){
            System.out.println("stack overflow occured");
        }
    }
    public static void someMethod(){
        count++;
        someMethod();
    }
}