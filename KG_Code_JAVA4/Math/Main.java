import java.lang.Math;

class Main {
  public static void main(String[] args) {

    // create int variable
    int a = 54;
    int b = 30;

    // subtractExact() with int arguments
    System.out.println(Math.subtractExact(a, b));  // 24

    // create long variable
    long c = 72345678l;
    long d = 17654321l;

    // subtractExact() with long arguments
    System.out.println(Math.subtractExact(c, d));  // 54691357
  }
}