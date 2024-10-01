// This is an 'interface' where Plant needs to implement requirements from FluidNeeds
abstract public class Plant implements FluidNeeds {
    private String name;
    private double heightInMeters;
    public abstract double getFluidAmountInLiters();
    public abstract LiquidType getLiquidType();

    public Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return name;
    }

    public boolean hasName(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }
}
