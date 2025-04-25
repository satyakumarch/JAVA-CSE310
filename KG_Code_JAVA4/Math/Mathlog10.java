class Mathlog10 {
    public static void main(String[] args) {
  
      // compute log10() for double value
      System.out.println(Math.log10(9.0));       // 0.9542425094393249
  
      // compute log10() for zero
      System.out.println(Math.log10(0.0));       // -Infinity
  
      // compute log10() for NaN
      double nanValue = Math.sqrt(-5.0);
      System.out.println(Math.log10(nanValue));  // NaN
  
      // compute log10() for infinity
      double infinity = Double.POSITIVE_INFINITY;
      System.out.println(Math.log10(infinity));  // Infinity
  
      // compute log10() for negative numbers
      System.out.println(Math.log(-9.0));      // NaN
  
      //compute log10() for 103
      System.out.println(Math.log10(Math.pow(10, 3)));  // 3.0
  
    }
  }