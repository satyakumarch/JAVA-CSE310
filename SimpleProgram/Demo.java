class Demo{
    int  value1;
    int  value2;
     Demo(){
       value1 = 1;
       value2 = 2;
       System.out.println("Inside 1st Parent Constructor");
    }
    Demo(int a){
       value1 = a;
       System.out.println("Inside 2nd Parent Constructor");
    }
   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
   }
   public static void main(String args[]){
      DemoChild d1 = new DemoChild();
      d1.display();
   }
 }
 class DemoChild extends Demo{
     int value3;
     int value4;
     DemoChild(){
     //super(5);
      value3 = 3;
      value4 = 4;
     System.out.println("Inside the Constructor of Child");
     }
     public void display(){
       System.out.println("Value1 === "+value1);
       System.out.println("Value2 === "+value2);
       System.out.println("Value1 === "+value3);
       System.out.println("Value2 === "+value4);
    }
 }