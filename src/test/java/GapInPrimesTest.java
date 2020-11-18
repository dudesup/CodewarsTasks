import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GapInPrimesTest {
    private GapInPrimes gapInPrimes;

    @BeforeEach
    void init(){
        gapInPrimes = new GapInPrimes();
    }

    @Test
    void testGapBetween3And50() {
        long[] result = gapInPrimes.gap(2,3,50);
        assertArrayEquals(new long[]{3,5}, result);
    }

    @Test
    void testGapNonPrimeNumbers() {
        long[] result = gapInPrimes.gap(2,5,6);
        assertArrayEquals(null, result);
    }

    @Test
    void testGapBetween300And400() {
        long[] result = gapInPrimes.gap(10,300,400);
        assertArrayEquals(new long[]{337, 347}, result);
    }
}