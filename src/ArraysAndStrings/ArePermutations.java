package ArraysAndStrings;

import java.util.HashMap;

public class ArePermutations {

    public static boolean ArePermutations(String str1, String str2) { // O(n)
        HashMap<Character, Integer> charCount1 = new HashMap<>();
        HashMap<Character, Integer> charCount2 = new HashMap<>();

        countCharsInString(str1, charCount1);
        countCharsInString(str2, charCount2);

        return charCount1.equals(charCount2);
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
}
