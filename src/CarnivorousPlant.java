public class CarnivorousPlant extends Plant {
    private final double LIQUID_NEED_LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public double getLiquidAmountInLiters() {
        return 0.1 + (LIQUID_NEED_LITERS_PER_METER * this.getHeightInMeters());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
