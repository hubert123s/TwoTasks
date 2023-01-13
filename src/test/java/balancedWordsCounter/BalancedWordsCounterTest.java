package balancedWordsCounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    private final BalancedWordsCounter counter = new BalancedWordsCounter();

    @Test
    public void shouldReturn28() {
        assertEquals(28, counter.count("aabbabcccba"));
    }

    @Test
    public void shouldReturn0() {
        assertEquals(0, counter.count(""));
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputIncludeDigit() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            counter.count("abababa1");
        });
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputIsNull() {
        String input = null;
        Assertions.assertThrows(RuntimeException.class, () -> {
            counter.count(input);
        });
    }

}