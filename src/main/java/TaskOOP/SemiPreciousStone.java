package TaskOOP;

public class SemiPreciousStone extends Stone {



    public SemiPreciousStone( double weight, double price,int transparency) {
        super(weight,price,transparency);
        this.name = "Semi Precious Stone";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}