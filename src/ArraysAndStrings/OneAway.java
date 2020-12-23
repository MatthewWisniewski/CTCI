package ArraysAndStrings;

public class OneAway {

    public static boolean OneAway(String a, String b) { // O(n)
        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }
        if (a.length() == b.length()) {
            return zeroOrOneCharactersReplaced(a, b);
        } else if (a.length() > b.length()) {
            return singleCharacterCanBeInserted(a, b);
        } else {
            return singleCharacterCanBeInserted(b, a);
        }
    }

    private static boolean singleCharacterCanBeInserted(String a, String b) { // O(n)
        // assume that a.length() == b.length() + 1
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        int differenceFound = 0;

        for (int i = 0; i < charsB.length; i++) {
            if (charsB[i] != charsA[i + differenceFound]) {
                if (differenceFound == 1) {
                    return false;
                } else {
                    differenceFound++;
                }
            }
        }
        return true;

    }

    private static boolean zeroOrOneCharactersReplaced(String a, String b) { // O(n)
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int differences = 0;

        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] != charsB[i]) {
                differences++;
            }
        }

        return differences <= 1;
    }
}
