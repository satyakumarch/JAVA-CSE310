// class firstprogram{
//     final double balance=500;
//     final void display(){
//     System.out.println("from the class A");
//     }
    
// }
// public class inheritance extends firstprogram{
//     // void display(){
//     //      System.out.println("ffrom class a first program");
//     // }
//     public static void main(String[] args){
//         //firstprogram r=new firstprogram();
//         inheritance r=new inheritance();
//         System.out.println("balance"+r.balance);
//         r.display();
//     }

// }




// The java instance of operator is ued to text weather the object is an instance of specific type
// (class or sub class or interface)
// abstract class and interface 
// rules for java abstract class
// 1)any abstract class must be declared with  abstract keyword
// 2)it can have anstract and non anstract method
// 3)it can have constructor and static method
// 4)it can have final method which will force the sub class not to changee the body of method.
// abstract method
// a method  which is declared  as abstract and doesnot have implementatation method

// an interface is an blueprint of a class
// to 
// three main reason to uded to interface
// it is used to achieve abstraction
// By interface we can support the functionality of multiple inheritance
// it can be used to achieve loos coupling


// class inheritance{
//     int z;

//     public void add(int x,int y){
//         z=x+y;
//         System.out.println("The addition of  two numner is:"+z);
//     }
//     public void sub(int x,int y){
//         z=x-y;
//         System.out.println("The suntraction of two nnumber is:"+z);
//     }
// }
// public class calculation extends inheritance{
//     public void multiplication(int x,int y){
//         z=x*y;
//         System.out.println("multiplication "+z);
//     }
//     public static void main(String[] args){
//         int a=30, b=23;
//         calculation demo=new calculation();
//         demo.add(a,b);
//         demo.sub(a,b);
//         demo.multiplication
//     }
// }