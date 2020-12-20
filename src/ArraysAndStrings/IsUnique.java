package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;

public class IsUnique {

    //Questions: What happens when an empty string is passed in
    // (in both implementations, it returns true

    public static boolean isUnique(String str) { // O(n)
        HashSet<Character> chars = new HashSet<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }
        return chars.size() == str.length();
    }

    public static boolean isUniqueNoDataStructures(String str) { // O(nlgn)
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
