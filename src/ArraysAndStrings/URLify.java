package ArraysAndStrings;

public class URLify {

    // Making the assumption that string doesn't have any trailing whitespace,
    // except for the purpose of adding the "%20" strings in

    public static String URLify(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.stripTrailing().toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
