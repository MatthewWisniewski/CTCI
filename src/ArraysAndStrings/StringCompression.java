package ArraysAndStrings;

public class StringCompression {

    public static String StringCompression(String str) {

        if (str.length() == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        //Can do this because the question states we can assume all characters are
        // upper or lower case letters
        char currentChar = chars[0];
        int currentCharCount = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCharCount++;
            } else {
                writeLastChar(sb, currentChar, currentCharCount);
                currentChar = chars[i];
                currentCharCount = 1;
            }
        }
        writeLastChar(sb, currentChar, currentCharCount);
        String compressed = sb.toString();
        if (compressed.length() < str.length()) {
            return compressed;
        } else {
            return str;
        }
    }

    private static void writeLastChar(StringBuilder sb, char c, int i) {
        sb.append(c + Integer.toString(i));
    }
}
