import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitStringsTest {
    private SplitStrings splitStrings;

    @BeforeEach
    void init() {
        splitStrings = new SplitStrings();
    }

    @Test
    void testSolutionEvenString() {
        String result = Arrays.toString(splitStrings.solution("abcd"));
        assertEquals("[ab, cd]", result);
    }

    @Test
    void testSolutionOddString() {
        SplitStrings splitStrings = new SplitStrings();
        String result = Arrays.toString(splitStrings.solution("abc"));
        assertEquals("[ab, c_]", result);
    }

    @Test
    void testSolutionEmptyString() {
        SplitStrings splitStrings = new SplitStrings();
        String result = Arrays.toString(splitStrings.solution(""));
        assertEquals("[]", result);
    }

}