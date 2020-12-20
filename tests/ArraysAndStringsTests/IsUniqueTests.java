package ArraysAndStringsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ArraysAndStrings.IsUnique;

public class IsUniqueTests {
    @Test
    public void isUniqueTest() {
        assertTrue(IsUnique.isUnique("abcde"), "isUnique not returning true when it should be");
        assertFalse(IsUnique.isUnique("aa"), "isUnique not returning false when it should in a simple case");
        assertFalse(IsUnique.isUnique("ab2cdef2"), "failing negative test in more complex example");
    }

    @Test
    public void isUniqueNoDataStructuresTest() {
        assertTrue(IsUnique.isUniqueNoDataStructures("abcde"), "isUnique not returning true when it should be");
        assertFalse(IsUnique.isUniqueNoDataStructures("aa"), "isUnique not returning false when it should in a simple case");
        assertFalse(IsUnique.isUniqueNoDataStructures("ab2cdef2"), "failing negative test in more complex example");
    }

    @Test
    public void isUniqueEmptyStringTest() {
        assertTrue(IsUnique.isUnique(""), "Returning false with isUnique for an empty string");
        assertTrue(IsUnique.isUniqueNoDataStructures(""), "Returning false with isUniqueNoDataStructure for an empty string");
    }
}
