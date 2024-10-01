import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CactusTest {

    @Test
    public void testRegularCactus() {
        Cactus cactus = new Cactus("Igge", 0.2);
        assertEquals(0.02, cactus.getLiquidAmountInLiters());
    }

    @Test
    public void testLongCactus() {
        Cactus cactus = new Cactus("Igge", 2);
        assertEquals(0.02, cactus.getLiquidAmountInLiters());
    }
}
