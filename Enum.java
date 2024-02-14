// public class Enum {

//     //defining the enum inside the class
//     public enum Season{winder,summer,spring,fail};
//     public static void main(String[] args) {
//         for(Season s : Season.values())
//         System.out.println(s);
//     }
// }


import java.util.Scanner;

public class Enum {

    // defining the enum inside the class
    public enum Season {winter, summer, spring, fall};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season: ");
        String userInput = scanner.nextLine();

        Season season = Season.valueOf(userInput.toLowerCase()); // Assuming user input is in lowercase

        System.out.println("You entered: " + season);

        scanner.close(); // close the scanner to prevent resource leak
    }
}
