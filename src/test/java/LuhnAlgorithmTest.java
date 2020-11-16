import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnAlgorithmTest {
    private LuhnAlgorithm luhnAlgorithm;

    @BeforeEach
    void init(){
        luhnAlgorithm = new LuhnAlgorithm();
    }

    @Test
    void testValidateFailed() {
        boolean result = luhnAlgorithm.validate("12345");
        assertEquals(false, result);
    }

    @Test
    void testValidatePassed() {
        boolean result = luhnAlgorithm.validate("4000003182343265");
        assertEquals(true, result);
    }
}