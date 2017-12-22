import java.text.DecimalFormat;

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

    public double getCost() {
        return Part.getCost();
    }

    public String getName(){
        return Part.getName();
    }

    public double getWeight() {
        return Part.getWeight();
    }

    public void printBillOfMaterials() {
        Part.printBillOfMaterials();
    }

}
