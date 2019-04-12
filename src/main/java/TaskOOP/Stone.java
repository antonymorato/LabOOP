package TaskOOP;

public class Stone implements Comparable{
    protected String name;
    protected double weight;
    protected double price;
    protected double transparency;
    public static final int maxTransparency=10;
    public Stone( double weight, double price,int transparency) {
        this.weight = weight;
        this.price = price;
        this.transparency=transparency;
    }
    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}