package ArraysAndStringsTests;

import ArraysAndStrings.ArePermutations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArePermutationsTest {

    @Test
    public void ArePermutationsTest() {
        Assertions.assertTrue(ArePermutations.ArePermutations("abcde", "cdeab"), "ArePermutations not returning true when it should");
        assertFalse(ArePermutations.ArePermutations("abc", "123"), "ArePermutations not returning false when it should");

        assertTrue(ArePermutations.ArePermutations("aaabc", "abaca"), "ArePermutations not returning true when it should with repeated chars");
        assertFalse(ArePermutations.ArePermutations("aaabc", "abac"), "ArePermutations not returning false when it should with repeated chars");
    }

    @Test
    public void ArePermutationsEmptyStringsTest() {
        assertTrue(ArePermutations.ArePermutations("", ""), "ArePermutations not returning true with two empty strings");
    }

}