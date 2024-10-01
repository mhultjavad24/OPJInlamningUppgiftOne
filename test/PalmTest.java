import org.junit.jupiter.api.Test;

public class PalmTest {
    @Test
    public void testLauraPalm() {
        Palm palm = new Palm("Laura", 5);
        assert(palm.getFluidAmountInLiters() == 2.5);
    }

    @Test
    public void testOlofPalm() {
        Palm palm = new Palm("Olof", 1);
        assert(palm.getFluidAmountInLiters() == 0.5);
    }

    @Test
    public void testLongPalm() {
        Palm palm = new Palm("Laura", 22);
        assert(palm.getFluidAmountInLiters() == 11);
    }

    @Test
    public void testShortPalm() {
        Palm palm = new Palm("Laura", 0.8);
        assert(palm.getFluidAmountInLiters() == 0.4);
    }
}
