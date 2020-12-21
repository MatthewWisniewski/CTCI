package ArraysAndStringsTests;

import ArraysAndStrings.URLify;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    public void URLifyTest() {
        assertEquals(URLify.URLify("hey"), "hey", "URLify not processing string correctly when there are no spaces");
        assertEquals(URLify.URLify("hello world"), "hello%20world", "URLify not replacing spaces with '%20'");
    }

    @Test
    public void URLifyTrailingSpacesTest() {
        assertEquals(URLify.URLify("3SpacesAhead   "), "3SpacesAhead", "URLify is not replacing trailing spaces, as expected");
    }

}