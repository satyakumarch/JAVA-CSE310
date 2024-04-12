
import java.util.ArrayList;
public class ArraylistDemo2 {
   public static void main(String[] args) {
      
      // create an empty array list 
      ArrayList<Integer> arrayList = new ArrayList<>();

      // use add() method to add elements in the arrayList
      arrayList.add(0);
      arrayList.add(1);
      arrayList.add(2);
      arrayList.add(3);
      arrayList.add(4);
      arrayList.add(5);
      arrayList.add(6);

      // get the array
      Object[] array = arrayList.toArray();

      // print the array elements
      for (Object object : array) {
         System.out.println(object);
      }
   }
}