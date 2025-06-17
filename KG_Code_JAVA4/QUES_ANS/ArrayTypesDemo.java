public class ArrayTypesDemo {
    public static void main(String[] args) {
        // 1. One-dimensional array
        int[] oneDArray = {1, 2, 3, 4, 5};
        System.out.print("One-dimensional array: ");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Two-dimensional array (matrix)
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Two-dimensional array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        // 3. Jagged array (array of arrays with different lengths)
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}