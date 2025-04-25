public class Abstract{
    public static void main(String[] args){
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);

        Mustang myhorse=new Mustang();

    }

}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
        color="brown";

    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();

}
    class Horse extends Animal{
        Horse(){
            System.out.println("horse constructor called");
        }
        void changecolor(){
            color="dark brown";
        }
        void walk(){
            System.out.println("walk on 4 legs");
        }

    }
    class Mustang extends Horse{
        Mustang(){
            System.out.println("mustang constructor called");
        }
    }
    class Chicken extends Animal{
        void changecolor(){
            color="white";
        }
        void walk(){
            System.out.println("walks on 2 legs");
        }
    }
