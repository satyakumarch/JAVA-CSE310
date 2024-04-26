 import java.time.*;
// public class MultiCatchBlocks{
//     public  static void multiCatch(int[] arr,int index){
//         try{
//             System.out.println(arr[index]);
//             System.out.println(arr[index]/index);
//         }catch(ArithmeticException e){
//             System.out.println("Division by zero exception occured");
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index out of bounds exception occurred");
//         }catch(Exception e){
//             System.out.println("Exception occurred");
//         }
//     }
// }

public class MultiCatchBlocks {
    public static void multiCatch(int[] arr, int index) {
        try {
            // Print the element at the specified index
            System.out.println(arr[index]);
            // Perform division and print the result
            System.out.println(arr[index] / index);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("Error: Specified index is out of bounds for the array.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }
}
