package ArraysAndStringsTests;

import ArraysAndStrings.ZeroMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMatrixTest {

    @Test
    public void testZeroMatrixEmptyMatrix() {
        int[][] input0x0 = {{}};
        int[][] expected0x0 = {{}};
        input0x0 = ZeroMatrix.ZeroMatrix(input0x0);
        assertTrue(Arrays.deepEquals(input0x0, expected0x0));
    }

    @Test
    public void testZeroMatrixNoZeroes() {
        int[][] inputs1x1 = {{1}};
        int[][] expected0x0 = {{1}};
        inputs1x1 = ZeroMatrix.ZeroMatrix(inputs1x1);
        assertTrue(Arrays.deepEquals(inputs1x1, expected0x0));

        int[][] inputs2x2 = {{1, 2}, {3, 4}};
        int[][] expected2x2 = {{1, 2}, {3, 4}};
        inputs2x2 = ZeroMatrix.ZeroMatrix(inputs2x2);
        assertTrue(Arrays.deepEquals(inputs2x2, expected2x2));
    }

    @Test
    public void testZeroMatrixSomeZeroes() {
        int[][] inputs2x2 = {{1, 0}, {1, 1}};
        int[][] expected2x2 = {{0, 0}, {1, 0}};
        inputs2x2 = ZeroMatrix.ZeroMatrix(inputs2x2);
        assertTrue(Arrays.deepEquals(inputs2x2, expected2x2));

        int[][] inputs3x3 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected3x3 = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        inputs3x3 = ZeroMatrix.ZeroMatrix(inputs3x3);
        assertTrue(Arrays.deepEquals(inputs3x3, expected3x3));

        inputs3x3 = new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 1, 0}};
        expected3x3 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        inputs3x3 = ZeroMatrix.ZeroMatrix(inputs3x3);
        assertTrue(Arrays.deepEquals(inputs3x3, expected3x3));
    }

    @Test
    public void testZeroMatrixAllZeroes() {
        int[][] inputs3x3 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] expected3x3 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        inputs3x3 = ZeroMatrix.ZeroMatrix(inputs3x3);
        assertTrue(Arrays.deepEquals(inputs3x3, expected3x3));
    }

}