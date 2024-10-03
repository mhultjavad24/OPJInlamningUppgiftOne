import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Greenest {
    public static void main(String[] args) {

        Plant igge = new Cactus("Igge", 0.2);
        Plant laura = new Palm("Laura", 5);
        Plant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plant olof = new Palm("Olof", 1);
        List<Plant> plants = new ArrayList<>();
        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);


        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter the name of the plant you want to give liquid (or type Exit to quit):");
            if (name == null || name.equalsIgnoreCase("Exit")) {
                break;
            }

            Plant matchingPlant = null;
            for (Plant plant : plants) {
                if (plant.hasName(name)) {
                    matchingPlant = plant;
                    break;
                }
            }
            if (matchingPlant != null) {
                // 'Polymorphism' is used here. We can calculate the amount of liquid needed for the plant by method overriding, this works no matter the class could be Cactus, Palm, or CarnivorousPlant
                String message = "The plant " + matchingPlant.getName() + " needs " + matchingPlant.getLiquidAmountInLiters() + " liters of " + matchingPlant.getLiquidType().name + " per day.";
                JOptionPane.showMessageDialog(null, message);
            } else {
                JOptionPane.showMessageDialog(null, "No plant at the hotel with name " + name);
            }
        }
    }
}