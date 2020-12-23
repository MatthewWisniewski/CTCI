package ArraysAndStringsTests;

import ArraysAndStrings.StringCompression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    public void testStringCompressionEmptyString() {
        assertEquals(StringCompression.StringCompression(""), "");
    }

    @Test
    public void testStringCompressionBasic() {
        assertEquals(StringCompression.StringCompression("aaa"), "a3");
        assertEquals(StringCompression.StringCompression("aabbb"), "a2b3");
        assertEquals(StringCompression.StringCompression("aabbbaaaa"), "a2b3a4");
    }

    @Test
    public void testStringCompressionShouldNotReturnALongerString() {
        assertEquals(StringCompression.StringCompression("a"), "a");
        assertEquals(StringCompression.StringCompression("aa"), "aa");
        assertEquals(StringCompression.StringCompression("aabb"), "aabb");
    }

    @Test
    public void testStringCompressionBookExample() {
        assertEquals(StringCompression.StringCompression("aabcccccaaa"), "a2b1c5a3");
    }

}