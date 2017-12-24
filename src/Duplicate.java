/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/14/2017
 * Author: Jake Evenson
 */
import java.text.DecimalFormat;

/**
 * A class that creates multiple instances of a single, identical part.
 */
public class Duplicate implements Part {
    final private DecimalFormat costFormat = new DecimalFormat();
    private Part identicalPart;
    private int numDuplicates;
    public final double REDUCTION_FACTOR1 = 0.95;
    public final double REDUCTION_FACTOR2 = 0.9;
    public final int USD_THRESHOLD1 = 5;
    public final int USD_THRESHOLD2 = 10;
    private final DecimalFormat weightFormat = new DecimalFormat();

    public Duplicate(Part identicalPart, int numDuplicates) {
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    /**
     * Calculates the cost of the sub parts and applies a bulk discount.
     * @return the total cost
     */
    public double getCost() {
        if (numDuplicates >= USD_THRESHOLD1) {
            return(REDUCTION_FACTOR1*numDuplicates*identicalPart.getCost());
        }
        if (numDuplicates >= USD_THRESHOLD2) {
            return(REDUCTION_FACTOR2*numDuplicates*identicalPart.getCost());
        }
        else{
            return(numDuplicates*identicalPart.getCost());
        }
    }

    /**
     * @return the name of the part being duplicated
     */
    public String getName(){
        return (identicalPart.getName()+"s");
    }

    /**
     * @return the total weight of the duplicates
     */
    public double getWeight() {
        return (numDuplicates*identicalPart.getWeight());
    }

    /**
     * prints the formatted bill of materials
     */
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Duplicate part: " + identicalPart.getName() + "\n" +
                "Copies: " + numDuplicates + " \n" +
                "Individual cost: $" + identicalPart.getCost() + "\n" +
                "Individual weight: " + identicalPart.getWeight() + " lbs\n" +
                "\n" +
                "Total cost: $" + getCost() + "\n" +
                "Total weight: " + getWeight() + " lbs\n");
                identicalPart.printBillOfMaterials();
    }


}
