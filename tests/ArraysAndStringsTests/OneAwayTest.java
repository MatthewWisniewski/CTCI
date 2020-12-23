package ArraysAndStringsTests;

import ArraysAndStrings.OneAway;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    @Test
    public void testOneAwaySameString() {
        assertTrue(OneAway.OneAway("", ""));
        assertTrue(OneAway.OneAway("abc", "abc"));
    }

    @Test
    public void testOneAwayInsert() {
        assertTrue(OneAway.OneAway("abc", "abcd"));
        assertTrue(OneAway.OneAway("bc", "abc"));
        assertTrue(OneAway.OneAway("ac", "abc"));
        assertFalse(OneAway.OneAway("abfd", "abcde"));
        assertFalse(OneAway.OneAway("b", "abc"));
    }

    @Test
    public void testOneAwayDelete() {
        assertTrue(OneAway.OneAway("abcd", "abc"));
        assertTrue(OneAway.OneAway("abc", "bc"));
        assertTrue(OneAway.OneAway("abc", "ac"));
        assertFalse(OneAway.OneAway("abcde", "abfd"));
        assertFalse(OneAway.OneAway("abc", "b"));
    }

    @Test
    public void testOneAwayReplace() {
        assertTrue(OneAway.OneAway("abc", "adc"));
        assertTrue(OneAway.OneAway("abc", "dbc"));
        assertFalse(OneAway.OneAway("ab", "ba"));
        assertFalse(OneAway.OneAway("abcde", "bacde"));
    }

    @Test
    public void testOneAwayBookExample() {
        assertTrue(OneAway.OneAway("pale", "ple"));
        assertTrue(OneAway.OneAway("pales", "pale"));
        assertTrue(OneAway.OneAway("pale", "bale"));
        assertFalse(OneAway.OneAway("pale", "bake"));
    }

}