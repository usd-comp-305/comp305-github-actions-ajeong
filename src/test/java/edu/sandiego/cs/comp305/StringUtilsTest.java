package edu.sandiego.cs.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void ReverseNormalWord() {
        assertEquals("cat", StringUtils.reverseString("tac"));
    }

    @Test
    void ReverseLettersWithSpaces() {
        assertEquals("a b c", StringUtils.reverseString("c b a"));
    }

    @Test
    void ReverseWordsWithSpaces() {
        assertEquals("COMP 305", StringUtils.reverseString("503 PMOC"));
    }

    @Test
    void ReverseSingleLetter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }
}
