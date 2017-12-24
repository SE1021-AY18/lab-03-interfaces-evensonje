/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/14/2017
 * Author: Jake Evenson
 */
public class Bolt implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;
    public static final double USD_MULTIPLIER = 1.00;

    public Bolt(double diameterInches, double lengthInches) {
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    /**
     * Calculates the cost of the bolt
     * @return the total cost
     */
    public double getCost() {
        return (USD_MULTIPLIER*diameterInches*lengthInches);
    }

    /**
     * @return the name and size of the bolt
     */
    public String getName() {
        return  diameterInches+"x"+lengthInches+" bolt";
    }

    /**
     * @return the total weight of the bolt
     */
    public double getWeight() {
        return (LBS_MULTIPLIER*(diameterInches*diameterInches));
    }

    /**
     * prints the formatted bill of materials
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
               getName()+"\n"+
                "==========================\n" +
                "Diameter: "+diameterInches+" inches\n" +
                "Length: "+lengthInches+" inches\n" +
                "Cost: $"+getCost()+"\n" +
                "Weight: "+getWeight()+" lbs\n");
    }
}
