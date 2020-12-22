package ArraysAndStrings;

import java.util.HashMap;

public class PalindromePermutation {

    // Making the assumption based on the example given that spaces are
    // not considered when checking for a palindromic permutation

    // Also taking from the example that capitalisation doesn't matter

    public static boolean isPalindromicPermutation(String str) { // O(n)
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        //Strip away all spaces from str and convert all characters to lowercase
        str = str.strip().replace(" ", "").toLowerCase(); // O(n)

        countCharsInString(str, characterCounts);
        int numberOfCharsThatAppearAnOddNumberOfTimes = countCharsWithOddNumberOfOccurences(characterCounts);

        if (str.length() % 2 == 1) {
            return numberOfCharsThatAppearAnOddNumberOfTimes == 1;
        } else {
            return numberOfCharsThatAppearAnOddNumberOfTimes == 0 || numberOfCharsThatAppearAnOddNumberOfTimes == 2;
        }
    }

    private static void countCharsInString(String string, HashMap<Character, Integer> charCounts) { // O(n)
        for (char c : string.toCharArray()) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }
    }

    private static int countCharsWithOddNumberOfOccurences(HashMap<Character, Integer> charCounts) { // O(n)
        int total = 0;
        for (char c : charCounts.keySet()) {
            if (charCounts.get(c) % 2 == 1) {
                total++;
            }
        }
        return total;
    }

}
