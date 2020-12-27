package ArraysAndStrings;

public class RotateMatrix {

    // 90 degree clockwise reflection is equivalent to a reflection in y = -x,
    // followed by a reflection in y = 0

    public static String[][] RotateMatrix(String[][] matrix) {

        String temp;

        // Reflection across y = -x
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reflection across y = 0

        int midPoint = matrix.length / 2;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < midPoint; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }

        return matrix;

    }
}
