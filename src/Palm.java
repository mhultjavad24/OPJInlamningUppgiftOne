public class Palm extends Plant {
    private static final double LIQUID_PER_METER = 0.5;

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    public double getLiquidAmountInLiters() {
        return LIQUID_PER_METER * super.getHeightInMeters();
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

}
