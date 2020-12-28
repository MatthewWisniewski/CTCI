package ArraysAndStringsTests;

import ArraysAndStrings.StringRotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

    @Test
    public void testStringRotationEmptyStrings() {
        assertTrue(StringRotation.StringRotation("", ""));
        assertFalse(StringRotation.StringRotation("", "a"));
        assertTrue(StringRotation.StringRotation("a", ""));
    }

    @Test
    public void testStringRotationBasic() {
        assertTrue(StringRotation.StringRotation("abc", "cab"));
        assertFalse(StringRotation.StringRotation("abc", "cba"));
    }

    @Test
    public void testStringRotationBookExample() {
        assertTrue(StringRotation.StringRotation("erbottlewat", "waterbottle"));
    }

}