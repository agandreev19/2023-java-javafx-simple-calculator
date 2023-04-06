import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    private StringManipulator manipulator;

    @BeforeEach
    public void setUp() {
        manipulator = new StringManipulator();
    }

    @Test
    public void testReverseSimpleString() {
        String result = manipulator.Reverse("hello");
        assertEquals("olleh", result);
    }

    @Test
    public void testReverseLongString() {
        String result = manipulator.Reverse("the quick brown fox jumps over the lazy dog");
        assertEquals("god yzal eht revo spmuj xof nworb kciuq eht", result);
    }

    @Test
    public void testTruncateSimpleString() {
        String result = manipulator.Truncate("hello", 3);
        assertEquals("hel", result);
    }

    @Test
    public void testTruncateLongString() {
        String result = manipulator.Truncate("the quick brown fox jumps over the lazy dog", 10);
        assertEquals("the quick ", result);
    }

    @Test
    public void testTruncateNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            manipulator.Truncate(null, 5);
        });
    }

    @Test
    public void testTruncateEmptyInput() {
        String result = manipulator.Truncate("", 5);
        assertEquals("", result);
    }

    @Test
    public void testTruncateZeroLength() {
        String result = manipulator.Truncate("hello", 0);
        assertEquals("", result);
    }
}