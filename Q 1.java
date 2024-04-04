import java.util.Arrays;

public class Main {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = m - n - 1; // Index of the last non-vacant cell in X
        int j = 0; // Index of the first element in Y
        int k = 0; // Index of the current element in X

        // Merge elements from Y[] into X[] in sorted order
        while (j < n) {
            // If X[k] is vacant or greater than Y[j], place Y[j] in X[k]
            if (i >= 0 && X[i] > Y[j]) {
                X[k++] = Y[j++];
            }
            // Otherwise, swap elements of X[i] and X[k], and place Y[j] in X[k]
            else {
                if (i >= 0) {
                    int temp = X[i];
                    X[i] = X[k];
                    X[k] = temp;
                }
                X[k++] = Y[j++];
            }
            i++; // Move to the next non-vacant cell in X
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        // Print the merged array
        System.out.print("Merged array: " + Arrays.toString(X));
    }
}
