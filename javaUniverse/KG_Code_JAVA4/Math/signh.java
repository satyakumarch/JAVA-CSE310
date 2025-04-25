class signh {
    public static void main(String[] args) {
  
      // create a double variable
      double value1 = 45.0;
      double value2 = 60.0;
      double value3 = 30.0;
  
      // convert into radians
      value1 = Math.toRadians(value1);
      value2 = Math.toRadians(value2);
      value3 = Math.toRadians(value3);
  
      // compute the hyperbolic sine
      System.out.println(Math.sinh(value1));  // 0.8686709614860095
      System.out.println(Math.sinh(value2));  // 1.2493670505239751
      System.out.println(Math.sinh(value3));  // 0.5478534738880397
    }
  }