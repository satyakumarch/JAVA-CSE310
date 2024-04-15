class DisplayOverloading3
{
  public float add(int a, float b)
  {
    System.out.println("Method with (int, float) param list.");
    return a+b;
  }
  public float add(float a, int b)
  {
    System.out.println("Method with (float, int) param list.");
    return a+b;
  }
}
class javaoverriding
{
  public static void main(String args[])
  {
    DisplayOverloading3 obj = new DisplayOverloading3();

    // This will call the method where first parameter is int
    // and the second parameter is float
    System.out.println(obj.add(10, 10.5f));

    // This will call the method where first parameter is float
    // and the second parameter is int
    System.out.println(obj.add(1.5f, 1));
  }
}