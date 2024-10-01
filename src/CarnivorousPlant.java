public class CarnivorousPlant extends Plant {
    private static final double LIQUID_NEED_LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    public double getLiquidAmountInLiters() {
        return 0.1 + (LIQUID_NEED_LITERS_PER_METER * this.getHeightInMeters());
    }

    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
