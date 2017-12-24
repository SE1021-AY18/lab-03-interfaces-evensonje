/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/14/2017
 * Author: Jake Evenson
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part{
    private final DecimalFormat costFormat = new DecimalFormat();
    private String name;
    List<Part> subParts = new ArrayList<Part>();
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat = new DecimalFormat();

    public void addPart(Part part) {
        subParts.add(part);
    }

    public Assembly(String name) {
        this.name = name;
    }

    /**
     * Calculates the cost of the assembly and applies a sub part fee
     * @return the total cost
     */
    public double getCost() {
        double totalCost = 0;
        for(int i = 0; i < subParts.size(); i++) {
            totalCost += USD_PER_SUB_PART + subParts.get(i).getCost();
        }
        return totalCost;
    }

    /**
     * @return the name of the product being assembled
     */
    public String getName() {
        return name;
    }

    /**
     * @return the total weight of the product
     */
    public double getWeight() {
        int totalWeight = 0;
        for(int i = 0; i < subParts.size(); i++) {
            totalWeight += subParts.get(i).getWeight();
        }
        return totalWeight;
    }

    /**
     * prints the formatted bill of materials
     */
    public void printBillOfMaterials() {
        String subPartSummary = "";
        for(int i = 0; i < subParts.size(); i++) {
            subPartSummary += "Part: "+subParts.get(i).getName()+"\n"+
                    "Cost: $"+subParts.get(i).getCost()+"\n"+
                    "Weight: "+subParts.get(i).getWeight()+"\n";
        }
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                subPartSummary+"\n"+
                "Total cost: $"+getCost()+"\n"+
                "Total weight: "+getWeight()+" lbs\n");
        for(int i = 0; i < subParts.size(); i++) {
            subParts.get(i).printBillOfMaterials();
        }
    }
}
