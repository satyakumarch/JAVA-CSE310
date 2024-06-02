// Java Example: Compile Time Polymorphism
public class calculation {
    // method to add two integers
    public int addition(int x, int y) {
      return x + y;
    }
  
    // method to add three integers
    public int addition(int x, int y, int z) {
      return x + y + z;
    }
  
    // method to add two doubles
    public double addition(double x, double y) {
      return x + y;
    }
  
    // Main method
    public static void main(String[] args) {
      // Creating an object of the Main method
      calculation number = new Main();
  
      // calling the overloaded methods
      int res1 = number.addition(444, 555);
      System.out.println("Addition of two integers: " + res1);
  
      int res2 = number.addition(333, 444, 555);
      System.out.println("Addition of three integers: " + res2);
  
      double res3 = number.addition(10.15, 20.22);
      System.out.println("Addition of two doubles: " + res3);
    }
  }