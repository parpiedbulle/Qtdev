import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestsPetitsCalculs {
    @Test
    public void testAddition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMultiplication1() {
        assertEquals(72, 8 * 9);
    }

    @Test
    public void testMultiplication2() {
        assertEquals(3252, 32 * 52);
    }

    @Test
    public void testHexa() {
        assertEquals(1024, 0x10 * 0x10);
    }
}