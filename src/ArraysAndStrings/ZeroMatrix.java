package ArraysAndStrings;

public class ZeroMatrix {

    public static int[][] ZeroMatrix(int[][] matrix) { // O(mn) - additional space complexity of O(m + n)
        int[] rowFlags = new int[matrix.length];
        int[] colFlags = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) { // O(mn)
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags[i] = 1;
                    colFlags[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) { // O(mn)
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowFlags[i] == 1 || colFlags[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
