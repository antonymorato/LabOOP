package TaskOOP;

public class Stone {
    protected String name;
    protected double weight;
    protected double price;
    private double transparency;
    public static final double maxTransparency=1;
    public static final double minTransparency=0;
    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

}