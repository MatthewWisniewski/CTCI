package ArraysAndStringsTests;

import ArraysAndStrings.RotateMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test
    public void testRotateMatrix() {
        String[][] input1x1 = {{"1"}};
        String[][] expected1x1 = {{"1"}};
        input1x1 = RotateMatrix.RotateMatrix(input1x1);
        assertTrue(Arrays.deepEquals(input1x1, expected1x1));

        String[][] input2x2 = {{"1", "2"}, {"3", "4"}};
        String[][] expected2x2 = {{"3", "1"}, {"4", "2"}};
        input2x2 = RotateMatrix.RotateMatrix(input2x2);
        assertTrue(Arrays.deepEquals(input2x2, expected2x2));

        String[][] input3x3 = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        String[][] expected3x3 = {{"7", "4", "1"}, {"8", "5", "2"}, {"9", "6", "3"}};
        input3x3 = RotateMatrix.RotateMatrix(input3x3);
        assertTrue(Arrays.deepEquals(input3x3, expected3x3));
    }

}