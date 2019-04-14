package TaskOOP;



public class Stone implements Comparable<Stone> {
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
    public int compareTo(Stone stone) {
        if(stone.price==this.price) return 0;
        if (this.price<stone.price) return -1;
        else return 1;
    }
}