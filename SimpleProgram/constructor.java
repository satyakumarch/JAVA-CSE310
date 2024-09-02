class constructor{
    int  value1;
    int  value2;
    constructor(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside Constructor");
   }

   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }

 public static void main(String args[]){
     constructor d1 = new constructor();
    d1.display();
}
}