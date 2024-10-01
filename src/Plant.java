// This uses an 'interface' where Plant needs to implement requirements from LiquidNeeds
abstract public class Plant implements LiquidNeeds {
    // 'Encapsulation' is used here with accessors to prevent mutating/renaming the name of plant, currently only constructor can set the name.
    private String name;
    private double heightInMeters;
    public abstract double getLiquidAmountInLiters();
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
