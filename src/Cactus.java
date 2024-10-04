// This is an 'arv' from abstract class Plant
public class Cactus extends Plant {
    private final double LIQUID_NEED_LITERS = 0.02;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // Method overriding is used here for 'polymorphism' purpose, this method originates from Plant, but is overridden here.
    @Override
    public double getLiquidAmountInLiters() {
        return LIQUID_NEED_LITERS;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
