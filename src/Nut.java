/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/14/2017
 * Author: Jake Evenson
 */
public class Nut implements Part{
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.5;

    /**
     * Calculates the cost of the nut
     * @return the total cost
     */
    public double getCost() {
        return (USD_MULTIPLIER*diameterInches);
    }

    /**
     * @return the name and diameter of the nut
     */
    public String getName() {
        return diameterInches+" inch nut";
    }

    /**
     * @return the total weight of the nut
     */
    public double getWeight() {
        return (LBS_MULTIPLIER*(diameterInches*diameterInches));
    }

    /**
     * prints the formatted bill of materials
     */
    public Nut (double diameterInches) {
        this.diameterInches = diameterInches;
    }

    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName()+"\n"+
                "==========================\n" +
                "Diameter: "+diameterInches+" inches\n" +
                "Cost: $"+getCost()+"\n" +
                "Weight: "+getWeight()+" lbs\n");
    }
}
