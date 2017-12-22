public class SheetMetal implements Part {
    public static final double LBS_MULTIPLIER = 0.1;
    private double lengthInches;
    private double thicknessInches;
    public static final double USD_MULTIPLIER = 0.50;
    private double widthInches;

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

    public SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }
}
