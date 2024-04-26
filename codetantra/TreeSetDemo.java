// import java.util.*;
// public static TreeSetDemo{
//     public static void main(String[] args){
//         Set namesSet=new TreeSet();
//         //create a scanner class object to read input
//         Scanner scanner=new Scanner(System.in);
//         //read string1 from user and add to the set
//         String str1=scanner.nextLine();
//         namesSet.add(str1);
//         //read string 2 from user and add to the set
//         String str2=scanner.nextLine();
//         namesSet.add(str2);
//         namesSet.add("Buddha");
//         //print the treeSet
//         System.out.println("namsesSet = "+namesSet);
//         //again add "buddha" to the set
//         namesSet.add("Buddha");
//         //print the treeSet
//         System.out.println("namesSet = "+namesSet);
//         //remove string 2 from the set
//         namesSet.remove(str2);
//         //print the TreeSet
//         System.out.println("nameSet = "+nameSet);
//     }
// }


import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet to hold the names
        Set<String> namesSet = new TreeSet<>();

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read string1 from user and add to the set
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        namesSet.add(str1);

        // Read string2 from user and add to the set
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        namesSet.add(str2);

        // Add "Buddha" to the set
        namesSet.add("Buddha");

        // Print the TreeSet
        System.out.println("namesSet = " + namesSet);

        // Add "Buddha" again to the set
        namesSet.add("Buddha");

        // Print the TreeSet
        System.out.println("namesSet = " + namesSet);

        // Remove string2 from the setsa
        namesSet.remove(str2);

        // Print the TreeSet
        System.out.println("namesSet = " + namesSet);

        // Close the Scanner
        scanner.close();
    }
}
