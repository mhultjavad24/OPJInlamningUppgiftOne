// 'Enums' is used here to specify liquid type but also provide a more human readable name for the liquid type.
public enum LiquidType {
    TAP_WATER ("tap water"), PROTEIN_DRINK ("protein drink"), MINERAL_WATER ("mineral water");

    public String name;

    LiquidType(String name) {
        this.name = name;
    }
}
