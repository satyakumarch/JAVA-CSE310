import java.util.*;

public class ArrayListDemo2_6 {
    public static void main(String[] args) {
        // Create a list
        List<String> aList = new ArrayList<>();
        System.out.println("aList size = " + aList.size());
        System.out.println("aList = " + aList);
        
        // Add entries to the list
        aList.add("First Entry");
        aList.add("Second Entry");
        
        // Print size and contents of the list
        System.out.println("aList size = " + aList.size());
        System.out.println("aList = " + aList);

        // Create a new list from aList
        List<String> bList = new ArrayList<>(aList);
        System.out.println("bList size = " + bList.size());
        System.out.println("bList = " + bList);

        // Create a new list with an initial capacity of 20
        List<String> cList = new ArrayList<>(20);
        System.out.println("cList size = " + cList.size());
        System.out.println("cList = " + cList);
    }
}
