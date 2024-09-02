public class Overriding{
    public static void main(String[] args){
       Deer d=new Deer();
       d.eat();



    }
}
class Animal{
    void eat(){
        System.out.println("eats anythingd");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}