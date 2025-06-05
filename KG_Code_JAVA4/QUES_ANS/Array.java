public class Array {
    public static void main(String[] args) {
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] clone = original.clone();

        System.out.println("Original[0] == Clone[0]? " + (original[0] == clone[0]));
    }
}