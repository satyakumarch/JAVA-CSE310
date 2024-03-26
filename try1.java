public class try1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0; // This line will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception occurred");
        } catch (Exception e) {
            System.out.println("Parent exception occurred");
        }
    }
}
