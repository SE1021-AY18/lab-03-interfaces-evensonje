public class Bolt implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;
    public static final double USD_MULTIPLIER = 1.00;

    public Bolt(double diameterInches, double lengthInches) {
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
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
