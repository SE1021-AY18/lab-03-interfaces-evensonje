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
        return (USD_MULTIPLIER*diameterInches*lengthInches);
    }

    public String getName() {
        return "Bolt";
    }

    public double getWeight() {
        return (LBS_MULTIPLIER*(diameterInches*diameterInches));
    }

    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                diameterInches+"x"+lengthInches+" "+getName()+"\n"+
                "==========================\n" +
                "Diameter: 0.25 inches\n" +
                "Length: 2.0 inches\n" +
                "Cost: $0.50\n" +
                "Weight: 0.006 lbs");
    }
}
