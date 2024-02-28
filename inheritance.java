class firstprogram{
    final double balance=500;
    final void display(){
    System.out.println("from the class A");
    }
    
}
public class inheritance extends firstprogram{
    // void display(){
    //      System.out.println("ffrom class a first program");
    // }
    public static void main(String[] args){
        //firstprogram r=new firstprogram();
        inheritance r=new inheritance();
        System.out.println("balance"+r.balance);
        r.display();
    }

}