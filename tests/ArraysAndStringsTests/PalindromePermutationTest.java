package ArraysAndStringsTests;

import ArraysAndStrings.PalindromePermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @Test
    public void testIsPalindromicPermutationBasic() {
        assertTrue(PalindromePermutation.isPalindromicPermutation("aba"));
        assertTrue(PalindromePermutation.isPalindromicPermutation("abab"));
        assertTrue(PalindromePermutation.isPalindromicPermutation("abababcc"));

        assertFalse(PalindromePermutation.isPalindromicPermutation("abc"));
        assertFalse(PalindromePermutation.isPalindromicPermutation("aaabbbcccddd"));
    }

    @Test
    public void testIsPalindromicPermutationEmptyString() {
        assertTrue(PalindromePermutation.isPalindromicPermutation(""));
    }

    @Test
    public void testIsPalindromicPermutationIgnoresSpaces() {
        assertTrue(PalindromePermutation.isPalindromicPermutation("a b a"));
        assertTrue(PalindromePermutation.isPalindromicPermutation(" abb"));
        assertTrue(PalindromePermutation.isPalindromicPermutation("abb "));
        assertTrue(PalindromePermutation.isPalindromicPermutation(" a b b "));
    }

    @Test public void testIsPalindromicPermutationIgnoresCases() {
        assertTrue(PalindromePermutation.isPalindromicPermutation("Aba"));
        assertTrue(PalindromePermutation.isPalindromicPermutation("AbBb"));
        assertTrue(PalindromePermutation.isPalindromicPermutation("aBabAbCC"));
    }

    @Test public void testIsPalindromicPermutationBookExample() {
        assertTrue(PalindromePermutation.isPalindromicPermutation("Tact Coa"));
    }
}