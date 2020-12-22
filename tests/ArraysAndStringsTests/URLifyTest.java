package ArraysAndStringsTests;

import ArraysAndStrings.URLify;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    public void testURLifyBasic() {
        assertEquals(URLify.URLify("hey"), "hey", "URLify not processing string correctly when there are no spaces");
        assertEquals(URLify.URLify("hello world"), "hello%20world", "URLify not replacing spaces with '%20'");
    }

    @Test
    public void testURLifyEmptyString() {
        assertEquals(URLify.URLify(""), "");
    }

    @Test
    public void testURLifyTrailingSpaces() {
        assertEquals(URLify.URLify("3SpacesAhead   "), "3SpacesAhead", "URLify is not replacing trailing spaces, as expected");
    }

    @Test
    public void testURLiftBookExample() {
        //TODO: Not really the book example, fix the algorithm so it answers exactly what is
        //      asked, rather than what was assumed, then fix the tests to compensate for that
        assertEquals(URLify.URLify("Mr John Smith "), "Mr%20John%20Smith");
        //URLify.URLify should have an additional argument of 13
    }

}