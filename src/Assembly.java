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

    public double getCost() {
        int totalCost = 0;
        for(int i = 0; i < subParts.size(); i++) {
            totalCost += USD_PER_SUB_PART + subParts.get(i).getCost();
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return Part.getWeight();
    }

    public void printBillOfMaterials() {
        Part.printBillOfMaterials();
    }
}
