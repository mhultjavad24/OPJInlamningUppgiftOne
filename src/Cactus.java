public class Cactus extends Plant {
    private static final double LIQUID_NEED_LITERS = 0.02;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    public double getFluidAmountInLiters() {
        return LIQUID_NEED_LITERS;
    }

    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
