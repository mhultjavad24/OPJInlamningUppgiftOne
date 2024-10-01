import org.junit.jupiter.api.Test;

public class PalmTest {
    @Test
    public void testLauraPalm() {
        Palm palm = new Palm("Laura", 5);
        assert(palm.getLiquidAmountInLiters() == 2.5);
    }

    @Test
    public void testOlofPalm() {
        Palm palm = new Palm("Olof", 1);
        assert(palm.getLiquidAmountInLiters() == 0.5);
    }

    @Test
    public void testLongPalm() {
        Palm palm = new Palm("Laura", 22);
        assert(palm.getLiquidAmountInLiters() == 11);
    }

    @Test
    public void testShortPalm() {
        Palm palm = new Palm("Laura", 0.8);
        assert(palm.getLiquidAmountInLiters() == 0.4);
    }
}
