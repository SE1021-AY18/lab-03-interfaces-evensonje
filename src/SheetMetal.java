/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/14/2017
 * Author: Jake Evenson
 */
public class SheetMetal implements Part {
    public static final double LBS_MULTIPLIER = 0.1;
    private double lengthInches;
    private double thicknessInches;
    public static final double USD_MULTIPLIER = 0.50;
    private double widthInches;

    /**
     * Calculates the cost of the sheet
     * @return the total cost
     */
    public double getCost() {
        return (USD_MULTIPLIER*thicknessInches*widthInches*lengthInches);
    }

    /**
     * @return the name and size of the sheet
     */
    public String getName() {
        return lengthInches+"x"+widthInches+"x"+thicknessInches+" sheet";
    }

    /**
     * @return the total weight of the sheet
     */
    public double getWeight() {
        return (LBS_MULTIPLIER*thicknessInches*widthInches*lengthInches);
    }

    /**
     * prints the formatted bill of materials
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName()+"\n"+
                "==========================\n" +
                "Length: "+lengthInches+" inches\n" +
                "Width: "+widthInches+" inches\n" +
                "Thickness: "+thicknessInches+" inches\n" +
                "Cost: $"+getCost()+"\n" +
                "Weight: "+getWeight()+" lbs\n");
    }

    public SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }
}
