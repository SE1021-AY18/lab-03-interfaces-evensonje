public class Nut implements Part{
    private double diameterInches;
    public static final double LBS_DOUBLE = 0.01;
    public static final double USD_MULTIPLIER = 0.5;

    public double getCost() {
        return Part.getCost();
    }

    public String getName() {
        return Part.getName();
    }

    public double getWeight() {
        return Part.getWeight();
    }

    public Nut (double diameterInches) {
        this.diameterInches = diameterInches;
    }

    public void printBillOfMaterials() {
        Part.printBillOfMaterials();
    }
}
