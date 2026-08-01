package edu.sandiego.cs.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void reverseStringReversesWord() {
        assertEquals("charlie", StringUtils.reverseString("eilrahc"));
    }

    @Test
    void reverseStringReversesSentence() {
        assertEquals(
                "sdrawkcab si egassem siht",
                StringUtils.reverseString("this message is backwards")
        );
    }

    @Test
    void reverseStringReturnsSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseStringReturnsEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reverseStringPreservesCapitalization() {
        assertEquals("JilletnI", StringUtils.reverseString("IntelliJ"));
    }
}
