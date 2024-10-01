// This is an 'arv' from abstract class Plant
public class Palm extends Plant {
    private static final double LIQUID_PER_METER = 0.5;

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // 'Encapsulation' is used here to calculate the amount of water needed for the plant without exposing the heightInMeters variable
    public double getFluidAmountInLiters() {
        return LIQUID_PER_METER * super.getHeightInMeters();
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

}
