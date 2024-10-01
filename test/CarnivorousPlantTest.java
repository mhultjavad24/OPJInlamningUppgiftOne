import org.junit.jupiter.api.Test;

public class CarnivorousPlantTest {
    @Test
    public void testRegularCactus() {
        CarnivorousPlant cp = new CarnivorousPlant("Igge", 0.2);
        assert(cp.getFluidAmountInLiters() == 0.14);
    }

    @Test
    public void testLongCactus() {
        CarnivorousPlant cp = new CarnivorousPlant("Igge", 0.5);
        assert(cp.getFluidAmountInLiters() == 0.2);
    }
    @Test
    public void testLongerCactus() {
        CarnivorousPlant cp = new CarnivorousPlant("Igge",  2);
        assert(cp.getFluidAmountInLiters() == 0.5);
    }
}
