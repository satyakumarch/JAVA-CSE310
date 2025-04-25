public class Outer {
    static class NestedDemo {
       public static void print() {
          System.out.println("This is my nested class");
       }
    }
    
    public static void main(String args[]) {
       NestedDemo.print();
    }
 }