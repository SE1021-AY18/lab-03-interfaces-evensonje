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

    }

    public Assembly(String name) {
        this.name = name;
    }

    public double getCost() {
        return Part.getCost();
    }

    public String getName() {
        return Part.getName();
    }

    public double getWeight() {
        return Part.getWeight();
    }

    public void printBillOfMaterials() {
        Part.printBillOfMaterials();
    }
}
