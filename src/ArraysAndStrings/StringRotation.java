package ArraysAndStrings;

public class StringRotation {

    // Limitation: Only one call is isSubstring allowed

    public static boolean StringRotation(String s1, String s2) { // O(n^2)
        // Error checking
        if (s1.equals("") && s2.equals("")) {
            return true;
        } else if (s1.equals("")) {
            return false;
        }

        StringBuilder conjoinedRotations = new StringBuilder();
        char[] chars = s1.toCharArray();
        conjoinedRotations.append(chars[0]);

        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < chars.length; j++) {
                conjoinedRotations.append(chars[j]);
            }
            chars = rotate(chars);
        }
        return isSubstring(conjoinedRotations.toString(), s2);
    }

    private static char[] rotate(char[] charArray) { // O(n)
        char[] rotated = new char[charArray.length];
        rotated[0] = charArray[rotated.length - 1];
        for (int i = 0; i < charArray.length - 1; i++) {
            rotated[i + 1] = charArray[i];
        }
        return rotated;
    }

    private static boolean isSubstring(String str, String substring) { // O(n)
        //Runs in O(mn) in java implementation,
        // However, as we are assuming that we can are given this method, it
        // can be achieved in O(n) (with the Boyer–Moore string-search algorithm)
        // So will assume that the provided method is as efficient as possible,
        // hence will have runtime O(n)
        return str.contains(substring);
    }

}
