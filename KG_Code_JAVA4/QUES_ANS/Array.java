// public class Array {
//     public static void main(String[] args) {
//         int[][] original = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {3,4,6},

//         };

//         int[][] clone = original.clone();

//         System.out.println("Original[0] == Clone[0]? " + (original[0] == clone[0]));
//     }
// }

public class Array {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}