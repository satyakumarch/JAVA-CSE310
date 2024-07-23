public class Animal{
    public static void main(String[] args){
        Fish shark=new Fish();
        shark.eat();

    }
}
class Animals{
  String color;
  void eat(){
    System.out.println("eats");
  }
  void breadth(){
    System.out.println("breadth");
  }  
}
//derived
class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}